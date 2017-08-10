package com.example.wiantoro.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wiantoro.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 09/08/2017.
 */

public class quickCountAdapter extends RecyclerView.Adapter<quickCountAdapter.ViewHolder> {

    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;

    Context context;
    ArrayList<Integer> listViewType;

    public quickCountAdapter(ArrayList<Integer> listViewType, Context context){
        this.listViewType = listViewType;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case TYPE_1 :
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quickcount_left, null);
                return new ItemPertamaViewHolder(view);
            case TYPE_2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quickcount_right, null);
                return new ItemKeduaViewHolder(view);
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int viewType = listViewType.get(position);
        switch (viewType){
            case TYPE_1:
                ItemPertamaViewHolder itemPertamaViewHolder = (ItemPertamaViewHolder) holder;
                itemPertamaViewHolder.textViewItemPertama.setText("Candidate 1" + " 51,80%");
                break;
            case TYPE_2:
                ItemKeduaViewHolder itemKeduaViewHolder = (ItemKeduaViewHolder) holder;
                itemKeduaViewHolder.textViewItemKedua.setText("Candidate 2" + " 48,20%");
        }
    }

    @Override
    public int getItemCount() {
        return listViewType.size();
    }

    @Override
    public int getItemViewType(int position) {
        return listViewType.get(position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder (View itemView){
            super(itemView);
        }
    }

    class ItemPertamaViewHolder extends ViewHolder {

        TextView textViewItemPertama;

        public ItemPertamaViewHolder(View itemView){
            super(itemView);
            textViewItemPertama = (TextView)itemView.findViewById(R.id.tv_quickCount1);
        }
    }

    class ItemKeduaViewHolder extends ViewHolder {

        TextView textViewItemKedua;

        public ItemKeduaViewHolder (final View itemView){
            super(itemView);
            textViewItemKedua = (TextView)itemView.findViewById(R.id.tv_quickCount2);
        }
    }


}
