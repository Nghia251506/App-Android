package game.miqi.ThiThu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import game.miqi.R;


public class ThiThu_Reading extends AppCompatActivity {
    TextView textView;
    String[][] answer;
    int stt = 5 ;
    int score ;
    Button button1,button2,button3,button4
            ,button5,button6,button7,button8
            ,button9,button10,button11,button12
            ,button13,button14,button15,button16,
            button17,button18,button19,button20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thi_thu__reading);
        button1 =(Button)findViewById(R.id.but1_cau1_read);
        button2 =(Button)findViewById(R.id.but2_cau1_read);
        button3 =(Button)findViewById(R.id.but3_cau1_read);
        button4 =(Button)findViewById(R.id.but4_cau1_read);
        button5 =(Button)findViewById(R.id.but1_cau2_read);
        button6 =(Button)findViewById(R.id.but2_cau2_read);
        button7 =(Button)findViewById(R.id.but3_cau2_read);
        button8 =(Button)findViewById(R.id.but4_cau2_read);
        button9 =(Button)findViewById(R.id.but1_cau3_read);
        button10 =(Button)findViewById(R.id.but2_cau3_read);
        button11 =(Button)findViewById(R.id.but3_cau3_read);
        button12 =(Button)findViewById(R.id.but4_cau3_read);
        button13 =(Button)findViewById(R.id.but1_cau4_read);
        button14 =(Button)findViewById(R.id.but2_cau4_read);
        button15 =(Button)findViewById(R.id.but3_cau4_read);
        button16 =(Button)findViewById(R.id.but4_cau4_read);
        button17 =(Button)findViewById(R.id.but1_cau5_read);
        button18 =(Button)findViewById(R.id.but2_cau5_read);
        button19 =(Button)findViewById(R.id.but3_cau5_read);
        button20 =(Button)findViewById(R.id.but4_cau5_read);
        button1.setText("different");
        button2.setText("unique");
        button3.setText("common");
        button4.setText("same");
        button5.setText("light");
        button6.setText("superficial");
        button7.setText("fast");
        button8.setText("heavy");
        button9.setText("huge");
        button10.setText("large");
        button11.setText("big");
        button12.setText("great");
        button13.setText("habit");
        button14.setText("routine");
        button15.setText("custom");
        button16.setText("tradition");
        button17.setText("sincere");
        button18.setText("truthful");
        button19.setText("faithful ");
        button20.setText("hopeful");
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 score+=1 ;
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score+=1 ;
                button6.setVisibility(View.INVISIBLE);
                button7.setVisibility(View.INVISIBLE);
                button8.setVisibility(View.INVISIBLE);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score+=1 ;
                button9.setVisibility(View.INVISIBLE);
                button10.setVisibility(View.INVISIBLE);
                button12.setVisibility(View.INVISIBLE);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score+=1 ;
                button14.setVisibility(View.INVISIBLE);
                button15.setVisibility(View.INVISIBLE);
                button16.setVisibility(View.INVISIBLE);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score+=1 ;
                button18.setVisibility(View.INVISIBLE);
                button19.setVisibility(View.INVISIBLE);
                button20.setVisibility(View.INVISIBLE);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setVisibility(View.INVISIBLE);
                button7.setVisibility(View.INVISIBLE);
                button8.setVisibility(View.INVISIBLE);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setVisibility(View.INVISIBLE);
                button6.setVisibility(View.INVISIBLE);
                button8.setVisibility(View.INVISIBLE);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setVisibility(View.INVISIBLE);
                button6.setVisibility(View.INVISIBLE);
                button7.setVisibility(View.INVISIBLE);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setVisibility(View.INVISIBLE);
                button11.setVisibility(View.INVISIBLE);
                button12.setVisibility(View.INVISIBLE);

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9.setVisibility(View.INVISIBLE);
                button11.setVisibility(View.INVISIBLE);
                button12.setVisibility(View.INVISIBLE);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9.setVisibility(View.INVISIBLE);
                button10.setVisibility(View.INVISIBLE);
                button11.setVisibility(View.INVISIBLE);

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button13.setVisibility(View.INVISIBLE);
                button15.setVisibility(View.INVISIBLE);
                button16.setVisibility(View.INVISIBLE);

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button13.setVisibility(View.INVISIBLE);
                button14.setVisibility(View.INVISIBLE);
                button16.setVisibility(View.INVISIBLE);

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button13.setVisibility(View.INVISIBLE);
                button14.setVisibility(View.INVISIBLE);
                button15.setVisibility(View.INVISIBLE);

            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button17.setVisibility(View.INVISIBLE);
                button19.setVisibility(View.INVISIBLE);
                button20.setVisibility(View.INVISIBLE);

            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button17.setVisibility(View.INVISIBLE);
                button18.setVisibility(View.INVISIBLE);
                button20.setVisibility(View.INVISIBLE);

            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button18.setVisibility(View.INVISIBLE);
                button19.setVisibility(View.INVISIBLE);
                button17.setVisibility(View.INVISIBLE);

            }
        });

    }

}
