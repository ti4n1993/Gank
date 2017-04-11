package com.ti4n.gank.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.ti4n.gank.Data.FuliData;
import com.ti4n.gank.Data.TodayData;
import com.ti4n.gank.R;

/**
 * Created by liany on 12/30/2016.
 */

public class TodayAdapter extends RecyclerView.Adapter<TodayAdapter.ViewHolder>{
    private TodayData todayData;
    private Context context;
    private FuliData fuliData;

    public TodayAdapter(TodayData todayData, Context context) {
        this.todayData = todayData;
        this.context = context;
        this.fuliData=fuliData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.content_list_today,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(todayData.getResults().getAndroid().get(position).getDesc());

    }
    @Override
    public int getItemCount() {
        return todayData.getResults().getAndroid().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);

            textView= (TextView) itemView.findViewById(R.id.text_content_list);
        }
    }

}
