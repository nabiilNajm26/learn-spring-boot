package nabil.spring.core;

import nabil.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPrimary {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
    }

    @Test
    void testPrimary() {
        var fooPrimary = applicationContext.getBean(Foo.class);
        var foo1 = applicationContext.getBean("foo1",Foo.class);
        var foo2 = applicationContext.getBean("foo2",Foo.class);

        Assertions.assertNotSame(fooPrimary, foo2);
        Assertions.assertSame(fooPrimary, foo1);
        Assertions.assertNotSame(foo1, foo2);
    }
}
