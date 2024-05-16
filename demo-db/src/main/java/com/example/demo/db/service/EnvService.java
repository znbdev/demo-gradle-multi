package com.example.demo.db.service;

import com.example.demo.db.properties.EnvProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnvService {
    private final EnvProperties envProperties;

    public String getEnv() {
        return envProperties.getEnv();
    }

}
