package game.miqi.Unit14;

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

public class Contest_unit14 extends AppCompatActivity {
    TextView hienthi,textscore,cau;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    ImageView back;
    MediaPlayer mediaPlayer;
    int score=0;
    int solansai=0;
    ArrayList<Integer> list;
    String [] question={"They are appealing __________ local business for sponsorship money."
            ,"The Red Cross is aimed_________ providing medical and other help to victims of\n" +
            "natural disasters.","WHO's main activities are carrying out research________ medical development and\n" +
            "improving health care","They have launched a(n) __________ to send food to the flood victims.","The British government has now suspended ______ aid to the area.",
    "_______for founding the Red Cross came from a Swiss called Jean Henri Dunant.",
            "The Red Cross provide relief in case of ______ such as floods, earth-quakes, and\n" +
            "hurricanes.","Protests died down when they realized that the new tax _____ to only 50p a week.","Failure to win the championship will _______in the dismissal of the coach.","He tried to_______to everyone to support him."
    ,"There was a hold-up on the road because a bridge had been_______away by the flood.",
            "He_______his life to helping the poor.","The Red Cross is a organization whose purpose is to help people in war time and\n" +
            "_______ disasters.","She got angry when they started to_______her private life.",
    "Her life was devoted _____the relief of suffering","An international medical conference initiated by Davidson resulted ____the birth of\n" +
            "the League of Red Cross Societies.","The WHO was established _____ 7 April 1948.",
            "On 25 April 1945, the UN ____ on International Organization began in San Francisco","The United Nations ____ is a golden rectangled building in New York City.","The WHO is financed by____ from member states and from donors.","More than 120 country offices carry out UNICEF's ____ through a unique program of\n" +
            "cooperation developed with host governments."};
    String[][]traloi={{"in","at","on","to"},{"in","at","to","for"},
            {"on","in","for","of"},{"aid","proposal","appeal","attraction"}
,{"human","humane","humanistic","humanitarian"},{"Research","Invention","Initiative","Ambition"}
,{"challenges","disasters","commodities","disadvantage"},
            {"added","reached","approached","amounted"},
            {"result","happen","affect","cause"},
            {"make","appeal","persuade","advise"},
            {"washed","flowed","blown","destroyed"},
            {"spent","experienced","dedicated","used"},
            {"commercial","political","military","humanitarian"},
            {"ask for","enquire after","ask about","enquire with"},
            {"on","for","in","to"},
            {"in","of","from","for"},
            {"in","on","since","from"},
            {"Committee","Federation","Council","Conference"},
            {"headcenter","headquarter","headship","headland"},
            {"contributing","contributors","contributions","contributory"},
            {"mission","chore","duty","assignment"}};
    String[]Correct={"to","to","on","appeal","humanitarian","Initiative","disasters","amounted","result","appeal","washed","dedicated",
    "humanitarian","ask about","to","in","on","Conference","headquarter","contributing","mission"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_unit14);
        textscore = (TextView) findViewById(R.id.score_unit14);
        cau = (TextView) findViewById(R.id.cau_unit14);
        back = (ImageView) findViewById(R.id.back_unit14);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(Contest_unit14.this, R.raw.yeah);
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

        AlertDialog.Builder builder = new AlertDialog.Builder(Contest_unit14.this);
        builder.setTitle("Do you want to return ?")
        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
public void onClick(DialogInterface dialog, int id) {
        finish();
        Intent intent = new Intent(Contest_unit14.this, Unit14.class);
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
        Intent intent = new Intent(Contest_unit14.this, Result_Unit14.class);
        score+=1 ;
        intent.putExtra("Score_result_unit14",score);
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

        Intent intent = new Intent(Contest_unit14.this, Result_Unit14.class);
        score+=1 ;
        intent.putExtra("Score_result_unit14",score);
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
        Intent intent = new Intent(Contest_unit14.this, Result_Unit14.class);
        score+=1 ;
        intent.putExtra("Score_result_unit14",score);
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
        Intent intent = new Intent(Contest_unit14.this, Result_Unit14.class);
        score+=1 ;
        intent.putExtra("Score_result_unit14",score);
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

        AlertDialog.Builder builder = new AlertDialog.Builder(Contest_unit14.this);
        builder.setTitle("Do you want to give up ?")
        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
public void onClick(DialogInterface dialog, int id) {
        Intent intent = new Intent(Contest_unit14.this, Unit14.class);
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
        hienthi=(TextView)findViewById(R.id.text_show_unit14);
        button1=(Button)findViewById(R.id.button1_unit14);
        button2=(Button)findViewById(R.id.button2_unit14);
        button3=(Button)findViewById(R.id.button3_unit14);
        button4=(Button)findViewById(R.id.button4_unit14);

        }
        }