package game.miqi.Unit12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import game.miqi.R;


public class Task2_unit12 extends AppCompatActivity {
    EditText edit1,edit2,edit3,edit4,edit5;
    Button tieptuc;
    int score=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2_unit12);
        edit1 = (EditText)findViewById(R.id.edit1_unit12);
        edit2 = (EditText)findViewById(R.id.edit2_unit12);
        edit3 = (EditText)findViewById(R.id.edit3_unit12);
        edit4 = (EditText)findViewById(R.id.edit4_unit12);
        edit5 = (EditText)findViewById(R.id.edit5_unit12);
        tieptuc = (Button)findViewById(R.id.tieptuc_unit12);
        tieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.getText().equals("eject"))
                {
                    score+=1;
                }
                if(edit2.getText().equals("foul"))
                {
                    score+=1;
                }
                if(edit3.getText().equals("penalize"))
                {
                    score+=1;
                }
                if(edit4.getText().equals("tie"))
                {
                    score+=1;
                }
                if(edit5.getText().equals("opponent"))
                {
                    score+=1;
                }
                Intent intent = new Intent(Task2_unit12.this, Task1_unit12.class);
                intent.putExtra("Score_task1_unit12",score);
                startActivity(intent);
                finish();


            }
        });
    }
}
