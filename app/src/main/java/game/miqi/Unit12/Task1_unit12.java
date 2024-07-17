package game.miqi.Unit12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import game.miqi.R;


public class Task1_unit12 extends AppCompatActivity {
    EditText edit1,edit2,edit3,edit4,edit5;
    Button tieptuc;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1_unit12);
        edit1 = (EditText)findViewById(R.id.edit_unit12_1);
        edit2 = (EditText)findViewById(R.id.edit_unit12_2);
        edit3 = (EditText)findViewById(R.id.edit_unit12_3);
        edit4 = (EditText)findViewById(R.id.edit_unit12_4);
        edit5 = (EditText)findViewById(R.id.edit_unit12_5);
        tieptuc = (Button)findViewById(R.id.tieptuc_task1_unit12);
        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("Score_task1_unit12");
        tieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edit2.getText().equals("while caps; blue caps; red caps with the number 1 in white"))
                {
                    score+=1;
                }
                if(edit2.getText().equals("while caps;blue caps;red caps with the number 1 in white"))
                {
                    score +=1;
                }
                if(edit3.getText().equals("their own goal lines"))
                {
                    score+=1;
                }
                if(edit4.getText().equals("holding or punching the ball"))
                {
                    score+=1;
                }
                if(edit5.getText().equals("five to eight minute"))
                {
                    score+=1;
                }
                Intent intent = new Intent(Task1_unit12.this, OverView_unit12.class);
                intent.putExtra("Score_ketqua_unit12",score);
                startActivity(intent);
                finish();
            }
        });
    }
}
