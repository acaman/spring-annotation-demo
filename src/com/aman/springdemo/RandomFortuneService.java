package com.aman.springdemo;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    private String[] data = {
            "You are Lucky Today, Go for it",
            "Today can be an unlucky ay",
            "The journey is the reward"
    };

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}
