package game.miqi.Game3;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;




import java.util.ArrayList;
import java.util.Collections;

import es.dmoral.toasty.Toasty;
import game.miqi.MainActivity;
import game.miqi.R;

public class ActivityGame3 extends AppCompatActivity {
    int socau = 1 ;
    int count = 1200;

    public String[]question = {"A quick look would reveal that France has twice______computers?",
            "People have used coal and oil to______electricity for a long time.",
            "In the early years of the 20th century, several rebellions______in the northern parts of the country.",
            "When he started that company, he really went______. It might have been a disaster.",
            "We regret to tell you that the materials you ordered are______."
            ,"My sister is a woman of______age."
            ,"““How do you like your steak done?” _ “_______.”?”"
            ,"\"Oops! I’m sorry for stepping on your foot\" – “______.”"
    ," If he were younger, he ______ a professional running competition now."
            ," The children ______ to bed before their parents came home from work"
    ," Linda refused ______ in the musical performance because she was sick."
            ," There has been little rain in this area for months, ______?\n"
    ,"David was deported on account of his expired visa. He ______ it renewed."
    ,"The proposal ______ by the environmentalists to grow more trees has received\n" +
            "approval from the council."
    ,"Project-based learning provides wonderful opportunities for students to develop their\n" +
            "______.\n",
            " Violent films may have a negative ______ on children.",
            "A good leader should not be conservative, but rather ______ to new ideas.",
            ". ______ individuals are those who share the same hobbies, interests, or points of view.",
            "The child has no problem reciting the poem; he has ______ it to memory.\n",
            "After several injuries and failures, things have eventually ______ for Todd when he\n" +
                    "reached the final round of the tournament.\n"

    ,"I haven‘t met him again since we ______ school ten years ago",
            "A recent survey has shown that ______ increasing number of men are willing to share the\n" +
                    "housework with their wives.",
    "The more demanding the job is, ______ I like it.",
    "John wanted to know ______ in my family.",
    "Richard, my neighbor, _______ in World War II",
    "Students are ______ less pressure as a result of changes in testing procedures.",
    "Tom is getting ever keener on doing research on ______. \n",
    "Paul is a very____character, he is never relaxed with strangers",
            "Mary's lawyer advised her_____anything further about the accident",
    "Many of the pictures____from outer space are presently on display in the public library",
    "The authorities______actions to stop illegal purchase of wild animals and their associated products effectively.However, they didn't do so",
    "Although he is my friend, I find it hard to_____his selfishness.",
    "The U23 VietNamese football team's performance has garnered______from around the world and shown promise for VietNam's soccer horizon",
    "The joke would not be funny if it______into French.",
    "John congratulated us _____our exams with high marks.",
    "We expected him at night,but he finally ____at midnight",
    "Everybody is tired of watching the same commercials on TV every night,_____?",
    "The 1st week of classes at university is a little_______because " +
            "so many students get lost,change classes or go to the wrong place",
    "After he ______his work, he went straight home.",
    "There is too much____in this world.",
    "That's a very nice skirt you're wearing.\n" +
            "__________“\n",
    "_________are the formal rules of correct or polite behavior among people using the Internet",
            "UNICEF ______supports and funds for the most disadvantaged children all over the world.",
    "He would win the race if he______his brother's example and trained harder.",
    "Excuse me. Where is the ______office of OXFAM located?",
    "The doctors know that it is very difficult to save the patient's life,________they will try their best.",
    "I am  sending  you  my curriculum vitae_______you will have a chance to study it before our interview.",
    "Everybody in the house woke up when the burglar alarm______.",
    "Have a piece of chocolate,______?",
    "If you put your money in a bank now, you may get 12%___________annually.",
    ": I can’t possibly lend you any more money, it is quite out of the________.",
    "Of the two sisters, Thuy Kieu is the _______ . ",
    "All applicants _______ hand in their application forms by Friday at the latest.",
    "At the end of the film, the young prince _______ in love with a reporter.",
    "As we wanted to be close to_______nature, we moved to the countryside.",
    "Sex before _______ is strongly disapproved in some cultures.",
    "Those _______ boys often play tricks on their friends",
    "The child _______ parents both died is called an orphan.",
    "You were wrong _______ her for something she didn't do.",
    "He is going to marry a _______ girl next month.",
    "Who will _______ your baby when you are at work?",
    "Not until a few years ago_______ playing football .",
    "Mary is very_______ and caring. - I think she would make a good nurse."};
    private String [][]traloi={{"more televisions than","many as televisions as","as many televisions as","as many as televisions"},
            {"bred","raise","cultivate","generate"},
            {"turned out","rose up","broke out","came up"},
            {"out on the limb","on and off","over the odds","once too often"},
            {"out of stock","out of practice","out of reach","out of work"},
            {"marriage","married","marrying","marriageable"}
            ,{"I don’t like it","Very little","Well done","Very much"}
            ,{"Never mind","You don't mind","You're welcome","That's fine"},
            {"will join","had joined","would have joined","would join"},
            {"were all going","had all gone","had all been going","have all gone"},
            {"to participate","participate","participating","to participating"},
            {"has it","has there","hasn’t it","hasn’t there"},
            {"must have had","should have had","needn’t have had","mightn’t have had"},
            {"which suggested","be suggested","suggested","was suggested"},

            {"creative","creativity","create","creatively"},
            {"opinion","influence","dependence","decision"},
            {"receptive","acceptable","permissive","applicable"},
            {"Light-hearted","Like-minded","Even-handed","Open-minded"},
            {"devoted","added","committed","admitted"},
            {"looked up","gone on","taken up","turned on"},
            {"have left","leave","left","had lef"},
            {"a","an","the","some"}
            ,{"more","most","the more","the most"},
            {"there were how many people","how many people were there","were there how many people","how many people there were",},
            {"says to fight","says to have fought","is said to fight","is said to have fought"},
            {"under","above","upon","out of"},
            {"biology","biological","biologist","biologically"},


            {"self-conscious","self-satisfied","self-directed","self-confident"},
            {"not saying","telling","not to say","not tell"},
            {"sending","sent","having sent","were sent"},
            {"must have taken","had to take","needed have taken","should have taken"},
            {"put up with","cath up with","keep up with","come down with"},
            {"attentive","attention","attend","attentively"},
            {"has been translated","be translated","was be translated","were translated"},
            {"on passing","for passing","to pass","on pass"},
            {"turned up","came off","came to","turned in"},
            {"are they","aren't they","haven't they","don't they"},
            {"uncontrolled","arranged","chaotic","notorious"},
            {"would finish","has finished","had finished","has been finishing"},
            {"greediness","greed","greedy","greedness"},
            {"How a compliment!","That's all right","It's nice of you to say so","I like you said so"},
            {"Traffic rules","Family rules","Codes of etiquettes","Codes of netiquettes"},
            {"presents","assists","provides","offers"},
            {"repeated","set","answered","followed"},
            {"leading","head","central","summit"},
            {"but","although","despite","however"},
            {"so that","because","for","since"},
            {"went out","went off","came about","rang off"},
            {"do you","would you","don't you","haven't you"},
            {"interest","profit","money","income"},
            {"order","practice","place","question"},

            {"eldest","elder","eldly","most eldly"},
            {"may","must","ought","might"},
            {"felt","made","fell","got"},
            {"Ø","a","an","the"},
            {"get married","marry","marriage","married"},
            {"mischievous","obedient","honest","well-behaved"},
            {"which","who","that","whose"},
            {"criticizing","so as to criticize","to criticize","that criticizing"},
            {"tall pretty English","pretty tall English","pretty English tall","tall English pretty"},
            {"take after","take on","take over","take care of"},
            {"did he start","he has started","he started","had he started"},
            {"mischievous","effect","efficient","disobedient"}

};
    private  String[] Correct ={"as many televisions as","generate","broke out",
            "once too often","out of stock","marriageable","Well done","Never mind",
            "would join","had all gone","to participate","has there","should have had","suggested",
    "creativity","influence","receptive","Like-minded","committed","looked up","left"
            ,"a","the more","how many people there were","is said to have fought","under","biology","self-conscious",
    "not to say","sent","should have taken","put up with","attention","were translated","on passing","turned up","aren't they","chaotic",
    "had finished","greed","It's nice of you to say so","Codes of netiquettes","provides","followed","head","but",
    "so that","went off","do you","interest","question","elder","must","fell","Ø","marriage","mischievous","whose",
    "to criticize","pretty tall English","take care of","did he start","efficient"};



