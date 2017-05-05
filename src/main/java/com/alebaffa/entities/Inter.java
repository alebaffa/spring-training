package com.alebaffa.entities;

import org.springframework.stereotype.Component;

@Component
public class Inter implements Team {
    public String getName() {
        return "Inter FC";
    }
}
