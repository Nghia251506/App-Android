package game.miqi.Game4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Collections;

import es.dmoral.toasty.Toasty;
import game.miqi.MainActivity;
import game.miqi.R;

public class ActivityGame4 extends AppCompatActivity {
    GridView gridView;
    public int height;
    public  int width;
    ImageView submit;
    int[] question_primary;
    TextView text_score;
    int score=0;
   public int solanfree=6;
    int solanthua= 0 ;
    public  int stt=0;
   ImageView backgame;
  public SoundPool soundPool;
   public  int music,music_background;
   MediaPlayer mediaPlayer;
    public  String current;
    public ArrayList<Integer> list;
    public String [][]answer_button={{"áo đồ","chậm chạp","huyền thoại","ngôn ngữ"},
            {"xây dựng","sáng tác","nhân vật","cái tủ"},
            {"đối diện","cơ hội","phản đối","nỗ lực"},
            {"mê hoặc","hấp dẫn","thời trang","niềm đam mê"},{
        "lạc quan","bi quan","mạnh mẽ","thuốc trừ sâu"},
            {"tinh tế","thơm ngon","giao hàng","vui mừng"},
            {"chỉnh sửa","vòng xoáy","nguy hiểm","thông tin"},
            {"hiện tại","sức ép","ngăn chặn","tổng thống"},
            {"sức ép","cuộc thi","hiện tại","tổng thống"},
            {"trách nhiệm","tính cách","nhân viên","con người"}
,           {"điều khoản","cung cấp","quá trình","có lẽ"},
            {"hối hả","người chồng","đói bụng","hàng trăm"},
            {"giai đoạn","biểu diễn","có lẽ","cho phép"},
            {"nâng cao","lợi thế","địa chỉ","khuyên bảo"},
            {"va chạm","cải thiện","quan trọng","ấn tượng"},
            {"kỹ sư","tiếng anh","nước Anh","môi trường"},
            {"giới thiệu","ghi lại","nhìn nhận","đề nghị"},
            {"thẩm phán","hành trình","áo khoác","tháng Giêng"}
,{"yêu cầu","giải phóng","sẵn sàng","đáng tin cậy"},
            {"lĩnh vực","cánh đồng","cuối cùng","tìm kiếm"},
            {"thành viên","ký ức","đề cập","ở giữa"}};

    public String[] correct = {"ngôn ngữ","xây dựng","phản đối","hấp dẫn","bi quan"
            ,"thơm ngon","thông tin","tổng thống","hiện tại","tính cách","cung cấp","hối hả","giai đoạn","lợi thế",
            "ấn tượng","kỹ sư","nhìn nhận","hành trình","đáng tin cậy","cuối cùng","thành viên"};
    Button but1,but2,but3,but4;
    int[]question1={R.drawable.l,R.drawable.a,R.drawable.n,R.drawable.g,R.drawable.u,R.drawable.a,R.drawable.g,R.drawable.e};
    int[]question2={R.drawable.c,R.drawable.o,R.drawable.n,R.drawable.s,R.drawable.t,
            R.drawable.r,R.drawable.u,R.drawable.c,R.drawable.t,R.drawable.i,R.drawable.o,R.drawable.n};
    int[]question3={R.drawable.o,R.drawable.p,R.drawable.p,R.drawable.o,
            R.drawable.n,R.drawable.e,R.drawable.n,R.drawable.t};
    int[]question4={R.drawable.f,R.drawable.a,R.drawable.s,R.drawable.c,R.drawable.i,R.drawable.n,R.drawable.a,R.drawable.t,R.drawable.i,R.drawable.n,R.drawable.g};
    int[]question5={R.drawable.p, R.drawable.e,R.drawable.s,R.drawable.s,R.drawable.i,R.drawable.m,R.drawable.i,R.drawable.s,R.drawable.t,R.drawable.i,R.drawable.c};
    int[]question6={R.drawable.d,R.drawable.e,R.drawable.l,R.drawable.i,R.drawable.c,R.drawable.i,R.drawable.o,R.drawable.u,R.drawable.s}
            ;
    int[]question7={R.drawable.i,R.drawable.n,R.drawable.f,R.drawable.o,R.drawable.r,R.drawable.m,R.drawable.a,R.drawable.t,R.drawable.i,R.drawable.o,R.drawable.n};

