package game.miqi.Unit13;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import game.miqi.R;


public class Reading_unit13 extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_unit13);
        textView = (TextView)findViewById(R.id.dichnghia_unit13);
        textView.setText("SEA Games 22 được tổ chức ở Việt Nam từ ngày 5 đến ngày 13 tháng Mười Hai năm 2003. Mặc dù đây là lần đầu tiên Việt Nam tổ chức một sự kiện thể thao lớn như vậy, SEA Games 22 đã thành công tốt đẹp. SEA Games 22 thật sự đã trở thành một kỳ thể thao gây ấn tượng với những người yêu thể thao bởi tinh thần: đoàn kết, hợp tác vì hòa bình và phát triển.\n" +
                "\n" +
                "Các vận động viên từ 11 quốc gia tham gia thi đấu 32 môn thể thao, và đã giành được 444 huy chương vàng. Một số đội thể thao như bóng bàn, cầu lông, karatedo, bóng chuyền, bóng rổ và đấu vật có các vận động viên hàng đầu khu vực tham gia. Nhiều kỷ lục được thiết lập ở SEA Games gần với kỷ lục thế giới. Việt Nam giành được 158 huy chương vàng, dẫn đầu bảng tổng sắp huy chương tại SEA Games. Thái Lan đứng thứ hai với 90 huy chương vàng, và Indonesia đứng thứ ba với chỉ 55 huy chương vàng. Singapore và Việt Nam là hai quốc gia có các vận động viên được trao tặng danh hiệu vận động viên xuất sắc nhất trong các môn bơi lội và bắn súng. Đội bóng đã nữ Việt Nam bảo vệ thành công danh hiệu vô địch SEA Games. Đội bóng đã nam giành huy chương bạc. Các môn thể thao khác như karatedo, điền kinh, thể hình và wushu, các vận động viên trẻ và đầy nhiệt huyết của Việt Nam đã thi đấu tuyệt vời và giành được nhiều huy chương vàng.\n" +
                "\n" +
                "Vị trí số một trên bảng tổng sắp của Việt Nam không phải là điều đáng ngạc nhiên. Thứ nhất, để chuẩn bị cho SEA Games 22, Việt Nam đã thực hiện một chương trình tập trung cho tất cả các vận động viên, bao gồm các đợt tập huấn cả trong và ngoài nước. Thứ hai, với sự cổ vũ nồng nhiệt của đồng bào, các vận động viên Việt Nam đã thi đấu với tinh thần rất cao. Thành công này chứng tỏ Việt Nam có khả năng tổ chức một sự kiện thể thao tầm cỡ quốc tế. Kế hoạch đăng cai Á Vận Hội vào một thời điểm nào đó trong tương lai của Việt Nam đã được đề ra.");
        button = (Button)findViewById(R.id.tieptuc_reading_13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reading_unit13.this,Unit13.class);
                startActivity(intent);
                finish();

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Reading_unit13.this, Unit13.class);
        startActivity(intent);
        finish();



    }

}
