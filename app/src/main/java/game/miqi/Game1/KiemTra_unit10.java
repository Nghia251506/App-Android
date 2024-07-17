package game.miqi.Game1;

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
import game.miqi.Menu_Unit.Activity_Unit;
import game.miqi.R;

public class KiemTra_unit10 extends AppCompatActivity {
    TextView hienthi,textscore,cau;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    ImageView back;
    MediaPlayer mediaPlayer;
    int score=0;
    int solansai=0;
    String [] Correct={"needn't have studied","do","colder and colder","what the woman was","deep-seated","shall","had John gone out","how cold it was",
            "hadn't taken","to travel","civilization","Famine","the / Ø","broke down","devastation",
            "call it a day","stomach","reached","intent","caught","handling"};
    String [] question={"We found the exam extremely easy. We ________ so hard.","My parents always let me ____ what I think I should.",
    "It gets _______ when the winter is coming.","______ saying was so important that I asked everyone to stop talking and listen.",
    "A ________ problem, feeling, or belief is difficult to change because its causes have\n" +
            "been there for a long time.","Let's go to see that famous film, ____ we?","No sooner ____ than Mary came over.","I was surprised at ____ yesterday.",
    "He would still be alive today if he_________ that drug when he was in Spain.","Yuri Gagarin was the first person ________into space.","To preserve that ________, it was necessary to preserve the people that had created\n" +
            "it.","_______ is a situation in which large numbers of people have little or no food, and\n" +
            "many of them die.","In _______ 22nd SEA Games, Vietnam won 158 _______ gold medals.","The woman _______ when the police told her that her son had died.","When morning came, the scene of where the bomb had fallen was one of utter\n" +
            "_____.","When I finish writing this composition, I’m going to ________and go to bed.","Sheila had butterflies in her ________ before the interview.","After a lengthy debate, the spokesman announced the board had ________an\n" +
            "unanimous conclusion.","Andrew was ________ enough on becoming a professional singer and he didn’t want\n" +
            "to listen to anybody else’s advice.","Of all the paintings in the gallery, it was this one that really _______ my eye."
            ,"I thought that your ________ of that problem was excellent."};
    String [][] traloi={{"needn't study","needn't be studying","needn't have studied","needn't have been studied"},{"doing","did","done","do"}
    ,{"cold and cold","the coldest and coldest","more and more cold","colder and colder"},{"that the woman was","the woman was","what the woman was","what was the woman"}
    ,{"deep-seated","significant","dependent","intellectual"},{"don't","shall","won't","will"},
            {"has John gone out","John has gone out","had John gone out","have John gone out"},
            {"how cold it was","how was it cold","how cold was it","how it was cold"},{"weren't taking","hadn't taken","wouldn't take","didn't take"}
            ,{"travelling","has travelled","to travel","travelled"},
            {"civilize","civilization","civility","civil"},
            {"Disaster","Famine","Poverty","Flood"},
            {"Ø / the","the / Ø","a / the","the / the"},{"broke in","broke into","broke down","broke away"}
            ,{"damage","disruption","devastation","disturbance"},{"make time","hit the hay","hit the big time","call it a day"},
            {"face","heart","palms","stomach"},{"committed","solved","reached","compromised"},{"intent","eager","definite","certain"},
    {"grasped","snatched","caught","seized"},{"handling","conduct","running","approach"}};
    ArrayList<Integer> list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiem_tra_unit10);
        hienthi = (TextView) findViewById(R.id.text_show_kiemtra_unit10);
        textscore = (TextView) findViewById(R.id.score_kiemtra_unit10);
        cau = (TextView) findViewById(R.id.cau_kiemtra_unit10);
        back = (ImageView) findViewById(R.id.back_kiemtra_unit10);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(KiemTra_unit10.this, R.raw.yeah);
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

                AlertDialog.Builder builder = new AlertDialog.Builder(KiemTra_unit10.this);
                builder.setTitle("Do you want to return ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Intent intent = new Intent(KiemTra_unit10.this, Activity_Unit.class);
                                startActivity(intent);
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
                    Intent intent = new Intent(KiemTra_unit10.this, Result_unit10.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit10",score);
                    startActivity(intent);
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

                    Intent intent = new Intent(KiemTra_unit10.this, Result_unit10.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit10",score);
                    startActivity(intent);
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
                    Intent intent = new Intent(KiemTra_unit10.this, Result_unit10.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit10",score);
                    startActivity(intent);
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
                    Intent intent = new Intent(KiemTra_unit10.this, Result_unit10.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit10",score);
                    startActivity(intent);
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

        AlertDialog.Builder builder = new AlertDialog.Builder(KiemTra_unit10.this);
        builder.setTitle("Do you want to return ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        Intent intent = new Intent(KiemTra_unit10.this, Activity_Unit.class);
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
        hienthi=(TextView)findViewById(R.id.text_show_kiemtra_unit10);
        button1=(Button)findViewById(R.id.button1_kiemtra_unit10);
        button2=(Button)findViewById(R.id.button2_kiemtra_unit10);
        button3=(Button)findViewById(R.id.button3_kiemtra_unit10);
        button4=(Button)findViewById(R.id.button4_kiemtra_unit10);

    }
}