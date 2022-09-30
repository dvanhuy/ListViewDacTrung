package com.example.listviewdactrung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvitem;
    ArrayList<Item> arrayItem;
    ListViewAdapter listViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        AnhXa();
        listViewAdapter = new ListViewAdapter(this,R.layout.itemlist,arrayItem);
        lvitem.setAdapter(listViewAdapter);

        lvitem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,arrayItem.get(i).getLogoTen(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void AnhXa(){
        lvitem = findViewById(R.id.listviewsv);
        arrayItem = new ArrayList<>();
        arrayItem.add(new Item("H","Đinh Văn Huy 1","Mã sinh viên: 2050531200157, Giới tính: Nam"));
        arrayItem.add(new Item("U","Đinh Văn Huy 2","Mã sinh viên: 2050531200157, Giới tính: Nam"));
        arrayItem.add(new Item("Y","Đinh Văn Huy 3","Mã sinh viên: 2050531200157, Giới tính: Nam"));
        arrayItem.add(new Item("D","Đinh Văn Huy 4","Mã sinh viên: 2050531200157, Giới tính: Nam"));
        arrayItem.add(new Item("I","Đinh Văn Huy 5","Mã sinh viên: 2050531200157, Giới tính: Nam"));
        arrayItem.add(new Item("N","Đinh Văn Huy 6","Mã sinh viên: 2050531200157, Giới tính: Nam"));
        arrayItem.add(new Item("V","Đinh Văn Huy 7","Mã sinh viên: 2050531200157, Giới tính: Nam"));
        arrayItem.add(new Item("A","Đinh Văn Huy 8","Mã sinh viên: 2050531200157, Giới tính: Nam"));
        arrayItem.add(new Item("N","Đinh Văn Huy 9","Mã sinh viên: 2050531200157, Giới tính: Nam"));
    }
}