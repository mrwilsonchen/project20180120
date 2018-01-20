package com.example.mrwil.project20180120;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 連結ImageView
        ImageView image_view = (ImageView) findViewById(R.id.image_view);
        // 讀取圖片
        Picasso.with(this).load("http://i.imgur.com/XY1856Y.png").into(image_view);
    }
}
