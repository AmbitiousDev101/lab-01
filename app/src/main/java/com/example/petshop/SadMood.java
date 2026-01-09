package com.example.petshop;

public class SadMood extends Mood {
    public SadMood() { super(); }

    @Override
    public String getMoodString() {
        return "Sad";
    }
}