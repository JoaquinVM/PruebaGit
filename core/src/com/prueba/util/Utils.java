package com.prueba.util;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

/**
 * Created by Luchox on 20/07/2017.
 */
public class Utils {

    public static final Random random = new Random();

    public static Vector2 getTextDimensions(BitmapFont font, String text) {
        GlyphLayout layout = new GlyphLayout();
        layout.setText(font, text);
        float width = layout.width;
        float height = layout.height;
        return new Vector2(width, height);
    }
}
