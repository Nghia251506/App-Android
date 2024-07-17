package game.miqi.ThiThu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import game.miqi.R;


public class ThiThu_Rewrite extends AppCompatActivity {
    Button but1,but2,but3,but4;
    int stt = 0 ;
    String[]question={"I’m sure Luisa was very disappointed when she failed the exam ","“You had better see a doctor if the sore throat does not clear up.”---- she said to me. ",
    "Without her teacher’s advice, she would never have written such a good essay ","She tried very hard to pass the driving test. She could hardly pass it.",
    "Mary loved her stuffed animal when she was young. She couldn’t sleep without it."};
    String [][]answer = {{"Luisa must be very disappointed when she failed the exam",
            "Luisa must have been very disappointed when she failed the exam.",
    "Luisa may be very disappointed when she failed the exam.",
            "Luisa could have been very disappointed when she failed the exam."},

            {"She reminded me of seeing a doctor if the sore throat did not clear up",
                    "She ordered me to see a doctor if the sore throat did not clear up",
                    "She insisted that I see a doctor unless the sore throat did not clear up",
            "She suggested that I see a doctor if the sore throat did not clear up"},

            {"Her teacher advised him and she didn't write a good essay"
                    ,"Her teacher didn't advise her and she didn't write a good essay",
            "She wrote a good essay as her teacher gave her some advice",
            "If her teacher didn't advise her, she wouldnt write such a good essay"},

            {"Although she didn't try hard to pass the driving test, she could pass it",
            "Despite being able to pass the driving test, she didn‟t pass it",
            "No matter how hard she tried, she could hardly pass the driving test",
            "She tried very hard, so she passed the driving test satisfactorily"},

            {"When Mary was young, she loved her stuffed animal so much that she couldn‟t sleep without it",
            "When Mary was young, she loved her stuffed animal so as not to sleep without it",
            "When Mary was young, she loved her stuffed animal though she couldn‟t sleep without it",
            "As Mary couldn‟t sleep without her stuffed animal when Mary was young, she loved it"}};
    TextView cauhoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thi_thu__rewrite);
        but1 = (Button)findViewById(R.id.but1_closest);
        but2 = (Button)findViewById(R.id.but2_closest);
        but3 = (Button)findViewById(R.id.but3_closest);
        but4 = (Button)findViewById(R.id.but4_closest);
        cauhoi = (TextView)findViewById(R.id.write_2_rewrite);
        capnhat();

    }
    private  void capnhat(){
        cauhoi.setText(question[stt]);
        but1.setText(answer[stt][0]);
        but2.setText(answer[stt][1]);
        but3.setText(answer[stt][2]);
        but4.setText(answer[stt][3]);
    }
}
