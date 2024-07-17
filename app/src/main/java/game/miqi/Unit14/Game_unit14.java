package game.miqi.Unit14;

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

public class Game_unit14 extends AppCompatActivity {
    public TextView textScore ;
    String[] question={"heasitation","strugglae","livelihoody","pelace","earthquankes","internantional","solhdiers",
    "demergencies","vulnearable","headquaerters","humanitariani",
            "prinsoners","treantment","epindemics","powverty","agenciy"};
    int[]dapan={2,7,10,2,8,7,3,0,5,7,12,3,4,3,2,5};
    public  int score=0 ;
    Random random ;
    public char[]charquestion;
    public GridViewAdapter_unit14 adpater;
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
        setContentView(R.layout.activity_game_unit14);
        gridView=(GridView)findViewById(R.id.question_unit14);
        textScore = (TextView)findViewById(R.id.scoregame2_unit14);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(Game_unit14.this,R.raw.game_chinhthuc);
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
        adpater = new GridViewAdapter_unit14(Game_unit14.this,capnhat(list.get(stt)),dapan, Game_unit14.this);
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
        Intent intent1 = new Intent(Game_unit14.this, ChienthangGame_unit14.class);
        intent1.putExtra("Score_game2",score);
        startActivity(intent1);
        finish();
    }
    @Override
    public void onBackPressed() {

                        mediaPlayer.stop();
                        Intent intent = new Intent(Game_unit14.this, Unit14.class);
                        startActivity(intent);
                        finish();




    }

}

