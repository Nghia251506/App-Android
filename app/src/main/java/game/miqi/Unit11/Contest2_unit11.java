package game.miqi.Unit11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.Collections;

import es.dmoral.toasty.Toasty;
import game.miqi.R;

public class Contest2_unit11 extends AppCompatActivity {
    ArrayList<Integer> list ;
    TextView hienthi;
    int scorem2 =0;
    int scorem1;
    String[]cauhoi={"Book that give the fact about real events, things, or people are called ‘________ \"","Fiction is a type of literature that describes __________ people and events",
            "A ________ novelist, she wrote more than forty books","_________ knowledge can be acquired from books, skills must be learned through\n" +
            "practice.",
            "I have only had time to___________ the report before going to the meeting.","Have you read the book by Nelson Mandela,__________ Long Way to Freedom?"
    ,"If you want to learn how to operate a computer. you should read its _____"
    ,"It was such a great book that I couldn't put it _______","She's busy writing a book ___________ astrology","The novel was set ________ a small village in France"};
    String[]correct={"non-fiction","Imaginary","prolific","Whereas","dip into","entitled","instruction manual","down","on"} ;
    String[][]answer={{"novel","biography","romance","non-fiction"},{"Imaginary","real","historic","important"},
            {"famous","popular","prolific","neglected"},{"Whereas","Whereof","Whereby","Wherefore"},{"taste","dip into","chew","swallow"},
            {"reviewed","revised","illustrated","entitled"},{"reference book","guidebook","instruction manual","craft book"},
            {"on","off","out","down"},{"in","of","on","for"},{"in","on","off","by"}};
    Button but1,but2,but3,but4;
    int stt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest2_unit11);
        hienthi = (TextView)findViewById(R.id.question_m_m) ;
        Bundle bundle = getIntent().getExtras();
        scorem1 = bundle.getInt("m1_first");
        but1 = (Button)findViewById(R.id.m_traloi1_m) ;
        but2 = (Button)findViewById(R.id.m_traloi2_m) ;
        but3 = (Button)findViewById(R.id.m_traloi3_m) ;
        but4 = (Button)findViewById(R.id.m_traloi4_m) ;

        list = new ArrayList<>();
        for(int i=0;i<correct.length;i++)
        {
            list.add(i);
            Collections.shuffle(list);
        }
        capnhat();
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(but1.getText().equals(correct[list.get(stt)]))
                {
                    stt+=1;
                    capnhat();
                    Toasty.success(Contest2_unit11.this,"Correct", Toast.LENGTH_SHORT).show();
                    scorem2+=1;
                    if(stt==8){

                        Intent intent = new Intent(Contest2_unit11.this,CompleteContest_unit11.class);
                        intent.putExtra("m1",scorem1);
                        intent.putExtra("m2",scorem2);
                        startActivity(intent);
                        finish();

                    }

                }else {
                    stt += 1;
                     capnhat();
                    if(stt==8)
                    {
                        Intent intent = new Intent(Contest2_unit11.this,CompleteContest_unit11.class);
                        intent.putExtra("m1",scorem1);
                        intent.putExtra("m2",scorem2);
                        startActivity(intent);
                        finish();

                    }

                    Toasty.error(Contest2_unit11.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(but2.getText().equals(correct[list.get(stt)]))
                {  stt+=1;
                    capnhat();

                    Toasty.success(Contest2_unit11.this,"Correct", Toast.LENGTH_SHORT).show();
                    scorem2+=1;
                    if(stt==8)
                    {
                        Intent intent = new Intent(Contest2_unit11.this,CompleteContest_unit11.class);
                        intent.putExtra("m1",scorem1);
                        intent.putExtra("m2",scorem2);
                        startActivity(intent);
                        finish();

                    }

                }else {
                    stt += 1;
                     capnhat();
                    if(stt==8)
                    {
                        Intent intent = new Intent(Contest2_unit11.this,CompleteContest_unit11.class);
                        intent.putExtra("m1",scorem1);
                        intent.putExtra("m2",scorem2);
                        startActivity(intent);
                        finish();

                    }

                    Toasty.error(Contest2_unit11.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(but3.getText().equals(correct[list.get(stt)]))
                {  stt+=1;
                capnhat();
                    Toasty.success(Contest2_unit11.this,"Correct", Toast.LENGTH_SHORT).show();
                    scorem2+=1;
                    if(stt==8){

                        Intent intent = new Intent(Contest2_unit11.this,CompleteContest_unit11.class);
                        intent.putExtra("m1",scorem1);
                        intent.putExtra("m2",scorem2);
                        startActivity(intent);
                        finish();

                    }

                }else {
                    stt += 1;

                     capnhat();
                    if(stt==8)
                    {
                        Intent intent = new Intent(Contest2_unit11.this,CompleteContest_unit11.class);
                        intent.putExtra("m1",scorem1);
                        intent.putExtra("m2",scorem2);
                        startActivity(intent);
                        finish();

                    }

                    Toasty.error(Contest2_unit11.this, "Incorrect", Toast.LENGTH_SHORT).show();




                }

            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(but4.getText().equals(correct[list.get(stt)]))
                {  stt+=1;
                 capnhat();
                    Toasty.success(Contest2_unit11.this,"Correct", Toast.LENGTH_SHORT).show();
                    scorem2+=1;
                    if(stt==8){

                        Intent intent = new Intent(Contest2_unit11.this,CompleteContest_unit11.class);
                        intent.putExtra("m1",scorem1);
                        intent.putExtra("m2",scorem2);
                        startActivity(intent);
                        finish();

                    }

                }else {
                    stt += 1;

                    capnhat();
                    if(stt==8)
                    {
                        Intent intent = new Intent(Contest2_unit11.this,CompleteContest_unit11.class);
                        intent.putExtra("m1",scorem1);
                        intent.putExtra("m2",scorem2);
                        startActivity(intent);
                        finish();

                    }

                    Toasty.error(Contest2_unit11.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });






    }

    private void capnhat() {

        but1.setText(answer[list.get(stt)][0]);
        but2.setText(answer[list.get(stt)][1]);
        but3.setText(answer[list.get(stt)][2]);
        but4.setText(answer[list.get(stt)][3]);
        hienthi.setText(cauhoi[list.get(stt)]);

    }


}
