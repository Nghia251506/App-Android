package game.miqi.Unit11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;




import es.dmoral.toasty.Toasty;
import game.miqi.Menu_Unit.Activity_Unit;
import game.miqi.R;

public class CompleteContest_unit11 extends AppCompatActivity {
    int score1,score2;
     TextView ketqua1,ketqua2;
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_contest_unit11);
        Bundle bundle = getIntent().getExtras();
        ketqua1 = (TextView)findViewById(R.id.ketqua_m1_m);
        ketqua2 = (TextView)findViewById(R.id.ketqua_m2_m);
        button=(Button)findViewById(R.id.m_button_m_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompleteContest_unit11.this, Activity_Unit.class);
                startActivity(intent);
                finish();
            }
        });

        score1 = bundle.getInt("m1");
        score2 = bundle.getInt("m2");
        ketqua1.setText("Phần 1: "+score1+" Điểm");
        ketqua2.setText("Phần 2: "+score2+" Điểm");


    }
    @Override
    public void onBackPressed() {
        Toasty.success(CompleteContest_unit11.this,"Press Tiếp Tục", Toast.LENGTH_SHORT).show();

    }
}
