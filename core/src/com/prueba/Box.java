package com.prueba;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Joaco99 on 20/07/2017.
 */

public class Box extends Actor{
    private float capacity = Constants.INITIAL_BOX_CAPACITY;
    private Color color;

    public Box(float width, float height, Color color){
        setSize(width, height);
        this.color = color;
    }

    @Override
    public void act(float delta) {

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {

    }
}
