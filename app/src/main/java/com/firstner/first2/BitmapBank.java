package com.firstner.first2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ResourceBundle;

public class BitmapBank {

    Bitmap background;
    //initiate

    public BitmapBank(Resources res) {
        background = BitmapFactory.decodeResource(res, R.drawable.abc);
    }

    //return background bitmap
    public Bitmap getBackground()
    {
        return background;
    }

    //return background width
    public int getBackgroundWidth()
    {
        return background.getWidth();
    }

    public int getBackgroundHeight()
    {
        return background.getHeight();
    }
}
