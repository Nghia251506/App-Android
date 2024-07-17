package game.miqi.Unit15;

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
import game.miqi.R;

public class Listening_unit15 extends AppCompatActivity {
    Button but1, but2, but3, but4;
    TextView text_score;
    ImageView imageView;
    int stt = 0;
    int score = 0;
    int solansai=0;
    String [][]answer ={{"Love Neighbor","Hate Daddy","Love Mai","Both"},
            {"Housewife","Go out all day","Take care of family","Do Housework"},
            {"Of course not","Yes,It is","Alright","Yes of course"},
            {"Short Skirt","Helmet","T-shirt","Long Shirt"},
            {"Wrong","Right","Need to review","You're welcome"},

            {"Just love children.","Live alone","Working 24h","Loving and caring for the family"},
            {"Destruction rights","All rights","Equality rights","Nothing"},
            {"20/10","8/3","20/11","30/4"},
            {"20/10","8/3","5/1","2/9"},
            {"Useless","Help society develop","Living selfish","Nothing"},
            {"No,It isn't","Yes,It is","Wrong","Right"}};
    String[] correct={"Both","Take care of family","Yes of course","Long Shirt","Wrong","Loving and caring for the family"
            ,"Equality rights",
            "8/3","20/10","Help society develop","Right"};
    SoundPool soundPool ;
    int id_yeah,id_ohno;
    ArrayList<Integer> kiemtra;
    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6, mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10, mediaPlayer11,
            mediaPlayer12, mediaPlayer13, mediaPlayer14, mediaPlayer15, mediaPlayer16, mediaPlayer17, mediaPlayer18, mediaPlayer19, mediaPlayer20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening_unit15);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC,1);
        id_yeah = soundPool.load(this, R.raw.correct,1);
        id_ohno = soundPool.load(this,R.raw.incorrect,1);
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
        mediaPlayer1 = MediaPlayer.create(Listening_unit15.this, R.raw.p1);
        mediaPlayer2 = MediaPlayer.create(Listening_unit15.this, R.raw.p2);
        mediaPlayer3 = MediaPlayer.create(Listening_unit15.this, R.raw.p3);
        mediaPlayer4 = MediaPlayer.create(Listening_unit15.this, R.raw.p4);
        mediaPlayer5 = MediaPlayer.create(Listening_unit15.this, R.raw.p5);
        mediaPlayer6 = MediaPlayer.create(Listening_unit15.this, R.raw.p6);
        mediaPlayer7 = MediaPlayer.create(Listening_unit15.this, R.raw.p7);
        mediaPlayer8 = MediaPlayer.create(Listening_unit15.this, R.raw.p8);
        mediaPlayer9 = MediaPlayer.create(Listening_unit15.this, R.raw.p9);
        mediaPlayer10 = MediaPlayer.create(Listening_unit15.this,R.raw.p10);
        mediaPlayer11 = MediaPlayer.create(Listening_unit15.this,R.raw.p11);

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
                    Intent intent = new Intent(Listening_unit15.this, ChienthangListen_unit15.class);
                    intent.putExtra("Score_listen_unit15",score);
                    startActivity(intent);
                    finish();
                }

                if(but1.getText().equals(correct[kiemtra.get(stt)]))
                {   soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Listening_unit15.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Listening_unit15.this, ChienthangListen_unit15.class);
                        intent.putExtra("Score_listen_unit15",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Listening_unit15.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Listening_unit15.this, ChienthangListen_unit15.class);
                    intent.putExtra("Score_listen_unit15",score);
                    startActivity(intent);
                    finish();
                }
                if(but2.getText().equals(correct[kiemtra.get(stt)]))
                {    soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Listening_unit15.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Listening_unit15.this, ChienthangListen_unit15.class);
                        intent.putExtra("Score_listen_unit15",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Listening_unit15.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Listening_unit15.this, ChienthangListen_unit15.class);
                    intent.putExtra("Score_listen_unit15",score);
                    startActivity(intent);
                    finish();
                }
                if(but3.getText().equals(correct[kiemtra.get(stt)]))
                {     soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Listening_unit15.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Listening_unit15.this, ChienthangListen_unit15.class);
                        intent.putExtra("Score_listen_unit15",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Listening_unit15.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Listening_unit15.this, ChienthangListen_unit15.class);
                    intent.putExtra("Score_listen_unit15",score);
                    startActivity(intent);
                    finish();
                }

                if(but4.getText().equals(correct[kiemtra.get(stt)]))
                {   soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Listening_unit15.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Listening_unit15.this,ChienthangListen_unit15.class);
                        intent.putExtra("Score_listen_unit15",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Listening_unit15.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
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
        but1 = (Button)findViewById(R.id.button_sound_1_unit15);
        but2=(Button)findViewById(R.id.button_sound_2_unit15);
        but3=(Button)findViewById(R.id.button_sound_3_unit15);
        but4=(Button)findViewById(R.id.button_sound_4_unit15);
        text_score= (TextView)findViewById(R.id.score_listen_unit15);
        text_score.setText("Score: "+score);
        imageView=(ImageView) findViewById(R.id.hinhanhlisten_unit15);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Listening_unit15.this,Unit15.class);
        startActivity(intent);
        finish();
    }

}
