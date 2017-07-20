package com.prueba;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.prueba.entities.Box;
import com.prueba.util.Constants;
import com.prueba.util.MyInput;
import com.prueba.util.Utils;

/**
 * Created by Joaco99 on 20/07/2017.
 */

public class Level extends ScreenAdapter {
    Stage stage;
    SpriteBatch batch;
    BitmapFont font;
    private DelayedRemovalArray<Box> boxes;
    private long startTime;
    private float spawnRate;

    @Override
    public void show() {
        stage = new Stage();
        batch = new SpriteBatch();
        font = new BitmapFont();
        boxes = new DelayedRemovalArray<Box>();
        for (int i = 0; i < 3; i++) {
            Box box = new Box(this, 100, 100, Color.GREEN, 10 + 110 * i, 10);
            boxes.add(box);
            stage.addActor(box);
        }
        Gdx.input.setInputProcessor(new MyInput(this));

        startTime = TimeUtils.nanoTime();
        spawnRate = Constants.INITIAL_BOX_SPAWN_RATE;
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(Utils.random.nextFloat(), Utils.random.nextFloat(), Utils.random.nextFloat(), 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        float elapsedTime = MathUtils.nanoToSec * (TimeUtils.nanoTime() - startTime);
        if (elapsedTime >= spawnRate) {
            // New box at a random position
            startTime = TimeUtils.nanoTime();
            spawnRate += Constants.BOX_SPAWN_RATE_INCREMENT;
        }
        stage.act();
        batch.begin();
        stage.draw();
        batch.end();
    }

    @Override
    public void dispose() {
        stage.dispose();
        batch.dispose();
        font.dispose();
    }

    public DelayedRemovalArray<Box> getBoxes() {
        return boxes;
    }

    public Viewport getViewport() {
        return stage.getViewport();
    }

    public BitmapFont getFont() {
        return font;
    }
}
