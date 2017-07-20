package com.prueba.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
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
        screenY = Gdx.graphics.getHeight() - screenY;
        for (Box box : level.getBoxes()) {
            if (box.getBounds().contains(screenX, screenY)) {
                box.onTouch();
            }
        }
        return true;
    }
}
