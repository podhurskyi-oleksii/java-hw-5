package com.company;

public class LevelLoaders {
    private static LevelLoaders instance = new LevelLoaders();

    private LevelLoaders() {

    }

    public String load(String levelName) {
        return "Loading leve " + levelName;
    }

    public static LevelLoaders getInstance() {
        return instance;
    }
}