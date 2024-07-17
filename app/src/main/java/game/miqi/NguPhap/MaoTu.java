package game.miqi.NguPhap;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Collections;

import es.dmoral.toasty.Toasty;
import game.miqi.HoanThanh;
import game.miqi.R;

public class MaoTu extends AppCompatActivity {
    ArrayList<Integer> list;
    TextView hienthi,textgoiy,textscore,cau;
    String current_answer ;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    MediaPlayer mediaPlayer;
    TextView goiyy;
    int score=0;
    int solansai=0;
    String [] question={"Jason's father bought him ............ bicycle that he had wanted for his birthday.","........ Statue of Liberty was a gift of friendship from France to ............ United States.",": Rita is studying........... English and ...........math this semester","Please give me ...........cup of coffee with........... cream and ........... sugar.\t","When you go to........... store, please buy........... bottle of ...........chocolate milk and........... dozen oranges.","John and Mary went to........... school yesterday and then studied in ........... library before returning home.","There are only ...........few seats left for …………… tonight's musical at ...........university.","...........Lake Erie is one of five Great Lakes in ........... North America","What did you eat for........... breakfast this morning","Louie played.......... basketball and.......... baseball at ..........Boy’s Club this year.","Rita plays .......... violin and her sister plays .......... guitar","David attended .......... Princeton University","Harry has been admitted to ..........School of Medicine at .......... Midwestern university.","Phil can't go to .......... movies tonight because he has to write .......... essay.","Last night there was .......... singing outside my house."
            ,".......... chair which you are sitting in is broken.","Every year, thousands of tourists visit ……... Nile River","Scientists sent ............ expedition to ............ Mars during .......... 1990s.",
            "Mel's grandmother is in........... hospital, so we went to visit her ............ last night.",
            "I'm on night duty. When you go to ..............bed, I go to ............ work.",
            "Sorry, I can't find the number. I remember writing it on ............. back of an envelop.",
            "..................gold is perhaps .............. most highly treasured metal.",
            ": .................. Mekong River is .............longest river in.................... Vietnam.",
            ".............. winter is usually cold, but .................. winter of this year is warm.",
            ".................. money you gave me is not enough to buy ..................bicycle.",
            "Look at.................. sun. It is rising.","We watch television after .................. dinner.",
            "Mr. Brown bought ..............new car ..................last week","He usually travels to..................Philadelphia by.................. train.","Miss Linda speaks.................. Chinese very well although she is from......... UK.","................. swimming is .................. good sport","Please open ..................door.","..................United States is ...................world's biggest consumer of energy.","Peter likes to play ...................volleyball, but he is not.................. good player.","My daughter is learning to play..................violin at .................. school.","I told Mom we would be ...................home in ...................hour or so.","You can see .................. moon in .................. sky at .................. nigh.","...................her children play in .................. street all day.",": .................. blue is .................. color I like.","...............January is ...................first month of the year","You frequently see this kind of violence on .................. television"} ;
    String[] goiy_dapan={"Đáp án C\n" +
            "The dùng trước một danh từ được xác định bằng một mệnh đề: “that he had…”\n" +
            "Dịch nghĩa: Bố của jason mua cho anh ta chiếc xe đạp mà anh ta muốn vào dịp sinh nhật \n","Đáp án C " +
            "Dùng the Khi vật thể hay nhóm vật thể là duy nhất hoặc được xem là duy nhất(Statue of Liberty), Trước tên quốc gia United States, tên châu lục, tên núi, tên hồ…\n" +
            "Dịch nghĩa: Tượng nữ thần tự do là một món quà tượng trưng cho tình bằng hữu của đất nước Pháp dành cho nước Mỹ \n","Đáp án D\n" +
            "Không dùng mạo từ trước tên các môn học \n" +
            "Dịch nghĩa: Rita học tiếng anh và toán trong kì học này \n","Đáp án A\n" +
            "A dùng với danh từ đếm được số ít cup of coffee ,không dùng mạo từ Khi danh từ không đếm được hoặc danh từ số nhiều dùng theo nghĩa chung nhất, chứ không chỉ riêng trường hợp nào\n" +
            "Dịch nghĩa: Làm ơn cho tôi 1 cốc cà phê có kem và đường \n","Đáp án D\n" +
            "Dùng The Trước một danh từ được xác định store, A dùng với danh từ đếm được số ít bottle. Không dùng the Khi danh từ không đếm được hoặc danh từ số nhiều dùng theo nghĩa chung nhất chocolate milk ,A dùng trong thành ngữ chỉ số lượng nhất định : a dozen of ( một tá)\n" +
            "Dịch nghĩa: Khi bạn đến cửa hàng, hãy mua 1 chai sữa sô cô la và một tá cam \n","Đáp án B\n" +
            "Không dùng the trước một từ chỉ nơi chốn khi người ta đến đó theo đúng mục đích phục vụ của nơi đó. Dùng the trước danh từ xác định library \n" +
            "Dịch nghĩa: John và mary đến trường hôm qua và đã học trong thư viện trước khi về nhà \n","Đáp án A\n" +
            "A dùng trong cụm từ chỉ số lượng nhất định: a little, a lot, a few.,,,Không dùng the trước danh từ không đếm được tonight's musical.The dùng với danh từ xác định đối với các đối tượng giao tiếp : university\n" +
            "Dịch nghĩa: Chỉ có vài chỗ ngồi còn lại trong buổi hòa nhạc tối nay ở trường đại học ","Đáp án B\n" +
            "Tên của lục địa, quốc gia, tiểu bang, tỉnh , thành phố, đường phố, mũi đất, hòn đảo, bán đảo , quần đảo , vịnh , hồ, ngọn núi không dùng mạo từ \"the\"\n" +
            "The dùng Trước những danh từ riêng chỉ biển, sông, quần đảo, dãy núi, tên gọi số nhiều của các nước, sa mạc, miền\n" +
            "North America \n" +
            "Dịch nghĩa: Hồ Erie là 1 trong 5 hồ lớn ở Bắc Mĩ \n","Đáp án D\n" +
            "The không dùng trước tên các bữa ăn\n" +
            "Dịch nghĩa: Bạn ăn gì vào bữa sáng nay? \n","Đáp án C\n" +
            "The không dùng trước danh từ không đếm được hay mang nghĩa chung chung vì thế khôngđiền mạo từ ở 2 vị trí đầu, đáp án A,B sai. Dùng the trước danh từ xác định Boy’s Club . Chọn C\n" +
            "Dịch nghĩa: năm nay Louie đã chơi bóng rổ và bóng chày tại Boy’s Club \n","Đáp án C\n" +
            "The dùng trước tên các nhạc cụ\n" +
            "Dịch nghĩa: Rita chơi đàn vi ô lông và chị của cô ấy chơi ghi ta \n","Đáp án D\n" +
            "The không dùng trước tên trường được đặt theo tên riêng của người/nơi chốn\n" +
            "Dịch nghĩa: David từng hoc ở đại học Princeton \n","Đáp án A\n" +
            "Dùng the trước danh từ xác định School of Medicine . The không dùng trước tên trường được đặt theo tên riêng của người/nơi chốn\n" +
            "Dịch nghĩa: Harry đã đươc nhận vào trường Y ở đại học Midwestern \n","Đáp án C" +
            "Luôn Dùng the kèm với một số danh từ: the office,the cinema,the theater,the movies…Dùng an trước danh từ đếm được số ít bắt đầu bằng nguyên âm essay \n" +
            "Dịch nghĩa: Phil không thể đi xem phim tối nay vì anh ta phải viết 1 bài luận \n","Đáp án D\n" +
            "Không dùng mạo từ a,an vì singing là danh từ không đếm được.Không dùng the Trước danh từ trừu tượng\n" +
            "Dịch nghĩa: Có tiếng hát ở phía bên ngoài nhà tôi vào đêm qua \n"
            ,"Đáp án C\n" +
            "The dùng trước một danh từ được xác định bằng một mệnh đề: “which you are sitting …”\n" +
            "Dịch nghĩa: Cái ghế mà cậu đang ngồi đã gãy rồi \n","Đáp án C\n" +
            "The dùng trước Tên của con sông, đại dương và biển\n" +
            "Dịch nghĩa: hằng năm, hàng nghìn du khách đến sông Nin \n","Đáp án A\n" +
            "An dùng trước danh từ đếm được số ít bắt đầu bằng nguyên âm. Không dùng the Khi danh từ không đếm được, danh từ trừu tượng Mars. The được dùng trước tên thập niên 1990s.\n" +
            "Dịch nghĩa: Các nhà khoa học đã thám hiểm sao hỏa trong suốt thập niên 90 \n","Đáp án D\n" +
            "Không dùng the Khi danh từ dùng theo nghĩa chung, không dùng the trước các buổi ngày đêm (at noon / midnight /night)\n" +
            "Dịch nghĩa: Bà của Mel đang trong bệnh viện, vì vậy chúng tôi đã đến thăm bà tối qua \n","Đáp án D\n" +
            "The không được dùng trong các cụm nhất định go to bed, go to work, go to school,…\n" +
            "Dịch nghĩa: Tôi thường trực đêm.Khi bạn đi ngủ thì tôi đi làm \n","Đáp án C\n" +
            "Dùng the trước danh từ đã được xác định bằng một cụm từ .. The cũng đứng Trước những tên gọi gồm Danh từ + of + danh từ\n" +
            "Dịch nghĩa: Xin lỗi, tôi không thể tìm thấy số. Tôi nhớ đã viết nó vào mặt sau của một chiếc phong bì \n","Đáp án B\n" +
            "Không dùng the Trước danh từ chỉ vật liệu, chất liệu với nghĩa chung. The dùng trong cấp so sánh hơn nhât: the most\n" +
            "Dịch nghĩa: Vàng có lẽ là kim loại quý nhất \n","Đáp án D\n" +
            "The dùng Trước những danh từ riêng chỉ biển, sông, quần đảo, dãy núi, tên gọi số nhiều của các nước, sa mạc, miền\n" +
            "The dùng trong cấp so sánh hơn nhât. Không dùng the Trước tên quốc gia, tên châu lục, tên núi, tên hồ, tên đường.\n" +
            "Dịch nghĩa sông Mê kong là sông dài nhất Việt nam \n","Đáp án B\n" +
            "Không dùng the trước tên các mùa trong năm khi dùng với nghĩa chung, dùng the với tên mùa khi nó đã được xác định\n" +
            "Dịch nghĩa: Mùa đông thường lạnh, nhưng mùa đông của năm nay thì ấm \n","Đáp án D\n" +
            "Dùng the trước danh từ được xác đinh bằng một mệnh đề you gave me,a hoặc the đều được dùng trước danh từ đếm đc số ít \n" +
            "Dịch nghĩa: Số tiền mà cậu đưa tôi không đủ mua một chiếc xe đạp\n","Đáp án C\n" +
            "Dùng the trước danh từ chỉ vật thể được coi là duy nhất\n" +
            "Dịch nghĩa: Nhìn mặt trời kìa!Nó đang mọc lên đấy. \n","Đáp án D\n" +
            "Không dùng mạo từ trước tên các bữa ăn\n" +
            "Dịch nghĩa: Chúng tôi xem TV sau bữa tối ","Đáp án B\n" +
            "Dùng a trước danh từ đếm được số ít. Không dùng the trước một số danh từ chỉ thời điểm nhất định : last night, last week, last month…\n" +
            "Dịch nghĩa: Ông Brown đã mua một chiếc xe mới vào tuần trước \n","Đáp án D\n" +
            "Không dùng the Trước tên quốc gia, tên châu lục, tên núi, tên hồ, tên đường hay trước\"by\" +(phương tiện)\n" +
            "Dịch nghĩa: Anh ta thường đến Philadelphia bằng tàu hỏa \n","Đáp án B\n" +
            "Không dùng the Trước tên ngôn ngữ khi được dùng với nghĩa chung, The dùng Trước những danh từ riêng chỉ biển, sông, quần đảo, dãy núi, tên gọi số nhiều của các nước, sa mạc, miền: the US, The UK,…\n" +
            "Dịch nghĩa: Cô Linda nói tiếng Trung Quốc rất tốt dù cô ấy đến từ vương quốc Anh \n","Đáp án B\n" +
            "Không dùng the Trước tên môn học, môn thể thao. Dùng a trước danh từ đếm được số ít\n" +
            "Dịch nghĩa: Bơi lội là một môn thể thao tốt \n","Đáp án C\n" +
            "Dùng the trước danh từ xác định\n" +
            "Làm ơn mở cửa ra \n","Đáp án C\n" +
            "The dùng Trước những danh từ riêng chỉ biển, sông, quần đảo, dãy núi, tên gọi số nhiều của các nước, sa mạc, miền: the US, The UK,…The dùng trong cấp so sánh hơn nhất\n" +
            "Dịch nghĩa: Nước Mỹ là một trong những nước tiêu thụ năng lượng nhiều nhất \n","Không dùng the trước tên gọi các môn thể thao, a dùng trước danh từ đếm được số ít\n" +
            "Dịch nghĩa: Peter thích chơi bóng chuyền nhưng anh ấy không phải là một cầu thủ giỏi \n","Đáp án A\n" +
            "Dùng the trước danh từ chỉ nhạc cụ, không dùng the trước danh từ được dùng với nghĩa chung của nó\n" +
            "Dịch nghĩa: Con gái tôi đang học chơi vi ô lông ở trường \n","Đáp án B\n" +
            "Không dùng the trong các cụm từ nhất định: (be home: ở nhà).Dùng an trước danh từ đếm được số ít bắt đầu bằng nguyên âm trong cách phát âm\n" +
            "Dịch nghĩa: Tôi đã bảo mẹ là chúng tôi sẽ về đến nhà trong vòng khoảng một giờ \n","Đáp án B\n" +
            "Dùng The Khi vật thể hay nhóm vật thể là duy nhất hoặc được xem là duy nhất moon ,sky .Không dùng the trước các buổi (Vd: at noon/at night/at midnight/at sunset,…)\n" +
            "Dịch nghĩa: bạn có thể nhìn thấy măt trăng trên bầu trời vào buổi đêm \n","Đáp án D\n" +
            "Không dùng the khi đi kèm với tính từ sở hữu. Dùng the với danh từ xác định: street \n" +
            "Dịch nghĩa: Con cô ấy chơi ngoài đường suốt cả ngày \n","Đáp án D\n" +
            "Không dùng the trước tên các danh từ chỉ màu sắc được dùng với nghĩa chung, dùng the trước danh từ được xác định bới 1 mệnh đề\n" +
            "Dịch nghĩa: Màu xanh là màu tôi thích \n","Đáp án D\n" +
            "Không dùng the trước tên các tháng trong năm theo nghĩa chung, dùng the trước từ chỉ thứ tự: first,second,last,..\n" +
            "Dịch nghĩa: Tháng một là tháng đầu tiên trong năm ","Đáp án D\n" +
            "Không dùng mạo từ với các cụm từ nhất đinh như on television \n" +
            "Dịch nghĩa: Bạn thường xuyên thấy loại bạo lực này trên TV \n"};
    String [][] traloi={{"a","an","the","X"},{"the / X","X / the","the / the","X / X"},
            {"the / X","X / the","the / the","X / X"},{"a / X/ X","a / the / the","X/X/X","X / X/ a"},{"a / X/ X/a","a / the / the/ a","the / the / X / a","the / a / X / a"}
,{"the / X","X / the","the / the","X / X"},{"a / X/ the","a / the / the","X/X/X","X / X/ a"},{"a / X/ the","a / the / the","X/X/X","X / X/ a"},{"a","an","the","X"},{"a / X/ the","a / the / the","a / the / the","X / X/ a"},{"the / X","the / X","the / the","X / X"},{"a","an","the","X"}
,{"the / X","a / X","the / the","X / X"},{"the / X","the / X","the / the","X / X"},{"a","an","the","X"},{"a","an","the","X"},{"a","an","the","X"},{"an / X/ the","an / the / the","X / X/ the","X / X/ X"},{"the / X","X / the","the / the","X / X"},{"the / X","X / the","the / the","X / X"}
,{"a","an","the","X"},{"the / X","X / the","the / the","X / X"},{"the / X/ the","the / the / the","X / X/ the","the/ the/ X"},{"the / X","X / the","the / the","X / X"},{"the / X","X / the","the / the","X / X"},{"a","an","the","X"},{"a","an","the","X"},{"an / X","a / X","the / the","X / X"},{"the / X","X / the","the / the","X / X"}
,{"the / X","X / the","the / the","X / X"},{"the / X","X / a","the / the","X / the"},{"a","an","the","X"},{"the / X","X / a","the / the","X / the"},{"the / X","X / a","the / the","X / the"},{"the / X","X / a","the / the","X / the"},{"the / X","X / an","the / the","X / a"},{"a / X/ the","the / the / X","X/X/X","X / X/ the"},{"the / X","X / a","the / the","X / the"}
,{"the / X","X / a","the / the","X / the"},{"the / X","X / a","the / the","X / the"},{"a","an","the","X"}};
    String[] Correct={"the","the / the","X / X","a / X/ X","the / a / X / a","X / the","a / X/ the","a / the / the","X","a / the / the","the / the","X","the / X","the / the","X"
            ,"the","the","an / X/ the","X / X","X / X","the","X / the","the/ the/ X","X / the","X / X","the","X","a / X","X / X","X / the","X / a","the","the / the","X / a","the / X","X / an","the / the / X","X / the","X / the","X / the","X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mao_tu);
        hienthi=(TextView)findViewById(R.id.text_show_maotu);
        textgoiy=(TextView)findViewById(R.id.text_goiy_maotu);
        textscore=(TextView)findViewById(R.id.score_maotu);
        cau=(TextView)findViewById(R.id.cau_maotu);
        init();
        mediaPlayer = new MediaPlayer();
        list = new ArrayList<>();
      for(int i=0;i<Correct.length;i++)
      {
          list.add(i);
          Collections.shuffle(list);
      }

        goiyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textgoiy.setText(goiy_dapan[list.get(stt)]);
            }
        });
        updatequestion();
        sukienbutton();
    }

    private void sukienbutton() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==39)
                {
                    Intent intent = new Intent(MaoTu.this, HoanThanh.class);
                    startActivity(intent);
                    finish();
                }
                if(button1.getText().equals(current_answer))
                {

                    mediaPlayer.start();
                    Toasty.success(getApplicationContext(),"Very Good ", Toast.LENGTH_SHORT).show();

                    stt+=1;
                    socau+=1;
                    score+=1;
                    textscore.setText(score+"/40");
                    updatequestion();
                    textgoiy.setText("");


                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    textgoiy.setText("");
                    solansai+=1 ;
                    updatequestion();




                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==39)
                {

                    Intent intent = new Intent(MaoTu.this, HoanThanh.class);
                    startActivity(intent);
                    finish();
                }
                if(button2.getText().equals(current_answer))
                {
                    mediaPlayer.start();
                    Toasty.success(getApplicationContext(),"Very Good ",Toast.LENGTH_SHORT).show();
                    stt+=1;
                    socau+=1;
                    updatequestion();
                    score+=1;
                    textgoiy.setText("");
                    textscore.setText(score+"/40");

                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    solansai+=1 ;

                    textgoiy.setText("");

                    updatequestion();



                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==39)
                {
                    Intent intent = new Intent(MaoTu.this, HoanThanh.class);
                    startActivity(intent);
                    finish();
                }
                if(button3.getText().equals(current_answer))
                {
                    mediaPlayer.start();
                    Toasty.success(getApplicationContext(),"Very Good ",Toast.LENGTH_SHORT).show();
                    stt+=1;
                    socau+=1;
                    updatequestion();
                    score+=1;
                   textgoiy.setText("");
                    textscore.setText(score+"/40");

                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    solansai+=1 ;
                    textgoiy.setText("");
                    updatequestion();



                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==39)
                {
                    Intent intent = new Intent(MaoTu.this, HoanThanh.class);
                    startActivity(intent);
                    finish();
                }
                if(button4.getText().equals(current_answer))
                {
                    mediaPlayer.start();
                    Toasty.success(getApplicationContext(),"Very Good ",Toast.LENGTH_SHORT).show();
                    stt+=1;
                    socau+=1;
                    updatequestion();
                    textgoiy.setText("");
                    textscore.setText(score+"/40");
                    score+=1;


                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    solansai+=1 ;
                    textgoiy.setText("");
                    updatequestion();


                }

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MaoTu.this,Onthi.class);
        startActivity(intent);
        finish();

    }
    private void chienthang(){
        Toast.makeText(this,"You Win",Toast.LENGTH_SHORT);
    }
    private void updatequestion() {
        cau.setText("Câu: "+socau);
        hienthi.setText(question[list.get(stt)]);
        button1.setText(traloi[list.get(stt)][0]);
        button2.setText(traloi[list.get(stt)][1]);
        button3.setText(traloi[list.get(stt)][2]);
        button4.setText(traloi[list.get(stt)][3]);
        current_answer = Correct[list.get(stt)];


    }
    private void init() {
        goiyy=(TextView)findViewById(R.id.goiy_maotu);
        hienthi=(TextView)findViewById(R.id.text_show_maotu);
        button1=(Button)findViewById(R.id.button1_maotu);
        button2=(Button)findViewById(R.id.button2_maotu);
        button3=(Button)findViewById(R.id.button3_maotu);
        button4=(Button)findViewById(R.id.button4_maotu);

    }
}
