package game.miqi.Game4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;


import es.dmoral.toasty.Toasty;
import game.miqi.R;

public class GridviewAdapterGame4 extends BaseAdapter {
    Context context;
    int[] imgae;
    int width;
    ActivityGame4 activityGame4;


    public GridviewAdapterGame4(Context context, int width, int[] imgae, ActivityGame4 activityGame4) {
        this.context = context;
        this.imgae = imgae;
        this.width = width;
        this.activityGame4 = activityGame4;

    }

    @Override
    public int getCount() {
        return imgae.length;
    }

    @Override
    public Object getItem(int position) {
        return imgae[position];
    }

    @Override
    public long getItemId(int position) {
        return imgae.length;
    }

    @Override
    public View getView(final int postion, View convertView, ViewGroup parent) {
        final ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setScrollBarSize(0);
            imageView.setLayoutParams(new GridView.LayoutParams(width, 190));
            imageView.setImageResource(R.drawable.bai_miqi);
        } else {
            imageView = (ImageView) convertView;
        }


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityGame4.solanfree-=1;
                if(activityGame4.solanfree<=0)
                {
                    Toasty.error(activityGame4,"Đã Hết Số Lần Mở", Toast.LENGTH_SHORT).show();

                }else{
                imageView.setImageResource(imgae[postion]);}
            }
        });
        return imageView;
    }
}