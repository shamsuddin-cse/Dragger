package com.example.dragger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine,private val wheels: Wheels) {
    companion object{
        private final val TAG="Car"
    }



    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive(){
        Log.e(TAG,"Driving...........")
    }
}