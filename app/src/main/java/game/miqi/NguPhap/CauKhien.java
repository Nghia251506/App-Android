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

public class CauKhien extends AppCompatActivity {
    TextView hienthi,goiy,textscore,cau;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    ImageView back;
    MediaPlayer mediaPlayer;
    TextView textgoiy;
    int score=0;
    int solansai=0;
    String [] Correct={"should she",
            "had listened","should","shines/will go","would have never been", //1 2 3 4 6
            "hadn’t left/would have","were/would know","had studied","unless/for","unless", // 7 8 9 10 11
            "melts","or","if they’re","have","unless","may", // 13 14 15 16 17 18
            "had checked/would not have got","unless","were/could enjoy","would have found","would have",//19 24 25 26 27
            "unless","if you are polite to them","will only make","will not speak","or", // 28 29 30 31 32
            "come","would have been","had seen","would happen/were" // 33 36 38 39
    };
    String [][]traloi={{"should she","If she","Will she","Unless she"}
    ,{"listened","would listen","had listened","would have listened"},
            {"must","will","should","ought"},
            {"shines/will go","shone/will go","shone/would go","had shone/would go"},
            {"will never be","would never be","wouldn’t have be","would have never been"},
            {"leave/will have","didn’t leave/would have","hadn’t left/would have","hadn’t left/would have had"},
            {"were/would know","is/will know","had been/would have known","was/would know"}
           ,{"study","had studied","studied","were studying"},
            {"if/for","unless/for","or/of","whether/or"},
            {"whether","if","however","unless"},
            {"vaporizes","melts","heats","disappears"},
            {"if","whether","or","unless"},
            {"if they’re","unless they’re","whether they were","if they were"},
            {"will have","have","have had","had"},
            {"if","until","when","unless"},
            {"would","could","have to","may"},
            {"checked/will not get","had checked/would not have got","checks/will not have got","would be checking/will not have got"},
            {"if","as if","unless","in case"},
            {"is/can enjoy","was/will enjoy","has been/would enjoy","were/could enjoy"},
            {"will find","would find","found","would have found"},
            {"have","i had","would have","would have had"}
            ,{"if","even if","unless","as if"},
            {"if you are polite to them","if you will be polite to them","unless you are polite to them","if you were polite to them"},
            {"makes only","would only make","will only make","had only made"},
            {"will speak","will not speak","can speak","did not speak"},
            {"if","and","or","as"},
            {"come","came","have come","will come"},
            {"has been","would has been","would be","would have been"},
            {"sees","is seeing","has seen","had seen"},
            {"will happen/was","happens/were","would happen/were","would happen/had been"}};
    String[]question={"_____ have enough apples, she’ll make an apple pie this afternoon", //1
            "If you_____to me, you wouldn’t have got so much trouble.", //2
            "If you don’t know how to spell a word, you_____ look it up in the dictionary." //3
            ,"If the sun _____, we _____for a walk", //4
            "But for our parents, we _____ successful in life.",//6
            "If I _____ my wallet at home this morning, I _____ money for lunch now."//7
            ,"It is too bad, Lam isn’t here. If he _____ here, he _____ what to do.",//8
            "If we _____ the plans carefully, we would not have had so many serious mistakes."//9
            ,"I will never talk to you again _____ you apologize me _____ your being rude.",//10
            "_____ you work harder, you will be sacked.",//11
            "If you take the ice out of the fridge, it _____.",//13
            "We should do something to protect water from being polluted _____ we will have nothing to drink in the future.",//14
            "Let’s knock on their door to see _____ home",//15
            "Unless we _____ more snow, we can’t go skiing",//16
            "You’ll fail the exam _____ you start revising",//17
            "Unless you wash the car, you _____ not drive it at the weekend"//18
            ,"If Peter _____ his car before the drive, he _____ the problem of out of petrol."//19
            ,"_____ there are some more ideas, we can end the meeting now."//24
            ,"If he _____ with us now, he _____ the beauty of nature of the National Park.",//25
            "If they had searched more carefully, they ________ the watch sooner.",//26
            "If I had got up early, I _____ to have breakfast now."//27
            ,"I cannot buy a new computer _____ I save enough money.",//28
            "Most people you meet will be polite to you _____.",//29
            "If you do so, it _____ the matter worse"//30
            ,"You _____ English fluently unless you practice it every day."//31
            ,"Hurry up _____ you will miss the bus and be late for school",//32
            "You will get a good seat if you _____ first."//33
          ,"If Margaret hadn’t been wearing a seat belt, she ________ injured."//36
           ,"He looked frightened as if he _____ a ghost."//38
            ,"What _____ if there _____ a serious nuclear accident?",//39
    };
    String[] goiy_dapan={"Đáp án A\n" +
            "Ngoại lệ CĐK loại 1,đảo should lên đầu câu\n" +
            "If sb should do st = Should sb do st. Ta chọn A\n" +
            "Đáp án B,D sai vì she danh từ số ít động từ phải là has\n" +
            "Đáp án C không thể hoàn thành câu đúng cấu trúc ngữ pháp\n"+
            "Dịch nghĩa: Nếu cô ấy có đủ táo, chiều nay cô ấy sẽ làm bánh táo",

            "Đáp án C\n" +
            "CĐK loại 3, vì mệnh đề chính có cấu trúc would have done st nên mệnh đề ĐK chia ở thì QKHT. Chọn C\n" +
            "Đáp án A,B,D không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Nếu bạn mà đã nghe lời tôi, bạn đã chẳng gặp nhiều rắc rối như vậy\n"

            ,"Đáp án C\n" +
            "Ngoại lệ cậu ĐK loại 1, mệnh đề cấu tạo đằng sau có thể dùng should để đưa ra lời khuyên, hoặc can để nói lên khả năng.Ta chọn C\n" +
            "Đáp án D sai vì phải là ought to\n" +
            "Đáp án A không phù hợp với ngữ nghĩa của câu\n" +
            "Đáp án B không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Nếu bạn không biết cách đánh vần 1 từ, bạn nên tra nó trong từ điển\n",

            "Đáp án A\n" +
            "Câu ĐK loại 1, mệnh đề ĐK chia ở HTĐ, MĐ chính chia ở TLĐ. \n" +
            "Đáp án B, Dkhông thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "VÌ không có dấu hiệu mệnh đề đưa ra trái với hiện tại, ta không dùng câu ĐK loại 2 ở ý C\n" +
            "Dịch nghĩa Nếu trời quang, chúng ta sẽ đi dạo\n",


            "Đáp án D\n" +
            "Ngoại lệ của câu ĐK loại 3, vì nói đến việc đã xảy ra\n" +
            "But for/ Without + N, Mệnh đề ĐK dạng would have done st. Đáp án B dùng câu ĐK loại 2 sai vì đây không đưa ra ĐK trái với hiện tại.\n"+"Đáp án A, C không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Nếu không có bố mẹ, chúng tôi đã chẳng thể thành công trong cuộc sống.\n","Đáp án C\n" +
            "Câu ĐK hỗn hợp MĐ đầu chia theo ngữ pháp câu ĐK loại 3, MĐ sau chia theo ngữ pháp câu ĐK loại 2 vì MĐ đầu có this morning đi kèm với sự việc đã xảy ra, mệnh đề sau có now. Dùng để nói đến một điều kiện xảy ra trong quá khứ dẫn đến kết quả ở hiện tại.Chọn C\n" +
            "Đáp án A, B, D lần lượt chia theo cấu trúc CĐK loại 1,2,3 không phù hợp với nghĩa của câu\n" +
            "Dịch nghĩa Nếu tôi đã không để quên ví ở nhà từ sáng nay thì giờ tôi sẽ có tiền trả cho bữa trưa\n","Đáp án A\n" +
            "CĐK loại 2, đưa ra điều kiện trái với hiện tại, vì câu trước động từ chia ở hiện tại đơn, không dùng CĐK loại 1, ý B sai. Ta chọn A\n" +
            "Mệnh đề ĐK trong CĐK loại 2 động từ to be chia ở quá khứ giả định, dùng were với mọi chủ ngữ, ý D sai\n" +
            "Đáp án C dùng câu ĐK loại 3 sai vì đây là giả thiết trái với hiện tại Dịch nghĩa Tồi tệ thật, Lam không ở đây. Nếu cô ấy mà ở đây, cô ây sẽ biết phải làm gì\n","Đáp án B\n" +
            "CĐK loại 3 đưa ra mệnh đề trái với quá khứ, vì sự việc trong câu đã xảy ra, mệnh đề sau có dạng would have done st.chọn B. \n" +
            "Đáp án A, D, C không thể hoàn thành câu đúng cấu trúc ngữ pháp của câu ĐK loại 3\n" +
            "Dịch nghĩa Nếu chúng ta đã chuẩn bị kể hoạch cẩn thận, chúng ta đã chẳng mắc phải nhiều sai lầm nghiêm trọng\n","Đáp án B\n" +
            "CĐK loại 1 vì có mệnh đề chia ở thì TLĐ. Ta chọn B\n"+"Apologize sb for (doing) st: xin lỗi vì đã làm gì, nên đáp án C,D sai. Đáp án A không phù hợp với nghĩa của câu\n" +
            "Dịch nghĩa Tôi sẽ không bao giờ nói chuyện với cậu nữa trừ khi cậu xin lỗi tôi vì đã thô lỗ\n","Đáp án D\n" +
            "Đáp án A, C không thể hoàn thành câu đúng cấu trúc ngữ pháp. Chọn D. Đáp án B ko phù hợp về nghĩa\n" +
            "Dịch nghĩa Trừ khi bạn làm việc chăm chỉ hơn, không thì bạn sẽ bị sa thải\n","Đáp án B\n" +
            "Câu ĐK loại 1 đưa ra một chân lý.\n" +
            "Vaporizes: bay hơi\n" +
            "Melts: tan chảy\n" +
            "Heats: làm nóng\n" +
            "Disappears: biến mất\n" +
            "Đáp án A, C, D không phù hợp về nghĩa. Ta chọn B\n" +
            "Dịch nghĩa Nếu bạn lấy viên đá ra khỏi tủ lạnh, nó sẽ tan chảy\n","Đáp án C\n" +
            "Ngoại lệ câu ĐK loại 1, dùng or để đưa ra hệ quả của mệnh đề điều kiện.\n" +
            "Không dùng if hay unless ở mệnh đề chính chia ở TLĐ, đáp án A, D sai.\n" +
            "Đáp án B không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Chúng ta nên làm gì đó để bảo vệ nước khỏi ô nhiễm, không thì chúng ta sẽ chẳng có gì đê uống trong tương lai\n","Đáp án A \n"+"Ngoại lệ câu ĐK loại 1 vì có Let’s: đưa ra đề nghị, gợi ý ở hiện tại.C,D sai ngữ pháp câu ĐK loại 1.Đáp án B không phù hợp về nghĩa\n" +
            "Dịch nghĩa Hãy gõ cử để xem họ có nhà không\n","Đáp án B\n" +
            "ĐK loại 1 vì có unless, đưa ra sự việc có thực ở hiện tại, MĐ Đk chia ở HTĐ.Chọn B cho chủ ngữ we\n" +
            "Đáp án A, C, D không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Trừ khi tuyết rơi nhiều hơn, chúng ta sẽ không thể đi trượt tuyết\n","Đáp án D\n" +
            "CĐK loại 1, đưa ra sự việc có thực ở hiện tại,MĐ chính chia ở thì TLĐ. Đáp án A không phù hợp về nghĩa, chọn D\n" +
            "Đáp án C, B không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Bạn sẽ trượt kì thi trừ khi bạn bắt đầu ôn tập\n","Đáp án D\n" +
            "CĐK loại 1 đưa ra sự việc có thật ở hiện tại, dùng may/might nhấn mạnh khả năng xảy ra của sự việc\n" +
            "Đáp án C không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Đáp án A, B không đúng cấu trúc câu ĐK loại 1\n" +
            "Dịch nghĩa Trừ khi bạn rửa xe, không thì bạn không thể lái nó vào cuối tuần\n","Đáp án B\n" +
            "Câu ĐK loại 3, sự việc không có thực trong quá khứ\n" +
            "Đáp án C, A, D không thể hoàn thành câu đúng cấu trúc ngữ pháp.Chọn B\n" +
            "Dịch nghĩa Nếu Peter đã kiểm tra chiếc ô tô của anh ấy trước khi lái, anh ấy đã chẳng gặp vấn đề với việc hết xăng\n","Đáp án C\n" +
            "MĐ chính chia ở hiện tại nên ta dùng câu ĐK loại 1. Đáp án A không đúng về nghĩa, ta chọn C\n" +
            "Đáp án B, D không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Trừ khi có nhiều ý tưởng hơn, chúng ta có thể kết thúc cuộc gặp mặt ngày mai\n","Đáp án D\n" +
            "MĐ ĐK có now, nên để đưa ra giả thiết trái với hiện tại, ta dùng câu ĐK loại 2. \n" +
            "Đáp án A, B, C không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa: Nếu anh ấy mà ở đây với chúng ta lúc này, anh ấy có thể tận hưởng vẻ đẹp tự nhiên của Công viên quốc gia\n","Đáp án D\n" +
            "MĐ ĐK chia ở QKHT nên đây là câu ĐK loại 3, MĐ chính có dạng would have done st, chọn D.\n" +
            "Đáp án A, B, C không thể hoàn thành câu đúng cấu trúc ngữ pháp\n"+"Dịch nghĩa Nếu họ đã tìm kiếm cẩn thận hơn, họ đã tìm thấy chiếc đồng hồ sớm hơn\n","Đáp án C\n" +
            "MĐ ĐK chia thì QKHT, MĐ chính có now nên dùng câu ĐK hỗn hợp, MĐ chính có dạng would do st. \n" +
            "Đáp án A, B, D không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa: Nếu tôi dậy sớm hơn thì bây giờ tôi phải ăn sáng\n","Đáp án C\n" +
            "Dùng CĐK loại 1, đưa ra sự việc có thật ở hiện tại\n" +
            "Đáp án B, D không thể hoàn thành câu đúng cấu trúc ngữ pháp, đáp án A sai về nghĩa, chọn C\n" +
            "Dịch nghĩa Tôi không thể mua một cái máy tính mới trừ khi tôi tiết kiệm đủ tiền\n","Đáp án A\n" +
            "CĐK loại 1, đưa ra chân lý, điều hiển nhiên có thật ở hiện tại\n" +
            "Đáp án D, B không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Đáp án C sai về nghĩa, ta chọn A\n" +
            "Dịch nghĩa Phần lớn mọi người bạn gặp sẽ lịch sự với bạn nếu bạn lịch sự với họ\n","Đáp án C\n" +
            "MĐ ĐK chia ở HTĐ, ta dùng câu ĐK loại 1, MĐ chính chia thì TLĐ, chọn C.\n" +
            "Đáp án A, B, D không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa: Nếu bạn làm vậy, bạn sẽ chỉ làm vấn đề tồi tệ hơn thôi\n","Đáp án B\n" +
            "Câu ĐK loại 1 đưa ra sự việc có thật ở hiện tại, MĐ ĐK chia ở HT đơn, MĐ chính chia thì TLĐ\n" +
            "Đáp án A, C, D không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Bạn sẽ không nói tiếng Anh trôi chảy trừ khi bạn luyện tập hằng ngày\n","Đáp án C\n" +
            "Ngoại lệ của CĐK loại 1, câu mệnh lệnh dùng Or để đưa ra kết quả của giả thiết\n"+"Đáp án A, B, D không thể hoàn thành câu đúng cấu trúc ngữ pháp, chọn C\n" +
            "Dịch nghĩa Nhanh lên không là bạn sẽ lỡ xe buýt và đến trường muộn đấy\n","Đáp án A\n" +
            "Câu ĐK loại 1 đưa ra sự việc có thật ở hiện tại,MĐ Đk chia ở HTĐ, ta chọn A\n" +
            "Đáp án B, C, D không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Bạn sẽ có chỗ ngồi tốt nếu bạn đến đầu tiên\n","Đáp án D \n" +
            "MĐ ĐK chia thì QKHT,nên dùng câu ĐK loại 3, MĐ chính dạng would have done st. Chọn D\n" +
            "Đáp án A, B, C không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Nếu Margaret đã không thắt dây an toàn thì cô ấy đã bị thương rồi\n","Đáp án D \n"+"As if: như thể là, dùng để đưa ra mệnh đề trái ngược với quá khứ ta dùng As if + QKHT\n" +
            "Đáp án A, B, C không thể hoàn thành câu đúng cấu trúc ngữ pháp\n" +
            "Dịch nghĩa Anh ta nhìn sợ hãi như thể anh ấy đã thấy ma\n","Đáp án C\n" +
            "Câu nói về sự việc ở hiện tại, có thể dùng CĐK loại 1 hoặc 2. Đáp án A,B,D không thể hoàn thành câu đúng cấu trúc ngữ pháp của CĐK loại 1 hay 2, ta chọn C\n" +
            "Dịch nghĩa: Điều gì sẽ xảy ra nếu có một vụ tai nạn hạt nhân nghiêm trọng?\n"};
    ArrayList<Integer> list ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau_khien);
        hienthi=(TextView)findViewById(R.id.text_show_caukhien);
        goiy=(TextView)findViewById(R.id.goiy_caukhien);
        textgoiy=(TextView)findViewById(R.id.textgoiy_caukhien);
        textscore=(TextView)findViewById(R.id.score_caukhien);
        cau=(TextView)findViewById(R.id.cau_caukhien);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(CauKhien.this,R.raw.correct);
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
                if(stt==29)
                {
                    Intent intent = new Intent(CauKhien.this, HoanThanh.class);
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
                    textscore.setText(score+"/30");
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
                if(stt==29)
                {

                    Intent intent = new Intent(CauKhien.this, HoanThanh.class);
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
                    textscore.setText(score+"/30");

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
                if(stt==29)
                {
                    Intent intent = new Intent(CauKhien.this, HoanThanh.class);
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
                    textscore.setText(score+"/30");

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
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==29)
                {
                    Intent intent = new Intent(CauKhien.this, HoanThanh.class);
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
                    textscore.setText(score+"/30");
                    score+=1;


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
    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(CauKhien.this, Onthi.class);
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
        hienthi=(TextView)findViewById(R.id.text_show_caukhien);
        button1=(Button)findViewById(R.id.button1_caukhien);
        button2=(Button)findViewById(R.id.button2_caukhien);
        button3=(Button)findViewById(R.id.button3_caukhien);
        button4=(Button)findViewById(R.id.button4_caukhien);

    }
}