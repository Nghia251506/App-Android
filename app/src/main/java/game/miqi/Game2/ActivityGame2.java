package game.miqi.Game2;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


import com.plattysoft.leonids.ParticleSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import game.miqi.Menu_Unit.Activity_Unit;
import game.miqi.R;

public class ActivityGame2 extends AppCompatActivity {
    String[] question = {"Engdanogerous","Sopecies","Bottlen","Prostect","pecnalize","movempent","ansian"
            ,"existience","gulobal","amazhing","evermything","pareticipation",
            "endthusiasm","conmpetitor","goablie","vertincal","opptonent","digesnt","prencision","overwheolming"
            ,"siwallow","countrymane","pogdium","scoareboard","titleo"};
    public TextView textScore ;
    int[]dapan={6,1,6,3,2,5,1,5,1,4,4,3,2,2,3,5,3,5,3,7,1,10,2,3,5};
    public  int score=0 ;
    Random random ;
    public char[]charquestion;
    public GridViewAdapter adpater;
    public GridView gridView;
    public int stt=0;
    public  int solansai=0;
    public SoundPool soundPool;
   public int id_chienthang;
    public  int id_thatbai;
    public  ArrayList<Integer> list ;
    ImageView back ;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        gridView=(GridView)findViewById(R.id.question);
        textScore = (TextView)findViewById(R.id.scoregame2);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(ActivityGame2.this,R.raw.game_chinhthuc);
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
        adpater = new GridViewAdapter(ActivityGame2.this,capnhat(list.get(stt)),dapan, ActivityGame2.this);
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
                        Intent intent1 = new Intent(ActivityGame2.this, ChienThangGame2.class);
                        intent1.putExtra("Score_game2",score);
                        startActivity(intent1);
    }
    @Override
    public void onBackPressed() {


                        mediaPlayer.stop();
                        Intent intent = new Intent(ActivityGame2.this, Activity_Unit.class);
                        startActivity(intent);
                        finish();


    }

}
