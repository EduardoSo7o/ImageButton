package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View view){
        Toast.makeText(this, "Save Button", Toast.LENGTH_SHORT).show();
    }

    public void score(View view){
        Toast.makeText(this, "Score Button", Toast.LENGTH_SHORT).show();
    }
}