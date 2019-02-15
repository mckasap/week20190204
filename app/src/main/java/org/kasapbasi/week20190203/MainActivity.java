package org.kasapbasi.week20190203;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int order=0;
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MCK", "onStart: " +order);
        order++;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MCK", "onDestroy: " +order);
        order++;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MCK", "onPAuse: " +order);
        order++;
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d("MCK", "onPostCreate: " +order);
        order++;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MCK", "onREsume: " +order);
        order++;
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("MCK", "onPostResume: " +order);
        order++;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MCK", "onStop: " +order);
        order++;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MCK", "onCreate: " +order);
        order++;
        setContentView(R.layout.activity_main);
    }
}
