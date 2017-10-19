package com.example.paola.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Splash extends AppCompatActivity {

    @BindView(R.id.IvGitHub)
    ImageView IvGitHub;
    @BindView(R.id.TvGitHub)
    TextView TvGitHub;
    @BindView(R.id.TvTextoGH)
    TextView TvTextoGH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        ButterKnife.bind(this);

        Animation myAnimacion = AnimationUtils.loadAnimation(this,R.anim.mi_transicion);
        TvGitHub.startAnimation(myAnimacion);
        TvTextoGH.startAnimation(myAnimacion);
        IvGitHub.startAnimation(myAnimacion);

        final Intent intent = new Intent(this,MainActivity.class);

        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };

        timer.start();

    }
}
