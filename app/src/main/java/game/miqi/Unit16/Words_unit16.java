package game.miqi.Unit16;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import game.miqi.R;


public class Words_unit16 extends AppCompatActivity {
    ImageView back_button;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11
            ,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,
            button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33
            ,button34,button35,button36,button37,button38;
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,
            text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30,
            text31,text32,text33,text34,text35,text36,text37,text38 ;
    MediaPlayer mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8
            ,mediaPlayer9,mediaPlayer10,mediaPlayer11,mediaPlayer12,mediaPlayer13,mediaPlayer14,mediaPlayer15,
            mediaPlayer16,mediaPlayer17,mediaPlayer18,mediaPlayer19,mediaPlayer20,mediaPlayer21,mediaPlayer22,mediaPlayer23,mediaPlayer24,
            mediaPlayer25,mediaPlayer26,mediaPlayer27,mediaPlayer28,mediaPlayer29,mediaPlayer30,mediaPlayer31,
            mediaPlayer32,mediaPlayer33,mediaPlayer34,mediaPlayer35,mediaPlayer36,mediaPlayer37,mediaPlayer38;
String []name={"The association","Southeast Asia","Nation","Admitted","Promote","Stability"
        ,"Respect for",
        "Justice","Rule",
"Region","Population","Accounting for","Diverse cultures","Statistics","Combined"
        ,"Domestic","Average rate","Per","Special","Attention","Trade","Estimated"
        ,"Leaders","Vision","Aimed at","Integration","A series of","Cooperation","Investment",
        "Industry","Services","Finance","Agriculture","Rural development",
"Transportation","Medium","Enterprises","Tourism"};
String[]main={"Hiệp Hội","Đông Nam Á","Quốc Gia","Thừa Nhận","Khuyến Khích","Sự Ổn Địch","Tôn Trọng","Sự Công Bằng"
        ,"Quy Luật","Khu Vực","Dân số","Chiếm","Đa dạng văn hóa","Số Liệu Thống Kê","Kết Hợp","Trong Nước","Tỉ Lệ Trung Bình",
"Mỗi","Đặc Biệt","Chú Ý","Buôn Bán","Ước Tính","Người Dẫn Đầu","Tầm Nhìn Xa","Nhằm Vào","Sự Hội Nhập","Một Loạt","Hợp tác","Cuộc Điều Tra",
"Công Nghiệp","Dịch Vụ","Tài Chính","Nông Nghiệp","Phát Triển Nông Thôn","Sự Vận Chuyển","Trung Bình","Doanh Nghiệp","Du Lịch"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_unit16);
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
        mediaPlayer37 = new MediaPlayer();
        mediaPlayer38 = new MediaPlayer();



