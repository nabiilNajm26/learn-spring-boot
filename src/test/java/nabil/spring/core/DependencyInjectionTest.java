package nabil.spring.core;

import nabil.spring.core.data.Bar;
import nabil.spring.core.data.Foo;
import nabil.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DependencyInjenctionConfiguration.class);
    }

    @Test
    void testNoDI(){
        var foo = new Foo();
        var bar = new Bar();
        var fooBar = new FooBar(foo,bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());

    }

    @Test
    void testDI(){
        var fooBar = context.getBean(FooBar.class);
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
