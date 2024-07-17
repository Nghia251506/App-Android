package game.miqi.Unit12;

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

public class Speaking_unit12 extends AppCompatActivity {
    Button but1, but2, but3, but4;
    TextView text_score;
    ImageView imageView;
    int stt = 0;
    int score = 0;
    int solansai = 0 ;
    ArrayList<Integer> kiemtra;
    String [][]answer ={{"Yes,I do","Center of City","The bus station","Alright"},
            {"I can lend","Yes,I do","No,I don't","I don't have money"},
            {"Very expensive","VND 70 thousand","One ice-cream","Ahead"},
            {"On the Sea","Near the Bus Statiton","In the Restaurant","Very important"},
            {"I forget","It is important","Regularly","Happy"},
            {"On the Road","Near the Super Market","Alright","West"},
            {"Too wide","Too Deep","I know","80 meters"},
            {"Too Deep","Ahead","I don't know","Quite Comfortable"},
            {"Front of pool","Swim very well","It is difficult","It is important"},
            {"Yes,I do","Swim is my life","I can swim for 3 hours",
            "No,I can't"},
            {"Alright","Yes,I can","I can swim","Yes,I did"}};
    String[] correct={"Center of City","I don't have money","VND 70 thousand","Near the Bus Statiton","Regularly","West","80 meters"
            ,"Quite Comfortable","Front of pool","Yes,I do","Yes,I did"};
    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6,
            mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10, mediaPlayer11;
    SoundPool soundPool ;
    int id_yeah,id_ohno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaking_unit12);
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

        mediaPlayer1 = MediaPlayer.create(Speaking_unit12.this, R.raw.u12_1);
        mediaPlayer2 = MediaPlayer.create(Speaking_unit12.this, R.raw.u12_2);
        mediaPlayer3 = MediaPlayer.create(Speaking_unit12.this, R.raw.u12_3);
        mediaPlayer4 = MediaPlayer.create(Speaking_unit12.this, R.raw.u12_4);
        mediaPlayer5 = MediaPlayer.create(Speaking_unit12.this, R.raw.u12_5);
        mediaPlayer6 = MediaPlayer.create(Speaking_unit12.this, R.raw.u12_6);
        mediaPlayer7 = MediaPlayer.create(Speaking_unit12.this, R.raw.u12_7);
        mediaPlayer8 = MediaPlayer.create(Speaking_unit12.this, R.raw.u12_8);
        mediaPlayer9 = MediaPlayer.create(Speaking_unit12.this, R.raw.u12_9);
        mediaPlayer10 = MediaPlayer.create(Speaking_unit12.this,R.raw.u12_10);
        mediaPlayer11 = MediaPlayer.create(Speaking_unit12.this,R.raw.u12_11);

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
                    Intent intent = new Intent(Speaking_unit12.this,ChienthangSpeak_unit12.class);
                    intent.putExtra("Score_speak_unit12",score+1);
                    startActivity(intent);
                    finish();
                }

                if(but1.getText().equals(correct[kiemtra.get(stt)]))
                {   soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Speaking_unit12.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Speaking_unit12.this,ChienthangSpeak_unit12.class);
                        intent.putExtra("Score_speak_unit12",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Speaking_unit12.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Speaking_unit12.this,ChienthangSpeak_unit12.class);
                    intent.putExtra("Score_speak_unit12",score+1);
                    startActivity(intent);
                    finish();
                }
                if(but2.getText().equals(correct[kiemtra.get(stt)]))
                {  soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Speaking_unit12.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Speaking_unit12.this,ChienthangSpeak_unit12.class);
                        intent.putExtra("Score_speak_unit12",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Speaking_unit12.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {
                    Intent intent = new Intent(Speaking_unit12.this,ChienthangSpeak_unit12.class);
                    intent.putExtra("Score_speak_unit12",score+1);
                    startActivity(intent);
                    finish();
                }
                if(but3.getText().equals(correct[kiemtra.get(stt)]))
                {   soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Speaking_unit12.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Speaking_unit12.this,ChienthangSpeak_unit12.class);
                        intent.putExtra("Score_speak_unit12",score);
                        startActivity(intent);
                        finish();

                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Speaking_unit12.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt==9)
                {Intent intent = new Intent(Speaking_unit12.this,ChienthangSpeak_unit12.class);
                    intent.putExtra("Score_speak_unit12",score+1);
                    startActivity(intent);
                    finish();
                }

                if(but4.getText().equals(correct[kiemtra.get(stt)]))
                {    soundPool.play(id_yeah,10,10,1,0,1);
                    stt+=1;
                    score+=1;
                    text_score.setText("Score: "+score);
                    Toasty.success(Speaking_unit12.this,"Yeah !", Toast.LENGTH_SHORT).show();
                    capnhat();

                }else {
                    soundPool.play(id_ohno,10,10,1,0,1);
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Speaking_unit12.this,ChienthangSpeak_unit12.class);
                        intent.putExtra("Score_speak_unit12",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    text_score.setText("Score: "+score);
                    Toasty.error(Speaking_unit12.this,"Quá Gà !", Toast.LENGTH_SHORT).show();
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
        but1 = (Button)findViewById(R.id.button_sound_1_unit12);
        but2=(Button)findViewById(R.id.button_sound_2_unit12);
        but3=(Button)findViewById(R.id.button_sound_3_unit12);
        but4=(Button)findViewById(R.id.button_sound_4_unit12);
        text_score= (TextView)findViewById(R.id.score_speak_unit12);
        text_score.setText("Score: "+score);
        imageView=(ImageView) findViewById(R.id.hinhanhspeak_unit12);
    }

}
