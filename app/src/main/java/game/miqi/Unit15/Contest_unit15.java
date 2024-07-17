package game.miqi.Unit15;

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

public class Contest_unit15 extends AppCompatActivity {
    TextView hienthi,textscore,cau;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    ImageView back;
    MediaPlayer mediaPlayer;
    int score=0;
    int solansai=0;
    ArrayList<Integer> list;
    String[] question={"People used to consider women to be better_________ for childbearing and\n" +
            "homemaking","In the past, men seemed to_________ their duties at home.",
            "Nowadays, women have gained significant legal_________.",
            "When you are finished using the computer, can you please ______ it off.",
            "When the alarm (went off), everyone proceeded calmly to the emergency exits",
            "(Look out). There is a rattlesnake under the picnic table!",
            "Mrs. Jones's husband (passed away) fast Friday. We are all shocked by the news.",
            "If you do not understand the word \"superstitious,\" (look it up) in the dictionary.",
            "Although the team was both mentally and physically exhausted, they ________ on walking. ",
            "Before the plane ________ off, the flight attendant told everyone to fasten their seat belts and put their chairs in an upright position."
,"Don't forget to ________ your gloves on. It is cold outside.","If you don't pay your rent, your landlord is going to (kick you out)! " ,
    "Let's (go over) that report again before we submit it","At any competition, everyone is ________.","(Childbearing) is the women's most wonderful role.",
    "Although I did not totally agree ________ feminist's policies, I certainly admired their audacity, dedication and courage.",
    "Peter ________ when we came into the discotheque.",
    "It took women a long time to struggle ________ the right to vote",
    "I think women are suited ________ many important things, besides childbearing and homemaking.",
            "A lot of cows ________ on a productive farm.",
    "Try this question. It is ________."};
    String [][]traloi={{"regarded","suited","understood","kept"},
            {"expect","inspect","neglect","collect"},
            {"wrongs","rights","responsibilities","work"},
            {"take","turn","do","go"},
            {"fell","exploded","called","rang"},
            {"Listen","Be careful","Go","Watch"},
            {"got married","divorced","died","were on business"},
            {"find its meaning","write it","draw it","note it"},
            {"stopped","kept","took","put"},
            {"woke","brought","kept","took"},
            {"let","make","put","fix"},
            {"lend you some money","play football with you","give you a kick","force you to leave"},
            {"dictate","print","read carefully","type"},
            {"the same","equal","common","significant"},
            {"Giving birth to a baby","Having no child","Bring up a child","Educating a child"},
            {"for","with","along","up"},
            {"was dancing Mary","was dancing with Mary","was danced by Mary","had danced Mary"},
            {"for","with","against","upon"},
            {"of","on","for","about"},
            {"can raise","can be raising","can be raised","cannot raise"},
            {"less difficult","less and, less difficult","least difficult","more and more difficult"}};
    String[]Correct={"suited","neglect","rights","turn","rang","Be careful","died","find its meaning","kept","took",
    "put","force you to leave","read carefully","equal","Giving birth to a baby","with","was dancing with Mary",
            "for","for","can be raised","less difficult"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_unit15);
        textscore = (TextView) findViewById(R.id.score_unit15);
        cau = (TextView) findViewById(R.id.cau_unit15);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(Contest_unit15.this, R.raw.yeah);
        list = new ArrayList<>();
        for (int i = 0; i < Correct.length; i++) {
            list.add(i);
            Collections.shuffle(list);
        }
        init();
        updatequestion();
        sukienbutton();
        cau.setText("Câu: " + socau);
    }


    private void sukienbutton() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==19)
                {
                    Intent intent = new Intent(Contest_unit15.this, Result_unit15.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit15",score);
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

                    Intent intent = new Intent(Contest_unit15.this, Result_unit15.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit15",score);
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
                    Intent intent = new Intent(Contest_unit15.this, Result_unit15.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit15",score);
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
                    Intent intent = new Intent(Contest_unit15.this, Result_unit15.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit15",score);
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

        AlertDialog.Builder builder = new AlertDialog.Builder(Contest_unit15.this);
        builder.setTitle("Do you want to give up ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        Intent intent = new Intent(Contest_unit15.this, Unit15.class);
                        startActivity(intent);
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
        hienthi=(TextView)findViewById(R.id.text_show_unit15);
        button1=(Button)findViewById(R.id.button1_unit15);
        button2=(Button)findViewById(R.id.button2_unit15);
        button3=(Button)findViewById(R.id.button3_unit15);
        button4=(Button)findViewById(R.id.button4_unit15);

    }
}