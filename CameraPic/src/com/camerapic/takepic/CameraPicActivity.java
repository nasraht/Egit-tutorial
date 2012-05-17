package com.camerapic.takepic;

import android.app.Activity;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CameraPicActivity extends Activity implements SurfaceHolder.Callback{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public SurfaceView sv;
    public SurfaceHolder sh;
    public Camera c;
    public boolean pr;
}