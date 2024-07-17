package game.miqi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class AdapteViewMain  extends BaseAdapter{
    Context context ;
    String[]ten;
    int[]image;

    public AdapteViewMain(Context context, String[] ten, int[] image) {
        this.context = context;
        this.ten = ten;
        this.image = image;
    }

    @Override
    public int getCount() {
        return ten.length;
    }

    @Override
    public Object getItem(int position) {
        return  ten[position];
    }

    @Override
    public long getItemId(int position) {
        return  ten.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.custom_listview, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.text_custom);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image_custom);
        textView.setText(ten[position]);
        imageView.setImageResource(image[position]);

        return  rowView;
    }
}
