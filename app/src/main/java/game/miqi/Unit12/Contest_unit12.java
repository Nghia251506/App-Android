package game.miqi.Unit12;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Collections;

import es.dmoral.toasty.Toasty;
import game.miqi.R;

public class Contest_unit12 extends AppCompatActivity {
    TextView hienthi,textscore,cau;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    ImageView back;
    MediaPlayer mediaPlayer;
    int score=0;
    int solansai=0;
    ArrayList<Integer> list;
    String[]question={"One of the four period of time in which a game of American football is divided is\n" +
            "known as a _______.",
    "The _________ is the official who controls the game in some sports.",
    "A kick taken as a penalty in the game of football is called a penalty kick or\n" +
            "__________ kick.",
            "A _________ is a device that automatically controls something such as speed,\n" +
            "temperature or pressure.",
    "Rowing is the sport or activity of travelling in a boat by using ________",
    "Windsurfing or _______ is the sport of sailing on water standing on a windsurfer.",
    "Their ________ play lost them the match against an amateur team.","Don’t __________ in matters that do not concern you.",
    "I don’t know why he isn’t here at the moment. He ______ stuck in the traffic jam.","Never agree _________ something you know to be wrong.",
    "Never agree _________ something you know to be wrong.",
    "The place ________ good films is the Odeon Cinema.","It was my secretary ________ sent the document to Mr. Smith.",
    "They spent a lot of money _________ their children with the best education.",
    "I just bought __________ new shirt and some new shoes. ________ Shirt is quite\n" +
            "expensive but the price of _____ shoes are reasonable.",
    "I would like to thank my supervisor,________ I would never have finished my\n" +
            "work.",
    "Don’t spend time _______ about things that may never happen.",
    "Never __________ I experienced such a storm since I was a child.",
    "We need ________ information about this English course.",
    "The first water polo rules were set _______ by William Wilson in 1876.",
    "______ 1900, water polo has been in the program of the Olympic Games.",
    "Defensive players are not allowed to interfere ________ the opponent's movement"};
    String[][]traloi={{"part","half","quarter","stage"},
            {"player","captain","referee","defender"},
            {"punishment","foul","opposition","spot"},
            {"mask","regulator","boat","fin"},


            {"air tanks","sail","boards","oars"},
            {"boat-sailing","sail-boarding","board-sailing","wind-sailing"},
            {"false","foul","wrong","mistaken"},
            {"interfere","discuss","question","study"},
            {"must get","may be","should be","must have got"},
            {"doing","to do","you will do","that will do"},
            {"to see","seeing","can see","we see"},
            {"that","who","whom","A &B"},
            {"providing","provided","to provide","on providing"},
            {"a/ A/ the","a/ The/ a","the/ The/ the","a/ The/ the"},
            {"with whom","with him","with his help","without whom"},
            {"worried","worrying","to worry","and worry"},
            {"had","have","did","was"},
            {"far","farther","further","most of"},
            {"in","up","out","off"},
            {"in","by","for","since"},
            {"with","in","of","into"}};
    String[]Correct={"quarter","referee","spot","regulator","oars","board-sailing","foul","interfere","must get",
    "to do","to see","A &B","on providing","a/ The/ the","without whom","worrying","have","further","out","since","with"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_unit12);
        textscore = (TextView) findViewById(R.id.score_unit12);
        cau = (TextView) findViewById(R.id.cau_unit12);
        back = (ImageView) findViewById(R.id.back_unit12);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(Contest_unit12.this, R.raw.yeah);
        list = new ArrayList<>();
        for (int i = 0; i < Correct.length; i++) {
            list.add(i);
            Collections.shuffle(list);
        }
        init();
        updatequestion();
        sukienbutton();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Contest_unit12.this);
                builder.setTitle("Do you want to return ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                Intent intent = new Intent(Contest_unit12.this, Unit12.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();

                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
        cau.setText("Câu: " + socau);
    }


    private void sukienbutton() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==19)
                {
                    Intent intent = new Intent(Contest_unit12.this, Result_unit12.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit12",score);
                    startActivity(intent);
                    finish();
                }
                if(button1.getText().equals(Correct[list.get(stt)]))
                {

                    mediaPlayer.start();
                    Toasty.success(getApplicationContext(),"Very Good ", Toast.LENGTH_SHORT).show();

                    stt+=1;
                    socau+=1;
                    score+=1;
                    textscore.setText(score+"/20");
                    updatequestion();


                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +Correct[list.get(stt)] +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    solansai+=1 ;
                    updatequestion();




                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==19)
                {

                    Intent intent = new Intent(Contest_unit12.this, Result_unit12.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit12",score);
                    startActivity(intent);
                    finish();
                }
                if(button2.getText().equals(Correct[list.get(stt)]))
                {
                    mediaPlayer.start();
                    Toasty.success(getApplicationContext(),"Very Good ",Toast.LENGTH_SHORT).show();
                    stt+=1;
                    socau+=1;
                    updatequestion();
                    score+=1;
                    textscore.setText(score+"/20");

                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +Correct[list.get(stt)] +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    solansai+=1 ;
                    updatequestion();



                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==19)
                {
                    Intent intent = new Intent(Contest_unit12.this, Result_unit12.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit12",score);
                    startActivity(intent);
                    finish();
                }
                if(button3.getText().equals(Correct[list.get(stt)]))
                {
                    mediaPlayer.start();
                    Toasty.success(getApplicationContext(),"Very Good ",Toast.LENGTH_SHORT).show();
                    stt+=1;
                    socau+=1;
                    updatequestion();
                    score+=1;
                    textscore.setText(score+"/20");

                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +Correct[list.get(stt)] +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    solansai+=1 ;
                    updatequestion();



                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==19)
                {
                    Intent intent = new Intent(Contest_unit12.this, Result_unit12.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit12",score);
                    startActivity(intent);
                    finish();
                }
                if(button4.getText().equals(Correct[list.get(stt)]))
                {
                    mediaPlayer.start();
                    Toasty.success(getApplicationContext(),"Very Good ",Toast.LENGTH_SHORT).show();
                    stt+=1;
                    socau+=1;
                    updatequestion();
                    textscore.setText(score+"/20");
                    score+=1;


                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +Correct[list.get(stt)] +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    solansai+=1 ;
                    updatequestion();


                }

            }
        });
    }
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Contest_unit12.this);
        builder.setTitle("Do you want to return ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        Intent intent = new Intent(Contest_unit12.this, Unit12.class);
                        startActivity(intent);
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();

                    }
                });
        AlertDialog alertDialog =builder.create();
        alertDialog.show();

    }
    private void chienthang(){
        Toast.makeText(this,"You Win",Toast.LENGTH_SHORT);
    }
    private void updatequestion() {
        cau.setText("Câu: "+socau);
        hienthi.setText(question[list.get(stt)]);
        button1.setText(traloi[list.get(stt)][0]);
        button2.setText(traloi[list.get(stt)][1]);
        button3.setText(traloi[list.get(stt)][2]);
        button4.setText(traloi[list.get(stt)][3]);


    }
    private void init() {
        hienthi=(TextView)findViewById(R.id.text_show_unit12);
        button1=(Button)findViewById(R.id.button1_unit12);
        button2=(Button)findViewById(R.id.button2_unit12);
        button3=(Button)findViewById(R.id.button3_unit12);
        button4=(Button)findViewById(R.id.button4_unit12);

    }
}
