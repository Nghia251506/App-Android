package game.miqi.Unit12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import game.miqi.R;

public class Reading_unit12 extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_unit12);
        textView = (TextView)findViewById(R.id.dichnghia_unit12);
        button = (Button)findViewById(R.id.tieptuc_reading_12);
    textView.setText("Môn bóng nước được chơi trong một cái hồ sâu 1,8 mét, dài 30 mét và rộng 20 mét, với khung thành cao 3 mét và cao hơn mặt nước ít nhất 0,9 mét. Khung thành được đánh dấu bằng các cột dọc, một xà ngang và một tấm lưới.\n" +
            "\n" +
            "Mỗi đội có 7 cầu thủ, 6 tay bơi và 1 thủ môn. Đội chủ nhà đội mũ trắng, đội khách đội mũ xanh và thủ môn đội mũ đỏ với số 1 màu trắng.\n" +
            "\n" +
            "Giống như bóng đá, trò chơi bắt đầu với quả bóng ở giữa hồ và cả hai đội lao ra tranh bóng từ vạch gôn của họ. Quả bóng được đưa tới trước bằng cách chuyền một tay hoặc bơi với đầu nổi trên mặt nước và bóng ở giữa hai cánh tay vì thế bóng lướt đi trên gợn sóng do đầu của cầu thủ tạo ra. Ngoại trừ thủ môn, không cầu thủ nào được quyền giữ bóng bằng hai tay.\n" +
            "\n" +
            "Các cầu thủ hậu vệ không được phép ngăn cản đối phương di chuyển trừ khi cầu thủ kia đang giữ bóng. Những lỗi nghiêm trọng sẽ bị một quả phạt trong vòng một phút trong vòng cấm địa và cầu thủ nào phạm 5 lỗi sẽ bị truất quyền thi đấu.\n" +
            "\n" +
            "Đối với những lỗi nhỏ, chẳng hạn như giữ hoặc đấm bóng sẽ được hưởng một cú ném bóng tại điểm phạm lỗi. Phải có ít nhất hai cầu thủ chạm bóng sau cú ném đó thì bàn thắng mới được tính.\n" +
            "\n" +
            "Trận đấu được chia làm 4 hiệp, mỗi hiệp từ 5 tới 8 phút. Sau tỉ số hòa, có hai hiệp phụ, mỗi hiệp kéo dài 3 phút. Nếu trận đấu vẫn hòa sau hai hiệp phụ, hai đội sẽ tiếp tục chơi thêm 3 phút nữa cho đến khi có quyết định của trọng tài.");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reading_unit12.this,Task2_unit12.class);
                startActivity(intent);
                finish();

            }
        });
    }
    @Override
    public void onBackPressed() {
                        Intent intent = new Intent(Reading_unit12.this, Unit12.class);
                        startActivity(intent);
        finish();



    }

}
