package game.miqi.Menu_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;


import game.miqi.MainActivity;
import game.miqi.Menu_Unit.Activity_Unit;
import game.miqi.R;
import game.miqi.Unit11.Unit11;
import game.miqi.Unit12.Unit12;
import game.miqi.Unit13.Unit13;
import game.miqi.Unit14.Unit14;
import game.miqi.Unit15.Unit15;
import game.miqi.Unit16.Unit16;

public class Activity_menu extends AppCompatActivity {
String[]ten={"UNIT10: ENGDANGERED SPECIES","UNIT11: BOOKS","UNIT12: WATER SPORT","UNIT13: The 22nd SEA GAMES",
        "UNIT14: INTERNATIONAL ORGANIZATIONS","UNIT15: WOMEN IN SOCIETY","UNIT16: THE ASSOCIATION OF SOUTHEAST ASIAN NATIONS"};
int []image={R.drawable.unit10, R.drawable.unit11,R.drawable.unit12,R.drawable.seagame,R.drawable.unit13,R.drawable.unit15,R.drawable.unit16};
ListView listView;
ListViewAdapter listViewAdapter;
ImageView back;


int music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        listView = (ListView)findViewById(R.id.listview);


        listViewAdapter = new ListViewAdapter(this,ten,image);
        listView.setAdapter(listViewAdapter);
        listViewAdapter.notifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                   if(position==0)
                   {
                       Intent intent1 = new Intent(Activity_menu.this, Activity_Unit.class);
                       startActivity(intent1);
                       finish();


                   }

                   if(position==1)
                   {

                       Intent intent1 = new Intent(Activity_menu.this, Unit11.class);
                       startActivity(intent1);
                       finish();
                   }
                   if(position==2)
                   {
                       Intent intent1 = new Intent(Activity_menu.this, Unit12.class);
                       startActivity(intent1);
                       finish();
                   }
                   if(position==3)
                   {
                       Intent intent1 = new Intent(Activity_menu.this, Unit13.class);
                       startActivity(intent1);
                       finish();

                   }
                if(position==4)
                {
                    Intent intent1 = new Intent(Activity_menu.this, Unit14.class);
                    startActivity(intent1);
                    finish();

                }
                if(position==5)
                {
                    Intent intent1 = new Intent(Activity_menu.this, Unit15.class);
                    startActivity(intent1);
                    finish();

                }
                if(position==6)
                {

                    Intent intent1 = new Intent(Activity_menu.this, Unit16.class);
                    startActivity(intent1);
                    finish();

                }
            }
        });
    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Activity_menu.this, MainActivity.class);
        startActivity(intent);
        finish();

    }

}
