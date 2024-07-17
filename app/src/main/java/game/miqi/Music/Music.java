package game.miqi.Music;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


import com.plattysoft.leonids.ParticleSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import es.dmoral.toasty.Toasty;
import game.miqi.MainActivity;
import game.miqi.R;

public class Music extends AppCompatActivity {
    Animation nhapnhay ,thunho;
Button button_start,but1,but2,but3,but4;
CountDownTimer countDownTimer ;
int count = 30;
ArrayList<Integer> list ;
String[] Correct={"Counting Star","Cheap Thrills","Castle On The Hill","Closer","The River","Attention",
        "Cold Water","Beauty And Beat",
        "Dont Let Me Down","Im Your",
        "Sugar","See You Again","Symphony","What Makes You Beautiful","Love Yourself","Locked Away","Maps",
        "Let Me Love You","What Do You Mean","One Thing","Hello","Bad Things","Cant Stop Feeling","Dont Wanna Know",
        "I'm The One","More Than You Know","One Call Away","Paris","All We Know","Shape Of You","Rockabye",
        "Some Thing Just Like This","Stay","The Greatest","The Ocean","Titanium","Treat You Better","Viva La Vida",
"We Dont Talk Anymore","What I've Done","Why Not Me","Alone","Beautiful In White","Let Her Go","My Love",
        "One Last Time"
        ,"Roar","Take Me To Your Heart","Until You","I Can Fly","Young","I Need Your Love","Reality",
        "Rude","Summer","Tonight Tonight","Burn","Call Me Maybe","Chandelier","Havana",
        "How To Love","I do","In The End","Just The Way You Are","Love Me Like You Do","Numb"
        ,"Scared To Be Lonely","Sorry","Stereo Hearts","The Lazy Song","Thunder",
        "Waiting For Love","You Belong With Me","Baby","All Falls Down","Legend Never Die","OutSide",
        "Like I Do","Bad Day","Cry On My Shoulder","Dusk Till Dawn","Heathens","It Ain't Me","Starving"
        ,"The Spectre","Seve","You&I","Live While We're Young","Sun Goes Down","Where Are U Now"
        ,"I Want You To Know","Beautiful Now","Lean On","Roses","Show Me Love","Are You With Me"};
int stt = 0;
int score=0;
String[][] traloi={{"Counting Star","Closer","Cold Water","Attention"},//counting start
        {"Come On","Cheap Thrills","Castle On The Hill", "BaBy"}, // cheap thrill
        {"Castle On The Hill","Go Home","The Night","Locked Away"},//castle on the hill
        {"All We Know","Closer","Cold Water","Im Your"}, //closer
        {"Beauty And Beat","The River","Why Not Me","Im Your"},//despacito
        {"All We Know","Attention","Cold Water","Symphony"}, // Attention
        {"The Night","The Life","Cold Water","You Go"}, // cold water
        {"Cold Water","Beauty And Beat","Closer","Castle On The Hill"}, // beauty and beat
        {"Dont Let Me Down","Symphony","Locked Away","See You Again"}, //dont let me down
        {"Until You","Why Not Me","Cold Water","Im Your"}, //im your
        {"Sugar","Symphony","Animals","Oh Baby"},// sugar
        {"Dont Let Me Down","See You Again","All We Know","Symphony"},//see you again
        {"Symphony","Animals","Love Yourself","Maps"}, //symphony
        {"Locked Away","What Makes You Beautiful","What Do You Mean","One Thing"},//What make
        {"Maps","Love Yourself","Let Me Love You","Sugar"}, //Love yourself
        {"Locked Away","Closer","Until You","Symphony"}, // locked away
        {"Symphony","Maps","Closer","Sugar"} // maps
        ,{"Sorry","Beauty And Beat","Let Me Love You","What Do You Mean"}//let me love ou
,{"What Do You Mean","Sorry","Beauty and Beat","One Thing"},
        {"Shape Of You","One Thing","Until You","Sugar"},
     {"Hello","Hello Hello","Waiting For","The Love"}
,{"My Mind","The Love","Bad Things","Cant Stop Feeling"}
,{"Give Away","Stay","All We Know","Cant Stop Feeling"}
,{"Dont Wanna Know","Until You","For You","What I've Done"}
,{"I'm The One","Sorry Baby","I love You","Animals"}
,{"Im The One","The Greatest","Higher","More Than You Know"},
        {"One Call Away","Call Away","Super Man","Call Baby"}
,{"Paris","Titanium","Stay","Treat You Better"}
,{"Closer","Young","All We Know","The Nights"}
,{"Waiting For Love","Love","Titanium","Shape Of You"}
,{"Surface","Alone","Rockabye","Wake Me Up"}
,{"Some Thing Just Like This","Closer","All We Know","The Nights"}
,{"Paris","Levels","Stay","Titanium"}
,{"The Greatest","The Ocean","For Love","Levels"}
,{"Rockabye","The Ocean","Stay","Higher"}
,{"Something","Levels","Titanium","Blue"}
,{"Treat You Better","Cold Water","For Me","Faded"}
,{"Stay","Waiting For Love","Cheap Thrills","Viva La Vida"},
        {"We Dont Talk Anymore","Im Your","All We Know","We Are One"},
        {"One Number","Higher","Closer","What I've Done"},
        {"Take Me To Your Heart","I Do","Let Her Go","Why Not Me"}
,{"Alone","Faded","The Spectre","The Love"},
        {"My Love","The Beautiful","Beautiful In White","Beautiful"},
        {"Blue","Let Her Go","I Do","Wake Me up"},
        {"The One","Love My Love","My Love","The Love"},
        {"The Love","One Last Time","The Night","Last Time"},
        {"Boy","Roar","The Roar","My Face"},
        {"The Boy","Take Me To Your Heart","Your Heart","Call Me"},
        {"The World","Until You","The Way","Feel The World"},
        {"Sun Night","The Sun","Enemy","I Can Fly"},
        {"New Young","Young","Where You Go","Make Me Young"},
        {"My Life","I Need","I Need Your Love","Your Love"},
        {"Ready","Reality","You Go","Go"},
        {"Marry","Rude","Magic","The Way"},
        {"The Love","The Summer","Love","Summer"},
        {"Sun Night","Tonight","The Night","Tonight Tonight"},
        {"The Fire","I Don't Know","Burn","Fire"},
        {"Call Me","Baby","Call Me Baby","Call Me Maybe"},
        {"Chandelier","The Night","The Fire","Lie"},
        {"Havana","Lalala","Nanana","Hanava"},
        {"Some Body","How To Love","The Love","Love"},
        {"Heart You Say","Some Thing","I do","The Love"},
        {"Numb","In The End","Finish","Boy Friend"},
        {"Just The Love","Just The Way","Just The Way You Are","Amazing"},
        {"Love Me","Love Me Like You Do","The Love","Like You Do"},
        {"Numb","In The End","Finish","Come"},
        {"Scared","The River","Scared To Be Lonely","Lonely"},
        {"Love Yourself","Sorry","Sorry Sorry","What Do You Mean"},
        {"Stereo","Radio","The Radio","Stereo Hearts"},
        {"The Lazy is Song","The Lazy","Just The Way You Are","The Lazy Song"},
        {"Funder","Under","Thunder","Lighting"},
        {"The End","Waiting For Love","For Love","Wait For"},
        {"You With Me","You Belong With Me","Looking For","With Me"},
        {"Baby","BaBy BaBy","My Mind","The Baby"},
        {"Whenever","All Falls Down","Where You Go","Falls Down"},
        {"The Legend","Your Life","Never","Legend Never Die"},
        {"The Power","Side To Side","OutSide","Power"},
        {"Like I Do","Baby","Like You","The Love"},
        {"Lie","Bad Day","The Way","The Life"},
        {"Cry On My Shoulder","My Shoulder","Cry On","Some One"},
        {"Dusk Till Dawn","The Love","Till Dawn","Baby"},
        {"Friends","Where You Go","Heathens","You Don't Know"},
        {"Stand For","It Ain't Me","It Me","Down"},
        {"See You","Hold Me","Starving","No Way"},
        {"My Life","Hold Me","The Life","The Spectre"},
        {"Seve","Feeling","Down Seve","The Seve"},
        {"You End Die","You&I","You And Die","You Die"},
        {"Let Go","Crazy","While Young","Live While We're Young"},
        {"Sun Go Down","Sun Goes Down","We Go","Some Go Down"},
        {"I Need You","I Want You","I Want You","Where Are U Now"},
        {"I Want You Know","I Know","I Want You To Know","You Know"},
        {"Beautiful Night","Beautiful","Beautiful Now","The Nights"},
        {"Live On","Leon","Lean On","Living On"},
        {"Say You Love Me","Let We Go","Roses","We Go"},
        {"Beside","Show Me Love","The Love","Show Me"},
        {"You With Me","All You With Me","With Me","Are You With Me"}};
Button button;
    ParticleSystem ps;
    ParticleSystem ps2 ;
    ParticleSystem ps3 ;
    int [] mausac ={R.color.blue,R.color.green,R.color.orange, R.color.violeet,R.color.red,R.color.grey,R.color.yellow,R.color.pink};
    int [] mausac2 = {R.drawable.button_music_1,R.drawable.button_music_2,R.drawable.button_music_3,R.drawable.button_music_4,R.drawable.button_music_5};
    Random random = new Random();
    RelativeLayout relativeLayout;
    int solansai=0 ;
    MediaPlayer player;
ArrayList<Integer> array ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        button = (Button)findViewById(R.id.button_music_start);

