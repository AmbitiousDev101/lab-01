package com.example.petshop;

public class HappyMood extends Mood {
    public HappyMood() { super(); }

    @Override
    public String getMoodString() {
        return "Happy";
    }
}