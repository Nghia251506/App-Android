package game.miqi.Unit13;

import android.content.DialogInterface;
import android.content.Intent;
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

public class Game_unit13 extends AppCompatActivity {

    Button button1,button2,button3,button4;
    int[]img={R.drawable.archery, R.drawable.athletics,R.drawable.badminton,R.drawable.basketball,
            R.drawable.chess,R.drawable.karatedo,
            R.drawable.pingpong,R.drawable.shooting,R.drawable.swimming,R.drawable.volleyball
            ,R.drawable.weightlifting};
    String[][]answer={{"Shooting","Weightlifting","Chess","Archery"},
            {"Badminton","Athletics","Pingpong","Volleyball"},
            {"Archery","Badminton","Chess","Weightlifting"},
            {"Football","Baseball","Volleyball","Basketball"},
            {"Badminton","Pingpong","Chess","Archery"},
            {"Chess","Wrestling","Wushu","Karatedo"},
            {"Chess","Shooting","Pingpong","Weightlifting"}
            ,{"Archery","Weightlifting","Shooting","Badminton",},
            {"Athletics","Swimming","Chess","Badminton"}
            ,{"Baseball","Basketball","Volleyball","Badminton"},
            {"Baseball","Weightlifting","Volleyball","Badminton"}};
    String[]Correct={"Archery","Athletics","Badminton",
            "Basketball","Chess","Karatedo","Pingpong","Shooting",
            "Swimming","Volleyball","Weightlifting"};
    ImageView imageView ;
    TextView question;
    ArrayList<Integer> arrayList ;
    int stt = 0;
    int score =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_unit13);
        question = (TextView)findViewById(R.id.question_game_unit13);
        button1 = (Button)findViewById(R.id.but1_game13);
        button2 = (Button)findViewById(R.id.but2_game13);
        button3 = (Button)findViewById(R.id.but3_game13);
        button4 = (Button)findViewById(R.id.but4_game13);
        imageView = (ImageView)findViewById(R.id.image_game_unit13);
        arrayList = new ArrayList<>();
        for(int i =0;i<img.length;i++)
        {
            arrayList.add(i);
            Collections.shuffle(arrayList);
        }
        capnhat();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button1.getText().equals(Correct[arrayList.get(stt)]))
                {
                    score+=1;
                    stt+=1;
                    if(stt==9)
                    {
                        Intent intent = new Intent(Game_unit13.this, ChienthangGame_unit13.class);
                        intent.putExtra("Score_result_unit13",score);

                        startActivity(intent);
                        finish();
                    }
                    capnhat();
                    Toasty.info(Game_unit13.this,"Wow", Toast.LENGTH_SHORT).show();
                }
                else{
                    stt+=1;
                    if(stt==9)
                    {
                        Intent intent = new Intent(Game_unit13.this, ChienthangGame_unit13.class);
                        intent.putExtra("Score_result_unit13",score);

                        startActivity(intent);
                        finish();
                    }
                    capnhat();
                    Toasty.error(Game_unit13.this,"Sai Rồi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button2.getText().equals(Correct[arrayList.get(stt)]))
                {
                    score+=1;
                    stt+=1;
                    if(stt==9)
                    {
                        Intent intent = new Intent(Game_unit13.this, ChienthangGame_unit13.class);
                        intent.putExtra("Score_result_unit13",score);

                        startActivity(intent);
                        finish();
                    }
                    capnhat();
                    Toasty.info(Game_unit13.this,"Wow", Toast.LENGTH_SHORT).show();
                }
                else{
                    stt+=1;
                    if(stt==9)
                    {
                        Intent intent = new Intent(Game_unit13.this, ChienthangGame_unit13.class);
                        intent.putExtra("Score_result_unit13",score);

                        startActivity(intent);
                        finish();
                    }
                    capnhat();
                    Toasty.error(Game_unit13.this,"Sai Rồi", Toast.LENGTH_SHORT).show();
                }

            }
        });
        //
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button3.getText().equals(Correct[arrayList.get(stt)]))
                {
                    score+=1;
                    stt+=1;
                    if(stt==9)
                    {
                        Intent intent = new Intent(Game_unit13.this, ChienthangGame_unit13.class);
                        intent.putExtra("Score_result_unit13",score);

                        startActivity(intent);
                        finish();
                    }
                    capnhat();
                    Toasty.info(Game_unit13.this,"Wow", Toast.LENGTH_SHORT).show();
                }
                else{
                    stt+=1;
                    if(stt==9)
                    {
                        Intent intent = new Intent(Game_unit13.this, ChienthangGame_unit13.class);
                        intent.putExtra("Score_result_unit13",score);

                        startActivity(intent);
                        finish();
                    }
                    capnhat();
                    Toasty.error(Game_unit13.this,"Sai Rồi", Toast.LENGTH_SHORT).show();
                }

            }
        });
        //
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button4.getText().equals(Correct[arrayList.get(stt)]))
                {
                    score+=1;
                    stt+=1;
                    if(stt==9)
                    {
                        Intent intent = new Intent(Game_unit13.this, ChienthangGame_unit13.class);
                        intent.putExtra("Score_result_unit13",score);

                        startActivity(intent);
                        finish();
                    }
                    capnhat();
                    Toasty.info(Game_unit13.this,"Wow", Toast.LENGTH_SHORT).show();
                }
                else{
                    stt+=1;
                    if(stt==9)
                    {
                        Intent intent = new Intent(Game_unit13.this,ChienthangGame_unit13.class);
                        intent.putExtra("Score_result_unit13",score);

                        startActivity(intent);
                        finish();
                    }
                    capnhat();
                    Toasty.error(Game_unit13.this,"Sai Rồi", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void capnhat() {
        imageView.setBackgroundResource(img[arrayList.get(stt)]);
        button1.setText(answer[arrayList.get(stt)][0]);
        button2.setText(answer[arrayList.get(stt)][1]);
        button3.setText(answer[arrayList.get(stt)][2]);
        button4.setText(answer[arrayList.get(stt)][3]);


    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Game_unit13.this);
        builder.setTitle("Do you want to give up ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(Game_unit13.this, Unit13.class);
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

}
