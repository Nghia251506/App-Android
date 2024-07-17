package game.miqi.ThiThu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import game.miqi.Game3.ActivityGame3;
import game.miqi.MainActivity;
import game.miqi.R;


public class ThiThu_menu extends AppCompatActivity {
    Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thi_thu_menu);
        button = (Button)findViewById(R.id.button_thithu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThiThu_menu.this, ActivityGame3.class);
                startActivity(intent);
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ThiThu_menu.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
