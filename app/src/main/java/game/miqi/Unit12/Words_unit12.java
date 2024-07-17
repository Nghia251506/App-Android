package game.miqi.Unit12;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import game.miqi.R;


public class Words_unit12 extends AppCompatActivity {
    ImageView back_button;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20 ;
    MediaPlayer mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8
            ,mediaPlayer9,mediaPlayer10,mediaPlayer11,mediaPlayer12,mediaPlayer13,mediaPlayer14,mediaPlayer15,
            mediaPlayer16,mediaPlayer17,mediaPlayer18,mediaPlayer19,mediaPlayer20,mediaPlayer21,mediaPlayer22,
            mediaPlayer23,mediaPlayer24,mediaPlayer25;
    String[]name={"Pool","Deep","Vertical","Foul","Opponent","Net","Goalie","Sprint for","Passing","Pouching",
            "Holding","Defensive","Penalty","Free throw","Tie","Except","Referee's decision","Eject","Defeat",
            "Rowing","Scuba-diving","Windsurfing","Overtime","Period","Synchronized Swimming"};
    String[] main={"(N) Hồ Bơi","(Adj) Sâu","(N) cột dọc","(N) Lỗi","(N) Đối Thủ","(N) Lưới","(N) Thủ Môn",
            "(V) Đuổi Theo"," (V) Chuyền","(V) Đấm","(V) Giữ","(Adj) Phòng Ngự","(N) Phạt Đền","(V) Ném Tự Do",
            "(V) Đồng Hạng","(V) Ngoại Trừ","Quyết Định Của Trọng Tài","(V) Đuổi Ra","(V) Đánh Bại","(N) Chèo Thuyền",
            "(N) Môn Lặn","(N) Lướt Ván",
            "(N) Giờ bù thêm","(N) Giai Đoạn ","(N) Bơi Đồng Bộ"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_unit12);
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
        mediaPlayer1 = MediaPlayer.create(Words_unit12.this,R.raw.a1);
        mediaPlayer2 = MediaPlayer.create(Words_unit12.this,R.raw.a2);
        mediaPlayer3 = MediaPlayer.create(Words_unit12.this,R.raw.a3);
        mediaPlayer4 = MediaPlayer.create(Words_unit12.this,R.raw.a4);
        mediaPlayer5 = MediaPlayer.create(Words_unit12.this,R.raw.a5);
        mediaPlayer6 = MediaPlayer.create(Words_unit12.this,R.raw.a6);
        mediaPlayer7 = MediaPlayer.create(Words_unit12.this,R.raw.a7);
        mediaPlayer8 = MediaPlayer.create(Words_unit12.this,R.raw.a8);
        mediaPlayer9 = MediaPlayer.create(Words_unit12.this,R.raw.a9);
        mediaPlayer10 = MediaPlayer.create(Words_unit12.this,R.raw.a10);
        mediaPlayer11 = MediaPlayer.create(Words_unit12.this,R.raw.a11);
        mediaPlayer12 = MediaPlayer.create(Words_unit12.this,R.raw.a12);
        mediaPlayer13 = MediaPlayer.create(Words_unit12.this,R.raw.a13);
        mediaPlayer14 = MediaPlayer.create(Words_unit12.this,R.raw.a14);
        mediaPlayer15 = MediaPlayer.create(Words_unit12.this,R.raw.a15);
        mediaPlayer16 = MediaPlayer.create(Words_unit12.this,R.raw.a16);
        mediaPlayer17 = MediaPlayer.create(Words_unit12.this,R.raw.a17);
        mediaPlayer18 = MediaPlayer.create(Words_unit12.this,R.raw.a18);
        mediaPlayer19 = MediaPlayer.create(Words_unit12.this,R.raw.a19);
        mediaPlayer20 = MediaPlayer.create(Words_unit12.this,R.raw.a20);
        mediaPlayer21 = MediaPlayer.create(Words_unit12.this,R.raw.a21);
        mediaPlayer22 = MediaPlayer.create(Words_unit12.this,R.raw.a22);
        mediaPlayer23 = MediaPlayer.create(Words_unit12.this,R.raw.a23);
        mediaPlayer24 = MediaPlayer.create(Words_unit12.this,R.raw.a24);
        mediaPlayer25 = MediaPlayer.create(Words_unit12.this,R.raw.a25);




        text1=(TextView)findViewById(R.id.main1_unit12);
        text2=(TextView)findViewById(R.id.main2_unit12);
        text3=(TextView)findViewById(R.id.main3_unit12);
        text4=(TextView)findViewById(R.id.main4_unit12);
        text5=(TextView)findViewById(R.id.main5_unit12);
        text6=(TextView)findViewById(R.id.main6_unit12);
        text7=(TextView)findViewById(R.id.main7_unit12);
        text8=(TextView)findViewById(R.id.main8_unit12);
        text9=(TextView)findViewById(R.id.main9_unit12);
        text10=(TextView)findViewById(R.id.main10_unit12);
        text11=(TextView)findViewById(R.id.main11_unit12);
        text12=(TextView)findViewById(R.id.main12_unit12);
        text13=(TextView)findViewById(R.id.main13_unit12);
        text14=(TextView)findViewById(R.id.main14_unit12);
        text15=(TextView)findViewById(R.id.main15_unit12);
        text16=(TextView)findViewById(R.id.main16_unit12);
        text17=(TextView)findViewById(R.id.main17_unit12);
        text18=(TextView)findViewById(R.id.main18_unit12);
        text19=(TextView)findViewById(R.id.main19_unit12);
        text20=(TextView)findViewById(R.id.main20_unit12);
        button1=(Button)findViewById(R.id.word1_unit12);
        button2=(Button)findViewById(R.id.word2_unit12);
        button3=(Button)findViewById(R.id.word3_unit12);
        button4=(Button)findViewById(R.id.word4_unit12);
        button5=(Button)findViewById(R.id.word5_unit12);
        button6=(Button)findViewById(R.id.word6_unit12);
        button7=(Button)findViewById(R.id.word7_unit12);
        button8=(Button)findViewById(R.id.word8_unit12);
        button9=(Button)findViewById(R.id.word9_unit12);
        button10=(Button)findViewById(R.id.word10_unit12);
        button11=(Button)findViewById(R.id.word11_unit12);
        button12=(Button)findViewById(R.id.word12_unit12);
        button13=(Button)findViewById(R.id.word13_unit12);
        button14=(Button)findViewById(R.id.word14_unit12);
        button15=(Button)findViewById(R.id.word15_unit12);
        button16=(Button)findViewById(R.id.word16_unit12);
        button17=(Button)findViewById(R.id.word17_unit12);
        button18=(Button)findViewById(R.id.word18_unit12);
        button19=(Button)findViewById(R.id.word19_unit12);
        button20=(Button)findViewById(R.id.word20_unit12);


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


    }
    public void onBackPressed() {
        Intent intent = new Intent(Words_unit12.this, Unit12.class);
        startActivity(intent);
        finish();


    }




























}
