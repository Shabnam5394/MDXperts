package com.example.mdxperts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1={
            {"Doctor Name:Ajit Saste ","Hospital Address:pimpri ","Exp:5yrs ","Mobile No:9898989898 ","600"},
            {"Doctor Name:prasad pawar ","Hospital Address:Nigdi ","Exp: ","Mobile No:9797979797 ","900"},
            {"Doctor Name: Swapnil Kale","Hospital Address:Pune ","Exp: ","Mobile No: 9696969696","300"},
            {"Doctor Name: Deepak Deshmukh","Hospital Address:chinchwd ","Exp: ","Mobile No:9595959595 ","500"},
            {"Doctor Name:Ashok Panda ","Hospital Address: ","Exp:ketraj ","Mobile No:7978797879","800"}

    };
    private String[][] doctor_details2={
            {"Doctor Name:nilesh borate ","Hospital Address:pimpri ","Exp:5yrs ","Mobile No:9898989898 ","600"},
            {"Doctor Name:pamkaj pawar ","Hospital Address:Nigdi ","Exp: ","Mobile No:9797979797 ","900"},
            {"Doctor Name: Swapnil lele","Hospital Address:Pune ","Exp: ","Mobile No: 9696969696","300"},
            {"Doctor Name: Deepak kumar","Hospital Address:chinchwd ","Exp: ","Mobile No:9595959595 ","500"},
            {"Doctor Name:Ankul Panda ","Hospital Address: ","Exp:ketraj ","Mobile No:7978797879","800"}

    };

    private String[][] doctor_details3={
            {"Doctor Name:Seema patil ","Hospital Address:pimpri ","Exp:5yrs ","Mobile No:9898989898 ","600"},
            {"Doctor Name:pankaj parab ","Hospital Address:Nigdi ","Exp: ","Mobile No:9797979797 ","900"},
            {"Doctor Name: nilesh Kale","Hospital Address:Pune ","Exp: ","Mobile No: 9696969696","300"},
            {"Doctor Name: vishal Deshmukh","Hospital Address:chinchwd ","Exp: ","Mobile No:9595959595 ","500"},
            {"Doctor Name:Akshay Panda ","Hospital Address: ","Exp:ketraj ","Mobile No:7978797879","800"}

    };
    private String[][] doctor_details4={
            {"Doctor Name:amol gawade ","Hospital Address:pimpri ","Exp:5yrs ","Mobile No:9898989898 ","600"},
            {"Doctor Name:anil pawar ","Hospital Address:Nigdi ","Exp: ","Mobile No:9797979797 ","900"},
            {"Doctor Name: Nayak Kale","Hospital Address:Pune ","Exp: ","Mobile No: 9696969696","300"},
            {"Doctor Name: Mayur Deshmukh","Hospital Address:chinchwd ","Exp: ","Mobile No:9595959595 ","500"},
            {"Doctor Name:shrikant Panda ","Hospital Address: ","Exp:ketraj ","Mobile No:7978797879","800"}

    };
    private String[][] doctor_details5={
            {"Doctor Name:Ajit Saste ","Hospital Address:pimpri ","Exp:5yrs ","Mobile No:9898989898 ","600"},
            {"Doctor Name:prasad pawar ","Hospital Address:Nigdi ","Exp: ","Mobile No:9797979797 ","900"},
            {"Doctor Name: Swapnil Kale","Hospital Address:Pune ","Exp: ","Mobile No: 9696969696","300"},
            {"Doctor Name: Deepak Deshmukh","Hospital Address:chinchwd ","Exp: ","Mobile No:9595959595 ","500"},
            {"Doctor Name:Ashok Panda ","Hospital Address: ","Exp:ketraj ","Mobile No:7978797879","800"}

    };



    TextView tv;
    Button btn;
    String[][] doctor_details={};
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
    }
}