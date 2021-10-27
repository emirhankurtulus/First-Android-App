package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int counter = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("CAT OR DUCK");


    }

    public void button(View view)
    {
       counter++;
        if (counter % 2 != 1)
        {
            ImageView imageView=findViewById(R.id.imageView4);
            imageView.setImageResource(R.drawable.cat);
        }
        else
        {
            ImageView imageView=findViewById(R.id.imageView4);
            imageView.setImageResource(R.drawable.duck);
            
        }


    }

}