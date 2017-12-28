package com.example.khasirakanda.cardname;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            Intent Ik = new Intent( MainActivity.this,Main2Activity.class);
            Ik.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            Ik.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(Ik);
            finish();
        }
    }
}
