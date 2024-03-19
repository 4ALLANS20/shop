package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView rubbers=findViewById(R.id.imageView5);
        rubbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, rubbers.class);
                startActivity(intent);
                ImageView makavveli=findViewById(R.id.imageView8);
                makavveli.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1=new Intent(MainActivity.this, makavveli.class);
                        startActivity(intent1);
                        ImageView sneakers=findViewById(R.id.imageView7);
                        sneakers.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent2=new Intent(MainActivity.this, sneakers.class);
                                startActivity(intent2);
                                ImageView iphone=findViewById(R.id.imageView9);
                                iphone.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent3=new Intent(MainActivity.this, iphone.class);
                                        startActivity(intent3);
                                        ImageView blender=findViewById(R.id.imageView10);
                                        blender.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intent4=new Intent(MainActivity.this, blender.class);
                                                startActivity(intent4);
                                                ImageView speaker=findViewById(R.id.imageView11);
                                                speaker.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        Intent intent5=new Intent(MainActivity.this, speaker.class);
                                                        startActivity(intent5);
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });


    }
}