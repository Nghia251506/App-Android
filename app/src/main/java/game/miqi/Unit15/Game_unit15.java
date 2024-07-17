package game.miqi.Unit15;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.GridView;
import android.widget.TextView;


import com.plattysoft.leonids.ParticleSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import game.miqi.R;

public class Game_unit15 extends AppCompatActivity {
    String[] question = {"cimvilization","bealiefs","rowles","homemakinge","ingvolvement","bunsiness",
            "poplitics","widespreade","mintellectual",
    "conitrolled","destablish","staetus","phinlosophers","advocanted","duiscriminated","opuportunity","formali",
    "significanto","indinviduals","pimoneer","cheildbearing"};
    public TextView textScore ;
    int[]dapan={2,2,2,10,2,2,2,10,0,3,0,3,3,6,1,2,6,11,4,2,2};
    public  int score=0 ;
    Random random ;
    public char[]charquestion;
    public GridViewAdapter_unit15 adpater;
    public GridView gridView;
    public int stt=0;
    public  int solansai=0;
    public SoundPool soundPool;
    public int id_chienthang;
    public  int id_thatbai;
    public ArrayList<Integer> list ;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_unit15);
        gridView=(GridView)findViewById(R.id.question_unit15);
        textScore = (TextView)findViewById(R.id.scoregame_unit15);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(Game_unit15.this,R.raw.game_chinhthuc);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        list = new ArrayList<>();
        for(int i=0;i<dapan.length;i++)
        {
            list.add(i);
            Collections.shuffle(list);
        }

        textScore.setText("Score: "+score);
        capnhat(list.get(stt));
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC,1);
        id_chienthang = soundPool.load(this,R.raw.good,1);
        id_thatbai = soundPool.load(this,R.raw.ohno,1);
        adpater = new GridViewAdapter_unit15(Game_unit15.this,capnhat(list.get(stt)),dapan, Game_unit15.this);
        gridView.setAdapter(adpater);
        adpater.notifyDataSetChanged();


    }

    public char[] capnhat(int b) {
        charquestion= new char[question[b].length()];
        for (int a = 0; a<(question[b].length()); a++) {
            charquestion[a] = question[b].charAt(a);
        }
        return charquestion;

    }
    public void onClick(View arg0) {
        ParticleSystem ps = new ParticleSystem(this, 100, R.drawable.confeti, 1000);
        ps.setScaleRange(1f, 4f);
        ps.setSpeedRange(0.1f, 0.2f);
        ps.setRotationSpeedRange(90, 180);
        ps.setFadeOut(200, new AccelerateInterpolator());
        ps.oneShot(textScore, 70);

        ParticleSystem ps2 = new ParticleSystem(this, 100, R.drawable.confeti1, 1000);
        ps2.setScaleRange(1f, 4f);
        ps2.setSpeedRange(0.1f, 0.25f);
        ps.setRotationSpeedRange(90, 180);
        ps2.setFadeOut(200, new AccelerateInterpolator());
        ps2.oneShot(textScore, 70);
    }
    public  void chuyenmanhinh(){
        mediaPlayer.stop();
        Intent intent1 = new Intent(Game_unit15.this, Result_unit15.class);
        intent1.putExtra("Score_result_unit15",score);
        startActivity(intent1);
        finish();
    }
    @Override
    public void onBackPressed() {

                        mediaPlayer.stop();
                        Intent intent = new Intent(Game_unit15.this, Unit15.class);
                        startActivity(intent);
                        finish();



    }

}