        button.setBackground(this.getResources().getDrawable(R.drawable.button_start));
        relativeLayout=(RelativeLayout)findViewById(R.id.relative_music);
        int mau = mausac[random.nextInt(7)];
       relativeLayout.setBackgroundColor(getResources().getColor(mau));
        player = new MediaPlayer();
        player.setVolume(50,50);


        ps = new ParticleSystem(Music.this, 50, R.drawable.red, 1000);
       ps2 = new ParticleSystem(Music.this, 50, R.drawable.green, 1000);
       ps3 = new ParticleSystem(Music.this, 5, R.drawable.blue, 1000);

        list = new ArrayList<>();
        array = new ArrayList<>();
        for(int i=0;i<Correct.length;i++)
        {     list.add(i);
            Collections.shuffle(list);}
        init();
            capnhat();
        countDownTimer = new CountDownTimer(31000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                count-=1;
                if(count<=0)
                {
                  count=0;
                    button.setText(count+"");


                }else{
                    button.setText(count+"");
                }


            }


            @Override
            public void onFinish() {
                stopmusic();
                Toasty.error(Music.this,"Over Time", Toast.LENGTH_SHORT).show();
                solansai+=1;
                if(solansai==3) {

                    Intent intent = new Intent(Music.this, ChienThangMusic.class);
                    intent.putExtra("Score_music", score);
                    startActivity(intent);
                    finish();
                }
                button.clearAnimation();
                button.setText("Start");
                button.setEnabled(true);
                but1.setEnabled(true);
                but2.setEnabled(true);
                but3.setEnabled(true);
                but4.setEnabled(true);
                stt+=1 ;
                capnhat();
            }
        };
        thunho = AnimationUtils.loadAnimation(Music.this,R.anim.thunho);

        // Set su kien

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt>=10)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start4));
                }
                if(stt>=30)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start3));
                }
                if(stt>=60)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start2));
                }
                button.setEnabled(true);
                button.clearAnimation();
                countDownTimer.cancel();
                button.setText("Start");
                stopmusic();
                count=30;

                if(but1.getText().equals(Correct[list.get(stt)]))
                {
                    score +=1;
                    if(stt==94)
                    {

                        Intent intent = new Intent(Music.this, ChienThangMusic.class);
                        intent.putExtra("Score_music",score);
                        startActivity(intent);
                        finish();

                    }
                    stt+=1;
                    Toasty.success(Music.this,"Good !", Toast.LENGTH_SHORT).show();
                    capnhat();
                }else {
                    solansai+=1;
                    if(solansai==3)
                    {

                        Intent intent = new Intent(Music.this, ChienThangMusic.class);
                        intent.putExtra("Score_music",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    Toasty.error(Music.this,"Lose !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt>=10)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start4));
                }
                if(stt>=30)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start3));
                }
                if(stt>=60)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start2));
                }
                button.setEnabled(true);
                button.clearAnimation();
                countDownTimer.cancel();
                stopmusic();
                count=30;
                button.setText("Start");
                if(but2.getText().equals(Correct[list.get(stt)]))
                {
                    score +=1;
                    if(stt==94)
                    {

                        Intent intent = new Intent(Music.this, ChienThangMusic.class);
                        intent.putExtra("Score_music",score);
                        startActivity(intent);
                        finish();

                    }
                    stt+=1;
                    Toasty.success(Music.this,"Good !", Toast.LENGTH_SHORT).show();
                    capnhat();
                }else {
                    solansai+=1;
                    if(solansai==3)
                    {

                        Intent intent = new Intent(Music.this, ChienThangMusic.class);
                        intent.putExtra("Score_music",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    Toasty.error(Music.this,"Lose !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt>=10)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start4));
                }
                if(stt>=30)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start3));
                }
                if(stt>=60)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start2));
                }
                button.setEnabled(true);
                button.clearAnimation();
                countDownTimer.cancel();
                stopmusic();
                count=30;
                button.setText("Start");
                if(but3.getText().equals(Correct[list.get(stt)]))
                {
                    score +=1;
                    if(stt==94)
                    {

                        Intent intent = new Intent(Music.this, ChienThangMusic.class);
                        intent.putExtra("Score_music",score);
                        startActivity(intent);
                        finish();

                    }
                    stt+=1;
                    Toasty.success(Music.this,"Good !", Toast.LENGTH_SHORT).show();
                    capnhat();
                }else {
                    solansai+=1;
                    if(solansai==3)
                    {

                        Intent intent = new Intent(Music.this, ChienThangMusic.class);
                        intent.putExtra("Score_music",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    Toasty.error(Music.this,"Lose !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stt>=10)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start4));
                }
                if(stt>=30)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start3));
                }
                if(stt>=60)
                {
                    button.setBackground(getResources().getDrawable(R.drawable.button_start2));
                }
                button.setEnabled(true);
                button.clearAnimation();
                countDownTimer.cancel();
                stopmusic();
                count=30;
                button.setText("Start");
                if(but4.getText().equals(Correct[list.get(stt)]))
                {
                    score +=1;
                    if(stt==94)
                    {
                        Intent intent = new Intent(Music.this, ChienThangMusic.class);
                        intent.putExtra("Score_music",score);
                        startActivity(intent);
                        finish();

                    }
                    stt+=1;
                    Toasty.success(Music.this,"Good !", Toast.LENGTH_SHORT).show();
                    capnhat();
                }else {
                    solansai+=1;
                    if(solansai==3)
                    {
                        Intent intent = new Intent(Music.this,ChienThangMusic.class);
                        intent.putExtra("Score_music",score);
                        startActivity(intent);
                        finish();
                    }
                    stt+=1;
                    capnhat();
                    Toasty.error(Music.this,"Lose !", Toast.LENGTH_SHORT).show();
                }
            }
        });



 button.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         button.setEnabled(false);
         ps.setScaleRange(1f, 2f);
         ps.setSpeedRange(0.1f, 0.2f);
         ps.setRotationSpeedRange(90, 180);
         ps.setFadeOut(200, new AccelerateInterpolator());
         ps.oneShot(button, 150);

         ps2.setScaleRange(1f, 2f);
         ps2.setSpeedRange(0.1f, 0.25f);
         ps.setRotationSpeedRange(90, 180);
         ps2.setFadeOut(200, new AccelerateInterpolator());
         ps2.oneShot(button, 150);

         ps3.setScaleRange(1f, 2f);
         ps3.setSpeedRange(0.1f, 0.2f);
         ps3.setRotationSpeedRange(90, 180);
         ps3.setFadeOut(200, new AccelerateInterpolator());
         ps3.oneShot(button, 150);


         button.startAnimation(thunho);
         count = 30;
         countDownTimer.start();
         if (list.get(stt) == 0) {
           play(R.raw.counting);
         }

         if (list.get(stt) == 1) {
           play(R.raw.cheap);

         }
         if (list.get(stt) == 2) {
             play(R.raw.castle);

         }
         if (list.get(stt) == 3) {
            play(R.raw.closer);


         }
         if (list.get(stt) == 4) {
           play(R.raw.theriver);

         }
         if (list.get(stt) == 5) {
            play(R.raw.attention);
         }
         if (list.get(stt) == 6) {
            play(R.raw.coldwater);

         }
         if (list.get(stt) == 7) {
           play(R.raw.beautyandbeat);


         }
         if (list.get(stt) == 8) {
            play(R.raw.dontletmedown);

         }
         if (list.get(stt) == 9) {

 play(R.raw.im);
         }

         if (list.get(stt) == 10) {

             play(R.raw.sugar);

         }

         if (list.get(stt) == 11) {

play(R.raw.seeyouagain);

         }
         if (list.get(stt) == 12) {
            play(R.raw.symphony);


         }
         if (list.get(stt) == 13) {
             play(R.raw.whatmakeyourbeautiful);


         }

             if (list.get(stt) == 14) {
                play(R.raw.loveyourself);


             }
             if (list.get(stt) == 15) {
               play(R.raw.lockedaway);

             }
             if (list.get(stt) == 16) {
                 play(R.raw.maps);


             }
             if (list.get(stt) == 17) {
                play(R.raw.letmeloveyou);

             }
             if (list.get(stt) == 18) {
                play(R.raw.whatdoyoumean);

             }
             if (list.get(stt) == 19) {
                 play(R.raw.onething);


             }
             if (list.get(stt) == 20) {
                play(R.raw.hello);


             }
             if (list.get(stt) == 21) {

      play(R.raw.badthing);
             }
             if (list.get(stt) == 22) {
play(R.raw.cantstopfeeling);

             }
             if (list.get(stt) == 23) {
play(R.raw.dontwannaknow);

             }
             if (list.get(stt) == 24) {
play(R.raw.imtheone);


             }
             if (list.get(stt) == 25) {
play(R.raw.morethanyouknow);

             }
             if (list.get(stt) == 26) {

play(R.raw.onecallaway);
             }
             if (list.get(stt) == 27) {
play(R.raw.paris);

             }
             if (list.get(stt) == 28) {
play(R.raw.allweknow);


             }
             if (list.get(stt) == 29) {
play(R.raw.shapeofyou);
             }
             if (list.get(stt) == 30) {
play(R.raw.rockabye);
             }
             if (list.get(stt) == 31) {
play(R.raw.somethingjustlikethis);

             }
             if (list.get(stt) == 32) {
play(R.raw.stay);

             }
             if (list.get(stt) == 33) {
play(R.raw.thegreast);

             }
             if (list.get(stt) == 34) {
play(R.raw.theocean);
             }
             if (list.get(stt) == 35) {
play(R.raw.titanium);

             }
             if (list.get(stt) == 36) {
play(R.raw.treatyoubetter);
             }
             if (list.get(stt) == 37) {
play(R.raw.vivalavida);
             }
             if (list.get(stt) == 38) {
play(R.raw.wedonttalkanymore);


             }
             if (list.get(stt) == 39) {
play(R.raw.whatihavedone);
             }
             if (list.get(stt) == 40) {

play(R.raw.whynotme);
             }
         if (list.get(stt) == 41) {
play(R.raw.alonee);

         }
         if (list.get(stt) == 42) {
play(R.raw.beautifulinwhite);
         }
         if (list.get(stt) == 43) {
play(R.raw.lethergo);

         }
         if (list.get(stt) == 44) {
play(R.raw.mylove);

         }
         if (list.get(stt) == 45) {
play(R.raw.onelasttime);
         }
         if (list.get(stt) == 46) {
play(R.raw.roar);

         }
         if (list.get(stt) == 47) {
play(R.raw.takemetoyourheart);

         }
         if (list.get(stt) == 48) {
play(R.raw.untilyou);
         }

         if (list.get(stt) == 49) {
play(R.raw.icanfly);

         }
         if (list.get(stt) == 50) {
 play(R.raw.young);

         }
         if (list.get(stt) == 51) {
             play(R.raw.ineedyourlove);

         }
         if (list.get(stt) == 52) {
             play(R.raw.reality);

         }
         if (list.get(stt) == 53) {
             play(R.raw.rude);

         }
         if (list.get(stt) == 54) {
             play(R.raw.summer);

         }
         if (list.get(stt) == 55) {
             play(R.raw.tonighttonight);

         }
         if (list.get(stt) == 56) {
             play(R.raw.burn);

         }
         if (list.get(stt) == 57) {
             play(R.raw.callmemaybe);

         }
         if (list.get(stt) == 58) {
             play(R.raw.chandelier);

         }
         if (list.get(stt) == 59) {
             play(R.raw.havana);

         }
         if (list.get(stt) == 60) {
             play(R.raw.howtolove);

         }
         if (list.get(stt) == 61) {
             play(R.raw.ido);

         }
         if (list.get(stt) == 62) {
             play(R.raw.intheend);

         }
         if (list.get(stt) == 63) {
             play(R.raw.justthewayyouare);

         }
         if (list.get(stt) == 64) {
             play(R.raw.lovemeikeyoudo);

         }
         if (list.get(stt) == 65) {
             play(R.raw.numb);

         }
         if (list.get(stt) == 66) {
             play(R.raw.scaredtobelonely);

         }
         if (list.get(stt) == 67) {
             play(R.raw.sorry);

         }
         if (list.get(stt) == 68) {
             play(R.raw.stereohearts);

         }
         if (list.get(stt) == 69) {
             play(R.raw.thelazysong);

         }
         if (list.get(stt) == 70) {
             play(R.raw.thunder);

         }
         if (list.get(stt) == 71) {
             play(R.raw.waitingforlove);

         }
         if (list.get(stt) == 72) {
             play(R.raw.youbelongwithme);

         }
         if (list.get(stt) == 73) {
             play(R.raw.baby);

         }
         if (list.get(stt) == 74) {
             play(R.raw.allfallsdown);

         }
         if (list.get(stt) == 75) {
             play(R.raw.legendneverdie);

         }
         if (list.get(stt) == 76) {
             play(R.raw.outside);

         }
         if (list.get(stt) == 77) {
             play(R.raw.likeido);

         }
         if (list.get(stt) == 78) {
             play(R.raw.badday
             );

         }
         if (list.get(stt) == 79) {
             play(R.raw.cryonmyshoulder
             );

         }
         if (list.get(stt) == 80) {
             play(R.raw.dusktilldawn
             );

         }
         if (list.get(stt) == 81) {
             play(R.raw.heathens
             );

         }
         if (list.get(stt) == 82) {
             play(R.raw.itaintme
             );

         }
         if (list.get(stt) == 83) {
             play(R.raw.starving
             );

         }
         if (list.get(stt) == 84) {
             play(R.raw.thespectre
             );

         }
         if (list.get(stt) == 85) {
             play(R.raw.seve
             );

         }
         if (list.get(stt) == 86) {
             play(R.raw.youi
             );

         }
         if (list.get(stt) == 87) {
             play(R.raw.livewhile
             );

         }
         if (list.get(stt) == 88) {
             play(R.raw.sungoesdown
             );

         }
         if (list.get(stt) == 89) {
             play(R.raw.whereareunow
             );

         }
         if (list.get(stt) == 90) {
             play(R.raw.iwantyoutoknow
             );

         }
         if (list.get(stt) == 91) {
             play(R.raw.beautifulnow
             );

         }
         if (list.get(stt) == 92) {
             play(R.raw.leanon
             );

         }
         if (list.get(stt) == 93) {
             play(R.raw.roses
             );

         }
         if (list.get(stt) == 94) {
             play(R.raw.showmelove
             );

         }
         if (list.get(stt) == 95) {
             play(R.raw.areyouwithme
             );

         }



         }
     });



 }



    private void init() {
        but1 = (Button)findViewById(R.id.but1_music);
        but2 = (Button)findViewById(R.id.but2_music);
        but3 = (Button)findViewById(R.id.but3_music);
        but4 = (Button)findViewById(R.id.but4_music);
        but1.setBackground(getResources().getDrawable(R.drawable.button_music_1));
        but2.setBackground(getResources().getDrawable(R.drawable.button_music_2));
        but3.setBackground(getResources().getDrawable(R.drawable.button_music_3));
        but4.setBackground(getResources().getDrawable(R.drawable.button_music_4));


    }
    private  void stopmusic()   {
        if(player.isPlaying()) {
            player.pause();
        }


    }


    private void capnhat() {

        but1.setBackground(getResources().getDrawable(mausac2[random.nextInt(5)]));
        but2.setBackground(getResources().getDrawable(mausac2[random.nextInt(5)]));
        but3.setBackground(getResources().getDrawable(mausac2[random.nextInt(5)]));
        but4.setBackground(getResources().getDrawable(mausac2[random.nextInt(5)]));
       int mau = mausac[random.nextInt(7)];
        relativeLayout.setBackgroundColor(getResources().getColor(mau));
        ArrayList<Integer> random = new ArrayList<>();
        for(int i=0;i<4;i++)
        {
            random.add(i);
            Collections.shuffle(random);
        }
        but1.setText(traloi[list.get(stt)][random.get(0)]);
        but2.setText(traloi[list.get(stt)][random.get(1)]);
        but3.setText(traloi[list.get(stt)][random.get(2)]);
        but4.setText(traloi[list.get(stt)][random.get(3)]);


    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Music.this);
        builder.setTitle("Do you want to return ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        stopmusic();
                        Intent intent = new Intent(Music.this, MainActivity.class);
                        startActivity(intent);
                        finish();


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



       private void play(int resourceID) {
        player.reset();


                //Using the same object - Problem persists
                player = MediaPlayer.create(Music.this, resourceID);
           if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
               player.setAudioAttributes(new AudioAttributes.Builder()
                       .setUsage(AudioAttributes.USAGE_MEDIA)
                       .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                       .build());
           } else {
               player.setAudioStreamType(AudioManager.STREAM_MUSIC);
           }



                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {

                    }
                });

                player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });
           player.setOnErrorListener(new MediaPlayer.OnErrorListener() {
               @Override
               public boolean onError(MediaPlayer mp, int what, int extra) {
 Toasty.success(Music.this,"Lỗi",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Music.this,MainActivity.class);

        startActivity(intent);
               return  true;
               }
           });



        }

    @Override
    protected void onPause() {
        button.setEnabled(true);
        button.clearAnimation();
        countDownTimer.cancel();
        button.setText("Start");
        stopmusic();
        count=30;
        super.onPause();
        stt += 1;
        capnhat();

    }


    @Override
    protected void onResume() {
        super.onResume();
    }
}
