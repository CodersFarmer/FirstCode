package com.heima.yqz.firstcode.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.heima.yqz.firstcode.ActivityCollector;
import com.heima.yqz.firstcode.BaseActivity;
import com.heima.yqz.firstcode.R;

public class ThreadActivity extends BaseActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
        textView = (TextView) findViewById(R.id.ThreaActivity);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ActivityCollector.finishAll();
                //finish();
            }
        });
    }
}
