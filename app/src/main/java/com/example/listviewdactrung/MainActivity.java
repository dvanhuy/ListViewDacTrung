package com.example.listviewdactrung;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
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

        lvitem.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Xoa(i);
                return false;
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

    private void Xoa(final int  position){
        AlertDialog.Builder alterDialog  = new AlertDialog.Builder(this);
        alterDialog.setTitle("Thông báo ");
        alterDialog.setIcon(R.mipmap.ic_launcher);
        alterDialog.setMessage("Bạn có muốn xóa mặt hàng này không ?");
        alterDialog.setPositiveButton("Có", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                arrayItem.remove(position);
                listViewAdapter.notifyDataSetChanged();
            }
        });
        alterDialog.setNegativeButton("Không", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alterDialog.show();
    }
}

class ViewDialog {

    public void showDialog(Activity activity, String msg){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.additem);

        Button submit = (Button) dialog.findViewById(R.id.button2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        Button out = (Button) dialog.findViewById(R.id.button3);
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}