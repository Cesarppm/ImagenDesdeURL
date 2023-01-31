package com.example.imagendesdeurl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv, iv2, iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv= findViewById(R.id.imageView);
        iv2 = findViewById(R.id.imageView2);
        iv3 = findViewById(R.id.imageView3);

        String url = "http://i.annihil.us/u/prod/marvel/i/mg/c/80/5e3d7536c8ada.jpg";
        String url2 = "http://i.annihil.us/u/prod/marvel/i/mg/f/c0/4bc66d78f1bee.jpg";
        String url3 = "https://i.annihil.us/u/prod/marvel/i/mg/f/20/4bc69f33cafc0.jpg";

        Picasso.get().load(url).into(iv);
        Picasso.get().load(url2).into(iv2);
        Picasso.get().load(url3).into(iv3);

    }
}