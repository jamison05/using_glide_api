package com.example.deepj.myapplication;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

//import com.bumptech.glide.Glide;
//import com.bumptech.glide.request.FutureTarget;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.my_image_view);

        Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);
        //        FutureTarget<Bitmap> futureTarget =
//                Glide.with(this)
//                        .asBitmap()
//                        .load(url)
//                        .submit(width, height);
//
//        Bitmap bitmap = futureTarget.get();

    }
}
