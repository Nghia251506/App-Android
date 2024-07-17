package game.miqi.Unit16;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import game.miqi.R;


public class Reading_unit16 extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_unit16);
        textView = (TextView)findViewById(R.id.dichnghia_unit16);
textView.setText("Hiệp hội các quốc gia Đông Nam Á hay ASEAN được thành lập vào ngày 8 tháng Tám năm 1967 tại Bangkok, Thái Lan, gồm năm nước thành viên đầu tiên là Indonesia, Malaysia, Philippines, Singapore và Thái Lan. Năm 1984, Brunei gia nhập ASEAN. Năm 1995, Việt Nam trở thành thành viên thứ bảy. Năm 1997, Lào và Myanmar gia nhập hiệp hội này và năm 1999 là Campuchia. Mục tiêu chính của hiệp hội là thúc đẩy sự phát triển kinh tế, tiến bộ xã hội và phát triển văn hóa; và thúc đẩy hòa bình và ổn định khu vực thông qua sự tôn trọng công lý và nguyên tắc pháp lý trong quan hệ giữa các quốc gia trong khu vực.\n" +
        "\n" +
        "ASEAN có dân số 575.5 triệu người, chiếm khoảng 8.7% dân số thế giới. Tổng diện tích là 4 464 322 kilômét vuông. Đây là khu vực có nền văn hóa đa dạng, và ngoài tiếng mẹ đẻ người dân ở một số quốc gia như Philippines, Brunei, Malaysia và Singapore còn nói được tiếng Anh. Theo thống kê ghi nhận vào năm 2007, tổng sản lượng quốc dân (GDP) của các nước ASEAN gộp lại khoảng 1282 tỷ đôla Mỹ. Mức GDP chung này tăng trưởng với tốc độ trung bình khoảng 6% mỗi năm từ năm 2003 đến 2007. Nền kinh tế của các quốc gia thành viên đa dạng, dù sản phẩm chính của các quốc gia này đều là hàng điện tử, dầu lửa và gỗ. Các chính phủ của các quốc gia ASEAN đặc biệt chú trọng thương mại. Vào năm 2006, tổng mức giao dịch của toàn khối ASEAN là 1405 tỉ đôla Mỹ. Người ta ước tính trước năm 2020, một khu vực mậu dịch tự do sẽ được thành lập trong khu vực. Các nhà lãnh đạo ASEAN cũng đã thông qua Tầm nhìn ASEAN 2020, nhằm thúc đẩy hơn nữa hội nhập kinh tế trong khu vực. Được thông qua năm 1998, Chương trình hành động Hà Nội là chương trình đầu tiên trong một loạt chương trình hành động nhằm biến Tầm nhìn ASEAN thành hiện thực.\n" +
        "\n" +
        "Ngày nay, hợp tác kinh tế giữa các nước ASEAN bao gồm nhiều lĩnh vực: thương mại, đầu tư, công nghiệp, dịch vụ, tài chính, nông nghiệp, phát triển nông thôn, lâm nghiệp, năng lượng, giao thông vận tải và truyền thông, khoa học và công nghệ, kinh doanh vừa và nhỏ, và ngành du lịch. ASEAN đã hoạt động tích cực để cải thiện tình hình kinh tế xã hội và giải quyết các vấn đề giữa các nước thành viên.");
        button = (Button)findViewById(R.id.tieptuc_reading_16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reading_unit16.this, Unit16.class);
                startActivity(intent);
                finish();

            }
        });
    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Reading_unit16.this, Unit16.class);
        startActivity(intent);
        finish();



    }

}

