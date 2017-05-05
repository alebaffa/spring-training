package com.alebaffa.entities;

import org.springframework.stereotype.Component;

/**
 * Created by abaffa on 05/05/2017.
 */
@Component
public class Juventus implements Team {
    public String getName() {
        return "Juventus";
    }
}
