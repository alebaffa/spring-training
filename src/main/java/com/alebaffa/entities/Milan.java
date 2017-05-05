package com.alebaffa.entities;

import org.springframework.stereotype.Component;

@Component
public class Milan implements Team {
    public String getName() {
        return "Milan AC";
    }
}
