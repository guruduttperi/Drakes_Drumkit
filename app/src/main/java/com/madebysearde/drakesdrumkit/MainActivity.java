package com.madebysearde.drakesdrumkit;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants

    private final int NR_OF_SIMULTANEOUS_SOUNDS = 12;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // Variables and SoundPool
    private SoundPool drakePool;
    private int drakekickID;
    private int drakekick2ID;
    private int drakeclapID;
    private int drakesnapID;
    private int drakesnareID;
    private int drakeknockID;
    private int drakestickID;
    private int drakehatID;
    private int drakehhID;
    private int draketriangleID;
    private int drakevoxID;
    private int drakehotlineID;



    ImageButton red_btn, blue_btn, yellow_btn, orange_btn, black_btn, grey_btn, pink_btn, violet_btn, prussian_btn, mint_btn, green_btn, canary_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // IDing the ImageButtons

        red_btn = (ImageButton)findViewById(R.id.red_btn);
        blue_btn = (ImageButton)findViewById(R.id.blue_btn);
        yellow_btn = (ImageButton)findViewById(R.id.yellow_btn);
        green_btn = (ImageButton)findViewById(R.id.green_btn);
        orange_btn = (ImageButton)findViewById(R.id.orange_btn);
        black_btn = (ImageButton)findViewById(R.id.black_btn);
        violet_btn = (ImageButton)findViewById(R.id.violet_btn);
        mint_btn = (ImageButton)findViewById(R.id.mint_btn);
        grey_btn = (ImageButton)findViewById(R.id.grey_btn);
        pink_btn = (ImageButton)findViewById(R.id.pink_btn);
        canary_btn = (ImageButton)findViewById(R.id.canary_btn);
        prussian_btn = (ImageButton)findViewById(R.id.prussian_btn);

        // TODO: Create a new SoundPool

        drakePool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);


        // TODO: Load and get the IDs to identify the sounds

        drakekickID = drakePool.load(getApplicationContext(), R.raw.drake_kick,1);
        drakekick2ID = drakePool.load(getApplicationContext(), R.raw.drake_kick2,1);
        drakeclapID = drakePool.load(getApplicationContext(), R.raw.drake_clap,1);
        drakesnapID = drakePool.load(getApplicationContext(), R.raw.drake_snap,1);
        drakesnareID = drakePool.load(getApplicationContext(), R.raw.drake_snare,1);
        drakeknockID = drakePool.load(getApplicationContext(), R.raw.drake_knock,1);
        drakestickID = drakePool.load(getApplicationContext(), R.raw.drake_stick,1);
        drakehatID = drakePool.load(getApplicationContext(), R.raw.drake_hat,1);
        drakehhID = drakePool.load(getApplicationContext(), R.raw.drake_hh,1);
        draketriangleID = drakePool.load(getApplicationContext(), R.raw.drake_triangle,1);
        drakevoxID = drakePool.load(getApplicationContext(), R.raw.drake_vox,1);
        drakehotlineID = drakePool.load(getApplicationContext(), R.raw.drake_hotline,1);


        // Functionalities - onClick

        red_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakekickID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });

        blue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakekick2ID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });


        yellow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakeclapID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });


        green_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakesnapID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });


        orange_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakesnareID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });

        black_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakeknockID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });

        violet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakestickID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });

        mint_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakehatID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });

        grey_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakehhID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });

        pink_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(draketriangleID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });

        canary_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakevoxID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });

        prussian_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drakePool.play(drakehotlineID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
    }

}

