package game.miqi.NguPhap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;


import game.miqi.MainActivity;
import game.miqi.R;

public class Onthi extends AppCompatActivity {
    ListView listView;
    AdapterListOnThi adapterListOnThi;
    ImageView imageView;
    int[] image={R.drawable.background_grammar,R.drawable.background_grammar
            ,R.drawable.background_grammar,R.drawable.background_grammar,R.drawable.background_grammar};
    String[]ten = {"Cụm Động Từ","Mạo Từ","Giới Từ","Câu Điều Kiện","Giao Tiếp"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onthi);
        listView = (ListView)findViewById(R.id.onthi);
        adapterListOnThi = new AdapterListOnThi(this,ten,image);

        listView.setAdapter(adapterListOnThi);
        adapterListOnThi.notifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    Intent intent = new Intent(Onthi.this,CumDongTu.class);
                    startActivity(intent);
                    finish();

                }
                if(position==1){

                    Intent intent = new Intent(Onthi.this,MaoTu.class);
                    startActivity(intent);
                    finish();

                }
                if(position==2){

                    Intent intent = new Intent(Onthi.this,GioiTu.class);
                    startActivity(intent);
                    finish();

                }
                if(position==3){

                    Intent intent = new Intent(Onthi.this,CauKhien.class);
                    startActivity(intent);
                    finish();

                }
                if(position==4){

                    Intent intent = new Intent(Onthi.this,GiaoTiep.class);
                    startActivity(intent);
                    finish();

                }
            }
        });


    }
    @Override
    public void onBackPressed() {


        Intent intent = new Intent(Onthi.this, MainActivity.class);
        startActivity(intent);
        finish();



    }
}
