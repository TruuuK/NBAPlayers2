package com.senorin.nbaplayers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Players extends BaseAdapter {

    Context context;
    String listPlayers[];
    int listImages[];
    LayoutInflater inflater;

    public Players(Context ctx, String [] playerList, int [] images){
        this.context = ctx;
        this.listPlayers = playerList;
        this.listImages = images;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listPlayers.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_nbaplayers, null);
        TextView txtView = (TextView) convertView.findViewById(R.id.textView);
        ImageView playerImg = (ImageView) convertView.findViewById(R.id.imageIcon);
        txtView.setText(listPlayers[position]);
        playerImg.setImageResource(listImages[position]);
        return convertView;
    }
}