        mediaPlayer1 = MediaPlayer.create(Words_unit16.this,R.raw.e1);
        mediaPlayer2 = MediaPlayer.create(Words_unit16.this,R.raw.e2);
        mediaPlayer3 = MediaPlayer.create(Words_unit16.this,R.raw.e3);
        mediaPlayer4 = MediaPlayer.create(Words_unit16.this,R.raw.e4);
        mediaPlayer5 = MediaPlayer.create(Words_unit16.this,R.raw.e5);
        mediaPlayer6 = MediaPlayer.create(Words_unit16.this,R.raw.e6);
        mediaPlayer7 = MediaPlayer.create(Words_unit16.this,R.raw.e7);
        mediaPlayer8 = MediaPlayer.create(Words_unit16.this,R.raw.e8);
        mediaPlayer9 = MediaPlayer.create(Words_unit16.this,R.raw.e9);
        mediaPlayer10 = MediaPlayer.create(Words_unit16.this,R.raw.e10);
        mediaPlayer11 = MediaPlayer.create(Words_unit16.this,R.raw.e11);
        mediaPlayer12 = MediaPlayer.create(Words_unit16.this,R.raw.e12);
        mediaPlayer13 = MediaPlayer.create(Words_unit16.this,R.raw.e13);
        mediaPlayer14 = MediaPlayer.create(Words_unit16.this,R.raw.e14);
        mediaPlayer15 = MediaPlayer.create(Words_unit16.this,R.raw.e15);
        mediaPlayer16 = MediaPlayer.create(Words_unit16.this,R.raw.e16);
        mediaPlayer17 = MediaPlayer.create(Words_unit16.this,R.raw.e17);
        mediaPlayer18 = MediaPlayer.create(Words_unit16.this,R.raw.e18);
        mediaPlayer19 = MediaPlayer.create(Words_unit16.this,R.raw.e19);
        mediaPlayer20 = MediaPlayer.create(Words_unit16.this,R.raw.e20);
        mediaPlayer21 = MediaPlayer.create(Words_unit16.this,R.raw.e21);
        mediaPlayer22 = MediaPlayer.create(Words_unit16.this,R.raw.e22);
        mediaPlayer23 = MediaPlayer.create(Words_unit16.this,R.raw.e23);
        mediaPlayer24 = MediaPlayer.create(Words_unit16.this,R.raw.e24);
        mediaPlayer25 = MediaPlayer.create(Words_unit16.this,R.raw.e25);
        mediaPlayer26 = MediaPlayer.create(Words_unit16.this,R.raw.e26);
        mediaPlayer27 = MediaPlayer.create(Words_unit16.this,R.raw.e27);
        mediaPlayer28 = MediaPlayer.create(Words_unit16.this,R.raw.e28);
        mediaPlayer29 = MediaPlayer.create(Words_unit16.this,R.raw.e29);
        mediaPlayer30 = MediaPlayer.create(Words_unit16.this,R.raw.e30);
        mediaPlayer31 = MediaPlayer.create(Words_unit16.this,R.raw.e31);
        mediaPlayer32 = MediaPlayer.create(Words_unit16.this,R.raw.e32);
        mediaPlayer33 = MediaPlayer.create(Words_unit16.this,R.raw.e33);
        mediaPlayer34 = MediaPlayer.create(Words_unit16.this,R.raw.e34);
        mediaPlayer35 = MediaPlayer.create(Words_unit16.this,R.raw.e35);
        mediaPlayer36 = MediaPlayer.create(Words_unit16.this,R.raw.e36);
        mediaPlayer37 = MediaPlayer.create(Words_unit16.this,R.raw.e37);
        mediaPlayer38 = MediaPlayer.create(Words_unit16.this,R.raw.e38);
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
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
                text37.setText(main[36]);
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer36.start();
                text38.setText(main[37]);
            }
        });



    }

    private void init() {
        text1=(TextView)findViewById(R.id.main1_unit16);
        text2=(TextView)findViewById(R.id.main2_unit16);
        text3=(TextView)findViewById(R.id.main3_unit16);
        text4=(TextView)findViewById(R.id.main4_unit16);
        text5=(TextView)findViewById(R.id.main5_unit16);
        text6=(TextView)findViewById(R.id.main6_unit16);
        text7=(TextView)findViewById(R.id.main7_unit16);
        text8=(TextView)findViewById(R.id.main8_unit16);
        text9=(TextView)findViewById(R.id.main9_unit16);
        text10=(TextView)findViewById(R.id.main10_unit16);
        text11=(TextView)findViewById(R.id.main11_unit16);
        text12=(TextView)findViewById(R.id.main12_unit16);
        text13=(TextView)findViewById(R.id.main13_unit16);
        text14=(TextView)findViewById(R.id.main14_unit16);
        text15=(TextView)findViewById(R.id.main15_unit16);
        text16=(TextView)findViewById(R.id.main16_unit16);
        text17=(TextView)findViewById(R.id.main17_unit16);
        text18=(TextView)findViewById(R.id.main18_unit16);
        text19=(TextView)findViewById(R.id.main19_unit16);
        text20=(TextView)findViewById(R.id.main20_unit16);
        text21=(TextView)findViewById(R.id.main21_unit16);
        text22=(TextView)findViewById(R.id.main22_unit16);
        text23=(TextView)findViewById(R.id.main23_unit16);
        text24=(TextView)findViewById(R.id.main24_unit16);
        text25=(TextView)findViewById(R.id.main25_unit16);
        text26=(TextView)findViewById(R.id.main26_unit16);
        text27=(TextView)findViewById(R.id.main27_unit16);
        text28=(TextView)findViewById(R.id.main28_unit16);
        text29=(TextView)findViewById(R.id.main29_unit16);
        text30=(TextView)findViewById(R.id.main30_unit16);
        text31=(TextView)findViewById(R.id.main31_unit16);
        text32=(TextView)findViewById(R.id.main32_unit16);
        text33=(TextView)findViewById(R.id.main33_unit16);
        text34=(TextView)findViewById(R.id.main34_unit16);
        text35=(TextView)findViewById(R.id.main35_unit16);
        text36=(TextView)findViewById(R.id.main36_unit16);
        text37=(TextView)findViewById(R.id.main37_unit16);
        text38=(TextView)findViewById(R.id.main38_unit16);




        button1=(Button)findViewById(R.id.word1_unit16);
        button2=(Button)findViewById(R.id.word2_unit16);
        button3=(Button)findViewById(R.id.word3_unit16);
        button4=(Button)findViewById(R.id.word4_unit16);
        button5=(Button)findViewById(R.id.word5_unit16);
        button6=(Button)findViewById(R.id.word6_unit16);
        button7=(Button)findViewById(R.id.word7_unit16);
        button8=(Button)findViewById(R.id.word8_unit16);
        button9=(Button)findViewById(R.id.word9_unit16);
        button10=(Button)findViewById(R.id.word10_unit16);
        button11=(Button)findViewById(R.id.word11_unit16);
        button12=(Button)findViewById(R.id.word12_unit16);
        button13=(Button)findViewById(R.id.word13_unit16);
        button14=(Button)findViewById(R.id.word14_unit16);
        button15=(Button)findViewById(R.id.word15_unit16);
        button16=(Button)findViewById(R.id.word16_unit16);
        button17=(Button)findViewById(R.id.word17_unit16);
        button18=(Button)findViewById(R.id.word18_unit16);
        button19=(Button)findViewById(R.id.word19_unit16);
        button20=(Button)findViewById(R.id.word20_unit16);
        button21=(Button)findViewById(R.id.word21_unit16);
        button22=(Button)findViewById(R.id.word22_unit16);
        button23=(Button)findViewById(R.id.word23_unit16);
        button24=(Button)findViewById(R.id.word24_unit16);
        button25=(Button)findViewById(R.id.word25_unit16);
        button26=(Button)findViewById(R.id.word26_unit16);
        button27=(Button)findViewById(R.id.word27_unit16);
        button28=(Button)findViewById(R.id.word28_unit16);
        button29=(Button)findViewById(R.id.word29_unit16);
        button30=(Button)findViewById(R.id.word30_unit16);
        button31=(Button)findViewById(R.id.word31_unit16);
        button32=(Button)findViewById(R.id.word32_unit16);
        button33=(Button)findViewById(R.id.word33_unit16);
        button34=(Button)findViewById(R.id.word34_unit16);
        button35=(Button)findViewById(R.id.word35_unit16);
        button36=(Button)findViewById(R.id.word36_unit16);
        button37=(Button)findViewById(R.id.word37_unit16);
        button38=(Button)findViewById(R.id.word38_unit16);
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
        button37.setText(name[36]);
        button38.setText(name[37]);

    }
    public void onBackPressed() {
        Intent intent = new Intent(Words_unit16.this, Unit16.class);
        startActivity(intent);
        finish();


    }
}


