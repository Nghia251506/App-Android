package game.miqi.Game1;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;


import es.dmoral.toasty.Toasty;
import game.miqi.R;

public class GridViewAnswer extends BaseAdapter {
    char[] answerchar;
    Context context;
    ActivityGame11 activityGame11;
    public GridViewAnswer(char[] answerchar, Context context,ActivityGame11 activityGame11) {
        this.answerchar = answerchar;
        this.context = context;
        this.activityGame11 = activityGame11;


    }

    @Override

    public int getCount() {
        return activityGame11.dodai_answer[activityGame11.kiemtra.get(activityGame11.stt)];
    }

    @Override
    public Object getItem(int position) {
        return answerchar[position];
    }

    @Override
    public long getItemId(int i) {
        return answerchar.length;
    }

    @Override
    public View getView(final int vitri, View view, ViewGroup viewGroup) {
        final Button button;
        // Creat new Button
        if (view == null) {
            button = new Button(context);
            button.setPadding(5, 5, 5, 5);
            button.setLayoutParams(new GridView.LayoutParams(80, 80));
            int[] a={R.drawable.blue_button, R.drawable.green_button,R.drawable.red_button,R.drawable.violet_button,R.drawable.orange_button};
            button.setBackground(activityGame11.getResources().getDrawable(R.drawable.blue_button));
            if(activityGame11.check)
            {
                button.setBackground(activityGame11.getResources().getDrawable(R.drawable.red_button));
            }
            //button.setBackgroundColor(Color.DKGRAY);
            button.setTextColor(Color.BLACK);
            button.setTextSize(25);
            button.setText(String.valueOf(answerchar[vitri]));


        } else {
            button = (Button) view;

        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityGame11.soluot_mienphi -=1 ;
                if(activityGame11.soluot_mienphi>0) {


                    Commom.submit_answer[vitri] = activityGame11.answer[vitri];
                    button.setText((String.valueOf(activityGame11.answer[vitri])));
                }else{
                    Toasty.error(activityGame11, "Hết Lượt Miễn Phí", Toast.LENGTH_SHORT).show();
                }

            }
        });
        return button;
    }
}