    String[]goiy_dapan={"Cấu trúc so sánh gấp số lần: once/twice/three times.... + as... as +...\n" +
            "=> đáp án C\n" +
            "Tạm dịch: Nhìn qua có thể thấy rằng Pháp có số lượng tivi gấp 2 lần máy tính.",
            "bred (quá khứ của breed): sinh ra, gây ra, mang lại\n" +
                    "raise: nâng lên, đưa lên\n" +
                    "\n" +
                    "cultivate: canh tác, trau dồi, tu dưỡng\n" +
                    "generate: tạo ra, phát ra\n" +
                    "\n" +
                    "=> đáp án D\n" +
                    "Tạm dịch: Người ta đã sử dụng than và dầu để tạo ra điện trong một thời gian dài.",
            "turn out: diễn ra, hoá ra\n" +
                    "rise up: tăng lên\n" +
                    "\n" +
                    "break out: bùng ra, nổ ra\n" +
                    "come up: nhú lên, mọc, nảy sinh\n" +
                    "\n" +
                    "=> đáp án C\n" +
                    "Tạm dịch: Trong những năm đầu của thế kỷ 20, một số cuộc nổi dậy nổ ra ở các vùng phía bắc của đất nước.",
            "out on the limb: rơi vào thế kẹt\n" +
                    "on and off: chốc chốc, chập chờn, thỉnh thoảng\n" +
                    "\n" +
                    "over the odds : cần thiết, nhiều hơn mong đợi\n" +
                    "once too often: hơn một lần được vô sự\n" +
                    "\n" +
                    "=> đáp án D\n" +
                    "Tạm dịch: Khi mới bắt đầu công ty đó, anh ta thực sự được vô sự hơn một lần. Nó đã có thể là một thảm hoạ\n" +
                    "rồi.",
            "out of stock: hết hàng\n" +
                    "out of practice: không thể thực thi\n" +
                    "\n" +
                    "out of reach: ngoài tầm với\n" +
                    "out of work: thất nghiệp\n" +
                    "\n" +
                    "=> đáp án A\n" +
                    "Tạm dịch: Chúng tôi rất tiếc phải báo cho các ngài biết rằng nguyên liệu ngài đặt mua đã hết hàng.",
            "marriageable age: tuổi kết hôn, tuổi có thể kết hôn\n" +
                    "=> đáp án D\n" +
                    "Tạm dịch: Chị tôi là người phụ nữ đến tuổi kết hôn."
            ,"“Ngài muốn bít tết chín như thế nào?”\n" +
            "A. Tôi không thích nó.\n" +
            "B. Rất ít.\n" +
            "\n" +
            "C. Chín kỹ.\n" +
            "D. Rất nhiều.\n" +
            "\n" +
            "=> đáp án C",
            "“Ôi! Tôi xin lỗi đã giẫm lên chân bạn.”\n" +
                    "A. Không sao.\n" +
                    "B. Bạn không để tâm.\n" +
                    "\n" +
                    "C. Không có gì (dùng để đáp lại lời cám ơn.)\n" +
                    "D. Nó ổn.\n" +
                    "\n" +
                    "=> đáp án A",
    "Kiến thức: Câu điều kiện loại 2\n" +
            "Giải thích: Câu điều kiện loại để diễn tả điều không có thật ở hiện tại\n" +
            "If + S + Ved/ V2, S + would/ could + Vo\n" +
            "Tạm dịch: Nếu anh ấy trẻ hơn, bây giờ anh ấy sẽ tham gia cuộc thi chạy chuyên nghiệp.\n" +
            "Đáp án: D\n",
    "Kiến thức: Sự hòa hợp giữa thì quá khứ đơn và quá khứ hoàn thành\n" +
            "Giải thích: Cấu trúc\n" +
            "S + had Ved/ V3 before S + Ved/ V2\n" +
            "Tạm dịch: Những đứa trẻ đều đã đi ngủ trước khi bố mẹ chúng đi làm về.\n" +
            "Đáp án: B",
    "Kiến thức: Dạng của động từ sau “refuse”\n" +
            "Giải thích: Cấu trúc refuse + to Vo\n" +
            "Tạm dịch: Linda từ chối tham gia vào buổi biểu diễn âm nhạc vì cố ấy bị ốm.\n" +
            "Đáp án: A",
    "Kiến thức: Câu hỏi đuôi\n" +
            "Giải thích: Cấu trúc câu hỏi đuôi\n" +
            "S + V (phủ định), trợ động từ + S (khẳng định)?\n" +
            "Trong mệnh đề đầu có “little” mang nghĩa phủ định.\n" +
            "Tạm dịch: Nhiều tháng nay khu vực này có rất ít mưa, đúng không?" +
            "Đáp án: B\n",
    "Kiến thức: Động từ khuyết thiếu\n" +
            "Giải thích: Động từ khuyết thiếu dùng diễn tả những khả năng xảy ra trong quá khứ\n" +
            "must have had: chắc có lẽ đã có\n" +
            "should have had: đáng lẽ ra nên có\n" +
            "needn’t have had: đáng lẽ ra không cần có\n" +
            "mightn’t have had: đáng lẽ không thể có\n" +
            "Tạm dịch: David bị trục xuất vì visa hết hạn. Anh ấy đáng lẽ ra nên làm mới giấy thông hành (visa).\n" +
            "Đáp án: B\n",
    "Kiến thức: Rút gọn mệnh đề quan hệ " +
            "Tạm dịch: Bản kiến nghị cái mà được các nhà môi trường đề xuất trồng nhiều cây hơn đã nhận được sự chấp\n" +
            "thuận từ ủy ban.\n" +
            "Câu đầy đủ: The proposal which was suggested by the environmentalists to grow more trees has received\n" +
            "approval from the council.\n" +
            "=> Rút gọn lại: The proposal suggested by the environmentalists to grow more trees has received\n" +
            "approval from the council.\n" +
            "Đáp án: C\n" ,
    "Kiến thức: Từ loại\n" +
            "Giải thích: Sau tính từ sở hữu (their) cần danh từ\n" +
            "creative (a): sáng tạo\n" +
            "creativity (n): sự sáng tạo\n" +
            "create (v): sáng tạo ra\n" +
            "creatively (adv): một cách sáng tạo\n" +
            "Tạm dịch: Việc học dựa trên dự án cung cấp những cơ hội tuyệt vời cho học sinh phát triển sự sáng tạo của\n" +
            "chúng.\n" +
            "Đáp án: B",

                    "Kiến thức: Sự kết hợp từ, cụm từ\n" +
                    "Giải thích: \n" +
                    "Cụm từ have influence on : có ảnh hưởng đến\n" +
                    "Tạm dịch: Những bộ phim bạo lực có thể có những ảnh hưởng tiêu cực đến trẻ em.\n" +
                    "Đáp án: B\n",
    "Kiến thức: Từ vựng\n" +
            "Giải thích:\n" +
            "receptive (a): dễ tiếp thu\n" +
            "acceptable (a): có thể chấp nhận được\n" +
            "permissive (a): cho phép, chấp nhận\n" +
            "applicable (a): có thể áp dụng được\n" +
            "Tạm dịch: Một nhà lãnh đạo giỏi không nên bảo thủ, mà thay vào đó là tiếp thu những ý tưởng mới.\n" +
            "Đáp án: A",
    "Kiến thức: Từ vựng\n" +
            "Giải thích:\n" +
            "Light-hearted (a): dễ tính, hoạt bát\n" +
            "Like-minded (a): cùng tư tưởng, cùng ý kiến\n" +
            "Even-handed (a): công bằng, không thiên vị\n" +
            "Open-minded (a): cởi mở\n" +
            "Tạm dịch: Những người có cùng ý kiến là những người có cùng sở thích, đam mê, hay quan điểm.\n" +
            "Đáp án: B",
    "Kiến thức: Từ vựng\n" +
            "Giải thích:\n" +
            "devoted to (v): cống hiến, tận tụy\n" +
            "added (v) sth to sth: thêm vào\n" +
            "commit something to memory = to learn something well enough to remember it exactly: học kỹ để nhớ chính\n" +
            "xác\n" +
            "admitted (v): thừa nhận\n" +
            "Tạm dịch: Đứa bé này không có khó khăn gì khi đọc bài thơ; thằng bé đã thuộc lòng (ghi nhớ trong đầu).\n" +
            "Đáp án: C",
    "Kiến thức: Cụm động từ\n" +
            "Giải thích:\n" +
            "looked up = (of business, somebody’s situation, etc.) to become better: trở nên tốt đẹp hơn\n" +
            "gone on: tiếp tục\n" +
            "taken up: bắt đầu \n" +
            "turned on: bật lên\n" +
            "Tạm dịch: Sau những tổn thương và thất bại, mọi việc cuối cùng đã tốt đẹp hơn với Todd khi anh ấy đã vào\n" +
            "vòng chung kết của trận đấu.\n" +
            "Đáp án: A",
            "C\n" +
                    "Cấu trúc: S+ hiện tại hoàn thành since S+ quá khứ đơn.",
    "A\n"+"A number of + danh từ số nhiều -> động từ số nhiều ( are)",
    "C\n" +
            "Cấu trúc so sánh kép: the so sánh hơn S+V, the so sánh hơn S+ V",
            "D\n" +
                    "Tường thuật câu hỏi( wanted to know) nên lùi tì và không đảo ngữ",
    ".D\n" +
            "Cấu trúc bị động đặc biệt.\n" +
            "Câu này dịch như sau: Richard, hàng xóm của tôi, được bảo rằngđã tham gia chiến\n" +
            "tranh thế giới thứ hai.\n" +
            "Việc được đồn ở hiện tại nên dùng is said, việc tham chiến ở quá khứ nên dùng to\n" +
            "have Ved/ V3",
    "A\n" +
            "Under pressure: chịu áp lực",
    "A\n" +
            "Sau giới từ (on) dùng danh từ biology( môn sinh học)\n"};
    TextView goiyy ;
    ArrayList<Integer> kiemtra;
    int score=0;
    int solansai=0;
    TextView hienthi,demgio,textscore,cau;
    String current_answer ;
    Button button1,button2,button3,button4 ;
    TextView text_demso;
    int stt= 0 ;
    MediaPlayer mediaPlayer;
    CountDownTimer countDownTimer ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
      demgio=(TextView)findViewById(R.id.demgio);
        textscore=(TextView)findViewById(R.id.scoreee);
        cau=(TextView)findViewById(R.id.cau);
        kiemtra = new ArrayList<Integer>();
        for (int i = 0; i < Correct.length; i++) {
            kiemtra.add(i);
            Collections.shuffle(kiemtra);
        }
        text_demso = (TextView)findViewById(R.id.text_demso_game3);
      mediaPlayer = new MediaPlayer();
      mediaPlayer = MediaPlayer.create(ActivityGame3.this,R.raw.correct);
        cau.setText("Câu: "+socau);
        init();
        updatequestion();
        sukienbutton();

