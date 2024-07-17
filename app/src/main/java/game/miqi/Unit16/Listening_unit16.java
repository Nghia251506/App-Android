package game.miqi.Unit16;

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

public class Listening_unit16 extends AppCompatActivity {
    Button but1, but2, but3, but4;
    TextView text_score;
    ImageView imageView;
    int stt = 0;
    int score = 0;
    int solansai = 0 ;
    ArrayList<Integer> kiemtra;
    String[]correct={"Thailand",
            "Promote peace"
            ,"Naypyidaw",
            "Malaysia",
            "Bangkok",
            "10 countries"
            ,"Malay,Tamil,English"
            ,"No,it isn't","300,000 sq km","Bath","No,it isn't"};
    String[][]answer={{"Combodia","Thailand","Myanmar","VietNam","300,000 sq km","Bath"},
            {"Promote peace","Military development","Trade","Oil development"},
            {"Manila","Bangkok","Naypyidaw","Kualalumpur"}
            ,{"Thailand","Philippines","Malaysia","Indonesia"},
            {"Bangkok","Myanmar","VietNam","Singapore"},
            {"9 countries","12 countries","11 countries","10 countries"},
            {"English,Filipino","Thai,English","Tamil,English","Malay,Tamil,English"},
            {"No,it isn't","Yes,it is,","I don't know","There are 3 citys"},
            {"704 sq km","300,000 sq km","330,252 sq km","513,120 sq km"},
            {"Peso","Bath","Ringgit","Vietnamdong"},
            {"Yes,it is","No,it isn't","No,There aren't","Yes,There is"}};

    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6,
            mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10, mediaPlayer11;
    SoundPool soundPool;
    int id_yeah,id_ohno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening_unit16);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC,1);
        id_yeah = soundPool.load(this,R.raw.correct,1);
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

        mediaPlayer1 = MediaPlayer.create(Listening_unit16.this, R.raw.t1);
        mediaPlayer2 = MediaPlayer.create(Listening_unit16.this, R.raw.t2);
        mediaPlayer3 = MediaPlayer.create(Listening_unit16.this, R.raw.t3);
        mediaPlayer4 = MediaPlayer.create(Listening_unit16.this, R.raw.t4);
        mediaPlayer5 = MediaPlayer.create(Listening_unit16.this, R.raw.t5);
        mediaPlayer6 = MediaPlayer.create(Listening_unit16.this, R.raw.t6);
        mediaPlayer7 = MediaPlayer.create(Listening_unit16.this, R.raw.t7);
        mediaPlayer8 = MediaPlayer.create(Listening_unit16.this, R.raw.t8);
        mediaPlayer9 = MediaPlayer.create(Listening_unit16.this, R.raw.t9);
        mediaPlayer10 = MediaPlayer.create(Listening_unit16.this,R.raw.t10);
        mediaPlayer11 = MediaPlayer.create(Listening_unit16.this,R.raw.t11);

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
                    Intent intent = new Intent(Listening_unit16.this,ChienThangGame_unit16.class);
                    intent.putExtra("Score_listen_unit16",score+1);
                    startActivity(intent);
                    finish();
                }

                if(but1.getText().equals(correct[kiemtra.get(stt)]))
                {
                    soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Listening_unit16.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);

                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Listening_unit16.this,ChienThangGame_unit16.class);
                        intent.putExtra("Score_listen_unit16",score+1);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();

                    text_score.setText("Score: "+score);
                    Toasty.error(Listening_unit16.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Listening_unit16.this,ChienThangGame_unit16.class);
                    intent.putExtra("Score_listen_unit16",score+1);
                    startActivity(intent);
                    finish();
                }
                if(but2.getText().equals(correct[kiemtra.get(stt)]))
                {    soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Listening_unit16.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Listening_unit16.this,ChienThangGame_unit16.class);
                        intent.putExtra("Score_listen_unit16",score+1);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Listening_unit16.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Listening_unit16.this,ChienThangGame_unit16.class);
                    intent.putExtra("Score_listen_unit16",score+1);
                    startActivity(intent);
                    finish();
                }
                if(but3.getText().equals(correct[kiemtra.get(stt)]))
                {  soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Listening_unit16.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Listening_unit16.this,ChienThangGame_unit16.class);
                        intent.putExtra("Score_listen_unit16",score+1);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Listening_unit16.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Listening_unit16.this,ChienThangGame_unit16.class);
                    intent.putExtra("Score_listen_unit16",score+1);
                    startActivity(intent);
                    finish();
                }

                if(but4.getText().equals(correct[kiemtra.get(stt)]))
                {    soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Listening_unit16.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Listening_unit16.this,ChienThangGame_unit16.class);
                        intent.putExtra("Score_listen_unit16",score+1);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Listening_unit16.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
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
        but1 = (Button)findViewById(R.id.button_sound_1_unit16);
        but2=(Button)findViewById(R.id.button_sound_2_unit16);
        but3=(Button)findViewById(R.id.button_sound_3_unit16);
        but4=(Button)findViewById(R.id.button_sound_4_unit16);
        text_score= (TextView)findViewById(R.id.score_listen_unit16);
        text_score.setText("Score: "+score);
        imageView=(ImageView) findViewById(R.id.hinhanhlisten_unit16);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Listening_unit16.this,Unit16.class);
        startActivity(intent);
        finish();
    }

}
