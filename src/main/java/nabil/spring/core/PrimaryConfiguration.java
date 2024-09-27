package nabil.spring.core;

import lombok.extern.slf4j.Slf4j;
import nabil.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class PrimaryConfiguration {

    @Primary
    @Bean
    public Foo foo1(){
        log.info("creating foo1 Primary");
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        log.info("creating foo2");
        return new Foo();
    }
}
