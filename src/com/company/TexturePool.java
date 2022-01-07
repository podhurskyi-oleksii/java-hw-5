package com.company;

public class TexturePool {
    private static TexturePool instance = new TexturePool();

    private TexturePool() {

    }

    public String getTexture(String texture) {
        return "Get texture " + texture;
    }

    public static TexturePool getInstance() {
        return instance;
    }
}
