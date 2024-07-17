
package game.miqi.Unit11;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import game.miqi.R;

public class Words extends AppCompatActivity {
    ImageView back_button;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20 ;
    MediaPlayer mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8
            ,mediaPlayer9,mediaPlayer10,mediaPlayer11,mediaPlayer12,mediaPlayer13,mediaPlayer14,mediaPlayer15,
            mediaPlayer16,mediaPlayer17,mediaPlayer18,mediaPlayer19,mediaPlayer20,mediaPlayer21,mediaPlayer22,
            mediaPlayer23,mediaPlayer24,mediaPlayer25;
    String[]name={"Advantage(2)","Chew(1)","Comprehension(3)","Digest(1)","Discovery(1)",
            "Element(1)","Expertise(2)","Explain(2)","Fascinating(1)", "Forecast(1)",
            "Freezer(1)","Horizon(2)","Inspirational(3)","Literature(3)","Reunite(3)",
            "Swallow(1)","Taste(1)","Unnoticed(2)","Wilderness(1)","Reviewer(2)","Dip into","Hard-to-put-down",
            "Hard-to-pick-up-again","Fiction Books","Incredible(2)"};
    String[] main={"Lợi Thế","Nghiền ngẫm","Sự Nhận Thức","Đọc và Suy ngẫm","Sự Khám Phá","Thành phần","Sự Tinh Thông",
            "Giải Thích","Hấp Dẫn",
            "Dự Đoán","Máy Ướp Lạnh","Đường Chân Trời","Gây Cảm Hứng","Văn Học","Đoàn Tụ","Đọc Ngốn Ngấu"
            ,"Đọc Qua Loa","Không Để Ý","Vùng Hoang Dã","Nhà Đánh Giá","Đọc Lướt Qua","Không Thể Đặt Xuống",
            "Khó có thể cầm lên lại","Sách Tiểu Thuyết","Đáng Kinh Ngạc"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        init();
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
        mediaPlayer1 = MediaPlayer.create(Words.this,R.raw.advantage);
        mediaPlayer2 = MediaPlayer.create(Words.this,R.raw.chew);
        mediaPlayer3 = MediaPlayer.create(Words.this,R.raw.comprehension);
        mediaPlayer4 = MediaPlayer.create(Words.this,R.raw.digest);
        mediaPlayer5 = MediaPlayer.create(Words.this,R.raw.discovery);
        mediaPlayer6 = MediaPlayer.create(Words.this,R.raw.element);
        mediaPlayer7 = MediaPlayer.create(Words.this,R.raw.expertise);
        mediaPlayer8 = MediaPlayer.create(Words.this,R.raw.explain);
        mediaPlayer9 = MediaPlayer.create(Words.this,R.raw.fascinating);
        mediaPlayer10 = MediaPlayer.create(Words.this,R.raw.forecast);
        mediaPlayer11 = MediaPlayer.create(Words.this,R.raw.freezer);
        mediaPlayer12 = MediaPlayer.create(Words.this,R.raw.horizon);
        mediaPlayer13 = MediaPlayer.create(Words.this,R.raw.inspirational);
        mediaPlayer14 = MediaPlayer.create(Words.this,R.raw.literature);
        mediaPlayer15 = MediaPlayer.create(Words.this,R.raw.reunite);
        mediaPlayer16 = MediaPlayer.create(Words.this,R.raw.swallow);
        mediaPlayer17 = MediaPlayer.create(Words.this,R.raw.taste);
        mediaPlayer18 = MediaPlayer.create(Words.this,R.raw.unnoticed);
        mediaPlayer19 = MediaPlayer.create(Words.this,R.raw.wilderness);
        mediaPlayer20 = MediaPlayer.create(Words.this,R.raw.reviewer);
        mediaPlayer21 = MediaPlayer.create(Words.this,R.raw.dipinto);
        mediaPlayer22 = MediaPlayer.create(Words.this,R.raw.hardtoputdown);
        mediaPlayer23 = MediaPlayer.create(Words.this,R.raw.hardtopickupagain);
        mediaPlayer24 = MediaPlayer.create(Words.this,R.raw.fictionbook);
        mediaPlayer25 = MediaPlayer.create(Words.this,R.raw.incredible);
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
                mediaPlayer20.start();
                text20.setText(main[19]);
            }
        });

    }

    private void init() {

        text1=(TextView)findViewById(R.id.main1_11);
        text2=(TextView)findViewById(R.id.main2_11);
        text3=(TextView)findViewById(R.id.main3_11);
        text4=(TextView)findViewById(R.id.main4_11);
        text5=(TextView)findViewById(R.id.main5_11);
        text6=(TextView)findViewById(R.id.main6_11);
        text7=(TextView)findViewById(R.id.main7_11);
        text8=(TextView)findViewById(R.id.main8_11);
        text9=(TextView)findViewById(R.id.main9_11);
        text10=(TextView)findViewById(R.id.main10_11);
        text11=(TextView)findViewById(R.id.main11_11);
        text12=(TextView)findViewById(R.id.main12_11);
        text13=(TextView)findViewById(R.id.main13_11);
        text14=(TextView)findViewById(R.id.main14_11);
        text15=(TextView)findViewById(R.id.main15_11);
        text16=(TextView)findViewById(R.id.main16_11);
        text17=(TextView)findViewById(R.id.main17_11);
        text18=(TextView)findViewById(R.id.main18_11);
        text19=(TextView)findViewById(R.id.main19_11);
        text20=(TextView)findViewById(R.id.main20_11);
        button1=(Button)findViewById(R.id.word1_11);
        button2=(Button)findViewById(R.id.word2_11);
        button3=(Button)findViewById(R.id.word3_11);
        button4=(Button)findViewById(R.id.word4_11);
        button5=(Button)findViewById(R.id.word5_11);
        button6=(Button)findViewById(R.id.word6_11);
        button7=(Button)findViewById(R.id.word7_11);
        button8=(Button)findViewById(R.id.word8_11);
        button9=(Button)findViewById(R.id.word9_11);
        button10=(Button)findViewById(R.id.word10_11);
        button11=(Button)findViewById(R.id.word11_11);
        button12=(Button)findViewById(R.id.word12_11);
        button13=(Button)findViewById(R.id.word13_11);
        button14=(Button)findViewById(R.id.word14_11);
        button15=(Button)findViewById(R.id.word15_11);
        button16=(Button)findViewById(R.id.word16_11);
        button17=(Button)findViewById(R.id.word17_11);
        button18=(Button)findViewById(R.id.word18_11);
        button19=(Button)findViewById(R.id.word19_11);
        button20=(Button)findViewById(R.id.word20_11);
    }
    public void onBackPressed() {

                        Intent intent = new Intent(Words.this, Unit11.class);
                        startActivity(intent);
        finish();


    }

}
