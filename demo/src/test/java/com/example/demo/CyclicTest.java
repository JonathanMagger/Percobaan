package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {

    @Test
    void testCyclic() {
        //untuk lihat errornya hapus bagian throeable
        Assertions.assertThrows(Throwable.class,() -> {
                    ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
                }
                );
    }
}
