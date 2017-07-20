package com.prueba;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.graphics.Color;
import com.prueba.util.Constants;

/**
 * Created by Joaco99 on 20/07/2017.
 */

public class PlayScreen extends ScreenAdapter {
    Stage stage;
    Viewport viewport;
    Box box;
    SpriteBatch batch;

    @Override
    public void show() {
        stage = new Stage();
        viewport = new ExtendViewport(Constants.WORLD_WIDTH, Constants.WORLD_HEIGHT);
        batch = new SpriteBatch();
        box = new Box(100, 100, Color.GREEN, 10, 10);
        stage.addActor(box);

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        viewport.apply();
        batch.begin();
        stage.act();
        batch.end();
    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
