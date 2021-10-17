package com.example.tugas1_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void layout_profile(View view){
        Intent a = new Intent(MainActivity.this,
                LayoutProfile.class);
        startActivity(a);
    }
}