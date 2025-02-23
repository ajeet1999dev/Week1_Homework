package com.example.homework.HomeWorkWeek1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.frosting",havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
