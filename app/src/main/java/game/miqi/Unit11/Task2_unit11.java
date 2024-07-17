package game.miqi.Unit11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import game.miqi.R;


public class Task2_unit11 extends AppCompatActivity {
    RadioGroup group ,group2,group3,group4,group5;
    RadioButton radioButton;
    int score = 0;
    Button button;
    int score1 = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2_unit11);
        Bundle bundle = getIntent().getExtras();
     score1 = bundle.getInt("Score_taskfirst");
        group = (RadioGroup)findViewById(R.id.groupradio);
        group2 = (RadioGroup )findViewById(R.id.groupradio2);
        group3 = (RadioGroup )findViewById(R.id.groupradio3);
        group4 = (RadioGroup )findViewById(R.id.groupradio4);
        group5 = (RadioGroup )findViewById(R.id.groupradio5);
        button=(Button)findViewById(R.id.kiemtra_task2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Task2_unit11.this,OverView.class);
                intent.putExtra("Score_task2",score);
                intent.putExtra("Score_task1",score1);
                startActivity(intent);
                finish();

            }
        });

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radio3)
                { score+=2 ;
                }else { }

            }
        });
        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio2_2) {
                    score += 2;

                } else {
                }
            }
        });
        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radio3_3)
                {  score+=2;}else{}
            }
        });
        group4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radio1_4)
                {score+=2;}else{}
            }
        });
        group5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radio2_5){score+=2;}else{}
            }
        });

    }

}
