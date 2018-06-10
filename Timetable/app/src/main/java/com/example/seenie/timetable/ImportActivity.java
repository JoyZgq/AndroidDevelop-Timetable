package com.example.seenie.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

public class ImportActivity extends AppCompatActivity {

    private EditText et_name,et_day,et_place,et_end_hour,et_start_hour;
    private Button btn_import;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_import);

        et_name=findViewById(R.id.et_name);
        et_place=findViewById(R.id.et_place);
        et_day=findViewById(R.id.et_day);
        et_start_hour=findViewById(R.id.et_start_hour);
        et_end_hour=findViewById(R.id.et_end_hour);
        btn_import=findViewById(R.id.btn_import);

        btn_import.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultCode=100;
                Intent data =new Intent();
                String name =et_name.getText().toString();
                int day = Integer.parseInt(et_day.getText().toString());
                int start_hour = Integer.parseInt(et_start_hour.getText().toString());
                int end_hour = Integer.parseInt(et_end_hour.getText().toString());
                String place =et_place.getText().toString();

                Log.e("day", String.valueOf(day));
                Log.e("star_hour", String.valueOf(start_hour));
                Log.e("end_hour", String.valueOf(end_hour));
                Log.e("name",name);
                Log.e("place",place);
                data.putExtra("name",name);
                data.putExtra("day",day);
                data.putExtra("start_hour",start_hour);
                data.putExtra("end_hour",end_hour);
                data.putExtra("place",place);

                setResult(resultCode,data);
               // Toast.makeText(this,"添加成功",Toast.LENGTH_SHORT).show();
                finish();

            }
        });



    }
}
