package game.miqi.Unit14;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import game.miqi.R;


public class Words_unit14 extends AppCompatActivity {
    ImageView back_button;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11
            ,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,
            button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36;
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,
            text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30,text31,text32,text33,text34,text35,text36 ;
    MediaPlayer mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8
            ,mediaPlayer9,mediaPlayer10,mediaPlayer11,mediaPlayer12,mediaPlayer13,mediaPlayer14,mediaPlayer15,
            mediaPlayer16,mediaPlayer17,mediaPlayer18,mediaPlayer19,mediaPlayer20,mediaPlayer21,mediaPlayer22,mediaPlayer23,mediaPlayer24,
            mediaPlayer25,mediaPlayer26,mediaPlayer27,mediaPlayer28,mediaPlayer29,mediaPlayer30,mediaPlayer31,mediaPlayer32,mediaPlayer33,mediaPlayer34,mediaPlayer35,mediaPlayer36;
String[]main={"Hội Chữ Thập Đỏ","Quốc Tế","Nhân Đạo","Cơ Quan","Dâng hiến","Đau Khổ","Binh Lính","Người Dân","Tù Nhân",
"Chiến Tranh","Hòa Bình","Viện Trợ Về Y Tế","Nạn Nhân","Thảm Họa","Động Đất","Bệnh Dịch","Nạn Đói","Khinh Hoàng Bởi",
"Hội Nghị","Đại Biểu","Đưa Ra","Điều Trị","Thảm Họa","Cờ","Thông Qua","Đề Xuất","Liên Đoàn","Dễ Bị Tổn Thương","Nghèo Nàn",
"Trường Hợp Khẩn Cấp","Trụ Sở","Sóng Thần","Do Dự","Đấu Tranh","Kế Hoạch Hóa","Cuốn Trôi"};
String[] name={"The Red Cross","International(3)","Humanitarian(4)","Agency(1)","Dedicate(1)","Sufferings(1)","Soldiers(1)",
        "Civilians(2)",
"Prisoners(1)","War","Peace","Medical aid","Victims(1)","Disasters(2)","Earthquakes(1)",
        "Epidemics(3)","Famines(1)","Appalled by(2)","Conference(1)",
"Delegates(1)","Laying down","Treatment(1)","Disaster-stricken","Flag","Adopted(2)","Proposed(2)","Federation(3)"
        ,"Vulnerable(1)","Poverty(1)",
        "Emergencies(2)","Headquarters(2)",
"Tsunami(2)","Hesitation(3)","Struggle(1)","Livelihoods(1)","Wash away"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_unit14);
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
        mediaPlayer23 = new MediaPlayer();
        mediaPlayer24 = new MediaPlayer();
        mediaPlayer25 = new MediaPlayer();
        mediaPlayer26 = new MediaPlayer();
        mediaPlayer27 = new MediaPlayer();
        mediaPlayer28 = new MediaPlayer();
        mediaPlayer29 = new MediaPlayer();
        mediaPlayer30 = new MediaPlayer();
        mediaPlayer31 = new MediaPlayer();
        mediaPlayer32 = new MediaPlayer();
        mediaPlayer33 = new MediaPlayer();
        mediaPlayer34 = new MediaPlayer();
        mediaPlayer35 = new MediaPlayer();
        mediaPlayer36 = new MediaPlayer();



