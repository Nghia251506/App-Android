package game.miqi.Unit15;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import game.miqi.R;


public class Reading_unit15 extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_unit15);
        textView = (TextView)findViewById(R.id.dichnghia_unit15);
        textView.setText("Trong gần hết chiều dài lịch sử văn minh nhân loại, những quan niệm văn hóa lâu đời chỉ cho phép phụ nữ đảm nhận một ít vai trò trong xã hội. Nhiều người cho rằng thiên chức của người phụ nữ là làm vợ, làm mẹ. Những người này cho rằng phụ nữ thích hợp với việc sinh con và trông nom nhà cửa hơn là tham gia vào đời sống kinh tế hay chính trị của xã hội. Những nghi ngại chung về khả năng tư duy của người phụ nữ đã khiến cho nhiều xã hội không cho nữ giới được học hành, tuyển dụng và nhiều quyền lợi chính trị và pháp lý. Chính nam giới mới là người kiểm soát hầu hết việc làm và quyền lực trong xã hội.\n" +
                "\n" +
                "Cuộc đấu tranh cho nữ quyền - quyền mang lại cho phụ nữ vị thế xã hội, kinh tế và chính trị ngang bằng với nam giới - bắt đầu từ thế kỷ 18 trong một giai đoạn được gọi là Thời đại Ánh sáng. Trong giai đoạn này, các triết gia chính trị ở châu Âu bắt đầu tranh luận rằng mọi cá nhân, dù là nam hay nữ, sinh ra đã có quyền tự do và bình đẳng. Những nhà tư tưởng tiên phong này chủ trương rằng phụ nữ không nên bị phân biệt đối xử vì lý do giới tính.\n" +
                "\n" +
                "Ngày nay, mặc dù vị thế của phụ nữ ở mỗi quốc gia mỗi khác, phần lớn phụ nữ trên thế giới đã được những quyền lợi pháp lý đáng kể. Trong số đó, quan trọng nhất là: cơ hội làm việc và được trả lương ngang bằng với nam giới, quyền bầu cử và quyền được học hành tử tế.");
        button = (Button)findViewById(R.id.tieptuc_reading_15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reading_unit15.this,Unit15.class);
                startActivity(intent);
                finish();

            }
        });
    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Reading_unit15.this, Unit15.class);
        startActivity(intent);
        finish();



    }

}
