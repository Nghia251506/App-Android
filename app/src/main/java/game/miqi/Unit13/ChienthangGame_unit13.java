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

public class ChienthangGame_unit13 extends AppCompatActivity {
    Button button;
    MediaPlayer mediaPlayer;
    TextView nsthem ,result;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chienthang_game_unit13);
        nsthem = (TextView)findViewById(R.id.nsthem_result_unit13);
        result = (TextView)findViewById(R.id.result_result_unit13);
        button=(Button)findViewById(R.id.tieptuc_result_unit13);
        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("Score_result_unit13");
        if(score<5)
        {
            nsthem.setText("Too Bad");

        }
        if(score>=5)
        {
            result.setText("Let'Try");
            ;
        }
        if(score>=8)
        {
            result.setText("Very Good !");
            nsthem.setText("Á Đù");
        }



        mediaPlayer = new MediaPlayer();
        mediaPlayer =MediaPlayer.create(ChienthangGame_unit13.this,R.raw.music_end);
        mediaPlayer.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent = new Intent(ChienthangGame_unit13.this, Unit13.class);
                startActivity(intent);
                finish();

            }
        });

        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_result_unit13), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_result_unit13), 8);



    }
    @Override
    public void onBackPressed() {
        Toasty.success(ChienthangGame_unit13.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
}
