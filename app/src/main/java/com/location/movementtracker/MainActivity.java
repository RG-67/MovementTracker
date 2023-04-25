package com.location.movementtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Vibrator;

import com.location.movementtracker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    ActivityMainBinding binding;
    private SensorManager sensorManager;
    private Sensor accelerometer;
    private PowerManager powerManager;
    Vibrator vibrator;
    private PowerManager.WakeLock wakeLock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        startService(new Intent(MainActivity.this, MovementDetectionService.class));

//        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
//        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
//        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
//        powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
    }

    @Override
    protected void onResume() {
        super.onResume();
//        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_STATUS_ACCURACY_HIGH);
    }

    @Override
    protected void onPause() {
        super.onPause();
//        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_STATUS_ACCURACY_HIGH);
//        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
//        float x = sensorEvent.values[0];
//        float y = sensorEvent.values[1];
//        float z = sensorEvent.values[2];
//        float acceleration = (float) Math.sqrt(x*x + y*y + z*z);
//        if (acceleration > 10) {
//            binding.textMovement.setText("Movement detected");
//            vibrator.vibrate(1000);
//        }
//        else {
//            binding.textMovement.setText("No movement detected");
//        }
//        if (!powerManager.isInteractive()) {
//            vibrator.vibrate(1000);
//        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}