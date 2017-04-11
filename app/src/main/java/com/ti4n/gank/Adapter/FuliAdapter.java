package com.ti4n.gank.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.ti4n.gank.Data.FuliData;
import com.ti4n.gank.R;

/**
 * Created by liany on 1/1/2017.
 */

public class FuliAdapter extends RecyclerView.Adapter<FuliAdapter.ViewHolder> {
    private Context context;
    private FuliData fuliData;

    public FuliAdapter(FuliData fuliData,Context context) {
        this.context = context;
        this.fuliData = fuliData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.fuli_content,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.with(context).load(fuliData.getResults().get(position).getUrl()).resize(500,550).centerCrop().into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return fuliData.getResults().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.fuli_image);
        }
    }
}
