package com.swarawan.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by rioswarawan on 10/10/16.
 */

public class CheckBox extends android.widget.CheckBox {
    public CheckBox(Context context) {
        this(context, null);
    }

    public CheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.Kacang, 0, 0);
        String pathFont = array.getString(R.styleable.Kacang_font);

        array.recycle();
        if (pathFont != null) {
            setCustomFont(context, pathFont);
        }
    }

    private void setCustomFont(Context context, String pathFont) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), pathFont);
        this.setTypeface(typeface);
    }
}