    int[]question8={R.drawable.p,R.drawable.r,R.drawable.e,R.drawable.s,R.drawable.i,R.drawable.d,R.drawable.e,R.drawable.n,R.drawable.t};
    int[]question9={R.drawable.p,R.drawable.r,R.drawable.e,R.drawable.s,R.drawable.e,R.drawable.n,R.drawable.t};
    int[]question10={R.drawable.p,R.drawable.e,R.drawable.r,R.drawable.s,R.drawable.o,R.drawable.n,R.drawable.n,R.drawable.a,R.drawable.l,R.drawable.i,R.drawable.t,R.drawable.y};
    int []question11={R.drawable.p,R.drawable.r,R.drawable.o,R.drawable.v,R.drawable.i,R.drawable.d,R.drawable.e};
    int []question12={R.drawable.h,R.drawable.u,R.drawable.s,R.drawable.t,R.drawable.l,R.drawable.e};
    int []question13={R.drawable.p,R.drawable.e,R.drawable.r,R.drawable.i,R.drawable.o,R.drawable.d};
    int []question14={R.drawable.a,R.drawable.d,R.drawable.v,R.drawable.a,R.drawable.n,R.drawable.t,R.drawable.a,R.drawable.g,R.drawable.e};
    int []question15={R.drawable.i,R.drawable.m,R.drawable.p,R.drawable.r,R.drawable.e,R.drawable.s,R.drawable.s,R.drawable.i,R.drawable.v,R.drawable.e};
    int []question16={R.drawable.e,R.drawable.n,R.drawable.g,R.drawable.h,R.drawable.n,R.drawable.e,R.drawable.e,R.drawable.r};
    int []question17={R.drawable.r,R.drawable.e,R.drawable.c,R.drawable.o,R.drawable.g,R.drawable.n,R.drawable.i,R.drawable.s,R.drawable.e};
    int []question18={R.drawable.j,R.drawable.o,R.drawable.u,R.drawable.r,R.drawable.n,R.drawable.e,R.drawable.y};
    int []question19={R.drawable.r,R.drawable.e,R.drawable.l,R.drawable.i,R.drawable.a,R.drawable.b,R.drawable.l,R.drawable.e};
    int []question20={R.drawable.f,R.drawable.i,R.drawable.n,R.drawable.a,R.drawable.l,R.drawable.l,R.drawable.y};
    int []question21={R.drawable.m,R.drawable.e,R.drawable.m,R.drawable.b,R.drawable.e,R.drawable.r};



    GridviewAdapterGame4 gridviewAdapterGame4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        mediaPlayer = new MediaPlayer();
        mediaPlayer =MediaPlayer.create(ActivityGame4.this,R.raw.game_chinhthuc);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        list = new ArrayList<>();
        for(int i =0;i<correct.length;i++){
            list.add(i);
            Collections.shuffle(list);

        }
        height =metrics.heightPixels;
        width = (metrics.widthPixels)/5;
        setContentView(R.layout.activity_game4);
        but1 = (Button)findViewById(R.id.game4_but1);
        but2 = (Button)findViewById(R.id.game4_but2);
        but3 = (Button)findViewById(R.id.game4_but3);
        but4 = (Button)findViewById(R.id.game4_but4);
        text_score = (TextView)findViewById(R.id.score_game4);
        text_score.setText("Score: "+ score);
        current = correct[list.get(stt)];
        gridView = (GridView)findViewById(R.id.gridviewgame4);
        gridviewAdapterGame4 = new GridviewAdapterGame4(this,width,capnhat(), ActivityGame4.this);
        gridView.setAdapter(gridviewAdapterGame4);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // xu li thang



