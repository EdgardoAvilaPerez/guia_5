package org.dev4u.hv.guia5_ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class EjercicioActivity extends AppCompatActivity {
    ImageView img1,img2,img3;
    Button btn1,btn2,btn3;
    Animation animacion1,animacion2,animacion3;
    Boolean bjar,bj2,bj3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        animacion1 = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        animacion1.setDuration(1000);
        animacion1.setFillAfter(true);
        animacion2 = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        animacion2.setDuration(1000);
        animacion2.setFillAfter(true);
        animacion3 = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        animacion3.setDuration(1000);
        animacion3.setFillAfter(true);
        bjar=true;
        bj2=true;
        bj3=true;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img1.startAnimation(animacion1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img2.startAnimation(animacion2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img3.startAnimation(animacion3);
            }
        });
    }
}
