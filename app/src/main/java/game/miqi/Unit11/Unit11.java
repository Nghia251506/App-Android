package game.miqi.Unit11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import game.miqi.Menu_Unit.AdapterUnit;
import game.miqi.Menu_game.Activity_menu;
import game.miqi.R;


public class Unit11 extends AppCompatActivity {

    ListView listView;
AdapterUnit adapterUnit;
    int unit=11 ;
    TextView text_unit;
    ImageView back;

    String[]ten={"Words","Listening","Reading","Contest"};
    int[]image={R.drawable.words_unit,R.drawable.listening,R.drawable.readd,R.drawable.contest};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit11);
        listView = (ListView)findViewById(R.id.listview_unit_11);
        adapterUnit = new AdapterUnit(this,ten,image);
        listView.setAdapter(adapterUnit);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(Unit11.this,Words.class);
                    startActivity(intent);
                    finish();
                }
                if(position==1){

                    Intent intent = new Intent(Unit11.this,SpeakingU11.class);
                    startActivity(intent);
                    finish();
                }
                if(position==2){

                   Intent intent = new Intent(Unit11.this,ReadingUnit11.class);
                    startActivity(intent);
                    finish();
                }
                if(position==3){
                   Intent intent = new Intent(Unit11.this,Contest_unit11.class);
                    startActivity(intent);
                    finish();
                }
            }
        });



    }
    @Override
    public void onBackPressed() {


        Intent intent = new Intent(Unit11.this, Activity_menu.class);
        startActivity(intent);
        finish();
    }


}
