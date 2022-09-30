package com.example.listviewdactrung;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Item> itemList;

    public ListViewAdapter(Context context, int layout, List<Item> itemList) {
        this.context = context;
        this.layout = layout;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView logoTen,hoTen,gioiThieu ;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            //ánh xạ view
            holder.logoTen = view.findViewById(R.id.textView);
            holder.hoTen = view.findViewById(R.id.textView2);
            holder.gioiThieu = view.findViewById(R.id.textView3);
            view.setTag(holder);
        }
        else {
            holder=(ViewHolder) view.getTag();
        }
        Item item = itemList.get(i);
        holder.logoTen.setText(item.getLogoTen());
        holder.hoTen.setText(item.getHoTen());
        holder.gioiThieu.setText(item.getGioiThieu());
        return view;
    }
}
