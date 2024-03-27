package com.example.mdxperts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1={
            {"Doctor Name:Ajit Saste ","Hospital Address:pimpri ","Exp:5yrs ","Mobile No:9898989898 ","600"},
            {"Doctor Name:prasad pawar ","Hospital Address:Nigdi ","Exp:6yrs ","Mobile No:9797979797 ","900"},
            {"Doctor Name: Swapnil Kale","Hospital Address:Pune ","Exp:5yrs ","Mobile No: 9696969696","300"},
            {"Doctor Name: Deepak Deshmukh","Hospital Address:chinchwd ","Exp:4yrs ","Mobile No:9595959595 ","500"},
            {"Doctor Name:Ashok Panda ","Hospital Address:ketranj ","Exp:7yrs ","Mobile No:7978797879","800"},
            {"Doctor Name: bhaskar jhaa","Hospital Address:bombay ","Exp:4yrs ","Mobile No:9595989595 ","500"},
            {"Doctor Name:vinus patel ","Hospital Address:kolkatta ","Exp:7yrs ","Mobile No:7978097879","800"}

    };
    private String[][] doctor_details2={
            {"Doctor Name: Deepak kumar","Hospital Address:chinchwd ","Exp:8yrs ","Mobile No:9595959595 ","500"},
            {"Doctor Name: Swapnil lele","Hospital Address:Pune ","Exp:7yrs ","Mobile No: 9696969696","300"},
            {"Doctor Name:Ankul Panda ","Hospital Address:ketranj ","Exp:10yrs ","Mobile No:7978797879","800"},
            {"Doctor Name: bhaskar jhaa","Hospital Address:bombay ","Exp:4yrs ","Mobile No:9595989595 ","500"},
            {"Doctor Name:nilesh borate ","Hospital Address:pimpri ","Exp:5yrs ","Mobile No:9898989898 ","600"},
            {"Doctor Name:pamkaj pawar ","Hospital Address:Nigdi ","Exp:6yrs ","Mobile No:9797979797 ","900"},
            {"Doctor Name:vinus patel ","Hospital Address:kolkatta ","Exp:7yrs ","Mobile No:7978097879","800"}

    };

    private String[][] doctor_details3={
            {"Doctor Name:Ankul Panda ","Hospital Address:ketranj ","Exp:10yrs ","Mobile No:7978797879","800"},
            {"Doctor Name: bhaskar jhaa","Hospital Address:bombay ","Exp:4yrs ","Mobile No:9595989595 ","500"},
            {"Doctor Name:nilesh borate ","Hospital Address:pimpri ","Exp:5yrs ","Mobile No:9898989898 ","600"},
            {"Doctor Name:pamkaj pawar ","Hospital Address:Nigdi ","Exp:6yrs ","Mobile No:9797979797 ","900"},
            {"Doctor Name: Swapnil lele","Hospital Address:Pune ","Exp:7yrs ","Mobile No: 9696969696","300"},
            {"Doctor Name: Deepak kumar","Hospital Address:chinchwd ","Exp:8yrs ","Mobile No:9595959595 ","500"},
            {"Doctor Name:vinus patel ","Hospital Address:kolkatta ","Exp:7yrs ","Mobile No:7978097879","800"}

    };
    private String[][] doctor_details4={
            {"Doctor Name: bhaskar jhaa","Hospital Address:bombay ","Exp:4yrs ","Mobile No:9595989595 ","500"},
            {"Doctor Name:pamkaj pawar ","Hospital Address:Nigdi ","Exp:6yrs ","Mobile No:9797979797 ","900"},
            {"Doctor Name: Swapnil lele","Hospital Address:Pune ","Exp:7yrs ","Mobile No: 9696969696","300"},
            {"Doctor Name:nilesh borate ","Hospital Address:pimpri ","Exp:5yrs ","Mobile No:9898989898 ","600"},
            {"Doctor Name: Deepak kumar","Hospital Address:chinchwd ","Exp:8yrs ","Mobile No:9595959595 ","500"},
            {"Doctor Name:Ankul Panda ","Hospital Address:ketranj ","Exp:10yrs ","Mobile No:7978797879","800"},
            {"Doctor Name:vinus patel ","Hospital Address:kolkatta ","Exp:7yrs ","Mobile No:7978097879","800"}

    };
    private String[][] doctor_details5={
            {"Doctor Name: Swapnil lele","Hospital Address:Pune ","Exp:7yrs ","Mobile No: 9696969696","300"},
            {"Doctor Name: Deepak kumar","Hospital Address:chinchwd ","Exp:8yrs ","Mobile No:9595959595 ","500"},
            {"Doctor Name:vinus patel ","Hospital Address:kolkatta ","Exp:7yrs ","Mobile No:7978097879","800"},
            {"Doctor Name:Ankul Panda ","Hospital Address:ketranj ","Exp:10yrs ","Mobile No:7978797879","800"},
            {"Doctor Name:nilesh borate ","Hospital Address:pimpri ","Exp:5yrs ","Mobile No:9898989898 ","600"},
            {"Doctor Name:pamkaj pawar ","Hospital Address:Nigdi ","Exp:6yrs ","Mobile No:9797979797 ","900"},
            {"Doctor Name: bhaskar jhaa","Hospital Address:bombay ","Exp:4yrs ","Mobile No:9595989595 ","500"}


    };



    TextView tv;
    Button btn;
    String[][] doctor_details={};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);
        tv= findViewById(R.id.textviewDDtitle);
        btn=findViewById(R.id.buttonDDBack);

        Intent it=getIntent();
        String title=it.getStringExtra("title");
        tv.setText(title);
        if(title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Diticians")==0)
            doctor_details = doctor_details2;
        if(title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        if(title.compareTo("Surgion")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this,FindDoctorActivity.class));
            }
        });
        list = new ArrayList();
        for(int i=0;i<doctor_details.length;i++){
            item=new HashMap<String, String>();
            item.put("line1",doctor_details[i][0]);
            item.put("line2",doctor_details[i][1]);
            item.put("line3",doctor_details[i][2]);
            item.put("line4",doctor_details[i][3]);
            item.put("line5","Cons Fees:"+doctor_details[i][4]+"/-");
            list.add(item);
        }
        sa =new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
                );
        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);
    }
}