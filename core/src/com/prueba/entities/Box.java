package com.prueba.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.prueba.util.Constants;

/**
 * Created by Joaco99 on 20/07/2017.
 */

public class Box extends Actor{
    private float capacity = Constants.INITIAL_BOX_CAPACITY;
    private Color color;
    private Texture texture;

    public Box(float width, float height, Color color, float x, float y){
        setSize(width, height);
        this.color = color;
        texture = new Texture(Constants.BOX_TEXTURE);
        setPosition(x, y);
    }

    @Override
    public void act(float delta) {

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, getX(), getY());
    }
}