                if(but1.getText().equals(correct[list.get(stt)]))
                {
                    solanfree=6 ;
                    score+=1 ;
                    text_score.setText("Score: "+score);
                    Toasty.success(ActivityGame4.this,"Good", Toast.LENGTH_SHORT).show();
                    stt+=1;
                    if(stt==19){
                        finish();
                        mediaPlayer.stop();
                        Intent intent = new Intent(ActivityGame4.this, Chienthanggame4.class);
                        intent.putExtra("Score_game4",stt);
                        startActivity(intent);
                    }

                    current = correct[stt];
                    gridviewAdapterGame4 = new GridviewAdapterGame4(ActivityGame4.this,width,capnhat(), ActivityGame4.this);
                    gridView.setAdapter(gridviewAdapterGame4);


                }else {
                    stt+=1;
                    solanfree=6 ;
                    text_score.setText("Score: "+score);
                    current = correct[list.get(stt)];
                    gridviewAdapterGame4 = new GridviewAdapterGame4(ActivityGame4.this,width,capnhat(), ActivityGame4.this);
                    gridView.setAdapter(gridviewAdapterGame4);


                    solanthua+=1;
                    Toasty.error(ActivityGame4.this,"Quá Gà",Toast.LENGTH_SHORT).show();
                    if(solanthua>2)
                    {  finish();
                        mediaPlayer.stop();
                        Intent intent = new Intent(ActivityGame4.this, Chienthanggame4.class);
                        intent.putExtra("Score_game4",stt);
                        startActivity(intent);


                    }}
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(but2.getText().equals(correct[list.get(stt)]))
                {
                    solanfree=6 ;
                    stt+=1;
                    if(stt==19){
                        finish();
                        mediaPlayer.stop();
                        Intent intent = new Intent(ActivityGame4.this, Chienthanggame4.class);
                        intent.putExtra("Score_game4",stt);
                        startActivity(intent);
                    }

                    score+=1 ;
                    text_score.setText("Score: "+score);
                    current = correct[list.get(stt)];
                    Toasty.success(ActivityGame4.this,"Good",Toast.LENGTH_SHORT).show();
                    gridviewAdapterGame4 = new GridviewAdapterGame4(ActivityGame4.this,width,capnhat(), ActivityGame4.this);
                    gridView.setAdapter(gridviewAdapterGame4);


                }else{
                    stt+=1;
                    solanfree=6 ;
                    text_score.setText("Score: "+score);
                    current = correct[list.get(stt)];
                    gridviewAdapterGame4 = new GridviewAdapterGame4(ActivityGame4.this,width,capnhat(), ActivityGame4.this);
                    gridView.setAdapter(gridviewAdapterGame4);


                    solanthua+=1;
                    Toasty.error(ActivityGame4.this,"Quá Gà",Toast.LENGTH_SHORT).show();
                    if(solanthua>2)
                    {  finish();
                        mediaPlayer.stop();
                        Intent intent = new Intent(ActivityGame4.this, Chienthanggame4.class);
                        intent.putExtra("Score_game4",stt);
                        startActivity(intent);


                    }}
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(but3.getText().equals(correct[list.get(stt)]))
                {
                    solanfree=6 ;
                    stt+=1;
                    if(stt==19){
                        finish();
                        mediaPlayer.stop();
                        Intent intent = new Intent(ActivityGame4.this, Chienthanggame4.class);
                        intent.putExtra("Score_game4",stt);
                        startActivity(intent);
                    }

                    score+=1 ;
                    text_score.setText("Score: "+score);
                    current = correct[list.get(stt)];
                    Toasty.success(ActivityGame4.this,"Good",Toast.LENGTH_SHORT).show();
                    gridviewAdapterGame4 = new GridviewAdapterGame4(ActivityGame4.this,width,capnhat(), ActivityGame4.this);
                    gridView.setAdapter(gridviewAdapterGame4);


                }else {
                    stt+=1;
                    solanfree=6 ;
                    text_score.setText("Score: "+score);
                    current = correct[list.get(stt)];

                    gridviewAdapterGame4 = new GridviewAdapterGame4(ActivityGame4.this,width,capnhat(), ActivityGame4.this);
                    gridView.setAdapter(gridviewAdapterGame4);


                    solanthua+=1;
                    Toasty.error(ActivityGame4.this,"Quá Gà",Toast.LENGTH_SHORT).show();
                    if(solanthua>2)
                    {  finish();
                        mediaPlayer.stop();
                        Intent intent = new Intent(ActivityGame4.this, Chienthanggame4.class);
                        intent.putExtra("Score_game4",stt);
                        startActivity(intent);


                    }}
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(but4.getText().equals(correct[list.get(stt)]))
                {

                    solanfree=6 ;
                    stt+=1;
                    if(stt==19){
                        finish();
                        mediaPlayer.stop();
                        Intent intent = new Intent(ActivityGame4.this, Chienthanggame4.class);
                        intent.putExtra("Score_game4",stt);
                        startActivity(intent);
                    }

                    score+=1 ;
                    text_score.setText("Score: "+score);
                    current = correct[list.get(stt)];
                    Toasty.success(ActivityGame4.this,"Good",Toast.LENGTH_SHORT).show();
                    gridviewAdapterGame4 = new GridviewAdapterGame4(ActivityGame4.this,width,capnhat(), ActivityGame4.this);
                    gridView.setAdapter(gridviewAdapterGame4);


                }else {
                    stt+=1;
                    solanfree=6 ;
                    text_score.setText("Score: "+score);
                    current = correct[list.get(stt)];
                    Toasty.error(ActivityGame4.this,"Quá Gà",Toast.LENGTH_SHORT).show();
                    gridviewAdapterGame4 = new GridviewAdapterGame4(ActivityGame4.this,width,capnhat(), ActivityGame4.this);
                    gridView.setAdapter(gridviewAdapterGame4);
                    solanthua+=1;

                    if(solanthua>2)
                    {  finish();
                        mediaPlayer.stop();
                        Intent intent = new Intent(ActivityGame4.this, Chienthanggame4.class);
                        intent.putExtra("Score_game4",stt);
                        startActivity(intent);


                    }}
            }
        });


    }

    private int[] capnhat() {
        setbutton();
        if(list.get(stt)==0) {
            question_primary = new int[question1.length];

            for (int i = 0; i < question1.length; i++) {
                question_primary[i] = question1[i];
            }}
        if(list.get(stt)==1){
            setbutton();
            question_primary = new int[question2.length];

            for (int i = 0; i < question2.length; i++) {
                question_primary[i] = question2[i];
            }}
        if(list.get(stt)==2){

            question_primary = new int[question3.length];

            for (int i = 0; i < question3.length; i++) {
                question_primary[i] = question3[i];
            }}
        if(list.get(stt)==3){

            question_primary = new int[question4.length];

            for (int i = 0; i < question4.length; i++) {
                question_primary[i] = question4[i];
            }}
        if(list.get(stt)==4){

            question_primary = new int[question5.length];

            for (int i = 0; i < question5.length; i++) {
                question_primary[i] = question5[i];
            }}
        if(list.get(stt)==5){

            question_primary = new int[question6.length];

            for (int i = 0; i < question6.length; i++) {
                question_primary[i] = question6[i];
            }}
        if(list.get(stt)==6){

            question_primary = new int[question7.length];

            for (int i = 0; i < question7.length; i++) {
                question_primary[i] = question7[i];
            }}
        if(list.get(stt)==7){

            question_primary = new int[question8.length];

            for (int i = 0; i < question8.length; i++) {
                question_primary[i] = question8[i];
            }}
        if(list.get(stt)==8){

            question_primary = new int[question9.length];

            for (int i = 0; i < question9.length; i++) {
                question_primary[i] = question9[i];
            }}
        if(list.get(stt)==9){

            question_primary = new int[question10.length];

            for (int i = 0; i < question10.length; i++) {
                question_primary[i] = question10[i];
            }}
        if(list.get(stt)==10){

            question_primary = new int[question11.length];

            for (int i = 0; i < question11.length; i++) {
                question_primary[i] = question11[i];
            }}
        if(list.get(stt)==11){

            question_primary = new int[question12.length];

            for (int i = 0; i < question12.length; i++) {
                question_primary[i] = question12[i];
            }}
        if(list.get(stt)==12){

            question_primary = new int[question13.length];

            for (int i = 0; i < question13.length; i++) {
                question_primary[i] = question13[i];
            }}
        if(list.get(stt)==13){

            question_primary = new int[question14.length];

            for (int i = 0; i < question14.length; i++) {
                question_primary[i] = question14[i];
            }}
        if(list.get(stt)==14){

            question_primary = new int[question15.length];

            for (int i = 0; i < question15.length; i++) {
                question_primary[i] = question15[i];
            }}
        if(list.get(stt)==15){

            question_primary = new int[question16.length];

            for (int i = 0; i < question16.length; i++) {
                question_primary[i] = question16[i];
            }}
        if(list.get(stt)==16){

            question_primary = new int[question17.length];

            for (int i = 0; i < question17.length; i++) {
                question_primary[i] = question17[i];
            }}
        if(list.get(stt)==17){

            question_primary = new int[question18.length];

            for (int i = 0; i < question18.length; i++) {
                question_primary[i] = question18[i];
            }}
        if(list.get(stt)==18){

            question_primary = new int[question19.length];

            for (int i = 0; i < question19.length; i++) {
                question_primary[i] = question19[i];
            }}
        if(list.get(stt)==19){

            question_primary = new int[question20.length];

            for (int i = 0; i < question20.length; i++) {
                question_primary[i] = question20[i];
            }}
        if(list.get(stt)==20){

            question_primary = new int[question21.length];

            for (int i = 0; i < question21.length; i++) {
                question_primary[i] = question21[i];
            }}















        return question_primary;
    }

    private void setbutton() {
        ArrayList<Integer> random = new ArrayList<>();
        for(int i=0;i<4;i++)
        {
            random.add(i);
            Collections.shuffle(random);
        }



            but1.setText(answer_button[list.get(stt)][random.get(0)]);
            but2.setText(answer_button[list.get(stt)][random.get(1)]);
            but3.setText(answer_button[list.get(stt)][random.get(2)]);
            but4.setText(answer_button[list.get(stt)][random.get(3)]);




    }

    private void capnhatt(View view)
    {
        capnhat();
    }
    private void clickbutton(View view){


    }
    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        Intent intent = new Intent(ActivityGame4.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}