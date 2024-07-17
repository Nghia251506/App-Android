package game.miqi.Unit14;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import game.miqi.R;


public class Reading_unit14 extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_unit14);
        textView = (TextView)findViewById(R.id.dichnghia_unit14);
        button = (Button)findViewById(R.id.tieptuc_reading_14);
        textView.setText("Hội chữ thập đỏ là một tổ chức nhân đạo quốc tế. Thời chiến, tổ chức này hoạt động nhằm mục đích giảm thiểu những đau khổ của binh sĩ, thường dân và tù binh bị thương. Thời bình, tổ chức này cứu trợ y tế và giúp đỡ nạn nhân của những thảm họa lớn: lũ lụt, động đất, dịch bệnh và nạn đói.\n" +
                "\n" +
                "Ý tưởng thành lập Hội chữ thập đỏ xuất phát từ một người Thụy Sĩ tên Jean Henri Dunant. Phẫn nộ trước tình trạng gần như không có sự chăm sóc nào dành cho thương binh, ông kêu gọi lãnh đạo các quốc gia thành lập các hiệp hội nhằm mục đích giúp đỡ những người bị thương trong thời chiến. Một hội nghị đã được tổ chức ở Geneva và cuối năm 1864, và đại diện chính chức của 12 quốc gia đã ký hiệp định Geneva lần đầu tiên, đặt ra những qui định về đối xử và bảo vệ những người bị thương và những người gánh chịu thiên tai, dịch bệnh. Cũng tại hội nghị này, biểu tượng nổi tiếng của tổ chức, lá cờ trắng có chữ thập đỏ đã được chọn.\n" +
                "\n" +
                "Chính Henry Davison, chủ tịch Hội đồng chữ thập đỏ thời chiến Hoa Kỳ, đã đề nghị thành lập liên đoàn các Hội chữ thập đỏ. Một hội nghị y khoa quốc tế do Davison khởi xướng đã dẫn đến sự ra đời của Liên hiệp các hội chữ thập đỏ vào năm 1991. Tháng Mười Một năm 1991, Liên hiệp Chữ thập đỏ trở thành Liên đoàn chữ thập đỏ quốc tế. Sứ mệnh của liên đoàn và cải thiện cuộc sống của những người phải gánh chịu thiên tai, đói nghèo và dịch bệnh.\n" +
                "\n" +
                "Hội chữ thập đỏ quốc tế đặt trụ sở ở Geneva, Thụy Sĩ. Ngày nay, tổng số các Hội chữ thập đỏ các nước trên thế giới đã lên tới con số 186. Vì vậy, ở đâu có nạn nhân của tai ương, ở đó có sự cứu giúp kịp thời, chẳng hạn như cứu giúp các nạn nhân sóng thần ở châu Á năm 2004. Hội chữ thập đỏ và Hội lưỡi liềm đỏ tại các quốc gia bị sóng thần đã nhanh chóng phản ứng nhằm giúp đỡ những người phải nỗ lực sống còn, bất chấp một sự thật là nhiều nhân viên và tình nguyện viên cũng bị mất người thân, bạn bè, đồng nghiệp và sinh kế. Thí dụ, trụ sở của Hội chữ thập đỏ Indonesia ở Banda Aceh bị cuốn trôi nhưng một văn phòng tạm thời đã được dựng lên chỉ trong vài giờ và những người bị thương đã được giúp đỡ.");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reading_unit14.this, Unit14.class);
                startActivity(intent);
                finish();

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Reading_unit14.this, Unit14.class);
        startActivity(intent);
        finish();


    }

}



