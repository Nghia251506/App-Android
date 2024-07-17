package game.miqi.Unit11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import game.miqi.R;


public class ReadingUnit11 extends AppCompatActivity {
TextView textView,task;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_unit11);
        textView = (TextView)findViewById(R.id.dichnghia);
        button = (Button)findViewById(R.id.tieptuc_reading_11);
        textView.setText("Bàn về việc đọc sách, Francis Bacon, người sống cùng thời với nhà văn Shakespeare, đã viết như sau \"Một số sách cần đọc qua loa, một số khác cần đọc ngốn ngấu, một số ít cần phải nghiền ngẫm và suy ngẫm\". Lời khuyên hay đó chỉ ra các cách khác nhau để đọc những loại sách khác nhau. Chẳng hạn, bạn có thể lấy một quyển sách về du lịch và đọc vài trang trước khi đi ngủ. Quyển đó chỉ để cho bạn ghé mắt vào và đọc chút ít chồ này chỗ nọ. Nói tóm lại, chỉ là đọc qua loa mà thôi.\n" +
                "\n" +
                "Vài quyển truyện thì để đọc ngốn ngấu. Cứ tưởng tượng bạn vừa tìm được quyển truyện hay, và quan trọng hơn nữa là bạn có thì giờ để thưởng thức nó. Có thể bạn đang đi nghỉ hay đang trên tàu hỏa cho một chuyến đi dài. Nếu đó là quyển sách hay, bạn có thể nói \"quyển này hay tới nỗi tôi không đặt nó xuống được\", nhưng không phải sách truyện nào cũng thuộc loại này. Các nhà phê bình văn học đôi khi mô tả sách là \"khó mà đặt xuống\" hay \"khó có thể cầm lên lại được\".\n" +
                "\n" +
                "Có những quyển sách phải đọc chậm rãi và cẩn thận. Nếu đó là quyển sách về chủ đề bạn ưa thích thì bạn sẽ muốn \"nghiền ngẫm và suy ngẫm\" nó. Điều đó không có nghĩa là bạn phải đọc thật chậm. Khi cầm một quyển sách lên lần đầu tiên, bạn phải kiểm tra để biết chắc là nó không quá khó đọc. Đừng bắt đầu đọc một quyển sách mà không xem qua vài trang đầu để biết bạn có thể đọc và hiểu nó dễ dàng không.\n" +
                "\n" +
                "Một số người nghĩ là khi càng nhiều người có tivi ở nhà thì số người mua sách sẽ càng ít đi. Tại sao phải đọc sách khi vô tuyến truyền hình có thể mang đến cho bạn tất cả thông tin và các câu truyện với màu sắc, hình ảnh sống động? Thế nhưng, thật ra, tivi không giết chết thú đọc sách. Ngày nay, sách các loại được bán nhiều hơn bao giờ hết. Sách vẫn là một cách ít tốn kém để có thông tin và giải trí, và bạn lại có thể cất giữ sách và đọc lại nhiều lần. Sách ở nhà chính là một nguồn kiến thức và vui thú tuyệt vời.");

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ReadingUnit11.this,TaskUn11.class);
        startActivity(intent);
        finish();

    }
});
    }

}
