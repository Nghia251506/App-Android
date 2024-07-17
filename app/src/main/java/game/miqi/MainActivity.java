package game.miqi;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;
import game.miqi.Game1.ActivityGame11;
import game.miqi.Game4.ActivityGame4;
import game.miqi.Menu_game.Activity_menu;
import game.miqi.Music.Music;
import game.miqi.NguPhap.Onthi;
import game.miqi.ThiThu.ThiThu_menu;

public class MainActivity extends AppCompatActivity {
ListView listView;
int[] image={R.drawable.sgk,R.drawable.onthi,R.drawable.game,R.drawable.music_icon,R.drawable.duoihinh,R.drawable.thithu};
String[] title={"Học Tập ","Ngữ Pháp","Game Lật Hình","Game Đoán Nhạc","Đuổi Hình Bắt Chữ","Thi Thử"
      };
AdapteViewMain adapteViewMain;
ImageView rank;
TextView text_rank;
int text_huyhieu=0;
int score_thithu;
TextView welcome ;

SoundPool soundPool;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toasty.info(MainActivity.this,"Welcome To English Miqi",Toast.LENGTH_LONG).show();
        listView = (ListView)findViewById(R.id.listview_main);
        rank = (ImageView)findViewById(R.id.rank);
        rank.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toasty.info(MainActivity.this,"Huy Hiệu Học Sinh",Toast.LENGTH_SHORT).show();
            }
        });
        text_rank=(TextView)findViewById(R.id.text_rank);
        text_rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setMessage("Hệ Thống Danh Hiệu(Điểm Thi Thử) \n"+
                "-Học Sinh Mới      (0  Điểm)  \n"+
                "-Học Sinh Chăm Chỉ (10 Điểm) \n"+
                "-Học Sinh Tiềm Năng(20 Điểm) \n" +
                "-Học Sinh Sáng Tạo (30 Điểm) \n" +
                "-Học Sinh Giỏi     (40 Điểm)\n"+
                "-Học Sinh Đột Phá  (50 Điểm)");
                // thiết lập nội dung cho dialog
                alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {


                    }
                });

                alertDialogBuilder.setNegativeButton("", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });
        adapteViewMain = new AdapteViewMain(this,title,image);
        listView.setAdapter(adapteViewMain);
        SharedPreferences preferences = getSharedPreferences("mydata123",MODE_PRIVATE);
        score_thithu = preferences.getInt("score_thithu",0);
        if(score_thithu<=10)
        {
            rank.setBackgroundResource(R.drawable.huanchuong2);
            text_rank.setText("Học Sinh Mới");
        }
        if(score_thithu>=10)
        {
            rank.setBackgroundResource(R.drawable.huanchuong2);
            text_rank.setText("Học Sinh Chăm Chỉ");

        }



        if(score_thithu>=20)
        {
            rank.setBackgroundResource(R.drawable.caylua);
            text_rank.setText("Học Sinh Tiềm Năng");
        }


        if (score_thithu>=30) {
            rank.setBackgroundResource(R.drawable.cup);
            text_rank.setText("Học Sinh Sáng Tạo");
        }
        if (score_thithu>=40) {
            rank.setBackgroundResource(R.drawable.vuongmien);
            text_rank.setText("Học Sinh Giỏi");
        }

        if(score_thithu>=50)
        {
        rank.setBackgroundResource(R.drawable.vuongmien);
        text_rank.setText("Học Sinh Đột Phá");
        }
















        adapteViewMain.notifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                  //  mediaPlayer.stop();
                    Intent intent = new Intent(MainActivity.this,Activity_menu.class);
                    startActivity(intent);
                    finish();
                }
                if(position==1)
                {
                    //mediaPlayer.stop();
                    Intent intent = new Intent(MainActivity.this, Onthi.class);
                    startActivity(intent);
                    finish();

                }
                if(position==2)
                {
                   // mediaPlayer.stop();
                    Intent intent = new Intent(MainActivity.this, ActivityGame4.class);
                    startActivity(intent);
                    finish();

                }
                if(position==3){
                  //  mediaPlayer.stop();
                    Intent intent = new Intent(MainActivity.this, Music.class);
                    startActivity(intent);
                    finish();

                }
                if(position==4){
                   // mediaPlayer.stop();
                    Intent intent = new Intent(MainActivity.this, ActivityGame11.class);
                    startActivity(intent);
                    finish();

                }
                if(position==5){

                    Intent intent = new Intent(MainActivity.this, ThiThu_menu.class);
                    startActivity(intent);
                    finish();

                }

            }
        });

    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Do you want to exit ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//***Change Here***
                        startActivity(intent);
                        finish();
                        System.exit(0);
                     System.exit(0);
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

