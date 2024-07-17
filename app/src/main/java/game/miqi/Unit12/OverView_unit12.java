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

public class OverView_unit12 extends AppCompatActivity {
    TextView text;
    int score=0;

    Button button;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over_view_unit12);
        button = (Button)findViewById(R.id.ketqua_read_u12);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(OverView_unit12.this,R.raw.music_end);
        mediaPlayer.start();
        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("Score_ketqua_unit12");
        text =(TextView)findViewById(R.id.score_ketqua_u12);
        text.setText("Score: "+score );

        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.hieuung1_u12), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.hieuung1_u12), 8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent = new Intent(OverView_unit12.this,Unit12.class);
                startActivity(intent);
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        Toasty.success(OverView_unit12.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
}
