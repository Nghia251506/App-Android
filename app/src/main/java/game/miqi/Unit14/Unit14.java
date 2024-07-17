package game.miqi.Unit14;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;


import game.miqi.Menu_Unit.AdapterUnit;
import game.miqi.Menu_game.Activity_menu;
import game.miqi.R;


public class Unit14 extends AppCompatActivity {
    ListView listView;
    AdapterUnit adapterUnit;
    ImageView back;
    String[]ten={"Words","Reading","Listening","Game","Contest"};
    int[]image={R.drawable.words_unit, R.drawable.bookss,R.drawable.listening,R.drawable.game,R.drawable.contest};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit14);
        listView = (ListView)findViewById(R.id.listview_unit_14);
        adapterUnit = new AdapterUnit(this,ten,image);
        listView.setAdapter(adapterUnit);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    Intent intent = new Intent(Unit14.this,Words_unit14.class);
                    startActivity(intent);
                    finish();
                }
                if(position==1){

                    Intent intent = new Intent(Unit14.this,Reading_unit14.class);
                    startActivity(intent);
                    finish();
                }
                if(position==2){
                    Intent intent = new Intent(Unit14.this,Listening_unit14.class);
                    startActivity(intent);
                    finish();
                }
                if(position==3){
                    Intent intent = new Intent(Unit14.this,Game_unit14.class);
                    startActivity(intent);
                    finish();
                }
                if(position==4){
                    Intent intent = new Intent(Unit14.this,Contest_unit14.class);
                    startActivity(intent);
                    finish();
                }
            }
        });



    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Unit14.this, Activity_menu.class);
        startActivity(intent);
        finish();


    }


}