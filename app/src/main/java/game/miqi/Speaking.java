package game.miqi;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Collections;

import es.dmoral.toasty.Toasty;
import game.miqi.Menu_Unit.Activity_Unit;

public class Speaking extends AppCompatActivity {
    Button but1, but2, but3, but4;
    TextView text_score;
    ImageView imageView;
    int stt = 0;
    int score = 0;
    int solansai=0;
    String [][]answer ={{"Yes,I do","I love it","Alright","Ahead"},
            {"Yes,I know","Ahead","I love Animals","Alright"},
            {"Go left","10 pm","Of Course","I love animals"},
            {"Dinosaur","Frog","Rhino","Alright"},
            {"I like Animals","Rhino","This is Chicken","I don't know"},

            {"Catch Animals","Reduced hunting","Stop Exploited","Give more law"},
            {"In the sky","Rhino","Left","Alright"},
            {"Yes,I do","Bad action","Good action","Not"},
            {"Not","Yes,It is","Good","Lion"},
            {"I don't know","3 lions","1 the zoo","I don't know"},
            {"People","Toxic Snake","Pig","Deer"}};
    String[] correct={"Yes,I do","Ahead","Of Course","Alright","Rhino","Reduced hunting",
            "Left","Bad action","Yes,It is","3 lions","Toxic Snake"};
    SoundPool soundPool ;
    int id_yeah,id_ohno;
    ArrayList<Integer> kiemtra;
    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6, mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10, mediaPlayer11,
            mediaPlayer12, mediaPlayer13, mediaPlayer14, mediaPlayer15, mediaPlayer16, mediaPlayer17, mediaPlayer18, mediaPlayer19, mediaPlayer20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaking);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC,1);
        id_yeah = soundPool.load(this,R.raw.yeah,1);
        id_ohno = soundPool.load(this,R.raw.ohno,1);
        mediaPlayer1 = new MediaPlayer();
        mediaPlayer2 = new MediaPlayer();
        mediaPlayer3 = new MediaPlayer();
        mediaPlayer4 = new MediaPlayer();
        mediaPlayer5 = new MediaPlayer();
        mediaPlayer6 = new MediaPlayer();
        mediaPlayer7 = new MediaPlayer();
        mediaPlayer8 = new MediaPlayer();
        mediaPlayer9 = new MediaPlayer();
        mediaPlayer10 = new MediaPlayer();
        mediaPlayer11 = new MediaPlayer();
        mediaPlayer12 = new MediaPlayer();
        mediaPlayer13 = new MediaPlayer();
        mediaPlayer14 = new MediaPlayer();
        mediaPlayer15 = new MediaPlayer();
        mediaPlayer16 = new MediaPlayer();
        mediaPlayer17 = new MediaPlayer();
        mediaPlayer18 = new MediaPlayer();
        mediaPlayer19 = new MediaPlayer();
        mediaPlayer20 = new MediaPlayer();
        mediaPlayer1 = MediaPlayer.create(Speaking.this, R.raw.u10_1);
        mediaPlayer2 = MediaPlayer.create(Speaking.this, R.raw.u10_2);
        mediaPlayer3 = MediaPlayer.create(Speaking.this, R.raw.u10_3);
        mediaPlayer4 = MediaPlayer.create(Speaking.this, R.raw.u10_4);
        mediaPlayer5 = MediaPlayer.create(Speaking.this, R.raw.u10_5);
        mediaPlayer6 = MediaPlayer.create(Speaking.this, R.raw.u10_6);
        mediaPlayer7 = MediaPlayer.create(Speaking.this, R.raw.u10_7);
        mediaPlayer8 = MediaPlayer.create(Speaking.this, R.raw.u10_8);
        mediaPlayer9 = MediaPlayer.create(Speaking.this, R.raw.u10_9);
        mediaPlayer10 = MediaPlayer.create(Speaking.this,R.raw.u10_10);
        mediaPlayer11 = MediaPlayer.create(Speaking.this,R.raw.u10_11);

        kiemtra = new ArrayList<>();
        for (int i = 0; i < correct.length; i++) {
            kiemtra.add(i);
            Collections.shuffle(kiemtra);
        }



    init();

    capnhat();

    sukien();

}
    private void sukien() {
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(stt==9)
                {
                    Intent intent = new Intent(Speaking.this,ChienThang_speak.class);
                    intent.putExtra("Score_speak",score+1);
                    startActivity(intent);
                    finish();
                }

                if(but1.getText().equals(correct[kiemtra.get(stt)]))
                {   soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Speaking.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Speaking.this,ChienThang_speak.class);
                        intent.putExtra("Score_speak",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Speaking.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Speaking.this,ChienThang_speak.class);
                    intent.putExtra("Score_speak",score+1);
                    startActivity(intent);
                    finish();
                }
                if(but2.getText().equals(correct[kiemtra.get(stt)]))
                {    soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Speaking.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Speaking.this,ChienThang_speak.class);
                        intent.putExtra("Score_speak",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Speaking.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Speaking.this,ChienThang_speak.class);
                    intent.putExtra("Score_speak",score+1);
                    startActivity(intent);
                    finish();
                }
                if(but3.getText().equals(correct[kiemtra.get(stt)]))
                {     soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Speaking.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Speaking.this,ChienThang_speak.class);
                        intent.putExtra("Score_speak",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Speaking.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Speaking.this,ChienThang_speak.class);
                    intent.putExtra("Score_speak",score+1);
                    startActivity(intent);
                    finish();
                }

                if(but4.getText().equals(correct[kiemtra.get(stt)]))
                {   soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Speaking.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Speaking.this,ChienThang_speak.class);
                        intent.putExtra("Score_speak",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Speaking.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });






        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kiemtra.get(stt) ==0)
                {
                    mediaPlayer1.start();
                }
                if(kiemtra.get(stt) ==1)
                {
                    mediaPlayer2.start();
                }
                if(kiemtra.get(stt) ==2)
                {
                    mediaPlayer3.start();}
                if(kiemtra.get(stt) ==3)
                {
                    mediaPlayer4.start();}
                if(kiemtra.get(stt) ==4)
                {
                    mediaPlayer5.start(); }
                if(kiemtra.get(stt) ==5)
                {   mediaPlayer6.start(); }
                if(kiemtra.get(stt) ==6)
                {
                    mediaPlayer7.start(); }
                if(kiemtra.get(stt) ==7)
                {
                    mediaPlayer8.start(); }
                if(kiemtra.get(stt) ==8)
                {
                    mediaPlayer9.start(); }
                if(kiemtra.get(stt) ==9)
                {
                    mediaPlayer10.start(); }
                if(kiemtra.get(stt) ==10)
                {
                    mediaPlayer11.start(); }


    }});}

    private void capnhat() {
        Log.d("kiemtra",kiemtra.get(stt)+"");
            but1.setText(answer[kiemtra.get(stt)][0]);
            but2.setText(answer[kiemtra.get(stt)][1]);
            but3.setText(answer[kiemtra.get(stt)][2]);
            but4.setText(answer[kiemtra.get(stt)][3]);


    }

    private void init() {
        but1 = (Button)findViewById(R.id.button_sound_1);
        but2=(Button)findViewById(R.id.button_sound_2);
        but3=(Button)findViewById(R.id.button_sound_3);
        but4=(Button)findViewById(R.id.button_sound_4);
        text_score= (TextView)findViewById(R.id.score_speak);
        text_score.setText("Score: "+score);
        imageView=(ImageView) findViewById(R.id.hinhanhspeak);
    }
    @Override
    public void onBackPressed() {
      Intent intent = new Intent(Speaking.this,Activity_Unit.class);
      startActivity(intent);
      finish();
    }

}
