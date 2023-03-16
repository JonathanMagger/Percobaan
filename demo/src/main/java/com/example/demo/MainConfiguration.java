package com.example.demo;

import com.example.demo.configuration.BarConfiguration;
import com.example.demo.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FooConfiguration.class, BarConfiguration.class})
public class MainConfiguration {
}
