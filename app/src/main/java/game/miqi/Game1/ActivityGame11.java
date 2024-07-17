package game.miqi.Game1;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import es.dmoral.toasty.Toasty;
import game.miqi.MainActivity;
import game.miqi.R;

public class ActivityGame11 extends AppCompatActivity {


    public GridView gridView_answer;
   public int solansai = 0 ;
    public  int socausai= 0 ;
    public GridView gridViewbanphim;
    ImageView imagequestion;
    public  boolean check= false ;
    MediaPlayer mediaPlayer;
    public  int id ;
    public SoundPool soundPool;
    int[] image_list = {R.drawable.u10_dinosaurs, R.drawable.u10_buffalo, R.drawable.u10_cabbages,
            R.drawable.u10_global, R.drawable.u10_grass, R.drawable.u10_insect, R.drawable.u10_dam,
            R.drawable.u10_toxicchemical, R.drawable.u10_wetland, R.drawable.u10_tortoise, R.drawable.awereness,
            R.drawable.exploitation, R.drawable.effort, R.drawable.measure, R.drawable.hunt,R.drawable.baseketball,R.drawable.goalie,R.drawable.karatedo,R.drawable.penalty,R.drawable.pool,R.drawable.rhino,R.drawable.rowing,R.drawable.swim,R.drawable.windsurfing,R.drawable.wrestling};
    public char[] answer;
   public String correct_answer;
    public  int id_chienthang,id_thatbai;
    int count = 120;
   public ArrayList<Integer> kiemtra;
   public char[] kitu_correct;

    public GridViewAnswer adapteranswer;
    public GridView_Banphim adapter_banphim;
    public  int soluot_mienphi = 3 ;
    int id_click;
    public String[] correct = {"dinosaurs", "buffallo", "cabbages", "global", "grass",
            "insect", "dam",
            "toxicchemical", "wetland", "tortoise", "awereness", "exploitation", "effort",
            "measure", "hunt","basketball","goalie","karatedo","penalty","pool","rhino"
            ,"rowing","swim","windsurfing","wrestling"};
    public int dodai_answer[] = {9, 8, 8, 6, 5, 6, 3, 13, 7, 8, 9, 12, 6, 7, 4,10,6,8,7,4,5,6,4,11,9};
    int[] music={R.raw.dinorsaurs,R.raw.buffalo,R.raw.cabbages,R.raw.global,R.raw.grasss,R.raw.insect,
    R.raw.dam,R.raw.toxicchemical,R.raw.wetland,R.raw.tortoise,R.raw.awarenesss,R.raw.exploitation,R.raw.effort,R.raw.measure,
    R.raw.hunt,R.raw.b10,R.raw.a7,R.raw.b9,R.raw.a13,R.raw.a1,R.raw.rhino,R.raw.a20,R.raw.a25,R.raw.a22,R.raw.b11};

    public static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public int score = 0;
    int stt=0;
    MediaPlayer mediaPlayerground;
TextView text_score ;
TextView chuthich;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game11);
        text_score = (TextView) findViewById(R.id.score_game1);
        chuthich = (TextView)findViewById(R.id.chuthich_game1);
        chuthich.setText("Click Ô Trống Xem Từ Gợi Ý( 2 lần)");
        mediaPlayer = new MediaPlayer();
        text_score.setText("Score: "+score);

        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC,1);
        id_chienthang = soundPool.load(this,R.raw.correct,1);
        id_thatbai = soundPool.load(this,R.raw.incorrect,1);
        id_click = soundPool.load(this,R.raw.click_button,1);
        kiemtra = new ArrayList<Integer>();
        for (int i = 0; i < correct.length; i++) {
            kiemtra.add(i);
            Collections.shuffle(kiemtra);
        }

        mediaPlayerground = new MediaPlayer();
  mediaPlayerground = MediaPlayer.create(ActivityGame11.this,R.raw.game_chinhthuc);
  mediaPlayerground.setVolume(1f,1f);
  mediaPlayerground.setLooping(true);
  mediaPlayerground.start();

        init();
        capnhat();
    }

    private void capnhat() {
        Random random = new Random();
        id = random.nextInt(5);
        soluot_mienphi = 3 ;
        for (int i = 0; i < Commom.submit_answer.length; i++) {
            Commom.submit_answer[i] = ' ';
        }
        imagequestion.setImageResource(image_list[kiemtra.get(stt)]);
        correct_answer = correct[kiemtra.get(stt)];
        answer = correct_answer.toCharArray();
        kitu_correct = correct_answer.toCharArray();
        adapter_banphim = new GridView_Banphim(ActivityGame11.this, alphabet, ActivityGame11.this);
        adapteranswer = new GridViewAnswer(setupnullist(), this, ActivityGame11.this);
        gridViewbanphim.setAdapter(adapter_banphim);
        gridView_answer.setAdapter(adapteranswer);
        adapteranswer.notifyDataSetChanged();
        adapter_banphim.notifyDataSetChanged();






}
public  void nextnext() {

    chuthich.setVisibility(View.INVISIBLE);
    if (score == 20) {
        mediaPlayerground.stop();

        Intent intent = new Intent(ActivityGame11.this, Acitivity_Chienthang.class);
        intent.putExtra("Score_game1", score);
        startActivity(intent);
    }

    if (Commom.submit_answer == null) {

    } else {
        String result = "";

        for (int i = 0; i < dodai_answer[kiemtra.get(stt)]; i++) {
            result += String.valueOf(Commom.submit_answer[i]);
        }


            if (result.equals(correct_answer)) {

                mediaPlayer = MediaPlayer.create(ActivityGame11.this,music[kiemtra.get(stt)]);
                mediaPlayer.start();

                Toasty.success(
                        ActivityGame11.this, "You Very Good !", Toast.LENGTH_SHORT).show();
                check = true;
                GridViewAnswer adapteranswer = new GridViewAnswer(Commom.submit_answer, this, ActivityGame11.this);
               gridView_answer.setAdapter(adapteranswer);
                adapteranswer.notifyDataSetChanged();
                CountDownTimer countDownTimer = new CountDownTimer(2000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                    }

                    @Override
                    public void onFinish() {
                        score += 1;
                        text_score.setText("Score: " + score);
                        stt += 1;
                        capnhat();
                        check = false;
                    }
                };
                countDownTimer.start();

                }


        }

    }

    public void kiemtrasolansai(){
    mediaPlayerground.stop();
    Intent intent = new Intent(ActivityGame11.this, Acitivity_Chienthang.class);
    intent.putExtra("Score_game1", score);
    startActivity(intent);

}
    private void init() {
        imagequestion = (ImageView) findViewById(R.id.imagequestion);
        gridView_answer=(GridView)findViewById(R.id.gridviewanswer);
        gridViewbanphim=(GridView)findViewById(R.id.gridviewbanphim);

    }
    private char[] setupnullist() {
        // tạo ra 1 chuỗi kí tự ' ' với độ dài bằng Kết quả đúng
        char result[] = new char[dodai_answer[kiemtra.get(stt)]];
       // result = correct_answer.toCharArray();
        for(int i=0;i<dodai_answer[kiemtra.get(stt)];i++)
        {result[i] =' ';}
        return  result;
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ActivityGame11.this);
        builder.setTitle("Do you want to return ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        mediaPlayerground.stop();
                        Intent intent = new Intent(ActivityGame11.this,MainActivity.class);
                        startActivity(intent);

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();

                    }
                });
        AlertDialog alertDialog =builder.create();
        alertDialog.show();
    }}
