package com.firstner.first2;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;

public class GameThread extends Thread {

    SurfaceHolder surfaceHolder;
    boolean isRunning;
    long startTime,loopTime;
    long DELAY = 33; //delay between screeen refreshes

    public GameThread(SurfaceHolder surfaceHolder) {
        this.surfaceHolder =surfaceHolder;
        isRunning = true;

    }

    @Override
    public void run(){
        while(isRunning){
            startTime = SystemClock.uptimeMillis();
            Canvas canvas = surfaceHolder.lockCanvas(null);
            if(canvas !=null){
                synchronized (surfaceHolder){
                    AppConstants.getGameEngine().updateAndDrawBackgroundImage(canvas);
                    //unlocking the canvas
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
            //loop time
            loopTime = SystemClock.uptimeMillis() - startTime;

            //checkcking below
            if(loopTime<DELAY)
            {
                try{
                    Thread.sleep(DELAY-loopTime);
                }catch(InterruptedException e){
                    Log.e("Interrupted","Interrupted when sleeping");
                }
            }
        }
    }

    //return whether the thread is running

    public boolean isRunning(){
        return isRunning();
    }

    //Sets the thread state, false = stopped, true = running
    public void setIsRunning(boolean state){
        isRunning = state;
    }
}
