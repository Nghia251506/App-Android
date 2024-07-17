package game.miqi.Unit11;

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

public class SpeakingU11 extends AppCompatActivity {
    Button but1, but2, but3, but4;
    TextView text_score;
    ImageView imageView;
    int stt = 0;
    int score = 0;
    int solansai = 0 ;
    ArrayList<Integer> kiemtra;
    String [][]answer ={{"Yes,I do","I often read book","Book is my life","Book very important"}
    ,{"I don't like book","Comic Book","Old Book","Funny Book"},{
        "I don't know","Doremon Book","When I was young","I love doremon book"}
    ,{"When Teacher remind","When I have free time","When friend remind","When I go swimming"}
    ,{"Money","Friend","Sadness","Knowledge"},
            {"No,you can't","That is hobby","Book is garbage","I love game"},
            {"Bookstore","School","Friend","Not"},
            {"4","Many Kind","3","Few kind"},
            {"Library have book","Not","Alright","Book is my life"},
            {"3","Many ways","4","Yes,it isn't"},
            {"Alright","No,it isn't","Very wasteful","Incorrect"}};
    String[] correct={"Yes,I do","Comic Book","Doremon Book","When I have free time","Knowledge"
            ,"That is hobby","Bookstore","Many Kind","Not","Many ways","Incorrect"};
    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6,
            mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10, mediaPlayer11;
    SoundPool soundPool;
    int id_yeah;
    int id_ohno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaking_u11);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC,1);
        id_yeah = soundPool.load(this, R.raw.yeah,1);
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

        mediaPlayer1 = MediaPlayer.create(SpeakingU11.this, R.raw.u11_1);
        mediaPlayer2 = MediaPlayer.create(SpeakingU11.this, R.raw.u11_2);
        mediaPlayer3 = MediaPlayer.create(SpeakingU11.this, R.raw.u11_3);
        mediaPlayer4 = MediaPlayer.create(SpeakingU11.this, R.raw.u11_4);
        mediaPlayer5 = MediaPlayer.create(SpeakingU11.this, R.raw.u11_5);
        mediaPlayer6 = MediaPlayer.create(SpeakingU11.this, R.raw.u11_6);
        mediaPlayer7 = MediaPlayer.create(SpeakingU11.this, R.raw.u11_7);
        mediaPlayer8 = MediaPlayer.create(SpeakingU11.this, R.raw.u11_8);
        mediaPlayer9 = MediaPlayer.create(SpeakingU11.this, R.raw.u11_9);
        mediaPlayer10 = MediaPlayer.create(SpeakingU11.this,R.raw.u11_10);
        mediaPlayer11 = MediaPlayer.create(SpeakingU11.this,R.raw.u11_11);

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
                    Intent intent = new Intent(SpeakingU11.this, ChienthangUnit11.class);
                    intent.putExtra("Score_speak_unit11",score+1);
                    startActivity(intent);
                }

                if(but1.getText().equals(correct[kiemtra.get(stt)]))
                {
                    soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(SpeakingU11.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                   solansai+=1;
                   if(solansai==3)
                   {
                       Intent intent = new Intent(SpeakingU11.this, ChienthangUnit11.class);
                       intent.putExtra("Score_speak_unit11",score);
                       startActivity(intent);
                       finish();
                   }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(SpeakingU11.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(SpeakingU11.this, ChienthangUnit11.class);
                    intent.putExtra("Score_speak_unit11",score+1);
                    startActivity(intent);
                    finish();
                }
                if(but2.getText().equals(correct[kiemtra.get(stt)]))
                {
                    soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(SpeakingU11.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(SpeakingU11.this, ChienthangUnit11.class);
                        intent.putExtra("Score_speak_unit11",score);
                        startActivity(intent);
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(SpeakingU11.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(SpeakingU11.this, ChienthangUnit11.class);
                    intent.putExtra("Score_speak_unit11",score+1);
                    startActivity(intent);
                    finish();
                }
                if(but3.getText().equals(correct[kiemtra.get(stt)]))
                {  soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(SpeakingU11.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(SpeakingU11.this, ChienthangUnit11.class);
                        intent.putExtra("Score_speak_unit11",score);
                        startActivity(intent);
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(SpeakingU11.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(SpeakingU11.this, ChienthangUnit11.class);
                    intent.putExtra("Score_speak_unit11",score+1);
                    startActivity(intent);
                    finish();
                }

                if(but4.getText().equals(correct[kiemtra.get(stt)]))
                {  soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(SpeakingU11.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(SpeakingU11.this,ChienthangUnit11.class);
                        intent.putExtra("Score_speak_unit11",score);
                        startActivity(intent);
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(SpeakingU11.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
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
        but1 = (Button)findViewById(R.id.button_sound_1_unit11);
        but2=(Button)findViewById(R.id.button_sound_2_unit11);
        but3=(Button)findViewById(R.id.button_sound_3_unit11);
        but4=(Button)findViewById(R.id.button_sound_4_unit11);
        text_score= (TextView)findViewById(R.id.score_speak_unit11);
        text_score.setText("Score: "+score);
        imageView=(ImageView) findViewById(R.id.hinhanhspeak_unit11);
    }

}
