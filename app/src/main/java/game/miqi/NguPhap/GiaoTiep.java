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

public class GiaoTiep extends AppCompatActivity {
    TextView hienthi,goiy,textscore,cau;
    String current_answer ;
    Button button1,button2,button3,button4 ;
    int stt= 0 ;
    int socau=1;
    MediaPlayer mediaPlayer;
    TextView goiyy;
    int score=0;
    int solansai=0;
    ArrayList<Integer> list;
    String[]question={"Mary: “May I leave a message for Mrs. Davis?”\n" +
            "Thomas: “_________”", //1
    "Dan: “It was very kind of you to help me out, Paul?”\n" +
            "Paul: “_________”", // 2
    "David; “ Thank you for the delicious meal”"  +"\n"+ " Joan: “ _______ ”", //3
    "Susan: \"Sorry, Brian is not here\"" +"\n"+" Peter: \" _____________\"",//4
    "Thomas and Peter are meeting after a long time.\n" +
            "Thomas: “How have you been recently?” Peter: “_____”", //5
    "George and Frankie are talking about their hobbies.\n" +
            "George: “In my opinion, action films are exciting”. Frankie: “__”" ,
    "Lucy is going to do some shopping. Ann offers to help her.\n" +
            "Ann: “ Would you like me to get you a taxi?”  Lucy: “___“" ,//6
            "Jeanne and Mike are talking about Bonnie.\n" +
                    "Jeanne: “__”   Mike: “ Really? What did he say?” \n",//7
            "Hoa and her neighbor are talking to each other in Hoa‟s house." +
                    "Neighbor: Do you mind if l borrow your plate?\n" +
                    "Hoa: ________Do you need only one?",//8
            "Peter : “Would you like to join our volunteer group this summer vacation!”\n" +
                    "Mary: ________", //9
            "Mary: “Would you mind if I use your computer for an hour?” Tony:\"_____”", //10
            "Tom: \"Do you think it's going to rain?“ ~ Trump: “_______”" ,//11
            "Jenny: “ Is it all right if I use your bike?” – Peter: “___________”",//12
            "Jean: “It was very kind of you to help me out, John”. – John: “ _________”", //13
                    "- Diana:” Our midterm exams will start next Tuesday, are you ready?”\n" +
                    "- Anne:” ______”", //14
                    "- Mary:” Can you tell me how to find material for my science report, professor?”\n" +
                    "- Professor:”______”",//15
                    "- Diana: “ That new hairstyle suits you perfectly, Anne.”\n" +
                    "- Anne “ ......”", //16
            "Mary is talking to a porter in the hotel lobby\n" +
                    "Porter: “Shall I help you with your suitcase?”"+"Mary: “_____.”\n",//17
            "John: “Do you fancy a drink?” -Catherine: “______”",//18
            "“Excuse me, can you tell me where I can catch a bus to London, please?”___",//19
            "“Excuse me, is anybody sitting here?”- “______”.",//20
            "“How can this dress be so expensive?”-“ ”___",//21
            "Your friend:” Do you want another serving of chicken soup?” – You: “___”" , //22
            "You want to address an envelope to whole family. You write: ____.",//23
            "“ Has an annoucement been made about the eight o‟clock flight to Paris?”\n" +
                    "- “______”",//24
            "-“ I can speak English well enough to apply for that post.”\n" +
                    "-“_____”", //25
            "Laura: “ What shall we do this evening?- Annie: “ _____”",//26
            "Kathy: “Make yourself at home” – Jim: “ ______”",//27
            "Marie accidentally stepped on Jane‟s foot\n" +
                    "~ Marie: “ Oops! I‟m sorry, Jane.” ~ Jane: “ ______”",//28
                    "~Tuan: “ Wow, I‟ve never seen such a nice cell phone, Khai”. ~ Khai: “ _____”",//29
            "Diana: “Do you like the advanced training course you are taking, Anne?”\n" +
                    "- Anne: “_____”",//30
            "“Hello. Could I speak to the manager, please?” – “____”",//31
            "John: Do you think that we should use public transportation to protect our\n" +
                    "environment? - Laura: _____________.",//32
            "- Jane: Tom‟s the best singer in our school.\n" +
                    "- Mary: _____________.",//33
            "Susan accidentally stepped on Denise‟s foot.\n" +
                    "~Susan: “Oops! I‟m sorry, Denise.” ~Denise: “___”",//34
                    "~Mai: “Wow, I‟ve never seen such a nice cell phone, Nam” ~Nam: “____”.",//35
                    "- Diana: “Look at this catalog, Anne. I think I want to get this red blouse.”\n" +
                    "- Anne: “ _______”",//36
            "Mary invited her friend, Sarah, to have dinner out that night and Sarah accepted.\n" +
                    "- Mary: “Shall we eat out tonight?”\n"+
                    "Sarah: “_______”",//37
            "“Your boss looks like the aggressive type” – “_____.”",//38
            "“We‟ve been there before.” - “_____.”",//39
            "Is it all right if I use your bike?",//40
            "What do you think about the election?",//41
            "- What did I do wrong? - ______",//42
            "Do you like my new shoes? - _____",//43
            "- Hello, Elena. What are you looking for?",//44
            "- I can‟t stop worrying about my exam tomorrow. -______.",//45
            "Do you like going to school? - ____",//46
            "Help me with this! - ______",//47
            "“Shall we eat out tonight?” – “_____.”",//48
            "“You have a wonderful garden!” – “_____.”",//49
            "Mrs Mai: “ ........................” -> Mr. Brown: “ Thank you. We are proud of him.”",//50
            "John: “What time did the meeting end?'' Laura: “_______.\""


    }; ;
    String[][] traloi={{"I‟m afraid she is not here at the moment.","No, she‟s not here now.","She‟s leaving a message for you now.","Yes, I‟ll make sure she gets it."},
            {"I‟m glad you like it","Thanks a million.","That was the least I could do.","You can say that again."},
            {"I‟m glad you enjoyed it","No problem","Never wonder","all right"},
            {"Can I speak to Brian, please?","Would you like to leave a message?", "Can I leave a message, then?", "Can I take a message then?"},
            {"I am going on holiday next week.","Pretty busy, I think.","By car, usually.","I am working here."},
            {"What are opinion!","There‟s no doubt about it.","Yes, you can do it.","Your opinion is exactly."},
            {"That would be delightful. Thanks.","Well, let‟s see.","Yes, I see.","Yes, please if it‟s no bother."},
            {"Can you call Bonnie tomorrow?","I ran into Bonnie on the way to work","Is Bonnie the one who won the lottery?","Bonnie just went to California for a holiday."},
            {"Not at all","Yes, l do","I'm sorry","Yes, I would"},
            {"Do you think l would?","l wouldn‟t. Thank you.","Yes, you‟re a good friend.","Yes, l'd love to. Thanks."},
            {"Not at all. I've finished my job","Yes, you can use it","Of course not. I still need it now","Yes. It‟s all right."},
            {"I hope so","I don't hope so","I hope not","I think not"},
            {"Sure, go head!","I accept it","Oh, forget it.","I don‟t care"},
            {"You can say that again.","Thanks a million","That was the least I could do","I‟m glad you like it."},
            {"I‟m half ready.","God save you.","Thank you so much","Don‟t mention it!"},
            {"I like it that you understand.","Try your best, Mary.","You can borrow books from the library.","You mean the podcasts from other students?"},
            {"Never mind","Don't mention it","Thank you","You re welcome."},
            {"Not a chance.","That's very kind of you.","I can‟t agree more.","What a pity!"},
            {"No, ever!","I‟m not sure I do. Thank all the same","I don‟t want","It is none of your business"},
            {"Sure, go ahead","Sorry, I‟m new here myself","OK. Here‟s your ticket","Yes, please"},
            {"No, thanks","Yes, I am so glad","Sorry, the seat is taken","Yes, yes. You can sit here"},
            {"Yes, it‟s the most expensive","What an expensive dress!","You‟re paying for the brand","That‟s a good idea"},
          /*22*/  {"No way","No comment","No, thanks","No longer"},
            {"Mr. and Mrs. Wilson and family","Family Wilson","Family Mr. and Mrs. Wilson","Mr. and Mrs. Wilson and other members"},
            {"Not yet","Yes, it was","I don‟t think that","Sorry, I don‟t"},
            {"Me neither","Me too","Me either","Me also"},
            {"I went out for dinner","Oh, that‟s bad!","No problem","Let‟s go out for dinner."},
            {"Yes. Can I help you?","Not at all. Don‟t mention it.","That‟s very kind. Thank you.","Thanks! Same to you."},
          /*28*/  {"It‟s alright","You shouldn‟t do that.","You are welcome","It‟s nonsense."},
            {"Thank you. I‟m glad you like it","Oh, I don‟t know","You‟re welcome","I agree with you."},
           {"No, thanks.","No, not everyone.","By and large, yes.","Not me, I‟m still waiting."},
            {"No, you can‟t.","Hello. But could you?","Yes, speaking.","I‟m answering you now."},
            {"Yes, it‟s an absurd idea.","There‟s no doubt about it.","Of course not. You bet.","Well, that‟s very surprising."},
            {"Yes, tell me about it!","That‟s OK!","I can‟t agree with you more!","Yes, please."},
            {"You shouldn‟t do that.","It‟s alright.","You are welcome.","It‟s nonsense."},
            {"Oh, I don‟t know.","Thank you. I‟m glad you like it.","You‟re welcome.","I agree with you."},
           {"Don‟t you have one like this in blue?","I‟ll go myself, then.","That‟s a long way to go, dear.","No, thank you."},
          {"That‟s a great idea","That‟s acceptable.","See you next time.","You are very welcome."},
           {"Yes, he really wants to get ahead","Yes, he‟s quite gentle","Really? I‟ve never seen him lie","Right. He‟s so quiet"},
            {"Oh, have we?","How nice!","How lovely!","No, we didn‟t."},
            {"Pleace accept it with my best wishes.","Go straight ahead","Sure, go ahead","Oh, sorry"},
            {"I must be off. Thank you","The Democratic Party had to win","Really? The Repullican Party won","The Democratic should have won"},
            {"You didn‟t have to connect these two wires.","You shouldn‟t connect these two wires like that","You shouldn‟t have connected these two wires.","You mustn‟t connect these two wires like that."},
            {"Where did you buy them?","How long are they?","Would you like them?","Thank you."},
           {"I need some information for a sports project","I can‟t find anything","I‟m sorry. I can‟t","No, I‟m just looking."},
          /*45*/  {"That‟s all right. Never mind.","I‟m sure you‟ll do well.","Ok. It doesn‟t matter.","Of course. So am I"},
            {"I usually visit my friends and sometimes I go to the cinema.","Yes, I do. I have lots of friends there.","Yes, I have one brother and one sister.","Geography. It‟s very interesting."},
            {"I come at once!","Just a minute!","Moment!","Wait on!"},
           {"That‟s understandable.","That‟s a great idea.","It is very kind of you to invite me.","You are very welcome."},
            {"I can‟t believe it!","It‟s my pleasure.","Yours is great too!","Don‟t mention it!"},
            {"Your kid is naughty.","Can we ask your child to take a photo?","Your child is just adirable.","I can give your kid a lift to school."},
            {"As soon as possible.","For half an hour.","In a minute.","Just before lunch."}};


