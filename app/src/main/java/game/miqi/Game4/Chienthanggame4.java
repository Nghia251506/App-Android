package game.miqi.Game4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



import com.plattysoft.leonids.ParticleSystem;

import es.dmoral.toasty.Toasty;
import game.miqi.MainActivity;
import game.miqi.R;

public class Chienthanggame4 extends AppCompatActivity {
    TextView result,nsthem;
    int score;
    public SoundPool soundPool;
    Button button;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chienthanggame4);
        result = (TextView)findViewById(R.id.result_game4);
        nsthem=(TextView)findViewById(R.id.nsthem_game4);
        button = (Button)findViewById(R.id.tieptuc_game4);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(Chienthanggame4.this,R.raw.music_end);
        mediaPlayer.start();
        mediaPlayer = new MediaPlayer();
        mediaPlayer =MediaPlayer.create(Chienthanggame4.this,R.raw.music_end);
        mediaPlayer.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                mediaPlayer.stop();
                Intent intent = new Intent(Chienthanggame4.this, MainActivity.class);
                startActivity(intent);

            }
        });
        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_game4), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_game4), 8);
        Bundle bundle = getIntent().getExtras();
       score = bundle.getInt("Score_game4");
        SharedPreferences preferences = getSharedPreferences("mydata123",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("score_huyhieu_lathinh",score);
        editor.commit();
        if(score<7)
        {
            nsthem.setText("Too Bad");
            result.setText("Score: "+score);
        }
        if(score>=7)
        {
            nsthem.setText("Let's Try");
            result.setText("Score: "+score);
        }
        if(score>=15)
        {
            result.setText("Score: "+score);
            nsthem.setText("Very Good");
        }

    }
    @Override
    public void onBackPressed() {
        Toasty.success(Chienthanggame4.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
    }

