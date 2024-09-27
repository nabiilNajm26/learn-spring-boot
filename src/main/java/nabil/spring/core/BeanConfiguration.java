package nabil.spring.core;

import lombok.extern.slf4j.Slf4j;
import nabil.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo1(){
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        log.info("Create new foo");
        return new Foo();
    }
}
