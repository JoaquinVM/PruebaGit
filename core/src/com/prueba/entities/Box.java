package com.prueba.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.prueba.Level;
import com.prueba.util.Constants;
import com.prueba.util.Utils;

/**
 * Created by Joaco99 on 20/07/2017.
 */

public class Box extends Actor {
    private int capacity = Constants.INITIAL_BOX_CAPACITY;
    private Color color;
    private Texture texture;
    private Level level;
    private Rectangle bounds;

    public Box(Level level, float width, float height, Color color, float x, float y) {
        this.level = level;
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
        batch.draw(texture, getX(), getY(), getWidth(), getHeight());
        level.getFont().setColor(color);
        level.getFont().getData().setScale(1.8f);
        level.getFont().draw(
                batch,
                capacity + "",
                getX() + (getWidth() / 2) - Utils.getTextDimensions(level.getFont(), capacity + "").x,
                getY() + (getHeight() / 2) - Utils.getTextDimensions(level.getFont(), capacity + "").y
        );
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void onTouch() {
        capacity += Constants.BOX_INCREMENT;
        if (capacity > Constants.BOX_MAX_CAPACITY) {
            this.remove();
            level.getBoxes().begin();
            level.getBoxes().removeValue(this, false);
            level.getBoxes().end();
        }
    }
}
