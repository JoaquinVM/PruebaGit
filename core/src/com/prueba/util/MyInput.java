package com.prueba.util;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.prueba.Level;
import com.prueba.entities.Box;

/**
 * Created by Luchox on 20/07/2017.
 */
public class MyInput extends InputAdapter {

    private Level level;

    public MyInput(Level level) {
        this.level = level;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        for (Box box : level.getBoxes()) {

        }
        return true;
    }
}
