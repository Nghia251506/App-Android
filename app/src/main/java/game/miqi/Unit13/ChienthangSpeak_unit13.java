package game.miqi.Unit13;

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

public class ChienthangSpeak_unit13 extends AppCompatActivity {
    TextView result,nsthem;
    Button tieptuc;
    int score;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chienthang_speak_unit13);
        result = (TextView)findViewById(R.id.result_speak_unit13);
        nsthem=(TextView)findViewById(R.id.nsthem_speak_unit13);
        tieptuc = (Button)findViewById(R.id.tieptuc_speak_unit13);
        mediaPlayer = new MediaPlayer();
        mediaPlayer =MediaPlayer.create(ChienthangSpeak_unit13.this,R.raw.music_end);
        mediaPlayer.start();
        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("Score_speak_unit13");
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
                mediaPlayer.stop();
                Intent intent = new Intent(ChienthangSpeak_unit13.this, Unit13.class);
                startActivity(intent);
                finish();
            }
        });
        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_speak_unit13), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_speak_unit13), 8);
    }
    @Override
    public void onBackPressed() {
        Toasty.success(ChienthangSpeak_unit13.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
}