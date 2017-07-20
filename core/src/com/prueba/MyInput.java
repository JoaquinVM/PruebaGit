package com.prueba;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Input;

/**
 * Created by Luchox on 20/07/2017.
 */
public class MyInput extends InputAdapter {

    @Override
    public boolean keyDown(int keycode) {
        switch (keycode) {
            case Input.Keys.Z:

                break;
            case Input.Keys.X:

                break;
        }
        return true;
    }
}
