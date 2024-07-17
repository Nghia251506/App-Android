package game.miqi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;



public class Activity_Reading extends AppCompatActivity {
 TextView text1,text2,text3 ;
 EditText edit1,edit2,edit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__reading);
     text1 = (TextView)findViewById(R.id.text1);
     text2 = (TextView)findViewById(R.id.text2);
     text3 = (TextView)findViewById(R.id.text3);
     edit1 = (EditText)findViewById(R.id.edit1);
     edit2 = (EditText)findViewById(R.id.edit2);
     edit3 = (EditText)findViewById(R.id.edit3);
     text1.setText("Psychologists have long known that having a set of cherished companions is crucial to\n" +
             "mental well-being. A recent study by Australian investigators concluded that our friends even help\n" +
             "to");
     edit1.setText(" ______ ");
     text2.setText(" our lives. The study concentrated");
        edit2.setText(" ______ ");
        text3.setText("the social environment, general\n" +
                "health, and lifestyle of 1,477 persons older than 70 years. The participants were asked how much\n" +
                "contact they had with friends, children, relatives and acquaintances.\n" +
                "Researchers were surprised to learn that friendships increased life ");
        edit3.setText(" ______ ");
    }
}
