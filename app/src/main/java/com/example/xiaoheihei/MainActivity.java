package com.example.xiaoheihei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<DataBean> dataBeanList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        RecyclerView recyclerview  =(RecyclerView) findViewById(R.id.recyclerviewid);
//        实现水平方向的滑动
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        StaggeredGridLayoutManager layoutManager  = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(layoutManager);
        RecyclerAdpter adapter = new RecyclerAdpter(dataBeanList);
        recyclerview.setAdapter(adapter);

    }

    private void initdata() {
        for(int i =0;i<2;i++){
            DataBean data1 = new DataBean("message1",R.mipmap.ic_launcher_round);
            dataBeanList.add(data1);
            DataBean data2 = new DataBean("message2",R.mipmap.ic_launcher_round);
            dataBeanList.add(data2);
            DataBean data3 = new DataBean("message3",R.mipmap.ic_launcher_round);
            dataBeanList.add(data3);
            DataBean data4 = new DataBean("message4",R.mipmap.ic_launcher_round);
            dataBeanList.add(data4);
            DataBean data5 = new DataBean("message5",R.mipmap.ic_launcher_round);
            dataBeanList.add(data5);
            DataBean data6 = new DataBean("message6",R.mipmap.ic_launcher_round);
            dataBeanList.add(data6);
            DataBean data7 = new DataBean("message7",R.mipmap.ic_launcher_round);
            dataBeanList.add(data7);
            DataBean data8 = new DataBean("message8",R.mipmap.ic_launcher_round);
            dataBeanList.add(data8);
            DataBean data9 = new DataBean("message9",R.mipmap.ic_launcher_round);
            dataBeanList.add(data9);
            DataBean data10 = new DataBean("message10",R.mipmap.ic_launcher_round);
            dataBeanList.add(data10);


        }
    }
}
