package com.example.demo;

import com.example.demo.data.Bar;
import com.example.demo.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo(){
        log.info("foonya dibuat");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Barnya dibuat");
        return new Bar();
    }
}
