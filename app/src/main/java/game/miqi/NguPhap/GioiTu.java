package game.miqi.NguPhap;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.Collections;

import es.dmoral.toasty.Toasty;
import game.miqi.HoanThanh;
import game.miqi.R;

public class GioiTu extends AppCompatActivity {
    TextView hienthi,goiy,textscore,cau;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    ImageView back;
    MediaPlayer mediaPlayer;
    TextView textgoiy;
    int score=0;
    int solansai=0;
    String [] Correct={"at","at","on","in","at","for","at","at","during",
            "for","on","on/in","at","between","in","in","in","at","for","since",
    "A&B","during","for","at","on/in","on","in","in","during","for"};
    String [][]traloi={{"at","in","to","from"},
            {"in","on","into","at"},
            {"at","on","in","since"},
            {"at","in","on","from"},
            {"at","on","in","since"},
            {"at","in","on","for"},
            {"in","on","into","at"},
            {"in","at","into","on"},
            {"since","for","during","on"},
            {"since","for","during","on"},
            {"at","in","on","for"},
            {"in/at","on/at","in/on","on/in"},
            {"at","in","on","for"},
            {"among","between","on","in"}
            ,{"at","in","on","from"},
            {"at","in","on","during"},
            {"at","in","on","into"},
            {"at","in","on","into"},
            {"since","for","during","in"},
            {"since","for","during","on"},
            {"until","till","to","A&B"}
            ,{"since","for","during","on"},
            {"since","for","during","on"}
    ,{"at","in","on","for"},{"at/on","in/on","at/in","on/in"},{"at","in","on","since"},{"at","in","on","into"},
            {"at","in","on","from"}
    ,{"since","for","during","on"}
    ,{"since","for","during","of"},
            {"at","in","on","into"},
            {"at","in","on","for"},
            {"at/on","at/in","in/on","in/at"},
            {"at","in","on","for"},
            {"at","in","on","since"},
            {"at","in","on","into"},
            {"at","in","on","since"},
            {"at","in","on","for"},
            {"at","in","on","for"},
            {"at","in","on","into"},
            {"at","on","in","from"}};
    String[]question={"I shall meet you _____ the corner of the street",
            "It never snows here _____ Christmas",
            "He never comes _____ time for the class",
    "We had a few problems at first, but _____ the end everything was OK",
            "I'm going away _____ the end of this week."
    ,"I waited for you_____half an hour and then decided that you weren't coming"
            ,"I have no time _____ the moment",
            "There is vocabulary _____ the end of the book",
    "I had been away for many years. _____ that time, many things had changed","Jack started a new job a few weeks ago. Before that he was out of work _____ six months.",
    "I wasn't sure whether I had come to the right office. There was no name _____ the door.","I like that picture hanging_____the wall_____the kitchen.",
    "The telephone and the doorbell rang _____ the same time","My pencil is _____the book and the notebook","We had a lot of problems with our car. _____ the end we sold it.",
            "We got to the bus-stop just _____ time to catch the last bus to Hanoi.","A delegation of senior French ministers will arrive_____ London today.","When I finally arrive _____ my house, all I want to do is to sleep.",
            "How long have you lived in the United States?\n"+"- I have lived in the United States _____ one year ","How long has Mary been a nurse?\n"+"- She has been a nurse _____ April.","He usually pays me on Friday but last week he didn't pay me _____ the following Monday.",
            "_____ our stay in Paris, we visited a lot of museums and galleries.","I felt really ill last week. I could hardly eat anything _____ three days.","I'll be moving to a new address _____ the end of September","The course begins _____ 7 January and ends sometimes_____April.","There are usually a lot of parties _____ New Year's Eve.",
            "It was a lovely day. There wasn't a cloud _____the sky.",
            "There are some beautiful trees _____the park.","There were many interruptions _____ the president's speech","The president gave a long speech. She spoke _____ two hours",
            "There are forty students _____ the class.",
            "The oranges are _____the table.",
            "We will leave _____ 10:30 _____ Monday.",
            "Valentine is _____ 14th February.",
            "We are going to have a party _____ Christmas.",
            "There are some food _____ the fridge",
            "The country looks beautiful _____springs.",
            "I don’t like getting up early _____ Sunday morning.",
            "I have breakfast _____ 7:00 every morning.",
            "I like swimming _____ the summer.",
            "He was born _____ 1995."
    };
    String[] goiy_dapan={"Đáp án A\n" +
            "- “in the corner of” dùng để ám chỉ một không gian chật hẹp ở trong góc ... \n" +
            "- \"at the corner of\" chỉ một không gian mở, quanh góc …. \n" +
            "Dịch: Tôi sẽ gặp bạn gần góc phố\n","Đáp án D\n" +
            "Giải thích: at Christmas: vào lễ Giáng sinh \n" +
            "Dịch: Tuyết không bao giờ rơi vào lễ Giáng sinh ở đây\n","Đáp án B\n" +
            "Giải thích: on time: đúng giờ; in time: kịp lúc \n" +
            "Dịch: Anh ta chẳng bao giờ vào lớp đúng giờ\n","Đáp án B\n" +
            "Giải thích: in the end= Finally: cuối cùng \n" +
            "Dịch: Ban đầu chúng tôi gặp một vài vấn đề, nhưng cuối cùng mọi thứ đã OK\n","Đáp án A\n" +
            "Giải thích: at the end of st: vào cuối của…. \n" +
            "Dịch: Tôi sẽ đi xa vào cuối tuần này.\n","Đáp án D\n" +
            "Giải thích: for + khoảng thời gian: trong bao lâu \n" +
            "Dịch: Tôi đã đợi bạn trong nửa tiếng đồng hồ và sau đó quyết định rằng bạn không đến.\n","Đáp án D\n" +
            "Giải thích: at the moment: vào lúc này, bây giờ \n" +
            "Dịch: Bây giờ tôi không có thời gian.\n","Đáp án D\n" +
            "Giải thích: at the end of st: vào cuối của…. \n" +
            "Dịch: Có phần từ vựng ở cuối cuốn sách\n","Đáp án C\n" +
            "Giải thích: Since + mốc thời gian: kể từ khi \n" +
            "For + khoảng thời gian: dùng để đo thời gian\n" +
            "During + N: trong suốt…\n" +
            "Dịch: Tôi đã ở xa trong nhiều năm. Trong suốt khoảng thời gian đó, nhiều thứ đã thay đổi.\n","Đáp án B\n" +
            "Dịch: Jack bắt đầu một công việc mới vài tuần trước. Trước đó, anh ta đã thất nghiệp trong vòng 6 tháng.\n" +
            "Giải thích: Since + mốc thời gian: kể từ khi For+ khoảng thời gian: dùng để đo thời gian During + N: trong suốt… Dịch: Jack bắt đầu một công việc mới vài tuần trước. Trước đó, anh ta đã thất nghiệp trong vòng 6 tháng. \n","Đáp án C\n" +
            "Giải thích: at the door: ở ngoài cửa \n" +
            "Ex: Someone is knocking at the door:Ai đó đang gõ cửa \n" +
            "on the door: trên bề mặt cửa\n" +
            "Dịch: Tôi không chắc liệu tôi đã tới đúng văn phòng chưa. Chẳng có cái tên nào trên cánh cửa cả.\n","Đáp án D\n" +
            "Dịch: Tôi thích bức tranh đang treo trên tường ở phòng bếp\n" +
            "On the wall: ở trên tường In the kitchen: trong phòng bếp \n","Đáp án A\n" +
            "Giải thích: at the same time: cùng lúc\n" +
            "Dịch: Điện thoại và chuông cửa reo cùng lúc\n","Đáp án B\n" +
            "Giải thích: between A and B: ở giữa A và B \n" +
            "Dịch: Cái bút chì của tôi ở giữa quyển sách và quyển vở\n","Đáp án B \n"+"Giải thích: in the end= Finally: cuối cùng \n" +
            "Dịch: Chúng tôi có một số vấn đề với chiếc ô tô của mình. Cuối cùng chúng tôi đã bán nó.\n","Đáp án B\n" +
            "Giải thích: on time: đúng giờ; in time: kịp lúc \n" +
            "Dịch: Chúng tôi đến trạm dừng xe buýt vừa kịp lúc để bắt chuyến xe cuối cùng đến Hà Nội\n","Đáp án B\n" +
            "Giải thích: Arrive at: khi nơi chốn nhỏ như sân bay, nhà ga.. \n" +
            "Arrive in: khi nơi chốn lớn như quận , tỉnh, thành phố, nước.\n" +
            "Dịch: Đoàn đại biểu các Bộ trưởng cấp cao ở Pháp sẽ đến London hôm nay\n","Đáp án A\n" +
            "Giải thích: arrive at: khi nơi chốn nhỏ \n" +
            "arrive in: khi nơi chốn lớn như quận , tỉnh... \n" +
            "arrive at my house = arrive home: về nhà \n" +
            "Dịch: Khi tôi về đến nhà, tất cả mọi thứ tôi muốn làm là đi ngủ\n","Đáp án B\n" +
            "Giải thích: Since + mốc thời gian: kể từ khi\n" +
            "For + khoảng thời gian: dùng để đo thời gian\n" +
            "During + N: trong suốt…\n" +
            "Dịch: - Bạn đã sống ở Mỹ được bao lâu rồi?\n" +
            "- Tôi đã sống ở Mỹ 1 năm\n","Đáp án A\n" +
            "Giải thích: Since + mốc thời gian: kể từ khi \n" +
            "For + khoảng thời gian: dùng để đo thời gian \n" +
            "During + N: trong suốt…\n" +
            "Dịch: Mary làm y tá được bao lâu rồi?- Cô ấy làm y tá từ tháng 4\n","Đáp án D\n"+ "Giải thích: until/till: cho tới khi \n" +
            "Dịch: Anh ta thường trả tôi vào thứ Sáu nhưng tuần trước anh ta không trả tôi cho tới thứ hai tuần sau\n","Đáp án C\n" +
            "Giải thích: Since + mốc thời gian: kể từ khi \n" +
            "For + khoảng thời gian: dùng để đo thời gian\n" +
            "During + N: trong suốt…\n" +
            "On + ngày\n" +
            "Dịch: Trong suốt kỳ nghỉ của chúng tôi ở Paris, chúng tôi đã đến thăm rất nhiều bảo tàng và phòng trưng bày nghệ thuật\n","Đáp án B\n" +
            "Giải thích: Since + mốc thời gian: kể từ khi \n" +
            "For + khoảng thời gian: dùng để đo thời gian \n" +
            "During + N: trong suốt… \n" +
            "On + ngày\n" +
            "Dịch: Tuần trước tôi cảm thấy rất mệt. Tôi không thể ăn bất cứ cái gì trong 3 ngày\n","Đáp án A\n" +
            "Giải thích: in the end= Finally: cuối cùng \n" +
            "at the end of st: vào cuối của….\n" +
            "Dịch: Tôi sẽ chuyển tới địa chỉ mới vào cuối tháng 9.\n","Đáp án D\n" +
            "Giải thích: at+giờ, phút, giây \n" +
            "On + ngày \n" +
            "In + tháng, mùa, năm….\n" +
            "Dịch: Khóa học bắt đầu vào ngày 7 tháng 1 và thường kết thúc vào tháng 4\n","Đáp án C\n" +
            "Giải thích: on New Year’s Eva: vào đêm giao thừa \n" +
            "Dịch: Có rất nhiều bữa tiệc vào đêm giao thừa.\n","Đáp án B\n" +
            "Giải thích: in the sky: trên bầu trời \n" +
            "Dịch: Đó là một ngày đẹp trời. Không có một bóng mây nào trên bầu trời.\n","Đáp án B\n" +
            "Giải thích: in the park: trong công viên \n" +
            "Dịch: Có rất nhiều cây đẹp trong công viên\n","Đáp án C\n" +
            "Giải thích: Since + mốc thời gian: kể từ khi \n" +
            "For + khoảng thời gian: dùng để đo thời gian \n" +
            "During + N: trong suốt… \n" +
            "On + ngày \n" +
            "Dịch: Có rất nhiều sự ngắt quãng trong suốt bài phát biểu của tổng thống\n","Đáp án B\n" +
            "Dịch: Tống thống đã đưa ra một bài phát biểu dài. Ông ấy đọc trong 2 giờ\n",
    "Đáp án B\n" +
            "Dịch: Có 40 học sinh trong lớp\n",
    "Đáp án C\n" +
            "Dịch: Những quả cam ở trên bàn\n",
    "Đáp án A\n" +
            "Giải thích: at + giờ, phút, giây \n" +
            "On + ngày \n" +
            "Dịch: Chúng tôi sẽ rời đi vào lúc 10:30 thứ 2\n",
    "Đáp án C\n" +
            "Dịch: Valentine vào ngày 14/2\n",
    "Đáp án A\n" +
            "Giải thích: at Christmas: vào lễ Giáng sinh \n" +
            "Dịch: Chúng tôi sẽ mở tiệc vào lễ Giáng sinh\n",
    "Đáp án B\n"+
    "Dịch: Có một số thức ăn trong tủ lạnh",
    "Đáp án B\n" +
            "Giải thích: in spring/ summer/ autumn/ winter: vào mùa xuân/hạ/ thu/ đông \n" +
            "Dịch: Nông thôn nhìn rất đẹp vào mùa xuân\n",
    "Đáp án C\n" +
            "Dịch: Tôi không thích dậy sớm vào sáng chủ nhật Dịch: Tôi không thích dậy sớm vào sáng chủ nhật \n",
    "Đáp án A\n" +
            "Dịch: Tôi ăn sáng vào lúc 7h sDịch: Tôi ăn sáng vào lúc 7h sáng • At: dùng trước thời gian ngắn: giờ, phút,giây...\n",
    "Đáp án B\n" +
            "Dịch: Tôi thích đi bơi vào mùa hè\n" +
            "• At: dùng trước thời gian ngắn: giờ, phút,giây...\n",
    "Đáp án C\n" +
            "Dịch: Anh ta được sinh ra vào năm 1995\n"};
    ArrayList<Integer> list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gioi_tu);
        hienthi=(TextView)findViewById(R.id.text_show_gioitu);
        goiy=(TextView)findViewById(R.id.goiy_gioitu);
        textgoiy=(TextView)findViewById(R.id.textgoiy_gioitu);
        textscore=(TextView)findViewById(R.id.score_gioitu);
        cau=(TextView)findViewById(R.id.cau_gioitu);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(GioiTu.this,R.raw.correct);
        list = new ArrayList<>();
        for (int i =0;i<Correct.length;i++)
        {
            list.add(i);
            Collections.shuffle(list);
        }
        init();
        cau.setText("Câu: "+socau);

        goiy.setOnClickListener(new View.OnClickListener() {
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

                    Intent intent = new Intent(GioiTu.this, HoanThanh.class);
                    startActivity(intent);
                    finish();
                }
                if(button1.getText().equals(Correct[list.get(stt)]))
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
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +Correct[list.get(stt)] +" là đáp án đúng",
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

                    Intent intent = new Intent(GioiTu.this, HoanThanh.class);
                    startActivity(intent);
                    finish();
                }
                if(button2.getText().equals(Correct[list.get(stt)]))
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
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +Correct[list.get(stt)] +" là đáp án đúng",
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
                    Intent intent = new Intent(GioiTu.this, HoanThanh.class);
                    startActivity(intent);
                    finish();
                }
                if(button3.getText().equals(Correct[list.get(stt)]))
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
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +Correct[list.get(stt)]+" là đáp án đúng",
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
                    Intent intent = new Intent(GioiTu.this, HoanThanh.class);
                    startActivity(intent);
                    finish();
                }
                if(button4.getText().equals(Correct[list.get(stt)]))
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
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +Correct[list.get(stt)]+" là đáp án đúng",
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


        Intent intent = new Intent(GioiTu.this, Onthi.class);
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


    }
    private void init() {
        hienthi=(TextView)findViewById(R.id.text_show_gioitu);
        button1=(Button)findViewById(R.id.button1_gioitu);
        button2=(Button)findViewById(R.id.button2_gioitu);
        button3=(Button)findViewById(R.id.button3_gioitu);
        button4=(Button)findViewById(R.id.button4_gioitu);

    }
}
