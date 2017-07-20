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

    private static final GlyphLayout layout = new GlyphLayout();
    private static final Vector2 textDimensions = new Vector2();

    public static Vector2 getTextDimensions(BitmapFont font, String text) {
        layout.setText(font, text);
        float width = layout.width;
        float height = layout.height;
        textDimensions.set(width, height);
        return textDimensions;
    }
}
