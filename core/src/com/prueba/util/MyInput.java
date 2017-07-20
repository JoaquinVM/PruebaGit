package com.prueba.util;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;
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
        Vector2 viewportPosition = level.getViewport().unproject(new Vector2(screenX, screenY));

        for (Box box : level.getBoxes()) {
            if (box.getBounds().contains(viewportPosition.x, viewportPosition.y)) {
                box.onTouch();
            }
        }
        return true;
    }
}
