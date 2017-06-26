package com.heima.yqz.firstcode;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mryang on 2017/6/12.
 * Email：
 * Content：activity的收集器，可以遍历关闭activity
 */

public class ActivityCollector {
    public static List<Activity> list = new ArrayList<>();
    public static void addActivityS(Activity activity){
        list.add(activity);
    }
    public static void removeActivity(Activity activity){
        list.remove(activity);
    }
    public static void finishAll(){
        for(Activity activity: list){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