  countDownTimer = new CountDownTimer(3000000,1000) {
     @Override
     public void onTick(long millisUntilFinished) {
         count+=1000;
         int minutes = (int) ((count / (1000 * 60)) % 60);
         int seconds = (int) (count / 1000) % 60;
         demgio.setText(String.format("%02d", minutes)
                 + ":" + String.format("%02d", seconds));

     }

     @Override
     public void onFinish() {
         finish();
         Toasty.success(ActivityGame3.this,"Hết Giờ",Toast.LENGTH_SHORT).show();
         Intent intent = new Intent(ActivityGame3.this, Chienthang_Game3.class);
         intent.putExtra("Score_game3kk",stt);
         startActivity(intent);
         cancel();

     }
 };
countDownTimer.start();


    }






    private void sukienbutton() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(button1.getText().equals(current_answer))
                {

                    Toasty.success(getApplicationContext(),"Very Good ",Toast.LENGTH_SHORT).show();

                    stt+=1;
                    score+=1;
                    {   finish();
                        countDownTimer.cancel();
                        Intent intent = new Intent(ActivityGame3.this, Chienthang_Game3.class);
                        intent.putExtra("Score_game3kk",score);
                        startActivity(intent);
                    }
                    socau+=1;
                    textscore.setText(score+"/50");
                    updatequestion();


                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    {   finish();
                        countDownTimer.cancel();
                        Intent intent = new Intent(ActivityGame3.this, Chienthang_Game3.class);
                        intent.putExtra("Score_game3kk",score);
                        startActivity(intent);
                    }
                    socau+=1;
                    solansai+=1 ;
                    updatequestion();

                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(button2.getText().equals(current_answer))
                {

                    Toasty.success(getApplicationContext(),"Very Good ",Toast.LENGTH_SHORT).show();
                    score+=1;
                    stt+=1;
                    if(stt==49)
                    {
                        finish();
                        countDownTimer.cancel();
                        Intent intent = new Intent(ActivityGame3.this, Chienthang_Game3.class);
                        intent.putExtra("Score_game3kk",score);
                        startActivity(intent);
                    }

                    socau+=1;
                    updatequestion();
                    textscore.setText(score+"/50");

                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    if(stt==49)
                    {   finish();
                        countDownTimer.cancel();
                        Intent intent = new Intent(ActivityGame3.this, Chienthang_Game3.class);
                        intent.putExtra("Score_game3kk",score);
                        startActivity(intent);
                    }
                    socau+=1;
                    solansai+=1 ;
                    updatequestion();

                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(button3.getText().equals(current_answer))
                {

                    Toasty.success(getApplicationContext(),"Very Good ",Toast.LENGTH_SHORT).show();
                    score+=1;
                    stt+=1;
                    if(stt==49)
                    {   finish();
                        countDownTimer.cancel();
                        Intent intent = new Intent(ActivityGame3.this, Chienthang_Game3.class);
                        intent.putExtra("Score_game3kk",score);
                        startActivity(intent);
                    }
                    socau+=1;
                    updatequestion();

                    textscore.setText(score+"/50");

                }else {
                    Toasty.normal(getApplicationContext(), "Rất tiếc " + current_answer + " là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt += 1;
                    if(stt==49)
                    {   finish();
                        countDownTimer.cancel();
                        Intent intent = new Intent(ActivityGame3.this, Chienthang_Game3.class);
                        intent.putExtra("Score_game3kk",score);
                        startActivity(intent);
                    }
                    socau += 1;
                    solansai += 1;
                    updatequestion();



                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(button4.getText().equals(current_answer))
                {

                    Toasty.success(getApplicationContext(),"Very Good ",Toast.LENGTH_SHORT).show();
                    stt+=1;
                    score+=1;
                    if(stt==49)
                    {   finish();
                        countDownTimer.cancel();
                        Intent intent = new Intent(ActivityGame3.this, Chienthang_Game3.class);
                        intent.putExtra("Score_game3kk",score);
                        startActivity(intent);
                    }
                    socau+=1;
                    updatequestion();
                    textscore.setText(score+"/50");



                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    {   finish();
                        countDownTimer.cancel();
                        Intent intent = new Intent(ActivityGame3.this, Chienthang_Game3.class);
                        intent.putExtra("Score_game3kk",score);
                        startActivity(intent);
                    }
                    socau+=1;
                    solansai+=1 ;
                    updatequestion();



                }

            }
        });
    }

    private void thatbai() {
        Toasty.error(this,"Thất bại",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ActivityGame3.this, Chienthang_Game3.class);
        intent.putExtra("Score_game3kk",stt);
        startActivity(intent);
    }

    private void init() {

        hienthi=(TextView)findViewById(R.id.text_show);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);

    }

    private void updatequestion() {
        cau.setText("Câu: "+socau);
        ArrayList<Integer> random = new ArrayList();
        for(int i=0;i<4;i++)
        {
            random.add(i);
            Collections.shuffle(random);
        }
        hienthi.setText(question[kiemtra.get(stt)]);
        button1.setText(traloi[kiemtra.get(stt)][random.get(0)]);
        button2.setText(traloi[kiemtra.get(stt)][random.get(1)]);
        button3.setText(traloi[kiemtra.get(stt)][random.get(2)]);
        button4.setText(traloi[kiemtra.get(stt)][random.get(3)]);
        current_answer = Correct[kiemtra.get(stt)];



    }
    private void chienthang(){
        Toast.makeText(this,"You Win",Toast.LENGTH_SHORT);
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ActivityGame3.this);
        builder.setTitle("Do you want to give up ? ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        countDownTimer.cancel();
                        Intent intent = new Intent(ActivityGame3.this, MainActivity.class);
                        startActivity(intent);

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();

                    }
                });
        AlertDialog alertDialog =builder.create();
        alertDialog.show();
    }
    @Override
    protected void onPause() {
        super.onPause();

    }


    @Override
    protected void onResume() {
        super.onResume();
    }



}