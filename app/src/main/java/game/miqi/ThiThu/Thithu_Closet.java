package game.miqi.ThiThu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import game.miqi.R;


public class Thithu_Closet extends AppCompatActivity {
    String[] question={"Students are expected to always ( adhere to ) school regulations",
    "A number of programs have been initiated to provide food and shelter for ( the underprivileged ) in the remote areas of the country. "};
    String [][] answer={{"question","violate","disregard","follow"},
            {"rich citizens","active members","poor inhabitants","enthusiastic people"},
            {""}};
    String[]dapan={"follow","poor inhabitants"};
    Button but1,but2,but3,but4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thithu__closet);
        but1 = (Button)findViewById(R.id.but1_closest);
        but2 = (Button)findViewById(R.id.but2_closest);
        but3 = (Button)findViewById(R.id.but3_closest);
        but4 = (Button)findViewById(R.id.but4_closest);

    }
}
