package com.gagakj.intel4android.network.http;

import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URLEncoder;

import retrofit2.Converter;

/**
 * 当前类注释:
 * 项目名：Intel4Android
 * 包名：com.gagakj.intel4android.network.http
 * 作者：江清清 on 2017/6/5 17:21
 * 邮箱：jiangqq@gagakj.com
 * QQ： 781931404
 * 公司：南通嘎嘎软件科技有限公司
 * 站点:<a href="http://www.gagakj.com">www.gagakj.com</a>
 */
public class GsonResponseBodyConverter<T> implements Converter<okhttp3.ResponseBody,T> {
    private final Gson gson;
    private final Type type;

    public GsonResponseBodyConverter(Gson gson,Type type){
        this.gson = gson;
        this.type = type;
    }
    @Override
    public T convert(okhttp3.ResponseBody value) throws IOException {
        //这边进行处理返回数据
        String response = value.string();
        if(response.endsWith("()")){
            //已（）结尾需要进行处理
            return gson.fromJson(response.substring(1,response.length()-3),type);
        }else if(response.startsWith("(")){
            return gson.fromJson(response.substring(1,response.length()-1),type);
        }else {
            return gson.fromJson(response, type);
        }
    }
}
