package game.miqi.Unit16;

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

public class Contest_unit16 extends AppCompatActivity {
    TextView hienthi,textscore,cau;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    ImageView back;
    MediaPlayer mediaPlayer;
    int score=0;
    int solansai=0;
    ArrayList<Integer> list;
    String[] question={"The major goal of ASEAN is to ____economic growth, social progress and cultural\n" +
            "development.","We are trying to control the ________ of the dollar on the world’s money markets.","_________ is the unit of money in many Latin American countries and the\n" +
            "Philippines.","The ASEAN was ________ on August 8th, 1967 in Bangkok, Thailand.",
            "We are _________ to produce employment by 50%.",
            "The _______ is increasing faster and faster.","All ASEAN countries are received equal rights and________.",
    "Throughout the 1970s, ASEAN embarked on a program of economic _______.",
            "2007 was the 40th anniversary of the _______ of ASEAN.","Vietnam asked for _______ to ASEAN in 1995.",
    "Companies now can exploit the opportunities presented by _______ integrated market\n" +
            "of increasingly prosperous consumers in the region of ASEAN","Among ASEAN's _______ greatest challenges are the integration of market diversity\n" +
            "and the transitional economies of its member countries","Integrating with _______ world's economy, ASEAN finds itself facing important\n" +
            "opportunities and challenges","They will campaign for the return of traditional lands and respect _______ national\n" +
            "rights and customs","Our country is trying its best to accelerate the rate ___ economic growth","Regional development activities have been carried out _______ ASEAN cooperation",
    "ASEAN economic cooperation _______ many areas, such as agriculture, industry,\n" +
            "services, transportations, and tourism","The ASEAN Security Community (ASC)aims to ensure that countries in the region\n" +
            "live at _______ with one another and in a democratic and harmonious environment","ASEAN's aims include the acceleration of economic growth, _______ progress,\n" +
            "cultural, development among its members, and the promotion of regional peace","A combined gross domestic _______ of the member countries of ASEAN has grown\n" +
            "at an average rate of around 6% per year","To build on the field of political and security cooperation, _______ ASEAN Leaders\n" +
            "have agreed to establish the ASEAN Security Community CASC)."};
    String [][]traloi={{"cooperate","accelerate","communicate","operate"},
            {"stable","stabilize","stability","stabilizer"},
            {"Baht","Ringed","Dollar","Peso"},
            {"established","begun","proved","seen"},
            {"aiming","finding","approving","accepting"},
            {"Gross Domestic Product","Gross Domestic Production","Growth Domestic Product","General Domestic Production"},
            {"justification","justifiable","justified","justify"},
            {"cooperate","cooperation","cooperative","cooperatively"},
            {"found","founder","foundation","founding"},
            {"admit","admission","admissive","admissible"},
            {"a","an","the","Ø"},
            {"a","an","the","Ø"},
            {"a","an","the","Ø"},
            {"to","with","on","for"},
            {"of","at","for","from"},
            {"under","for","into","off"},
            {"creates","contains","consists","covers"},
            {"peace","peaceful","peacefully","peaceable"},
            {"society","social","socially","socialize"},
            {"produce","productivity","production","product"},
            {"a","an","the","Ø"}};
    String[]Correct={"accelerate"
            ,"stability",
            "Peso",
            "established","aiming",
            "Gross Domestic Product","justification","cooperation",
    "foundation","admission","an","Ø","the","for","of","under","covers","peace","social","product","the"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_unit16);
        textscore = (TextView) findViewById(R.id.score_unit16);
        cau = (TextView) findViewById(R.id.cau_unit16);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(Contest_unit16.this, R.raw.yeah);
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
                    Intent intent = new Intent(Contest_unit16.this, Result_unit16.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit16",score);
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

                    Intent intent = new Intent(Contest_unit16.this, Result_unit16.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit16",score);
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
                    Intent intent = new Intent(Contest_unit16.this, Result_unit16.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit16",score);
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
                    Intent intent = new Intent(Contest_unit16.this, Result_unit16.class);
                    score+=1 ;
                    intent.putExtra("Score_result_unit16",score);
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

        AlertDialog.Builder builder = new AlertDialog.Builder(Contest_unit16.this);
        builder.setTitle("Do you want to give up ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(Contest_unit16.this, Unit16.class);
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
        hienthi=(TextView)findViewById(R.id.text_show_unit16);
        button1=(Button)findViewById(R.id.button1_unit16);
        button2=(Button)findViewById(R.id.button2_unit16);
        button3=(Button)findViewById(R.id.button3_unit16);
        button4=(Button)findViewById(R.id.button4_unit16);

    }
}