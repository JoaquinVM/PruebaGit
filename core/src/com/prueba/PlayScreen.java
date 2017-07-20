package com.prueba;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by Joaco99 on 20/07/2017.
 */

public class PlayScreen extends ScreenAdapter {
    Stage stage;
    Viewport viewport;

    @Override
    public void show() {
        stage = new Stage();
        viewport = new ExtendViewport(Constants.WORLD_WIDTH, Constants.WORLD_HEIGHT);
    }

    @Override
    public void render(float delta) {
    }

    @Override
    public void dispose() {
    }
}
