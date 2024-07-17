package game.miqi.Unit11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import game.miqi.R;


public class TaskUn11 extends AppCompatActivity {
    TextView cau1,cau2,cau3,cau4,cau5;
    EditText edit1,edit2,edit3,edit4,edit5;
    Button kiemtra;
    int score=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_un11);
        cau1 = (TextView)findViewById(R.id.cau1_u11);
        cau2 = (TextView)findViewById(R.id.cau2_u11);
        cau3 = (TextView)findViewById(R.id.cau3_u11);
        cau4 = (TextView)findViewById(R.id.cau4_u11);
        cau5=(TextView)findViewById(R.id.cau5_u11) ;
        edit1= ( EditText)findViewById(R.id.edit_cau1);
        edit2= ( EditText)findViewById(R.id.edit_cau2);
        edit3= ( EditText)findViewById(R.id.edit_cau3);
        edit4= ( EditText)findViewById(R.id.edit_cau4);
        edit5= ( EditText)findViewById(R.id.edit_cau5);
        kiemtra = (Button)findViewById(R.id.kiemtra_u11);
        cau1.setText("1. How many ways of reading are there? (Có bao nhiêu cách đọc sách?)");
        cau2.setText("2. When might you \"swallow\" a book? (Khi nào người ta \"đọc ngốn ngấu\" một quyển sách?)");
        cau3.setText("3. What should you do before starting to read a book carefully and slowly? (Ta nên làm gì trước khi bắt đầu đọc một quyển sách một cách kỹ lưỡng và chậm rãi?)");
        cau4.setText("4. What are the advantages of television over books? (Đâu là ưu điểm của truyền hình khi so sánh với sách?)");
        cau5.setText("5. What are the advantages of books over television? (Đâu là ưu điểm của sách khi so sánh với truyền hình?)");

   kiemtra.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           if(edit1.getText().equals("There are three"))
           { score +=2 ;

           }
           if(edit2.getText().equals("When you find a goodstory,and,what is even more important,the time to enjoy it"))
           {
               score +=2 ;
           }
           if(edit3.getText().equals("Read a few pagesthat it is one you can easily read and understand"))
           {
               score +=2 ;
           }
           if(edit4.getText().equals("Televisions can bring you the information and stories with colour, picture and action"))
           {
               score+=2;
           }
           if(edit5.getText().equals("Books are still a cheap way to get information and entertainment,and you can keep a book forever and read it many times"))
           {
               score+=2;
           }
           Intent intent = new Intent(TaskUn11.this,Task2_unit11.class);
           intent.putExtra("Score_taskfirst",score);
           startActivity(intent);
           finish();




       }
   });
    }



}
