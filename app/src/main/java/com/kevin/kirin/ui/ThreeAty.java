package com.kevin.kirin.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kevin.kirin.R;

import org.greenrobot.eventbus.EventBus;
/**
*
* @author：KevinLiu
* @E-mail:KevinLiu9527@163.com
* @time 2017/6/28 16:23
* 修改备注： 第三个简单界面
*
*/
public class ThreeAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_aty);
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post("结束掉SecondAty!!!!!!!!!!");
                finish();
            }
        });
    }
}