        mediaPlayer1 = MediaPlayer.create(Words_unit14.this,R.raw.c1);
        mediaPlayer2 = MediaPlayer.create(Words_unit14.this,R.raw.c2);
        mediaPlayer3 = MediaPlayer.create(Words_unit14.this,R.raw.c3);
        mediaPlayer4 = MediaPlayer.create(Words_unit14.this,R.raw.c4);
        mediaPlayer5 = MediaPlayer.create(Words_unit14.this,R.raw.c5);
        mediaPlayer6 = MediaPlayer.create(Words_unit14.this,R.raw.c6);;
        mediaPlayer7 = MediaPlayer.create(Words_unit14.this,R.raw.c7);
        mediaPlayer8 = MediaPlayer.create(Words_unit14.this,R.raw.c8);
        mediaPlayer9 = MediaPlayer.create(Words_unit14.this,R.raw.c9);
        mediaPlayer10 = MediaPlayer.create(Words_unit14.this,R.raw.c10);
        mediaPlayer11 = MediaPlayer.create(Words_unit14.this,R.raw.c11);
        mediaPlayer12 = MediaPlayer.create(Words_unit14.this,R.raw.c12);
        mediaPlayer13 = MediaPlayer.create(Words_unit14.this,R.raw.c13);
        mediaPlayer14 = MediaPlayer.create(Words_unit14.this,R.raw.c14);
        mediaPlayer15 = MediaPlayer.create(Words_unit14.this,R.raw.c15);
        mediaPlayer16 = MediaPlayer.create(Words_unit14.this,R.raw.c16);
        mediaPlayer17 = MediaPlayer.create(Words_unit14.this,R.raw.c17);
        mediaPlayer18 = MediaPlayer.create(Words_unit14.this,R.raw.c18);
        mediaPlayer19 = MediaPlayer.create(Words_unit14.this,R.raw.c19);
        mediaPlayer20 = MediaPlayer.create(Words_unit14.this,R.raw.c20);
        mediaPlayer21 = MediaPlayer.create(Words_unit14.this,R.raw.c21);
        mediaPlayer22 = MediaPlayer.create(Words_unit14.this,R.raw.c22);
        mediaPlayer23 = MediaPlayer.create(Words_unit14.this,R.raw.c23);
        mediaPlayer24 = MediaPlayer.create(Words_unit14.this,R.raw.c24);
        mediaPlayer25 = MediaPlayer.create(Words_unit14.this,R.raw.c25);
        mediaPlayer26 = MediaPlayer.create(Words_unit14.this,R.raw.c26);
        mediaPlayer27 = MediaPlayer.create(Words_unit14.this,R.raw.c27);
        mediaPlayer28 = MediaPlayer.create(Words_unit14.this,R.raw.c28);
        mediaPlayer29 = MediaPlayer.create(Words_unit14.this,R.raw.c29);
        mediaPlayer30 = MediaPlayer.create(Words_unit14.this,R.raw.c30);
        mediaPlayer31 = MediaPlayer.create(Words_unit14.this,R.raw.c31);
        mediaPlayer32 = MediaPlayer.create(Words_unit14.this,R.raw.c32);
        mediaPlayer33 = MediaPlayer.create(Words_unit14.this,R.raw.c33);
        mediaPlayer34 = MediaPlayer.create(Words_unit14.this,R.raw.c34);
        mediaPlayer35 = MediaPlayer.create(Words_unit14.this,R.raw.c35);
        mediaPlayer36 = MediaPlayer.create(Words_unit14.this,R.raw.c36);

