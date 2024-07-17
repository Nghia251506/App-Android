package game.miqi.Unit12;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.plattysoft.leonids.ParticleSystem;

import es.dmoral.toasty.Toasty;
import game.miqi.R;

public class ChienthangSpeak_unit12 extends AppCompatActivity {
    TextView result,nsthem;
    Button tieptuc;
    int score;
    MediaPlayer mediaPlayer123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chienthang_speak_unit12);
        result = (TextView)findViewById(R.id.result_speak_unit12_m);
        nsthem=(TextView)findViewById(R.id.nsthem_speak_unit12_m);
        tieptuc = (Button)findViewById(R.id.tieptuc_speak_unit12_m);
        mediaPlayer123 = new MediaPlayer();
        mediaPlayer123 =MediaPlayer.create(ChienthangSpeak_unit12.this,R.raw.music_end);
  mediaPlayer123.start();
        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("Score_speak_unit12");
        result.setText("Score: "+ score);

        if(score<5)
        { nsthem.setText("Too Bad");}
        if(score>=5)
        { nsthem.setText("Let's Try");}
        if(score>8)
        { nsthem.setText("Good!");}
        tieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer123.stop();

                Intent intent = new Intent(ChienthangSpeak_unit12.this, Unit12.class);
                startActivity(intent);
                finish();
            }
        });
        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_speak_unit12_m), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_speak_unit12_m), 8);
    }
    @Override
    public void onBackPressed() {
        Toasty.success(ChienthangSpeak_unit12.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
}

