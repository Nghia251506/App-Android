package game.miqi.Game3;

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

public class Chienthang_Game3 extends AppCompatActivity {
    TextView result,nsthem;
    int stt_game3=0;
    public SoundPool soundPool;
    Button button;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chienthang__game3);
        result = (TextView)findViewById(R.id.result_game3);
        nsthem=(TextView)findViewById(R.id.nsthem_game3);
        button = (Button)findViewById(R.id.tieptuc_game3);
        mediaPlayer = new MediaPlayer();
        mediaPlayer =MediaPlayer.create(Chienthang_Game3.this,R.raw.music_end);
        mediaPlayer.start();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                mediaPlayer.stop();
                Intent intent = new Intent(Chienthang_Game3.this, MainActivity.class);
                startActivity(intent);

            }
        });
        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_game3), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_game3), 8);
       Bundle bundle = getIntent().getExtras();
        stt_game3 = bundle.getInt("Score_game3kk");
        SharedPreferences preferences = getSharedPreferences("mydata123",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("score_thithu",stt_game3);
        editor.commit();
        if((stt_game3)<=15)
        {
            result.setText("Score: "+stt_game3);
            nsthem.setText("Too Bad");

        }
        if((stt_game3)>=15)
        { result.setText("Score: "+stt_game3);
            nsthem.setText("Let Try");

        }
        if((stt_game3)>=30)
        { result.setText("Score: "+stt_game3);
            nsthem.setText("Very Good ");

        }
        if((stt_game3)>=45)
        { result.setText("Score: "+stt_game3);
            nsthem.setText("Á Đù");

        }
    }
    @Override
    public void onBackPressed() {
        Toasty.success(Chienthang_Game3.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
}
