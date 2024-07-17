package game.miqi;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import game.miqi.Menu_Unit.Activity_Unit;


public class Class_Words extends AppCompatActivity {
    ImageView back_button;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,
    button23,button24,button25;
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,
            text16,text17,text18,text19,text20,text21,text22,text23,text24,text25 ;
    MediaPlayer mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8
            ,mediaPlayer9,mediaPlayer10,mediaPlayer11,mediaPlayer12,mediaPlayer13,mediaPlayer14,mediaPlayer15,
            mediaPlayer16,mediaPlayer17,mediaPlayer18,mediaPlayer19,mediaPlayer20,mediaPlayer21,mediaPlayer22,
            mediaPlayer23,mediaPlayer24,mediaPlayer25;



     String[]name={"Dinosaurs(1)","Extinction(2)","Awareness(2)","Buffallo(1)","Cabbages(1)",
             "Global(1)","Grass","Insect(1)","Dam", "Toxic Chemical",
             "Wetland(1)","Tortoise","Identify(2)","Exploitation(3)","Effort(1)",
             "Measure(1)","Evidence(1)","Benefit(1)","Hunt","Rhino","Zoo","Biodiversity(3)","Temperature(1)",
             "Construction(2)","Threaten(1)"};
    String[] main={"Khủng Long","Sự Tuyệt Chủng","Sự Nhận Thức","Con Trâu","Rau Cải Bắp","Quả Địa Cầu","Thảm Cỏ","Côn Trùng","Đập Nước",
            "Hóa Chất Độc Hại","Vùng Đất Ẩm Ướt","Con Rùa","Xác Định","Sự Khai Thác","Nỗ Lực","Biện Pháp"
            ,"Chứng Cứ","Lợi Ích","Săn Bắn","Tê Giác","Vườn Bách Thú","Đa Dạng Sinh Học","Nhiệt Độ","Công Trình","Đe Dọa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_class__words);
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
        mediaPlayer12 = new MediaPlayer();
        mediaPlayer13= new MediaPlayer();
        mediaPlayer14 = new MediaPlayer();
        mediaPlayer15 = new MediaPlayer();
        mediaPlayer16 = new MediaPlayer();
        mediaPlayer17 = new MediaPlayer();
        mediaPlayer18 = new MediaPlayer();
        mediaPlayer19 = new MediaPlayer();
        mediaPlayer20 = new MediaPlayer();
        mediaPlayer21 = new MediaPlayer();
        mediaPlayer22 = new MediaPlayer();
        mediaPlayer23= new MediaPlayer();
        mediaPlayer24 = new MediaPlayer();
        mediaPlayer25 = new MediaPlayer();
    mediaPlayer1 = MediaPlayer.create(Class_Words.this,R.raw.dinorsaurs);
        mediaPlayer2 = MediaPlayer.create(Class_Words.this,R.raw.extinction);
        mediaPlayer3 = MediaPlayer.create(Class_Words.this,R.raw.awarenesss);
        mediaPlayer4 = MediaPlayer.create(Class_Words.this,R.raw.buffalo);
        mediaPlayer5 = MediaPlayer.create(Class_Words.this,R.raw.cabbages);
        mediaPlayer6 = MediaPlayer.create(Class_Words.this,R.raw.global);
        mediaPlayer7 = MediaPlayer.create(Class_Words.this,R.raw.grasss);
        mediaPlayer8 = MediaPlayer.create(Class_Words.this,R.raw.insect);
        mediaPlayer9 = MediaPlayer.create(Class_Words.this,R.raw.dam);
       mediaPlayer10 = MediaPlayer.create(Class_Words.this,R.raw.toxicchemical);
        mediaPlayer11 = MediaPlayer.create(Class_Words.this,R.raw.wetland);
        mediaPlayer12 = MediaPlayer.create(Class_Words.this,R.raw.tortoise);
        mediaPlayer13 = MediaPlayer.create(Class_Words.this,R.raw.identify);
        mediaPlayer14 = MediaPlayer.create(Class_Words.this,R.raw.exploitation);
        mediaPlayer15 = MediaPlayer.create(Class_Words.this,R.raw.effort);
        mediaPlayer16 = MediaPlayer.create(Class_Words.this,R.raw.measure);
        mediaPlayer17 = MediaPlayer.create(Class_Words.this,R.raw.evidence);
        mediaPlayer18 = MediaPlayer.create(Class_Words.this,R.raw.benefit);
        mediaPlayer19 = MediaPlayer.create(Class_Words.this,R.raw.hunt);
        mediaPlayer20 = MediaPlayer.create(Class_Words.this,R.raw.rhino);
        mediaPlayer21 = MediaPlayer.create(Class_Words.this,R.raw.zoo);
        mediaPlayer22 = MediaPlayer.create(Class_Words.this,R.raw.biodiversity);
        mediaPlayer23 = MediaPlayer.create(Class_Words.this,R.raw.temperatures);
        mediaPlayer24 = MediaPlayer.create(Class_Words.this,R.raw.construction);
        mediaPlayer25 = MediaPlayer.create(Class_Words.this,R.raw.threaten);




           text1=(TextView)findViewById(R.id.main1);
           text2=(TextView)findViewById(R.id.main2);
           text3=(TextView)findViewById(R.id.main3);
           text4=(TextView)findViewById(R.id.main4);
           text5=(TextView)findViewById(R.id.main5);
           text6=(TextView)findViewById(R.id.main6);
           text7=(TextView)findViewById(R.id.main7);
           text8=(TextView)findViewById(R.id.main8);
           text9=(TextView)findViewById(R.id.main9);
           text10=(TextView)findViewById(R.id.main10);
           text11=(TextView)findViewById(R.id.main11);
           text12=(TextView)findViewById(R.id.main12);
           text13=(TextView)findViewById(R.id.main13);
           text14=(TextView)findViewById(R.id.main14);
           text15=(TextView)findViewById(R.id.main15);
           text16=(TextView)findViewById(R.id.main16);
           text17=(TextView)findViewById(R.id.main17);
           text18=(TextView)findViewById(R.id.main18);
           text19=(TextView)findViewById(R.id.main19);
           text20=(TextView)findViewById(R.id.main20);
        text21=(TextView)findViewById(R.id.main21);
        text22=(TextView)findViewById(R.id.main22);
        text23=(TextView)findViewById(R.id.main23);
        text24=(TextView)findViewById(R.id.main24);
        text25=(TextView)findViewById(R.id.main25);
           button1=(Button)findViewById(R.id.word1);
           button2=(Button)findViewById(R.id.word2);
           button3=(Button)findViewById(R.id.word3);
           button4=(Button)findViewById(R.id.word4);
           button5=(Button)findViewById(R.id.word5);
           button6=(Button)findViewById(R.id.word6);
           button7=(Button)findViewById(R.id.word7);
           button8=(Button)findViewById(R.id.word8);
           button9=(Button)findViewById(R.id.word9);
           button10=(Button)findViewById(R.id.word10);
           button11=(Button)findViewById(R.id.word11);
           button12=(Button)findViewById(R.id.word12);
           button13=(Button)findViewById(R.id.word13);
           button14=(Button)findViewById(R.id.word14);
           button15=(Button)findViewById(R.id.word15);
           button16=(Button)findViewById(R.id.word16);
           button17=(Button)findViewById(R.id.word17);
           button18=(Button)findViewById(R.id.word18);
           button19=(Button)findViewById(R.id.word19);
           button20=(Button)findViewById(R.id.word20);
        button21=(Button)findViewById(R.id.word21);
        button22=(Button)findViewById(R.id.word22);
        button23=(Button)findViewById(R.id.word23);
        button24=(Button)findViewById(R.id.word24);
        button25=(Button)findViewById(R.id.word25);



           button1.setText(name[0]);
           button2.setText(name[1]);
           button3.setText(name[2]);
           button4.setText(name[3]);
           button5.setText(name[4]);
           button6.setText(name[5]);
           button7.setText(name[6]);
           button8.setText(name[7]);
           button9.setText(name[8]);
           button10.setText(name[9]);
           button11.setText(name[10]);
           button12.setText(name[11]);
           button13.setText(name[12]);
           button14.setText(name[13]);
           button15.setText(name[14]);
           button16.setText(name[15]);
           button17.setText(name[16]);
           button18.setText(name[17]);
           button19.setText(name[18]);
           button20.setText(name[19]);
        button21.setText(name[19]);
        button22.setText(name[19]);
        button23.setText(name[19]);
        button24.setText(name[19]);
        button25.setText(name[19]);

           button1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                 mediaPlayer1.start();
                   text1.setText(main[0]);
               }
           });


           button2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer2.start();
                   text2.setText(main[1]);
               }
           });

           button3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer3.start();
                   text3.setText(main[2]);
               }
           });
           button4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer4.start();
                   text4.setText(main[3]);
               }
           });
           button5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer5.start();
                   text5.setText(main[4]);
               }
           });
           ;
           button6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer6.start();
                   text6.setText(main[5]);
               }
           });
           button7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer7.start();
                   text7.setText(main[6]);
               }
           });

           button8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer8.start();
                   text8.setText(main[7]);
               }
           });


           button9.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer9.start();
                   text9.setText(main[8]);
               }
           });

           button10.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer10.start();
                   text10.setText(main[9]);
               }
           });
           button11.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer11.start();
                   text11.setText(main[10]);
               }
           });
           button12.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer12.start();
                   text12.setText(main[11]);
               }
           });
           button13.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer13.start();
                   text13.setText(main[12]);
               }
           });
           button14.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer14.start();
                   text14.setText(main[13]);
               }
           });

           button15.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer15.start();
                   text15.setText(main[14]);
               }
           });

           button16.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer16.start();
                   text16.setText(main[15]);
               }
           });
           button17.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer17.start();
                   text17.setText(main[16]);
               }
           });
           button18.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer18.start();
                   text18.setText(main[17]);
               }
           });


           button19.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mediaPlayer19.start();
                   text19.setText(main[18]);
               }
           });
           button20.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                 //  mediaPlayer20.start();
                   text20.setText(main[19]);
               }
           });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  mediaPlayer20.start();
                text21.setText(main[20]);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  mediaPlayer20.start();
                text22.setText(main[21]);
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  mediaPlayer20.start();
                text23.setText(main[22]);
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  mediaPlayer20.start();
                text24.setText(main[23]);
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  mediaPlayer20.start();
                text25.setText(main[24]);
            }
        });


       }
    @Override
    public void onBackPressed() {
       Intent intent = new Intent(Class_Words.this,Activity_Unit.class);
       startActivity(intent);
       finish();
    }




























    }





















