package com.firstner.first2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap background;
    Bitmap[] bird;
    //initiate

    public BitmapBank(Resources res) {
        background = BitmapFactory.decodeResource(res, R.drawable.abc);
        background = scaleImage(background);

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

    public Bitmap scaleImage(Bitmap bitmap)
    {
        float widthHeightRatio = getBackgroundWidth() / getBackgroundHeight();
        //mutiply wiHeRatio with screen Height to get scaled width of the bitmap.
        //then call create ScaledBitmap() to create a new bitmap, scaled from an existing bitmapm when possible
        int backgroundScaleWidth = (int) widthHeightRatio * AppConstants.SCREEN_HEIGHT;
        return Bitmap.createScaledBitmap(bitmap, backgroundScaleWidth, AppConstants.SCREEN_HEIGHT, false);
    }

}