    String[] Correct={"Yes, I‟ll make sure she gets it.","That was the least I could do.","I‟m glad you enjoyed it",
    "Can I leave a message, then?","Pretty busy, I think.","There‟s no doubt about it.",
            "Yes, please if it‟s no bother.","I ran into Bonnie on the way to work","Not at all",
            "Yes, l'd love to. Thanks.","Not at all. I've finished my job","I don't hope so",
            "Sure, go head!","That was the least I could do","I‟m half ready.","You can borrow books from the library.",
    "Thank you","That's very kind of you.","I‟m not sure I do. Thank all the same"
            ,"Sorry, I‟m new here myself","Sorry, the seat is taken",
    "You‟re paying for the brand","No, thanks","Mr. and Mrs. Wilson and family","Not yet","Me too",
            "Let‟s go out for dinner.",
    "That‟s very kind. Thank you.","It‟s alright","Thank you. I‟m glad you like it","By and large, yes.",
            "Yes, speaking.","There‟s no doubt about it.","I can‟t agree with you more!","It‟s alright.","Thank you. I‟m glad you like it.",
    "Don‟t you have one like this in blue?","That‟s a great idea","Yes, he really wants to get ahead","Oh, have we?","Sure, go ahead",
            "The Democratic should have won","You shouldn‟t have connected these two wires.","Where did you buy them?",
    "I need some information for a sports project","I‟m sure you‟ll do well.",
            "Yes, I do. I have lots of friends there.","Just a minute!","That‟s a great idea.","Yours is great too!",
            "Your child is just adirable.","Just before lunch."};
    String[] goiy_dapan= {"A: Tôi e rằng bà ấy không có ở đây lúc này.\n" +
            "B: Không cô ấy không có mặt ở đây lúc này.\n" +
            "C: Cô ấy sẽ gửi lời nhắn cho bạn ngay bây giờ.\n" +
            "D: Vâng, tôi sẽ chắc chắn rằng cô ấy nhận được.\n"+
            "Dịch: tôi có thể để lại tin nhắn cho Mrs.Davis?", //1

            "I‟m glad you like it. : Tôi mừng là bạn thích nó.\n" +
            "Thanks a million. : Cảm ơn rất nhiều.\n" +
            "That was the least I could do. : Đó là điều ít nhất mà tôi có thể làm.\n" +
            "You can say that again. : Bạn có thể nói lại điều đó.\n" +
            "",//2
            "David: “Cám ơn vì bữa tối rất ngon miệng.” Joan: “________”\n" +
            "A.Tôi rất vui vì bạn thích nó.\n" +
            "B.Không vấn đề gì.\n" +
            "C.Đừng bao giờ tự hỏi.\n" +
            "D.Ổn thôi", //3
            "Leave a message: để lại lời nhắn qua điện thoại\n" +
            "Susan: “Xin lỗi, Brian không ở đây.” Peter:”tôi có thể để lại lời nhắn không?”", //4

            "Thomas và Peter gặp nhau sau 1 khoảng thời gian dài\n" +
            "Thomas: Cậu dạo này thế nào?  Peter: ....\n" +
            "A: Mình sẽ đi nghỉ tuần tới\n" +
            "B: Mình khá là bận rộn\n" +
            "C: Mình thường đi bằng ô tô\n" +
            "D: Mình đang làm ở đây", //5
            "George: Theo ý kiến mình, phim hành động rất là thú vị\n" +
            "Frankie:____" +
    "A: Đúng là ý kiến!\n" +
            "B: Không nghi ngờ gì nữa\n" +
            "C: Đúng, cậu có thể làm được mà\n" +
            "D: Ý kiến của cậu thật chính xác",
    "Lucy định đi mua sắm. Ann đề nghị giúp đỡ cô ấy.\n" +
            "Ann: “ Mình đón taxi cho bạn nhé!”\n" +
            "A.Điều đó thật thú vị. Cảm ơn.\n" +
            "B. À, chúng ta cùng chờ xem nhé.\n"+
            "C. Ừm, mình biết rồi.\n" +
            "D. Vâng, làm ơn nếu điều đó không phiền bạn.",
            "Jeanne: “ . “ Mike: “ Thật à. Anh ấy đã nói gì?”\n" +
            "A.Ngày mai bạn có thể gọi điện cho Bonnie được không?\n" +
            "B. Mình tình cờ gặp Bonnie trên đường đi làm.\n" +
            "C.Có phải Bonnie là người đã trúng xổ số không?\n" +
            "D.Bonnie vừa mới đến California nghỉ mát.",
    "A.Không Có gì B. Có \n"+" C. Tôi xin lỗi D. Có, tôi sẽ",
    "Bạn có muốn tham gia vào nhóm tình nguyện kỳ nghỉ hè này không? Mary: ......\n" +
            "A. Bạn nghĩ là tôi có à\n" +
            "B. Tôi không, cảm ơn bạn\n" +
            "C. Có, bạn là 1 người bạn tốt\n" +
            "D. Có, tôi rất thich, cảm ơn bạn",
    "Bạn có phiền không nếu tôi dùng máy tính của bạn?\n" +
            "Tony: ....."+
            "A. Không có gì. Tôi làm xong việc rồi\n" +
            "B. Có, bạn có thể dùng nó\n" +
            "C. Dĩ nhiên là không. Tôi vẫn đang cần nó\n" +
            "D. Có, được thôi",
    "Tom: Bạn có nghĩ trời sẽ mưa không?\n" +
            "Trump: .........\n" +
            "A. Tôi không hi vọng vậy\n" +
            "B. Tôi không hi vọng vậy\n" +
            "C. Tôi hi vọng là không\n" +
            "D. Tôi nghĩ là không",
    "Jenny: “ Mình dùng xe đạp của của cậu có được không?” John:__\n" +
            "A. Chắc chắn rồi. Cứ tự nhiên nhé.\n" +
            "B. Mình chấp nhận\n" +
            "C. Ồ, quên nó đi.\n" +
            "D. Mình chả quan tâm",
    "Jean: “ Cậu thật tốt vì đã giúp đỡ mình”. John:__\n" +
            "A. Cậu nói lại đi\n" +
            "B. Cảm ơn nhiều\n" +
            "C. Đó là ít nhất mình có thể làm.\n" +
            "D. Mình rất vui vì cậu thích nó.",
            "A. Mình ôn được một nửa rồi.\n" +
            "B. Chúa sẽ phù hộ cho bạn.\n" +
            "C. Cảm ơn nhiều nhé.\n" +
            "D. Đừng bận tâm đến nó.",
            "A.Thầy vui vì em đã hiểu. B.Cố hết sức nhé Mary.\n" +
            "C.Em có thể mượn sách từ thư viện. D.Ý em là những bản audio từ những học sinh khác?",
    "- Kiểu tóc mới này hoàn toàn hợp với cậu, Anne:___\n" +
            "A. Never mind: đừng bận tâm\n" +
            "B. Don‟t mention it: Đừng nhắc đến nó\n" +
            "D. You‟re welcome: không có gì (Đáp lại 1 lời cảm ơn)",
    "Tôi có thể giúp bà với chiếc vali không?\n" +
            "- Anh thật tốt bụng\n" +
            "A. Not a chance: Không đời nào, Chẳng bao giờ\n" +
            "C. I can‟t agree more: tôi không thể đồng ý hơn nữa\n" +
            "D. What a pity: thật đáng tiếc!",
    "John: “ Bạn muốn uống gì không?”\n" +
            "A.Không, chưa bao giờ.\n" +
            "B.Tôi không chắc có muốn hay không,cảm ơn tất cả.\n" +
            "C.Tôi không muốn giống như vậy.\n" +
            "D.Không phải việc của bạn.",
    "“ Xin lỗi bạn có thể cho tôi biết tôi có thể đón xe buýt đến Luân Đôn ở đâu không?”\n" +
            "A.Chắc chắn rồi. Cứ làm đi \n "+
            "B.Xin lỗi, tôi mới đến đây.\n" +
            "C.Được rồi. Vé của bạn đây.\n"+
            "D.Vâng, làm ơn.",
    "“Xin lỗi, có ai ngồi ở đây không? ____ \n"+
    "A.Không, cảm ơn. \n" +
            "B. Vâng, tôi rất vui lòng. \n"+
    "C.Xin lỗi, chỗ này có người ngồi rồi\n" +"" +
            "D.Có, có. Bạn có thể ngồi đây.",
    "“Sao chiếc váy này có thể đắt như thế được?”\n" +
            "A.Vâng, nó là cái đắt nhất.\n" +
            "B.Thật là một chiếc váy đắt tiền.\n" +
            "C.Tiền nào của nấy./ Hàng hiệu nên thế.\n" +
            "D.Ý kiến hay đó.",
    "Bạn của bạn: “ Bạn có muốn thêm 1 bát canh gà nữa không?”\n" +
            "A.Không đời nào. B. Miễn bình luận.\n" +
            "C. Không, cảm ơn. D. Không còn nữa.",
    "Bạn muốn chuyển phong thư cho cả gia đình. Bạn viết:\n" +
            "A.Ông và Bà Wilson và cả nhà B. Gia đình Wilson\n" +
            "C. Gia đình ông bà Wilson \n"+"D. Ông và Bà Wilson và những thành viên khác",
    "Đã có thông báo về chuyến bay 8h đến Paris chưa?\n" +
            "- Chưa (chưa có thông báo)",
    "Tớ nói tiếng anh đủ tốt để ứng cử cho vị trí đó\n" +
            "- Tớ cũng vậy\n" +
            "Neither và either được dùng cho câu phủ định\n" +
            "Me also không đúng ngữ pháp",
    "Laura. “ Chúng ta sẽ làm gì tối nay?” Annie:___\n" +
            "A.Tớ đã đi ra ngoài ăn tối.\n" +
            "B.Ồ. Thật là tồi.\n" +
            "C.Không vấn đề.\n" +
            "D.Chúng ta cùng ra ngoài ăn tối nhé.",
    "Kathy:“ Cứ tự nhiên như ở nhà nhé”. Jim:___\n" +
            "A. Vâng. Tôi có thể giúp gì cho anh?\n" +
            "B. Không tẹo nào. Đừng đề cập đến nó.\n" +
            "C. Thật là tốt. Cảm ơn cậu nhé.\n" +
            "D. Cảm ơn. Cậu cũng thế nhé.",
    "Marie vô tình dẫm lên chân của Jane.\n" +
            "~ Marie: “ Ôi! Mình xin lỗi nhé Jane.”~ Jane: “__”\n" +
            "A: Được rồi, không sao đâu\n" +
            "B: Cậu không nên làm thê.\n" +
            "C: Không cần cảm ơn mình đâu\n" +
            "D: Thật vô nghĩa.",
    "Tuấn: “ Wow, Mình chưa bao giờ thấy chiếc điện thoại nào đẹp như này”~ Khải: “__”\n" +
            "A: Cảm ơn nhé. Thật vui là cậu thích nó.\n" +
            "B: Ồ. Mình không biết.\n" +
            "C: Cậu không phải cảm ơn đâu.\n" +
            "D: Mình đồng ý với cậu.",
    "Diana: \"Bạn có thích khóa huấn luyện tiên tiến mà bạn đang học không, Anne?\"\n" +
            "Anne: “Nhìn chung, có. \"\n" +
            "A: Không, cảm ơn\n" +
            "B: Không, không phải tất cả mọi người\n" +
            "D: Không phải tôi, tôi vẫn đang đợi",
    "\"Chào bạn. Tôi có thể nói chuyện với người quản lý không? \"\n" +
            "- “Vâng, tôi đang nghe đây.”\n" +
            "A: Không, bạn ko thể\n" +
            "B: Xin chào. Nhưng bạn có thể?\n" +
            "D: Tôi sẽ trả lời bạn bây giờ",
    "(You bet = certaintly)\n" +
            "A. Đúng vậy, đó thật là một ý tưởng ngớ ngẩn. B. Không nghi ngờ gì về điều đó.\n" +
            "C. Tất nhiên không. Chắc chắn luôn. D. Ồ, điều này rất bất ngờ đấy.",
    "- Jane: Tom là ca sĩ hay nhất trong trường của chúng ta.\n" +
            "- Mary: ____\n"+"A. Có, hãy nói cho tôi về điều đó!\n" +
            "B. Được thôi!\n" +
            "C. Tôi không thể đồng ý hơn!\n" +
            "D. Vâng, làm ơn.",
    "Susan vô tình dẫm lên chân Denise\n" +
            "- Ối, tớ xin lỗi, Denise\n" +
            "- Không sao đâu./Ổn mà.\n" +
            "A.Cậu ko nên làm thế\n" +
            "C. Không có gì (dùng để đáp lại lời cám ơn)\n" +
            "D. Thật vô lý",
    "Wow, tớ chưa từng thấy chiếc điện thoại nào đẹp như vậy đó Nam\n" +
            "- Cám ơn, rất vui vì cậu thích nó\n" +
            "A . Ồ, tớ ko biết\n" +
            "C. Không có gì (dùng để đáp lại lời cám ơn)\n" +
            "D. Tớ đồng ý với cậu",
    "Diana:\"Nhìn vào catalog này, Anne. Tôi nghĩ rằng tôi muốn có chiếc áo đỏ này. \"\n" +
            "- Anne: \"_______\"\n" +
            "A. Không phải bạn đã có một cái như thế này màu xanh sao? B. Tôi sẽ tự làm việc này.\n" +
            "C. Đó là một chặng đường dài để đi, thân yêu. D. Không, cảm ơn bạn.",
    "Mary: \"Chúng ta sẽ ra ngoài ăn tối nay nhé?\"\n" +
            "- Sarah: \"_______\"\n" +
            "A. Đó là một ý tưởng tuyệt vời B. Điều đó chấp nhận được.\n" +
            "C. Hẹn gặp lại lần sau D. Bạn rất được hoan nghênh.",
    "Sếp của bạn trông giống như kiểu tích cực\n" +
            "- Vâng, anh ấy thực sự muốn tiến lên phía trước\n" +
            "B. Vâng, anh ấy khá là dịu dàng\n" +
            "C. Thật sao? Tớ chưa thấy anh ấy nói dối bao giờ\n" +
            "D. Đúng vậy. Anh ấy im lặng quá.",
    "Chúng ta đã từng đến đây.\n" +
            "- Ồ, thật sao?\n" +
            "B. Thật tuyệt!\n" +
            "C. THật đẹp!\n" +
            "D. Không chúng ta chưa. (thì đang dùng là thì quá khứ, trong khi câu gốc dùng thì hiện tại hoàn thành)",
    "Mình có thể dùng xe đạp của bạn được không?\n" +
            "A. Hãy chấp nhận những lời chúc tốt đẹp nhất của tôi.\n" +
            "B. Đi thẳng.\n" +
            "C. Chắc chắn rồi cứ tự nhiên.\n" +
            "D. Ôi, xin lỗi.",
    "Bạn nghĩ gì về cuộc bầu cử?\n" +
            "A.Tôi phải nghỉ rồi. Cảm ơn.\n" +
            "B.Đảng Dân chủ phải thắng.\n" +
            "C.Thật sao? Đảng Cộng hòa đã thắng.\n" +
            "D.Đảng Dân chủ đáng lẽ ra nên thắng.",
    "Tôi đã làm gì sai?\n" +
            "A.Bạn đã không phải nối hai dây điện này lại.\n" +
            "B.Bạn không nên nối hai dây điện lại như vậy.\n" +
            "C.Bạn đáng lẽ ra không nên nối hai dây điện này lại.\n" +
            "D.Bạn không được nối hai dây điện lại như thế này.",
    "Bạn thích giày mới của mình không?\n" +
            "A.Bạn đã mua chúng ở đâu?\n" +
            "B.Chúng dài bao nhiêu?\n" +
            "C.Bạn muốn chúng không?\n" +
            "D.Cảm ơn.",
    "- Chào Elena. Cậu đang tìm gì thế?\n" +
            "- Tớ cần một số thông tin cho một dự án thể thao\n" +
            "B.Tớ ko thể tìm thấy gì cả\n" +
            "C.Tớ xin lỗi. tớ ko thể\n" +
            "D.Không, tớ chỉ đang nhìn thôi",
    "Tớ ko thể ngừng lo về bài thi ngày mai\n" +
            "- Tớ chắc cậu sẽ làm tốt thôi mà\n" +
            "A Không sao, đừng bận tâm\n" +
            "C.OK, nó ko quan trọng\n" +
            "D.Dĩ nhiên, tớ cũng thế",
    "Cậu có thích đến trường không?\n" +
            "- Có, tớ thích. Tớ có rất nhiều bạn bè ở đó\n" +
            "A.Tớ thường thăm bạn và thỉnh thoảng đi xem phim\n" +
            "C.Có, tớ có 1 anh trai và 1 chị gái\n" +
            "D Địa lý. Nó rất thú vị",
    "Giúp tớ cái này với!\n" +
            "- Chờ một chút!\n" +
            "A.Tớ đến một lần thôi.\n" +
            "C và D thường dùng trong văn nói hằng ngày hơn",
    "Chúng ta sẽ ăn bên ngoài tối nay chứ?\n" +
            "- Đó là một ý tưởng rất tuyệt.\n" +
            "A.Điều đó có thể hiểu được\n" +
            "C.Bạn thật tốt khi đã mời tôi.\n" +
            "D.Không có gì (dùng để đáp lại một lời cám ơn)",
    "- Bạn có một khu vườn thật tuyệt vời!\n" +
            "- Vườn của bạn cũng vậy.\n" +
            "A.Tôi thật không thể tin!\n" +
            "B.Đó là vinh hạnh của tôi.\n" +
            "D.Đừng nhắc đến nó!",
    "Con của anh thật đáng yêu!\n" +
            "- Cám ơn, chúng tôi rất tự hào về bé.",
    "Cuộc họp đã kết thúc khi nào?\n" +
            "- Ngay trước bữa trưa\n" +
            "A.Càng sớm càng tốt\n" +
            "B.Khoảng nửa tiếng\n" +
            "C.trong vòng 1 phút"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_tiep);
        hienthi=(TextView)findViewById(R.id.text_show_giaotiep);
        goiyy=(TextView)findViewById(R.id.text_goiy_giaotiep);
        textscore=(TextView)findViewById(R.id.score_giaotiep);
        cau=(TextView)findViewById(R.id.cau_giaotiep);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(GiaoTiep.this,R.raw.correct);
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
                if(stt==49)
                {
                    Intent intent = new Intent(GiaoTiep.this, HoanThanh.class);
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
                    textscore.setText(score+"/50");
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
                if(stt==49)
                {

                    Intent intent = new Intent(GiaoTiep.this, HoanThanh.class);
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
                    textscore.setText(score+"/50");

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
                if(stt==49)
                {
                    Intent intent = new Intent(GiaoTiep.this, HoanThanh.class);
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
                    textscore.setText(score+"/50");

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
                if(stt==49)
                {
                    Intent intent = new Intent(GiaoTiep.this, HoanThanh.class);
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
                    textscore.setText(score+"/50");
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


        Intent intent = new Intent(GiaoTiep.this, Onthi.class);
        startActivity(intent);
        finish();



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
        goiy=(TextView)findViewById(R.id.goiy_giaotiep);
        hienthi=(TextView)findViewById(R.id.text_show_giaotiep);
        button1=(Button)findViewById(R.id.button1_giaotiep);
        button2=(Button)findViewById(R.id.button2_giaotiep);
        button3=(Button)findViewById(R.id.button3_giaotiep);
        button4=(Button)findViewById(R.id.button4_giaotiep);

    }
}

