package game.miqi;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.plattysoft.leonids.ParticleSystem;

import es.dmoral.toasty.Toasty;

public class HoanThanh extends AppCompatActivity {
    Button button;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoan_thanh);
        button =(Button)findViewById(R.id.tieptuc_ht);
        mediaPlayer = new MediaPlayer();
        mediaPlayer =MediaPlayer.create(HoanThanh.this,R.raw.music_end);
        mediaPlayer.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent = new Intent(HoanThanh.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        new ParticleSystem(this, 80, R.drawable.confeti, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_ht), 8);

        new ParticleSystem(this, 80, R.drawable.confeti1, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.3f, 0, 0)
                .setRotationSpeed(144)
                .setAcceleration(0.00005f, 90)
                .emit(findViewById(R.id.textright_ht), 8);
    }
    @Override
    public void onBackPressed() {
        Toasty.success(HoanThanh.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
}
