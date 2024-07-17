package game.miqi.Unit14;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class GridViewAdapter_unit14 extends BaseAdapter{
    Context context;
    char[]kitu;
    int[]dapan;
    Game_unit14 mainActivity;


    public GridViewAdapter_unit14(Context context, char[] kitu, int[]dapan, Game_unit14 mainActivity) {
        this.context = context;
        this.kitu = kitu;
        this.dapan = dapan;
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return  kitu.length;
    }

    @Override
    public Object getItem(int i) {
        return  kitu[i];
    }

    @Override
    public long getItemId(int i) {
        return  i ;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        final Button button;
        if(view==null)
        {button = new Button(context);
            button.setPadding(2,6,2,6);
            button.setLayoutParams(new GridView.LayoutParams(80,100));
            button.setTextColor(Color.parseColor("#6600cc"));
            button.setBackgroundColor(Color.parseColor("#ccffff"));
            button.setTextSize(30f);
            button.setText(String.valueOf(kitu[position]));
        }else {
            button=(Button)view;}


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mainActivity.solansai>3){
                    mainActivity.chuyenmanhinh();
                }

                if(mainActivity.stt==15) {
                    mainActivity.chuyenmanhinh();
                }

                if(dapan[mainActivity.list.get(mainActivity.stt)]==position)
                {
                    mainActivity.onClick(view);


                    Toasty.success(mainActivity,"You Win", Toast.LENGTH_SHORT).show();
                    mainActivity.soundPool.play(mainActivity.id_chienthang,10,10,1,0,1);
                    mainActivity.stt +=1 ;

                    mainActivity.capnhat(mainActivity.list.get(mainActivity.stt));
                    mainActivity.adpater = new GridViewAdapter_unit14(context,mainActivity.capnhat(mainActivity.list.get(mainActivity.stt)),dapan,mainActivity);
                    mainActivity.gridView.setAdapter(mainActivity.adpater);
                    mainActivity.score+=1;
                    mainActivity.textScore.setText(mainActivity.score+"");
                    mainActivity.adpater.notifyDataSetChanged();
                } else {
                    mainActivity.solansai+=1;
                    Toasty.error(mainActivity,"Sai rồi Nhé ",Toast.LENGTH_SHORT).show();
                    mainActivity.soundPool.play(mainActivity.id_thatbai,10,10,1,0,1);

                }


            }
        });
        return  button ;
    }
}