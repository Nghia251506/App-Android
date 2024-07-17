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

public class CumDongTu extends AppCompatActivity {
    TextView hienthi,goiy,textscore,cau;
    String current_answer ;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    ImageView back;
    MediaPlayer mediaPlayer;
    TextView goiyy;
    int score=0;
    int solansai=0;
    String[]question ={"The first census to be __________ in Ottoman Istanbul in 1477 revealed a total of 16,324 households",
            "Ursula and Tess had their little differences at the beginning of their work but now they seem to be __________ quite nicely.",
            "Kate had been __________ in order to buy a new laptop, but then she decided to use the money on guitar lessons instead.",
            "I read about the clothing discounts in a leaflet which a young woman was __________ outside of the cinema.",
            "Though there was a huge amount of turbulence during the flight, the pilot managed to __________ the plane __________ without crashing it.",
            "In the novella, Hadji Murat is an important figure among the Chechens, but he __________ the main leader Sheikh Shamil following an argument.",
            "I couldn’t hear what Angel was trying to tell me over the telephone, so I asked him to __________.",
            "Brigit and Leticia were very close when they were at school together, but, as they followed their separate careers, they started to ___",
    "The total cost of all of Ms. Harrell’s driving lessons __________ £6,000. ",
            "In order to apply for a credit card, Tom first had to __________ a four-page form at the bank. ",
    "Plato’s accounts of the philosopher Socrates don’t always __________ those left behind by Xenophon. ",
    "In \"The Lawless Roads\", Graham Greene __________ the people of Mexico by describing them in a highly patronizing manner.",
            "While Barbara was waiting in the queue to make her payment, a rude man __________ in front of her. ",
    "The abbreviation IAEA __________ the International Atomic Energy Agency, which seeks to prevent the build-up of nuclear weapons.",
    "Monica was so angry about the noise that her neighbours were making that she refused to __________ it anymore.",
    "Jeanne said that she would __________ our place this afternoon if she had enough time before she had to go back to work. ",
    "Towards the end of the film Thelma and Louise, a large truck is __________ by the main characters when they shoot its tank, which is full of oil. ",
    "The Bangladeshi Muhammad Yunus __________ the idea of microcredit to combat poverty, and this won him the Nobel Peace Prize this year. ",
    "The firemen had to break _______ the room to rescue the children."
    ,"On farms, when the cattle are too ill, farmers often have to put them ______ . ",
    "I would love to be able to _____ my children in the country. ",
    "Our flight was delayed, but we finally _______ shortly after midnight. ",
    "She wouldn’t buy any new clothes until hers_______ ",
    "The H5N1 infected patients have to _______ others to prevent the virus from spreading ",
    "Whenever I have problems, Jane is always very dependable. She never ______. ",
    "It’s too late; you shouldn’t go. Don’t worry! We can______for a night. ",
    "Please _________ and see us when you have time. You are always welcome ",
    "I can’t ________this noise any longer. I’m going to write a letter of complaint to the local authority about this problem. ",
    "The new manager laid down very strict rules as soon as he had ________the position. ",
    "Children should be taught that they have to___________everything after they use it.",
    "Everyone knows about the pollution problems, but not many people have _____ any solutions.",
    "Many factories break the anti-pollution laws and _____.","Disposing of waste and rubbish is a hard problem to _____. ",
    "Most people in cities should _____ cycling instead of using cars.","Most governments seem to just _____ dealing with environmental problems.",
    "The Press thought the football manager would be depressed by his dismissal but he just _____.",
    "We are doing _____ our kitchen today and we could do _____ more paint.","She got up when the alarm went _____.",
    "Put _____ the cigarette, please. I don’t like the smell of it.","Sixteen people showed _____ for her volleyball training session",
    "Were you brought _____ in the city or in the country?"};
    private  String[] Correct={"carried out","getting along","saving up","handing out","touch ... down",
            "falls out with","speak up","grow apart","came to","fill in","match up with","looks down on","pushed in",
            "stands for","put up with","drop by","blown up","came up with","into","away","bring up","took off",
            "Wear out","stay away from","let me down","put you up", "come round","put up with","taken over","put away",
    "come up with","get away with it","deal with","take up","put off","laughed it off","up / with","off","out","up","up"};
    private String [][]traloi={
            {"hung on","carried out","counted against","done for"},
            {"doing by","getting through","doing up","getting along"},
            {"working on","paying off","saving up","giving away"},
            {"giving off","putting across","handing out","letting up"},{
        "set... out","touch ... down","take ... off","run ... over"},
            {"sets apart from","falls out with","cuts back on","Keep out of"},
            {"get up","do up","speak up","call up"},
            {"tear up","break down","pull off","grow apart"}
            ,{"held out","paid up","passed as","came to"}
            ,{"fill in","do with","hand out","work up"},
            {"face up to","cut down on","match up with","try out for"},
            {"gets through with","runs out of","backs out of","looks down on"},
            {"pushed in","tried on","broke up","cut off"}
,{"reads over","does in","stands for","counts down"},
            {"run away with","cut down on","put up with","get away with"}
     ,{"drop by","give in","Put up","call off"}
            ,{"shot off","struck in","poured out","blown up"}
            ,{"looked forward to","came up with","kept up with","ran out of"}
            ,{"off","up","out","into"}
            ,{"in","down","up","away"}
            ,{"bring up","get up","grow up","wake up"}
            ,{"took on","took off","put off","took up"}
            ,{"Take out","Wear out","Let out","Go out"}
            ,{"Take care of","get away","look after","stay away from"}
            ,{"Turns up","let me down","turns me off","turns out"}
            ,{"put you up","put you through","put you away","put you aside"},
            {"come away","come to","come in","come round"}
            ,{"put up with","take away from","get back to","make out of"}
            ,{"come over","taken over","taken up","taken off"}
            ,{"put away","pick off","collect up","catch on"},
            {"come up with","thought over","get round to","looked into"},
            {"get away with it","put up with it","take it over","come round to it"},
            {"deal with","carry out","put up","get away"},
            {"take up","set up","rely on","get round to"},
            {"take after","make up for","do without","put off"},
            {"ran it down","laughed it off","turned it down","called it off"},
            {"up / with","over / with","away / up","without / with"},
            {"over","off","in","up"},
            {"out","in","up","off"},
            {"through","on","up","over"},
            {"off","forward","over","up"}
};
    String[]goiy_dapan={": Đáp án B\n" +
            "Carry out: tiến hành, thực hiện. \n" +
            "Hang on: giữ chặt; chờ đợi. \n" +
            "Count against: là điều bất lợi cho ai. \n" +
            "Do for: tiêu diệt, chấm dứt; làm việc nhà cho ai.\n" +
            "Dịch nghĩa: Cuộc điều tra dân số đầu tiên được thực hiện ở Ottoman Istanbul năm 1" +
            "477 cho thấy có tổng cộng 16.324 hộ gia đình.\n",
            //2
            "Đáp án D\n" +
            "Get along: hòa hợp. \n" +
            "Do by: giải quyết một cách cụ thể. \n" +
            "Get through: hoàn thành việc gì, đi qua. \n" +
            "Do up: buộc (dây); buộc lại thành bó; sửa sang hay trang trí một tòa nhà. \n" +
            "Dịch nghĩa: Ursula và Tess có những sự khác biệt nhỏ khi bắt đầu công việc của họ nhưng bây giờ " +
            "họ dường như đã hòa hợp với nhau khá tốt.\n",
            //3
            "Đáp án C\n" +
            "Save up: tiết kiệm. \n" +
            "Work on: tập trung làm gì. \n" +
            "Pay off: trả hết nợ; mang lại kết quả. \n" +
            "Give away: đưa cái gì cho người khác; lan truyền.\n" +
            "Dịch: Kate đã tiết kiệm được để mua một chiếc máy tính xách tay mới, nhưng sau đó cô quyết định " +
            "sử dụng tiền để học guitar thay vì mua máy tính xách tay.\n",
            //4
            "Đáp án C\n" +
            "Hand out: phát, phân phát. \n" +
            "Give off: tỏa ra. \n" +
            "Put across: thành công; truyền đạt được. \n" +
            "Let up: trở nên yếu, không còn sung sức.\n" +
            "Dịch: Tôi đã đọc về các khoản giảm giá quần áo trong một tờ rơi mà một cô gái trẻ đang phát ngoài rạp chiếu phim.\n",
            "Đáp án B\n" +
            "Touch down: hạ cánh\n Set out: khởi hành, xuất phát. \n" +
            "Take off: cất cánh. \n" +
            "Run over: ghi nhớ; đụng ngã. \n" +
            "Ở đây nhắc đến máy bay nên đáp án B và C đều phù hợp, nhưng dựa vào nghĩa của câu có thể thấy chỉ có đáp án B là chính xác.\n" +
            "Dịch: Mặc dù có một số lượng lớn hỗn loạn trong suốt chuyến bay, phi công đã cố gắng để hạ cánh máy bay xuống mà không bị đâm.\n",
            "Đáp án B\n" +
                    "Fall out with somebody: bất đồng, cãi cọ với ai. \n" +
                    "Set (somebody/something) apart from (somebody/something): làm cho ai/cái gì khác biệt với ai/cái gì. \n" +
                    "Cut back on something: cắt giảm. \n" +
                    "Keep out of something: đứng ngoài, không tham gia vào việc gì.\n" +
                    "Dịch: Trong cuốn tiểu thuyết, Hadji Murat là một nhân vật quan trọng trong số những người Chechen, nhưng ông đã bất đồng với lãnh đạo chính Sheikh Shamil sau một cuộc tranh luận.\n",
            ": Đáp án C\n" +
            "Speak up: nói to lên. \n" +
            "Get up: thức dậy; tổ chức, sắp xếp. \n" +
            "Do up: buộc (dây giày); buộc lại thành bó; sửa sang hay trang trí một tòa nhà. \n" +
            "Call up: gọi điện; hồi tưởng, nhớ lại.\n" +
            "Dịch nghĩa: Tôi không thể nghe thấy những gì Angel đã cố gắng nói với tôi qua điện thoại, vì vậy tôi đã yêu cầu anh ấy nói to lên.\n","Đáp án D\n" +
            "Grow apart: mối quan hệ dần thay đổi, ngày càng xa cách, ít gần gũi hơn. \n" +
            "Tear up: nhổ bật, cậy lên; xé vụn ra. \n" +
            "Break down: (máy móc) hỏng hóc; thất bại do sự bất đồng; chia nhỏ thông tin cho dễ hiểu. \n" +
            "Pull off: hoàn thành thành công; cởi ra.\n" +
            "Dịch: Brigit và Leticia rất gần gũi khi họ ở trường cùng nhau, nhưng, khi họ theo đuổi sự nghiệp của riêng mình, họ bắt đầu ngày càng xa cách\n"
            ,"Đáp án D\n" +
            "Come to: đạt tổng số là. \n" +
            "Hold out: đưa ra; tiếp tục chịu đựng cho đến khi có cứu viện. \n" +
            "Pay up: trả nợ, trả góp. \n" +
            "Pass as/for: bị nhầm là, được coi là.\n" +
            "Dịch: Tổng chi phí của tất cả các bài học lái xe của bà Harrell lên đến 6.000 bảng Anh.\n",
            "Đáp án A\n" +
            "Fill in: điền vào (đơn, chỗ trống). \n" +
            "Hand out: phân phát; ban phát. \n" +
            "Do with: có liên quan đến; thích cái gì/làm gì. \n" +
            "Work up: kích động, chọc tức.\n" +
            "Dịch: Để nộp đơn xin cấp thẻ tín dụng, Tom phải điền vào bảng mẫu bốn trang tại ngân hàng.\n","Đáp án C\n" +
            "Match up with: hài hòa, phù hợp với.\n" +
            "Face up to: đương đầu với. \n" +
            "Cut down on: cắt giảm. \n" +
            "Try out for: cạnh tranh trong một cuộc đấu thể thao hay để giành được một vai diễn.\n" +
            "Dịch: Những bài tường thuật của Plato về triết gia Socrates không phải lúc nào cũng phù hợp với những gì mà Xenophon để lại\n",
            ": Đáp án D\n" +
                    "Look down on somebody: coi thường, coi khinh ai. \n" +
                    "Run out of: hết, không còn nữa; rời bỏ. \n" +
                    "Back out of: rút lại lời nói, không làm như điều đã nói. \n" +
                    "Get through with somebody: giải quyết xong vấn đề với ai, nói xong điều gì với ai.\n" +
                    "Dịch nghĩa: Trong tác phẩm \"The Lawless Roads\", Graham Greene coi thường những người ở Mexico bằng cách miêu tả họ với một cung cách kẻ bề trên cao cấp.\n","Đáp án A\n" +
            "Push in: chen vào đứng trước ai đó khi xếp hàng. \n" +
            "Try on: thử.\n" +
            "Break up: tan rã; kết thúc, chấm dứt. \n" +
            "Cut off: cắt bỏ, cắt đứt; ngắt.\n Dịch: Trong khi Barbara đang xếp hàng đợi thanh toán, một người đàn ông thô lỗ đã chen lên ngay trước mặt cô ấy.","Đáp án C\n" +
            "Stand for: là từ viết tắt của từ/cụm từ nào đó.\n" +
            "Read over: đọc để kiểm tra lại. \n" +
            "Do in: thủ tiêu, giết; kiệt sức. \n" +
            "Count down: đếm ngược, chờ thời khắc điều gì xảy ra.\n" +
            "Dịch: Tên viết tắt IAEA là viết tắt của International Atomic Energy Agency (Cơ quan Năng lượng nguyên tử Quốc tế), cơ quan mà nhằm ngăn chặn việc xây dựng vũ khí hạt nhân.\n","Đáp án C\n" +
            "Put up with: chịu đựng ai/cái gì. \n" +
            "Run away with: đánh cắp; trốn đi; áp đảo, lấn át. \n" +
            "Cut down on: cắt giảm.\n" +
            "Get away with: làm điều gì đó xấu mà không bị phạt hay chỉ trích.\n" +
            "Dịch: Monica đã rất tức giận về tiếng ồn mà hàng xóm của cô gây ra đến nỗi mà cô không thể chịu đựng được nữa\n","Đáp án A\n" +
            "Drop by: ghé qua. \n" +
            "Give in: gao nộp; đầu hàng. \n" +
            "Put up: xây dựng, lắp đặt; dựng lên, đưa lên. \n" +
            "Call off: hủy bỏ.\n" +
            "Dịch:Jeanne nói rằng cô ấy sẽ ghé qua chỗ chúng tôi chiều nay nếu cô ấy có đủ thời gian trước khi cô ấy phải quay trở lại làm việc\n","Đáp án D\n" +
            "Blow up: cho nổ tung, vỡ tan thành từng mảnh. \n" +
            "Shoot off: bào (gỗ). \n" +
            "Strike in: xen vào (một cuộc hội thoại, thảo luận). \n Pour out: làm đầy.\n" +
            "Dịch: Vào cuối phim Thelma và Louise, một chiếc xe tải lớn bị làm nổ tung bởi các nhân vật chính khi họ bắn bình nhiên liệu đầy xăng của nó.\n",
            "Đáp án B\n" +
                    "Come up with the idea: đưa ra ý tưởng, nảy ra ý tưởng. \n" +
                    "Look forward to: mong đợi, trông chờ. \n" +
                    "Keep up with: theo kịp, tiếp tục tìm hiểu về điều gì để cập nhật những thông tin mới nhất. \n" +
                    "Run out of: rời khỏi; dùng hết, cạn kiệt.\n" +
                    "Dịch: Muhammad Yunus người Bangladesh đã đưa ra ý tưởng về tín dụng nhỏ để chống lại đói nghèo, và điều này đã giúp ông giành giải Nobel hòa bình năm nay.\n","Đáp án D\n" +
            "break into: đột nhập \n" +
            "break off: long ra \n" +
            "break up: chia tay, cắt đứt quan hệ \n" +
            "break out: bùng nổ \n" +
            "Dịch: Những người lính cứu hỏa đã phải đột nhập vào phòng để cứu lũ trẻ.\n",": Đáp án D\n" +
            "put away: giết/ để dành (tiền) \n" +
            "put in: thi hành, đưa ra (luật) \n" +
            "put down: đàn áp \n" +
            "put up: treo, đưa lên, tiến cứ \n" +
            "Dịch: Ở trang trại, khi gia súc quá ốm,người nông dân thường phải giết chúng đi\n",": Đáp án A\n" +
            "bring up: nuôi nấng \n" +
            "get up: thức dậy \n" +
            "grow up: lớn lên \n" +
            "wake up: thức dậy \n" +
            " Dịch: Tôi muốn có thể nuôi các con mình ở nông thôn","Đáp án B\n" +
            "take off: cất cánh \n" +
            "take on: đảm nhận \n" +
            "take up: bắt đầu \n" +
            "put off: trì hoãn \n" +
            "Dịch: Chuyến bay của chúng tôi đã bị trì hoãn, nhưng chúng tôi cuối cùng cũng đã cất cánh ngay sau nửa đêm\n","Đáp án B\n" +
            "wear out: hao mòn \n" +
            "take out: rút ra \n" +
            "let out: tiết lộ, nới rộng \n" +
            "go out: đi ra ngoài, giao thiệp \n" +
            "Dịch: Cô ấy sẽ không mua thêm bất kì quần áo mới nào cho tới khi những cái của cô ấy bị hỏng.\n",
            "Đáp án D\n" +
                    "stay away from: cách ly khỏi \n" +
                    "take care of = look after: chăm sóc \n" +
                    "get away: đi xa \n" +
                    "Dịch nghĩa: Các bệnh nhân nhiễm H5N1 phải cách li khỏi nhữn người khác để ngăn chặn virut lây lan\n","Đáp án B\n" +
            "let me down: làm tôi thất vọng \n" +
            "turn up: xuất hiện \n" +
            "turn me off: làm tôi khó chịu \n" +
            "turn out: hóa ra là \n" +
            "Dịch nghĩa: Bất cứ khi nào tôi có vấn đề, Jane luôn luôn rất đáng tin cậy. Cô ấy không bao giờ làm tôi thất vọng.\n","Đáp án A\n" +
            "put sb up: cho (ai đó) ngủ lại một đêm \n" +
            "put sb through: cho qua \n" +
            "put...away: cất đi \n" +
            "put...aside: để sang một bên \n" +
            "DỊch: Trễ quá rồi, bây giờ bạn không nên đi. Đừng lo. Chúng tôi có thể cho bạn ngủ nhờ một đêm.\n","Đáp án D\n" +
            "come away: rời khỏi \n" +
            "come to: đến \n" +
            "come in: mời vào \n" +
            "come round: ghé thăm \n" +
            "Dịch nghĩa: Hãy ghé chơi và gặp chúng tôi khi bạn có thời gian nhé. Bạn lúc nào cũng được chào đón.\n","Đáp án A\n" +
            "put up with: chịu đựng \n" +
            "take away from: lấy đi từ \n" +
            "get back to: trở về với \n" +
            "make out of: được làm bằng \n" +
            "DỊch: Tôi không thể chịu đựng tiếng ồn này thêm nữa. Tôi sẽ viết một lá thư phàn nàn đến chính quyền địa phương về vấn đề này\n","Đáp án B\n" +
            "take over: nắm quyền, giữ chức vụ \n" +
            "come over: vượt qua\n" +
            "take up: bắt đầu \n" +
            "take off: cất cánh \n" +
            "Dịch: Nhà quản lý mới đặt ra những quy định rất nghiêm ngặt ngay sau khi ông ta tiếp quản vị trí này.\n",
            "Đáp án A\n" +
                    "put st away: đặt vật lại đúng chỗ (ban đầu của nó) \n" +
                    "pick sb/st off: kéo ai/ cái gì ra khỏi chỗ nào đó \n" +
                    "collect up: thu nhặt \n" +
                    "catch on: trở nên thịnh hành \n" +
                    "Dịch nghĩa: Trẻ em nên được dạy rằng chúng phải cất mọi thứ về chỗ cũ sau khi dùng nó.\n",
    "Đáp án A\n" +
            "come up with: to think of, to produce: nảy ra, nghĩ ra, sản xuất ra \n" +
            "think over: nghĩ \n" +
            "get round to: xoay sở làm gì, có thời gian làm gì \n" +
            "look into: tìm hiểu, điều tra kỹ. \n" +
            "Dịch: Mọi người đều biết về vấn đề ô nhiễm, nhưng không nhiều người đưa ra bất kỳ giải pháp nào.\n",
    "Đáp án A \n"+"get away with it: trốn tránh, thoái thác, thoát tội \n" +
            "put up with it: chịu đựng\n" +
            "take it over: đảm nhận\n" +
            "come round to it: dần dần chấp nhận \n" +
            "Dịch: Nhiều nhà máy vi phạm luật chống ô nhiễm và trốn tội.\n","Đáp án A\n" +
            "deal with: đương đầu với, giải quyết \n" +
            "carry out: tiến hành \n" +
            "put up=raise: xây dựng lên, tăng lên \n" +
            "get away: trốn đi, rời đi \n" +
            "Dịch: Xử lý chất thải và rác thải là một vấn đề khó khăn để giải quyết\n",
    "Đáp án A\n" +
            "take up: bắt đầu \n" +
            "set up: thiết lập\n" +
            "rely on: dựa vào, tin tưởng \n" +
            "get round to: xoay sở làm gì, có thời gian làm gì \n" +
            "Dịch: Hầu hết mọi người ở các thành phố nên đi xe đạp thay vì sử dụng ô tô\n",
    "Đáp án D\n" +
            "put off: hoãn \n" +
            "make up for: đền bù \n" +
            "do without: làm mà không cần... \n" +
            "take after = resemble: giống nhau \n" +
            "Dịch: Hầu hết các chính phủ dường như chỉ trì hoãn giải quyết vấn đề môi trường.\n",
    "Đáp án B\n" +
            "laugh off:cười tỏ ra không quan tâm đến cái gì; cười xoà; cười trừ \n" +
            "run something down: bôi nhọ, gièm pha; chết \n" +
            "call off: hủy bỏ \n" +
            "turn down: từ chối, bác bỏ lời đề nghị \n"+"Dịch: Báo chí cho rằng ông bầu bóng đá sẽ bị chán nản bởi việc sa thải ông nhưng ông chỉ cười trừ\n",
    "Đáp án A\n" +
            "do up: Tân trang, sửa chữa \n" +
            "do over: bắt đầu lại việc gì mà lần đầu làm không tốt \n" +
            "do away with: loại bỏ \n" +
            "do without: làm việc mà không có thứ gì \n" +
            "Dịch: Hôm nay, chúng tôi đang tân trang bếp của chúng tôi và chúng tôi có thể làm với sơn nhiều hơn\n",
    "Đáp án B\n" +
            "go off: (đồng hồ) reo; rời đi,.... \n" +
            "go over: học kĩ, ôn lại \n" +
            "go in: đi vào \n" +
            "go up: tăng \n" +
            "Dịch: Cô ta dậy lúc báo thức kêu.\n",
    "Đáp án A\n" +
            "put out: dập tắt (lửa) \n" +
            "put in: lắp đặt, thực hiện \n" +
            "put up: xây dựng nên, tăng lên \n" +
            "put off: trì hoãn \n" +
            "Dịch: Dập bỏ điếu thuốc đi. Tôi không thích mùi của nó.\n",
    "Đáp án C\n" +
            "show up: xuất hiện \n" +
            "Dịch: 16 người đã tham gia khóa huấn luyện bóng chuyền\n",
    "Đáp án D\n" +
            "bring up: đề cập đến, nuôi nấng \n" +
            "bring off: đạt được \n" +
            "bring forward: gây tranh cãi; làm xảy ra nhanh hơn \n"
    +"bring over: làm cho ai thay đổi lối suy nghĩ, thuyết phục; đưa ai đến chơi\n" +
            "Dịch: Bạn đã được nuôi nấng trong thành phố hay ở nông thôn?\n"};
    ArrayList<Integer> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cum_dong_tu);
        hienthi=(TextView)findViewById(R.id.text_show_cumdongtu);
        goiy=(TextView)findViewById(R.id.texttext_cumdongtu);
        textscore=(TextView)findViewById(R.id.score_cumdongtu);
        cau=(TextView)findViewById(R.id.cau_cumdongtu);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(CumDongTu.this,R.raw.correct);
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
                goiyy.setText(goiy_dapan[list.get(stt)]);
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
                    Intent intent = new Intent(CumDongTu.this, HoanThanh.class);
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
                    goiyy.setText("");


                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    goiyy.setText("");
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

                    Intent intent = new Intent(CumDongTu.this, HoanThanh.class);
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
                    goiyy.setText("");
                    textscore.setText(score+"/40");

                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    solansai+=1 ;

                    goiyy.setText("");

                    updatequestion();



                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==39)
                {
                    Intent intent = new Intent(CumDongTu.this, HoanThanh.class);
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
                    goiyy.setText("");
                    textscore.setText(score+"/40");

                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    solansai+=1 ;
                    goiyy.setText("");
                    updatequestion();



                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stt==39)
                {
                    Intent intent = new Intent(CumDongTu.this, HoanThanh.class);
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
                    goiyy.setText("");
                    textscore.setText(score+"/40");
                    score+=1;


                }else{
                    Toasty.normal(getApplicationContext(),"Rất tiếc " +current_answer +" là đáp án đúng",
                            Toast.LENGTH_LONG).show();
                    stt+=1;
                    socau+=1;
                    solansai+=1 ;
                    goiyy.setText("");
                    updatequestion();


                }

            }
        });
    }
    @Override
    public void onBackPressed() {


        Intent intent = new Intent(CumDongTu.this, Onthi.class);
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
        goiyy=(TextView)findViewById(R.id.goiy_cumdongtu);
        hienthi=(TextView)findViewById(R.id.text_show_cumdongtu);
        button1=(Button)findViewById(R.id.button1_cumdongtu);
        button2=(Button)findViewById(R.id.button2_cumdongtu);
        button3=(Button)findViewById(R.id.button3_cumdongtu);
        button4=(Button)findViewById(R.id.button4_cumdongtu);

    }
}
