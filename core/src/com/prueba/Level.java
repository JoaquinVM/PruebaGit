package com.prueba;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.prueba.entities.Box;

/**
 * Created by Joaco99 on 20/07/2017.
 */

public class Level extends ScreenAdapter {
    Stage stage;
    Box box;
    SpriteBatch batch;
    BitmapFont font;
    private DelayedRemovalArray<Box> boxes;

    public Level() {
        boxes = new DelayedRemovalArray<Box>();
    }

    @Override
    public void show() {
        stage = new Stage();
        batch = new SpriteBatch();
        box = new Box(this, 100, 100, Color.GREEN, 10, 10);
        stage.addActor(box);
        font = new BitmapFont();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        batch.begin();
        stage.draw();
        batch.end();
    }

    @Override
    public void dispose() {
        stage.dispose();
    }

    public DelayedRemovalArray<Box> getBoxes() {
        return boxes;
    }

    public Camera getCamera() {
        return stage.getCamera();
    }

    public BitmapFont getFont(){
        return font;
    }
}