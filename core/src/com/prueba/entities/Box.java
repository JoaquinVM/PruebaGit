package com.prueba.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.prueba.util.Constants;
import com.prueba.util.Utils;

/**
 * Created by Joaco99 on 20/07/2017.
 */

public class Box extends Actor {
    private float capacity = Constants.INITIAL_BOX_CAPACITY;
    private Color color;
    private Texture texture;
    private Rectangle bounds;

    public Box(float width, float height, Color color, float x, float y) {
        setSize(width, height);
        this.color = color;
        texture = new Texture(Constants.BOX_TEXTURE);
        setPosition(x, y);
        bounds = new Rectangle(x, y, width, height);
    }

    @Override
    public void act(float delta) {
        color = new Color(
                Utils.random.nextFloat(),
                Utils.random.nextFloat(),
                Utils.random.nextFloat(),
                1
        );
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.setColor(color);
        batch.draw(texture, getX(), getY());
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void onTouch() {
        capacity += 20;
    }
}
