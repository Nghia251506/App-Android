package game.miqi.Unit13;

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

public class Contest_unit13 extends AppCompatActivity {
    TextView hienthi,textscore,cau;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    ImageView back;
    MediaPlayer mediaPlayer;
    int score=0;
    int solansai=0;
    ArrayList<Integer> list;
    String [] question = {"The Games impressed sports enthusiasts _________ operation for peace and\n" +
            "development.","They will have opportunity to participate__________ the 25th Sea Games next year.",
            "Thanks________ their talent and determination, the Vietnamese Women's Football\n" +
                    "Team successfully defended the Sea Games title","John is _______ only child in his family so his parents love him a lot."," The champion successfully _________ his title against the American challenger","The 25th Sea Games will be held in Lao. It is Lao’s first time as the ______ for the\n" +
            "games.","In November, 1997, Brunei was _________ as official member, raising total of\n" +
            "members to 10.","With greatly increased workloads, everyone is _______ pressure now.",
            "Thailand is our strongest __________ in Southeast Asia's Men's Soccer","You have to be highly __________ to do well in sport these days.","The SEA Game_________ every two years, with 11 country in Southeast Asia\n" +
            "participating","Some teams such as table tennis, badminton, karatedo were composed________ top\n" +
            "competitors in the region.","_______January, 5th 1977, Indonesia and Philippines joined the federation.","They finished the season ________the top of the league","To prepare for the SEA Games, Vietnam_______ an intensive program for its\n" +
            "athletes.","The South Asian Peninsula Games Federation officially was_________ in\n" +
            "Bangkok in 1459.","The 21 SEA Games has become a festival that impressed people with the ______of\n" +
            "\"solidarity, cooperation for peace and development\",","Spectators had great ________for the amazing results that Vietnam’s sports\n" +
            "delegation gained.","Minister Thai expressed thanks to the athletes and sport teams for their\n" +
            "_________competition and congratulated the medal winners.","All activities took place as scheduled in an atmosphere of ________ and friendship\n" +
            "among Southeast Asian people.","A spectacular art performance program with the _________of 300 musicians and\n" +
            "500 artists was held to welcome the success of the Games."};
    String[]Correct={"with","in","to","the","defended","host","recognized","under","rival","competitive","takes place","of","in","at","carried out","set up",
            "spirit","admiration","whole-hearted","solidarity","participation"};
    String[][]traloi={{"for","about","with","on"},{"on","at","to","in"},{"to","for","of","about"},
            {"a","an","the","no article"},{"protected","defended","retained","won"},{"host","competitor","supporter","participant"},
            {"proposed","organized","recognized","presented"},{"under","above","upon","out of"},{"athlete","rival","spectator","player"},
            {"competed","competitor","competition","competitive"},{"comes down","sets up","takes place","brings about"},
            {"of","with","for","in"},{"in","on","since","from"},{"in","on","at","to"},{"carried over","carried on","carried through","carried out"}
            ,{"set up","come out","brought down","put up"},{"morale","spirit","essence","sense"},
            {"admire","admirable","admiration","admiter"},
            {"cut-throat","knock-out","close-knit","whole-hearted"},{"solidarity","determination","admiration","presentation"},
            {"participate","participants","participation","participating"}
           };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_unit13);
        textscore = (TextView) findViewById(R.id.score_unit13);
        cau = (TextView) findViewById(R.id.cau_unit13);
        back = (ImageView) findViewById(R.id.back_unit13);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(Contest_unit13.this, R.raw.yeah);
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

                AlertDialog.Builder builder = new AlertDialog.Builder(Contest_unit13.this);
                builder.setTitle("Do you want to return ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(Contest_unit13.this, Unit13.class);
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
                    Intent intent = new Intent(Contest_unit13.this, Result_unit13.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit13",score);
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

                    Intent intent = new Intent(Contest_unit13.this, Result_unit13.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit13",score);
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
                    Intent intent = new Intent(Contest_unit13.this, Result_unit13.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit13",score);
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
                    Intent intent = new Intent(Contest_unit13.this, Result_unit13.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit13",score);
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

        AlertDialog.Builder builder = new AlertDialog.Builder(Contest_unit13.this);
        builder.setTitle("Do you want to return ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(Contest_unit13.this, Unit13.class);
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
        hienthi=(TextView)findViewById(R.id.text_show_unit13);
        button1=(Button)findViewById(R.id.button1_unit13);
        button2=(Button)findViewById(R.id.button2_unit13);
        button3=(Button)findViewById(R.id.button3_unit13);
        button4=(Button)findViewById(R.id.button4_unit13);

    }
}