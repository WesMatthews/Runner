package com.example.wes_m.Runner;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by wes_m on 10/26/2016.
 */

public interface Scene {
    public void update();
    public void draw(Canvas canvas);
    public void terminate();
    public void recieveTouch(MotionEvent event);
}
