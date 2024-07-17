package game.miqi.Unit11;

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

public class OverView extends AppCompatActivity {
    TextView text1,text2;
    int score1=0;
    int score2=0 ;
    Button button;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over_view);
        button = (Button)findViewById(R.id.continue_read_u11);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(OverView.this,R.raw.music_end);
        mediaPlayer.start();
        Bundle bundle = getIntent().getExtras();
        score1 = bundle.getInt("Score_task1");
        score2 = bundle.getInt("Score_task2");

        text1 =(TextView)findViewById(R.id.score_task1_u11);
        text2 =(TextView)findViewById(R.id.score_task2_u11);
        text1.setText("Score Task 1 : "+score1 );
        text2.setText("Score Task 2 : "+score2);
        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.hieuung1), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.hieuung1), 8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.stop();
                Intent intent = new Intent(OverView.this,Unit11.class);
                startActivity(intent);
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        Toasty.success(OverView.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
}
