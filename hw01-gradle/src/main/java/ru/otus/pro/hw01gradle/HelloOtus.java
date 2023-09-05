package ru.otus.pro.hw01gradle;

import com.google.common.collect.Sets;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HelloOtus {

    public static void main(String[] args) {

        SpringApplication.run(HelloOtus.class, args);
        var firstSet = Set.of("a", "b", "c");
        var secondSet = Set.of("b", "c", "d");
        log.info("Difference between first and second sets = '{}'", Sets.difference(firstSet, secondSet));
        log.info("Difference between second and first sets = '{}'", Sets.difference(secondSet, firstSet));
    }

}
