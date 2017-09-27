package com.gagakj.intel4android.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.gagakj.intel4android.R;
import com.gagakj.intel4android.adapter.base.TaskBoxAdapter;
import com.gagakj.intel4android.application.IntelApplication;
import com.gagakj.intel4android.base.BaseFragment;
import com.gagakj.intel4android.bean.TaskBoxListInfo;
import com.gagakj.intel4android.common.Constants;
import com.gagakj.intel4android.common.RequestAction;
import com.gagakj.intel4android.network.http.HTTPHelper;
import com.gagakj.intel4android.network.http.ResultSubscriber;
import com.gagakj.intel4android.network.model.IModel;
import com.gagakj.intel4android.network.model.RecTodoListsMattersResponse;
import com.gagakj.intel4android.utils.SharedPreferencesHelper;
import com.gagakj.intel4android.utils.SharedPreferencesTag;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 待办任务
 * Created by zhujiaqi on 2017/5/27.
 */
public class WaitingTaskFragment extends BaseFragment implements ResultSubscriber.OnResultListener{

    private View viewlayout;
    private ListView lv_list_task;
    private TaskBoxAdapter adapter ;
    private ArrayList<TaskBoxListInfo> taskBoxListInfos ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewlayout = inflater.inflate(R.layout.wating_task_fragment_layout , container , false);
        return viewlayout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initValidata();
    }

    public void initView(){
        lv_list_task = (ListView) viewlayout.findViewById(R.id.lv_list_task);
        taskBoxListInfos = new ArrayList<>() ;
    }

    public void initValidata(){
        for (int i = 0  ; i < 10  ; i++){
            TaskBoxListInfo taskBoskListinfo = new TaskBoxListInfo("线路专业开工流程" , "张伟" , "2017/01/12");
            taskBoxListInfos.add(taskBoskListinfo);
        }
        adapter = new TaskBoxAdapter(getActivity() , taskBoxListInfos , Constants.WAITING_TASK);
        lv_list_task.setAdapter(adapter);

        //发送请求
        HashMap<String,String> req_map = new HashMap<>();
        String userId = SharedPreferencesHelper.getInstance(IntelApplication.getInstance()).getStringValue(SharedPreferencesTag.KEY_USERID);
        req_map.put("userId", userId);
        Log.d("zttjiangqq","userId:"+userId);
        HTTPHelper.getInstance().recTodoListMattersReq(RecTodoListsMattersResponse.class,req_map, RequestAction.ACTION_PENDING_MATTERS,this);
    }

    /**
     * 进行绑定数据
     */
    @Override
    public void bindData() {
        super.bindData();
    }

    @Override
    public void onStart(int requestType) {

    }

    @Override
    public void onCompleted(int requestType) {

    }

    @Override
    public void onError(int requestType) {

    }

    @Override
    public void onNext(IModel t, int requestType) {
        if(requestType == RequestAction.ACTION_PENDING_MATTERS){
            RecTodoListsMattersResponse recTodoListsMattersResponse = (RecTodoListsMattersResponse)t;
            Log.d("zttjiangqq","RecTodoListsMattersResponse:"+ recTodoListsMattersResponse);
        }
    }
}
