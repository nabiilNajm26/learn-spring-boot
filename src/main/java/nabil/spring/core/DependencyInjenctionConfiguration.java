package nabil.spring.core;

import nabil.spring.core.data.Bar;
import nabil.spring.core.data.Foo;
import nabil.spring.core.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class DependencyInjenctionConfiguration {
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Primary
    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
