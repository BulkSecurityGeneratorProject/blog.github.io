package com.gagakj.intel4android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.gagakj.intel4android.R;
import com.gagakj.intel4android.adapter.CNKFragmentPagerAdapter;
import com.gagakj.intel4android.adapter.base.TaskStatusAdapter;
import com.gagakj.intel4android.base.BaseActivity;
import com.gagakj.intel4android.bean.FragmentInfo;
import com.gagakj.intel4android.fragment.ApprovalHistoryFragment;
import com.gagakj.intel4android.fragment.ApprovalHistoryGcFragment;
import com.gagakj.intel4android.fragment.EngineerInfoFragment;
import com.gagakj.intel4android.fragment.EngineerInfoGcFragment;
import com.gagakj.intel4android.fragment.OLTListFragment;
import com.gagakj.intel4android.fragment.OLTListGcFragment;
import com.gagakj.intel4android.network.model.PendingMattersGcResponse;
import com.gagakj.intel4android.network.model.PendingMattersResponse;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

import java.util.ArrayList;
import java.util.List;

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

    private ImageView img_back ;

    private TabLayout tab_layout;
    private ViewPager info_viewpager;
    private List<Fragment> fragments;
    private CNKFragmentPagerAdapter mPagerAdater;

    private Intent mIntent;
    private int type;
    private String taskIdOrId;
    private String runId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.olt_test_detail_gc_layout);
        mIntent = getIntent();
        taskIdOrId = mIntent.getStringExtra("taskIdOrId");
        runId = mIntent.getStringExtra("runId");
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
        fragmentInfoArrayList = new ArrayList<>();
        info_viewpager = (ViewPager)findViewById(R.id.viewpages);
        tab_layout=(TabLayout)this.findViewById(R.id.tab_layout);
    }

    @Override
    public void initValidata() {
        super.initValidata();
        tag_name_array = getResources().getStringArray(R.array.olt_titletab);
        fragments = new ArrayList<>();
        for(int i = 0  ; i < tag_name_array.length ; i++){
            if(i == 0){
                fragments.add(EngineerInfoGcFragment.newInstance(taskIdOrId,runId,type));
            }else if(i == 1){
                fragments.add(OLTListGcFragment.newInstance(taskIdOrId));
            }else {
                fragments.add(ApprovalHistoryGcFragment.newInstance(taskIdOrId,runId,type));
            }
        }
        //创建Fragment的 ViewPager 自定义适配器
        mPagerAdater=new CNKFragmentPagerAdapter(getSupportFragmentManager());
        //设置显示的标题
        mPagerAdater.setTitles(tag_name_array);
        //设置需要进行滑动的页面Fragment
        mPagerAdater.setFragments(fragments);

        info_viewpager.setAdapter(mPagerAdater);
        tab_layout.setupWithViewPager(info_viewpager);

        //设置Tablayout
        //设置TabLayout模式 -该使用Tab数量比较多的情况
        tab_layout.setTabMode(TabLayout.MODE_FIXED);


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
                finish(this);
                break;
            default:
                break;
        }
    }
}
