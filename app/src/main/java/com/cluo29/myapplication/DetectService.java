package com.cluo29.myapplication;

import android.app.Service;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by CLUO29 on 1/19/16.
 */
public class DetectService extends Service implements SensorEventListener{


    public void onAccuracyChanged(Sensor arg0, int arg1) {
        // TODO Auto-generated method stub
    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        // use hardware sensor
        Sensor sensor = event.sensor;

        //get correct type of sensor data
        if (sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD)
        {
            //fetch data

            //debugging information
            //Log.d("SENSORS", "x= " + Mag_X);
            //Log.d("SENSORS", "y= " + Mag_Y);
            //Log.d("SENSORS", "z= " + Mag_Z);

            //calculation
            //double metal_power=  Math.sqrt(sum);

            //Log.d("SENSORS", "metal_power from service= " + metal_power);

            //send intent from service to your activity
            //sendBroadcast(intent);

        }

    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return 0;
    }



    private static SensorManager mSensorManager;
    private static Sensor mMag;

    @Override
    public void onCreate() {
        //after creation

        //register sensor in sensor manager


    }


    @Override
    public IBinder onBind(Intent intent) {
        // We don't provide binding, so return null
        return null;
    }




    @Override
    public void onDestroy() {

    }

}
