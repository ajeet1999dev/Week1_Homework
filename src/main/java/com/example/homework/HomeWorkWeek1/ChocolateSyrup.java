package com.example.homework.HomeWorkWeek1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.syrup",havingValue = "chocolate")
public class ChocolateSyrup implements Syrup {

    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
