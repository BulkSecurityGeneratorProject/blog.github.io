package com.gagakj.intel4android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.gagakj.intel4android.R;
import com.gagakj.intel4android.adapter.base.TaskStatusAdapter;
import com.gagakj.intel4android.base.BaseActivity;
import com.gagakj.intel4android.bean.FragmentInfo;
import com.gagakj.intel4android.fragment.ApprovalHistoryFragment;
import com.gagakj.intel4android.fragment.EngineerInfoFragment;
import com.gagakj.intel4android.fragment.EngineerInfoGcFragment;
import com.gagakj.intel4android.fragment.OLTListFragment;
import com.gagakj.intel4android.fragment.OLTListGcFragment;
import com.gagakj.intel4android.network.model.PendingMattersGcResponse;
import com.gagakj.intel4android.network.model.PendingMattersResponse;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

import java.util.ArrayList;

/**
 * 当前类注释:OLT挂测详情
 * 项目名：Intel4Android
 * 包名：com.gagakj.intel4android.ui
 * 作者：江清清 on 2017/6/8 20:05
 * 邮箱：jiangqq@gagakj.com
 * QQ： 781931404
 * 公司：南通嘎嘎软件科技有限公司
 * 站点:<a href="http://www.gagakj.com">www.gagakj.com</a>
 */

public class OLTTestDetailGcActivity extends BaseActivity implements View.OnClickListener{
    private String[] tag_name_array ;
    private ArrayList<FragmentInfo> fragmentInfoArrayList ;
    private SmartTabLayout viewPagerTab ;
    private ViewPager viewPager ;
    private LayoutInflater inflater ;
    private ImageView img_back ;

    private Intent mIntent;
    private int type;
    private PendingMattersGcResponse.ResultsBean pendingMattersModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.olt_test_detail_layout);
        mIntent = getIntent();
        type = mIntent.getIntExtra("type",0);
        initView();
        initValidata();
        initListener();
        bindData();
    }

    @Override
    public void initView() {
        super.initView();
        img_back = $(R.id.img_back);
        inflater = LayoutInflater.from(this);
        fragmentInfoArrayList = new ArrayList<>();
        viewPager = (ViewPager)findViewById(R.id.viewpages);
        viewPagerTab = (SmartTabLayout)findViewById(R.id.smart_tab);
    }

    @Override
    public void initValidata() {
        super.initValidata();
        if(type == 1){

        }else if(type == 2){
            pendingMattersModel = (PendingMattersGcResponse.ResultsBean)getIntent().getSerializableExtra("olt");
        }else if(type == 3){

        }
        tag_name_array = getResources().getStringArray(R.array.olt_titletab);
        for(int i = 0  ; i < tag_name_array.length ; i++){
            FragmentInfo info ;
            if(i == 0){
                info = new FragmentInfo(EngineerInfoGcFragment.newInstance(pendingMattersModel), tag_name_array[i]);
            }else if(i == 1){
                info = new FragmentInfo(OLTListGcFragment.newInstance(pendingMattersModel), tag_name_array[i]);
            }else{
                info = new FragmentInfo(new ApprovalHistoryFragment(), tag_name_array[i]);
            }
            fragmentInfoArrayList.add(info);
        }
        TaskStatusAdapter taskStatusAdapter = new TaskStatusAdapter(getSupportFragmentManager() , fragmentInfoArrayList);
        viewPager.setAdapter(taskStatusAdapter);
        viewPagerTab.setViewPager(viewPager);

    }

    @Override
    public void initListener() {
        super.initListener();
        img_back.setOnClickListener(this);
    }

    @Override
    public void bindData() {
        super.bindData();
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.img_back :
                this.finish();
                break;
            default:
                break;
        }
    }
}
