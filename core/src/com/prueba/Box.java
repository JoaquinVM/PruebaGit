package com.prueba;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.prueba.util.Constants;

/**
 * Created by Joaco99 on 20/07/2017.
 */

public class Box extends Actor{
    private int capacity = Constants.INITIAL_BOX_CAPACITY;
    private Color color;
    private Texture texture;
    private PlayScreen screen;

    public Box(PlayScreen screen, float width, float height, Color color, float x, float y){
        this.screen = screen;
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
        batch.setColor(color);
        batch.draw(texture, getX(), getY(), getWidth(), getHeight());
        screen.getFont().setColor(color);
        screen.getFont().getData().setScale(1.8f);
        screen.getFont().draw(batch, capacity + "", getX() + (getWidth() / 2)
                , getY() + getHeight()+ Constants.BOX_AND_FONT_DISTANCE);
    }

}
