package nabil.spring.core;

import nabil.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(BeanNameTest.class);
    }

    @Test
    void testBeanName(){
        var foo1Name = context.getBean("fooFirst", Foo.class);
        var foo2Name = context.getBean("fooSecond", Foo.class);
        var fooPrimary = context.getBean(Foo.class);

        Assertions.assertSame(foo1Name, fooPrimary);
        Assertions.assertNotSame(foo2Name, foo1Name);


    }
}
