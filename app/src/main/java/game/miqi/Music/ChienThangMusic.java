package game.miqi.Music;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.plattysoft.leonids.ParticleSystem;

import es.dmoral.toasty.Toasty;
import game.miqi.MainActivity;
import game.miqi.R;

public class ChienThangMusic extends AppCompatActivity {
    TextView textscore,nhanxet,medal ;
    ImageView imageView ;
int score = 0 ;
Button tieptuc;
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chien_thang_music);
        mediaPlayer = new MediaPlayer();
        mediaPlayer =MediaPlayer.create(ChienThangMusic.this,R.raw.music_end);
        mediaPlayer.start();
        imageView = (ImageView) findViewById(R.id.symbol);
        textscore = (TextView) findViewById(R.id.score_music);
        nhanxet = (TextView) findViewById(R.id.nhanxet_music);
        medal = (TextView)findViewById(R.id.medal_music);
        tieptuc = (Button) findViewById(R.id.tieptuc_music);
        tieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                mediaPlayer.stop();
                Intent intent = new Intent(ChienThangMusic.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("Score_music");
        SharedPreferences preferences = getSharedPreferences("mydata123",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("score_huyhieu_music",score);


        editor.commit();
        if (score <= 15) {
            medal.setText("Bronze Medal");
            textscore.setText("Score: " + score);
            imageView.setImageResource(R.drawable.bronze);
            nhanxet.setText("Tệ Quá");
        }
        if (score > 15) {
            medal.setText("Silver Medal");
            textscore.setText("Score: " + score);
            imageView.setImageResource(R.drawable.silver);
            nhanxet.setText("Rất Tốt");
        }
        if (score >= 25) {
            medal.setText("Gold Medal");
            textscore.setText("Score: " + score);
            imageView.setImageResource(R.drawable.gold);
            nhanxet.setText("Quá Đẳng Cấp");
        }
        if (score >=50) {
            medal.setText("Gold Medal");
            textscore.setText("Score: " + score);
            imageView.setImageResource(R.drawable.diamond);
            nhanxet.setText("Kinh Dị Quá");
        }
        if (score ==60) {
            medal.setText("Gold Medal");
            textscore.setText("Score: " + score);
            imageView.setImageResource(R.drawable.diamond);
            nhanxet.setText("Bạn chơi với Dế đi");
        }

        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.medal_music), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.medal_music), 8);
    }
        @Override
        public void onBackPressed() {
            Toasty.success(ChienThangMusic.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

        }
        }



