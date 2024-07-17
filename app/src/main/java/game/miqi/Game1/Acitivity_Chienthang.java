package game.miqi.Game1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
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

public class Acitivity_Chienthang extends AppCompatActivity {

    Button button;
    MediaPlayer mediaPlayer;
    TextView nsthem ,result;
    int score =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitivity__chienthang);
        nsthem = (TextView)findViewById(R.id.nsthem);
       result = (TextView)findViewById(R.id.result);
      button=(Button)findViewById(R.id.tieptuc);
      Bundle bundle = getIntent().getExtras();
      score = bundle.getInt("Score_game1");
        SharedPreferences preferences = getSharedPreferences("mydata123",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("score_huyhieu_tuvung",score);
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
        mediaPlayer = new MediaPlayer();
        mediaPlayer =MediaPlayer.create(Acitivity_Chienthang.this,R.raw.music_end);
        mediaPlayer.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                mediaPlayer.stop();
                Intent intent = new Intent(Acitivity_Chienthang.this, MainActivity.class);
                startActivity(intent);
            }
        });

        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright), 8);



}
    @Override
    public void onBackPressed() {
        Toasty.success(Acitivity_Chienthang.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
}
