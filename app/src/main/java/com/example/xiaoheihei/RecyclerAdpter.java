package com.example.xiaoheihei;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by xhh on 2017/9/29.
 */

public class RecyclerAdpter extends RecyclerView.Adapter<RecyclerAdpter.ViewHolder> {
   private List<DataBean> MydataBeanList;
    public RecyclerAdpter(List<DataBean> dataBeanList){
        MydataBeanList = dataBeanList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewitem,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                 DataBean bean = MydataBeanList.get(position);
                Toast.makeText(view.getContext(), "you click view "+bean.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.imageview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                DataBean bean = MydataBeanList.get(position);
                Toast.makeText(view.getContext(), "you click image "+ bean.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       DataBean bean =  MydataBeanList.get(position);
        holder.imageview.setImageResource(bean.getImageid());
        holder.textView.setText(bean.getName());
    }

    @Override
    public int getItemCount() {
        return MydataBeanList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
       ImageView imageview;
       TextView textView;
       public ViewHolder(View view){
           super(view);
           imageview = (ImageView) view.findViewById(R.id.imageViewid);
           textView  =(TextView)view .findViewById(R.id.textviewid);
       }
   }

}
