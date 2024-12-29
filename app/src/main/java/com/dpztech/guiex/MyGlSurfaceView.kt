package com.dpztech.guiex
import android.content.Context
import android.opengl.GlSurfaceView


class MyGlSurfaceView(context: Context) : GlSurfaceView(context){
    init {
        setEGLContextClientVersion(3)
        // setRenderer(MyGlRenderer())
    }
}
