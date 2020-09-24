package com.liu.dao.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.stereotype.Component;

@Component
public class Configs {

    @Bean
    @Profile("dev")
    public CommandLinePropertySource dataLoader() {
//        ...
        return null;
    }
}