        init();
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
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer21.start();
                text21.setText(main[20]);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer22.start();
                text22.setText(main[21]);
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer23.start();
                text23.setText(main[22]);
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
                text24.setText(main[23]);
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer25.start();
                text25.setText(main[24]);
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer26.start();
                text26.setText(main[25]);
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer27.start();
                text27.setText(main[26]);
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer28.start();
                text28.setText(main[27]);
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer29.start();
                text29.setText(main[28]);
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer30.start();
                text30.setText(main[29]);
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer31.start();
                text31.setText(main[30]);
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer32.start();
                text32.setText(main[31]);
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer33.start();
                text33.setText(main[32]);
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer34.start();
                text34.setText(main[33]);
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer35.start();
                text35.setText(main[34]);
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
                text36.setText(main[35]);
            }
        });



    }

    private void init() {
        text1=(TextView)findViewById(R.id.main1_unit14);
        text2=(TextView)findViewById(R.id.main2_unit14);
        text3=(TextView)findViewById(R.id.main3_unit14);
        text4=(TextView)findViewById(R.id.main4_unit14);
        text5=(TextView)findViewById(R.id.main5_unit14);
        text6=(TextView)findViewById(R.id.main6_unit14);
        text7=(TextView)findViewById(R.id.main7_unit14);
        text8=(TextView)findViewById(R.id.main8_unit14);
        text9=(TextView)findViewById(R.id.main9_unit14);
        text10=(TextView)findViewById(R.id.main10_unit14);
        text11=(TextView)findViewById(R.id.main11_unit14);
        text12=(TextView)findViewById(R.id.main12_unit14);
        text13=(TextView)findViewById(R.id.main13_unit14);
        text14=(TextView)findViewById(R.id.main14_unit14);
        text15=(TextView)findViewById(R.id.main15_unit14);
        text16=(TextView)findViewById(R.id.main16_unit14);
        text17=(TextView)findViewById(R.id.main17_unit14);
        text18=(TextView)findViewById(R.id.main18_unit14);
        text19=(TextView)findViewById(R.id.main19_unit14);
        text20=(TextView)findViewById(R.id.main20_unit14);
        text21=(TextView)findViewById(R.id.main20_unit14);
        text22=(TextView)findViewById(R.id.main20_unit14);
        text23=(TextView)findViewById(R.id.main20_unit14);
        text24=(TextView)findViewById(R.id.main20_unit14);
        text25=(TextView)findViewById(R.id.main20_unit14);
        text26=(TextView)findViewById(R.id.main20_unit14);
        text27=(TextView)findViewById(R.id.main20_unit14);
        text28=(TextView)findViewById(R.id.main20_unit14);
        text29=(TextView)findViewById(R.id.main20_unit14);
        text30=(TextView)findViewById(R.id.main20_unit14);
        text31=(TextView)findViewById(R.id.main20_unit14);
        text32=(TextView)findViewById(R.id.main20_unit14);
        text33=(TextView)findViewById(R.id.main20_unit14);
        text34=(TextView)findViewById(R.id.main20_unit14);
        text35=(TextView)findViewById(R.id.main20_unit14);
        text36=(TextView)findViewById(R.id.main20_unit14);





        button1=(Button)findViewById(R.id.word1_unit14);
        button2=(Button)findViewById(R.id.word2_unit14);
        button3=(Button)findViewById(R.id.word3_unit14);
        button4=(Button)findViewById(R.id.word4_unit14);
        button5=(Button)findViewById(R.id.word5_unit14);
        button6=(Button)findViewById(R.id.word6_unit14);
        button7=(Button)findViewById(R.id.word7_unit14);
        button8=(Button)findViewById(R.id.word8_unit14);
        button9=(Button)findViewById(R.id.word9_unit14);
        button10=(Button)findViewById(R.id.word10_unit14);
        button11=(Button)findViewById(R.id.word11_unit14);
        button12=(Button)findViewById(R.id.word12_unit14);
        button13=(Button)findViewById(R.id.word13_unit14);
        button14=(Button)findViewById(R.id.word14_unit14);
        button15=(Button)findViewById(R.id.word15_unit14);
        button16=(Button)findViewById(R.id.word16_unit14);
        button17=(Button)findViewById(R.id.word17_unit14);
        button18=(Button)findViewById(R.id.word18_unit14);
        button19=(Button)findViewById(R.id.word19_unit14);
        button20=(Button)findViewById(R.id.word20_unit14);
        button21=(Button)findViewById(R.id.word21_unit14);
        button22=(Button)findViewById(R.id.word22_unit14);
        button23=(Button)findViewById(R.id.word23_unit14);
        button24=(Button)findViewById(R.id.word24_unit14);
        button25=(Button)findViewById(R.id.word25_unit14);
        button26=(Button)findViewById(R.id.word26_unit14);
        button27=(Button)findViewById(R.id.word27_unit14);
        button28=(Button)findViewById(R.id.word28_unit14);
        button29=(Button)findViewById(R.id.word29_unit14);
        button30=(Button)findViewById(R.id.word30_unit14);
        button31=(Button)findViewById(R.id.word31_unit14);
        button32=(Button)findViewById(R.id.word32_unit14);
        button33=(Button)findViewById(R.id.word33_unit14);
        button34=(Button)findViewById(R.id.word34_unit14);
        button35=(Button)findViewById(R.id.word35_unit14);
        button36=(Button)findViewById(R.id.word36_unit14);
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
        button21.setText(name[20]);
        button22.setText(name[21]);
        button23.setText(name[22]);
        button24.setText(name[23]);
        button25.setText(name[24]);
        button26.setText(name[25]);
        button27.setText(name[26]);
        button28.setText(name[27]);
        button29.setText(name[28]);
        button30.setText(name[29]);
        button31.setText(name[30]);
        button32.setText(name[31]);
        button33.setText(name[32]);
        button34.setText(name[33]);
        button35.setText(name[34]);
        button36.setText(name[35]);

    }
    public void onBackPressed() {
        Intent intent = new Intent(Words_unit14.this, Unit14.class);
        startActivity(intent);
        finish();


    }
}

