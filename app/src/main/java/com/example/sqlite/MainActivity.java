package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.sqlite.Models.PayInForm;
import com.example.sqlite.adapter.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText edt_name;
    private ArrayList<PayInForm> list;
    private RecyclerView recyclerView;
    private ImageButton buttonAddData;
    private CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAllData();
        buttonAddData = findViewById(R.id.buttonAddData);
        edt_name = findViewById(R.id.editText);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        list = new ArrayList<>();
        customAdapter = new CustomAdapter(this,list);
        recyclerView.setAdapter(customAdapter);
        buttonAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PayInForm payInForm = new PayInForm(String.valueOf(list.size()) , edt_name.getText().toString());
            }
        });
    }
    private void getAllData() {
      for (int i = 0; i < 10; i++) {
          PayInForm payInForm = new PayInForm(String.valueOf(i) , "person" + i);
          list.add(payInForm);
      }
    }

}