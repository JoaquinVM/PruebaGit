package com.prueba.util;

import com.badlogic.gdx.Gdx;

public class Constants {
    public static final float WORLD_WIDTH = Gdx.graphics.getWidth();//no hacer esto-
    public static final float WORLD_HEIGHT = Gdx.graphics.getHeight();//no hacer esto
    public static final int BOX_MAX_CAPACITY = 100;
    public static final float INITIAL_BOX_SPAWN_RATE = 1;
    public static final float MIN_SPAWN_RATE = 1f / 3f;
    public static final float BOX_SPAWN_RATE_DECREMENT = 0.95f;
    public static final int INITIAL_BOX_CAPACITY = 0;
    public static final int BOX_INCREMENT = 20;
    public static final float BOX_SIZE = 200;

    public static final String BOX_TEXTURE = "box.png";

}
