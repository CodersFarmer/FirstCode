package com.heima.yqz.firstcode;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/*
* 创建一个BaseActivity，实现在每个界面的，完全退出应用
* */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivityS(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
        //杀掉当前进程的方法，不可以杀掉其他的进程
        //android.os.Process.killProcess(android.os.Process.myPid());
    }
}
