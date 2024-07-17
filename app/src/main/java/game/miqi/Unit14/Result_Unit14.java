package game.miqi.Unit14;

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

public class Result_Unit14 extends AppCompatActivity {
    Button button;
    MediaPlayer mediaPlayer;
    TextView nsthem ,result;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result__unit14);
        nsthem = (TextView)findViewById(R.id.nsthem_result_unit14);
        result = (TextView)findViewById(R.id.result_result_unit14);
        button=(Button)findViewById(R.id.tieptuc_result_unit14);
        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("Score_result_unit14");
        if(score<10)
        {
            nsthem.setText("Too Bad");
            result.setText("Score: "+(score/2));
        }
        if(score>=10)
        {
            nsthem.setText("Hmmm");
            result.setText("Score: "+(score/2));
        }
        if(score>=15)
        {
            result.setText("Score: "+(score/2));
            nsthem.setText("Very Good !");
        }
        if(score>18)
        {
            result.setText("Score: "+(score/2));
            nsthem.setText(" Pro !");
        }








        mediaPlayer = new MediaPlayer();
        mediaPlayer =MediaPlayer.create(Result_Unit14.this,R.raw.music_end);
        mediaPlayer.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.stop();
                Intent intent = new Intent(Result_Unit14.this, Unit14.class);
                startActivity(intent);
                finish();

            }
        });

        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_result_unit14), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_result_unit14), 8);



    }
    @Override
    public void onBackPressed() {
        Toasty.success(Result_Unit14.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
}

