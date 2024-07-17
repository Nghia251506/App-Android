package game.miqi.Unit11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;



import es.dmoral.toasty.Toasty;
import game.miqi.R;

public class Contest_unit11 extends AppCompatActivity {
    RadioGroup radioGroup,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6,radioGroup7,radioGroup8,radioGroup9,radioGroup10;
    TextView text1_1,text1_2,text1_3,text1_4,text2_1,text2_2,text2_3,text2_4,
    text3_1,text3_2,text3_3,text3_4,text4_1,text4_2,text4_3,text4_4,text5_1,text5_2,text5_3,text5_4,text6_1,text6_2,
            text6_3
            ,text6_4,text7_1,text7_2,text7_3,text7_4,text8_1,text8_2,text8_3,text8_4,text9_1,text9_2,text9_3
            ,text9_4,text10_1,text10_2,text10_3,text10_4;
    int score = 0 ;
Button button_m ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_unit11);
        radioGroup = (RadioGroup)findViewById(R.id.group_m1);
        radioGroup2 = (RadioGroup)findViewById(R.id.group_m2);
        radioGroup3 = (RadioGroup)findViewById(R.id.group_m3);
        radioGroup4 = (RadioGroup)findViewById(R.id.group_m4);
        radioGroup5 = (RadioGroup)findViewById(R.id.group_m5);
        radioGroup6 = (RadioGroup)findViewById(R.id.group_m6);
        radioGroup7 = (RadioGroup)findViewById(R.id.group_m7);
        radioGroup8 = (RadioGroup)findViewById(R.id.group_m8);
        radioGroup9 = (RadioGroup)findViewById(R.id.group_m9);
        radioGroup10 = (RadioGroup)findViewById(R.id.group_m10);
        button_m = (Button)findViewById(R.id.tieptuc_m);
        button_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Contest_unit11.this,Contest2_unit11.class);
                intent.putExtra("m1_first",score);
                startActivity(intent);
                finish();
            }
        });


        text1_1 = (TextView)findViewById(R.id.cauhoi1_1);
        text1_2 = (TextView)findViewById(R.id.cauhoi1_2);
        text1_3 = (TextView)findViewById(R.id.cauhoi1_3);
        text1_4 = (TextView)findViewById(R.id.cauhoi1_4);

        text2_1 = (TextView)findViewById(R.id.cauhoi2_1);
        text2_2 = (TextView)findViewById(R.id.cauhoi2_2);
        text2_3 = (TextView)findViewById(R.id.cauhoi2_3);
        text2_4 = (TextView)findViewById(R.id.cauhoi2_4);

        text3_1 = (TextView)findViewById(R.id.cauhoi3_1);
        text3_2 = (TextView)findViewById(R.id.cauhoi3_2);
        text3_3 = (TextView)findViewById(R.id.cauhoi3_3);
        text3_4 = (TextView)findViewById(R.id.cauhoi3_4);

        text4_1 = (TextView)findViewById(R.id.cauhoi4_1);
        text4_2 = (TextView)findViewById(R.id.cauhoi4_2);
        text4_3 = (TextView)findViewById(R.id.cauhoi4_3);
        text4_4 = (TextView)findViewById(R.id.cauhoi4_4);

        text5_1 = (TextView)findViewById(R.id.cauhoi5_1);
        text5_2 = (TextView)findViewById(R.id.cauhoi5_2);
        text5_3 = (TextView)findViewById(R.id.cauhoi5_3);
        text5_4 = (TextView)findViewById(R.id.cauhoi5_4);

        text6_1 = (TextView)findViewById(R.id.cauhoi6_1);
        text6_2 = (TextView)findViewById(R.id.cauhoi6_2);
        text6_3 = (TextView)findViewById(R.id.cauhoi6_3);
        text6_4 = (TextView)findViewById(R.id.cauhoi6_4);

        text7_1 = (TextView)findViewById(R.id.cauhoi7_1);
        text7_2 = (TextView)findViewById(R.id.cauhoi7_2);
        text7_3 = (TextView)findViewById(R.id.cauhoi7_3);
        text7_4 = (TextView)findViewById(R.id.cauhoi7_4);

        text8_1 = (TextView)findViewById(R.id.cauhoi8_1);
        text8_2 = (TextView)findViewById(R.id.cauhoi8_2);
        text8_3 = (TextView)findViewById(R.id.cauhoi8_3);
        text8_4 = (TextView)findViewById(R.id.cauhoi8_4);

        text9_1 = (TextView)findViewById(R.id.cauhoi9_1);
        text9_2 = (TextView)findViewById(R.id.cauhoi9_2);
        text9_3 = (TextView)findViewById(R.id.cauhoi9_3);
        text9_4 = (TextView)findViewById(R.id.cauhoi9_4);

        text10_1 = (TextView)findViewById(R.id.cauhoi10_1);
        text10_2 = (TextView)findViewById(R.id.cauhoi10_2);
        text10_3 = (TextView)findViewById(R.id.cauhoi10_3);
        text10_4 = (TextView)findViewById(R.id.cauhoi10_4);

        text1_1.setText("organize");
        text1_2.setText("decorate");
        text1_3.setText("divorce");
        text1_4.setText("promise");

        text2_1.setText("refreshment");
        text2_2.setText("horrible");
        text2_3.setText("exciting");
        text2_4.setText("intention");

        text3_1.setText("knowledge");
        text3_2.setText("maximum");
        text3_3.setText("athletics");
        text3_4.setText("marathon");

        text4_1.setText("difficult");
        text4_2.setText("relevant");
        text4_3.setText("volunteer");
        text4_4.setText("interesting");

        text5_1.setText("confidence");
        text5_2.setText("supportive");
        text5_3.setText("solution");
        text5_4.setText("obedient");

        text6_1.setText("whenever");
        text6_2.setText("mischievous");
        text6_3.setText("hospital");
        text6_4.setText("separate");

        text7_1.setText("introduce");
        text7_2.setText("delegate");
        text7_3.setText("marvelous");
        text7_4.setText("currency");

        text8_1.setText("subject");
        text8_2.setText("swallow");
        text8_3.setText("story");
        text8_4.setText("digest");

        text9_1.setText("example");
        text9_2.setText("holiday");
        text9_3.setText("careful");
        text9_4.setText("interest");

        text10_1.setText("entertainment");
        text10_2.setText("information");
        text10_3.setText("difficulty");
        text10_4.setText("understanding");
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cau1_3){
                    Toasty.success(Contest_unit11.this,"Đúng",Toast.LENGTH_SHORT).show();
                    score+=1;
                }

            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cau2_2){
                    score+=1;
                }
            }
        });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cau3_3){
                    score+=1;
                }
            }
        });
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cau4_3){
                    score+=1;
                }
            }
        });
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cau5_2){
                    score+=1;
                }
            }
        });
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cau6_1){
                    score+=1;
                }
            }
        });
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cau7_1){
                    score+=1;
                }
            }
        });


        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cau8_4){
                    score+=1;
                }
            }
        });
        radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cau9_1){
                    score+=1;
                }
            }
        });
        radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.cau10_3){
                    score+=1;
                }
            }
        });





    }
}
