package game.miqi.Menu_Unit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import game.miqi.Class_Words;
import game.miqi.Game1.KiemTra_unit10;
import game.miqi.Game2.ActivityGame2;
import game.miqi.Menu_game.Activity_menu;
import game.miqi.R;
import game.miqi.Speaking;

public class Activity_Unit extends AppCompatActivity {
ListView listView;
AdapterUnit adapterUnit;
int unit=10 ;
TextView text_unit;
ImageView back;
String[]ten={"Words","Listening","Game","Contest"};
int[]image={R.drawable.words_unit, R.drawable.listening,R.drawable.game,R.drawable.contest};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__unit);
        listView = (ListView)findViewById(R.id.listview_unit);
        adapterUnit = new AdapterUnit(this,ten,image);
        text_unit = (TextView)findViewById(R.id.unit);
        listView.setAdapter(adapterUnit);
        text_unit.setText("Unit: "+unit+"");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    Intent intent = new Intent(Activity_Unit.this,Class_Words.class);
                    startActivity(intent);
                    finish();
                }
                if(position==1){

                    Intent intent = new Intent(Activity_Unit.this,Speaking.class);
                    startActivity(intent);
                    finish();
                }
                if(position==2){

                    Intent intent = new Intent(Activity_Unit.this,ActivityGame2.class);
                    startActivity(intent);
                    finish();
                }
                if(position==3){

                    Intent intent = new Intent(Activity_Unit.this,KiemTra_unit10.class);
                    intent.putExtra("unit",10);
                    startActivity(intent);
                    finish();
                }
            }
        });



    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Activity_Unit.this, Activity_menu.class);
        startActivity(intent);
        finish();
    }


}
