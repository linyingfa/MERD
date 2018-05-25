package com.example.administrator.merd;


import android.os.IInterface;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.example.administrator.merd.base.BaseActivity;
import com.example.administrator.merd.model.bean.WelcomeBean;
import com.example.administrator.merd.util.ToastUtil;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {
    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initEventAndData() {
        mPresenter.getWelcomeData();
    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    public void showContent(WelcomeBean welcomeBean) {
        ToastUtil.shortShow(welcomeBean.getText());
    }

    @Override
    public void jumpToMain() {
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * 使用lambda表达式的三种写法:
     * 适用于【匿名内部类中方法无参数的情况】              () -> 语句、、、() -> {代码块}
     * 适用于【匿名内部类中方法只有一个参数的情况】           方法参数 -> 语句 、方法参数 -> {代码块}
     * 适用于【匿名内部类中方法不止一个参数的情况】           (参数1, 参数2) -> 语句、、(参数1, 参数2) -> {代码块}
     */
    private void Lambda() {
        /**
         * 第一种方式,无参数+语句(代码块)：适用于【匿名内部类中方法无参数的情况】
         * () -> 语句
         * 或
         * () -> {代码块}
         **/

        /**普通写法**/
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("TAG", "this is a norm Thread");
            }
        }).start();

        /**使用lambda表达式写法**/
        new Thread(() -> {

        }).start();

        /**
         * 第二种方式，有参数+语句：适用于【匿名内部类中方法只有一个参数的情况】
         * 方法参数 -> 语句
         * 或
         * 方法参数 -> {代码块}
         */
        /**普通写法**/
        findViewById(getLayout()).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "this is a general onClick");
            }
        });
        /**使用lambda表达式写法**/
        findViewById(getLayout()).setOnClickListener(v -> Log.d("TAG", "this is a lambda onClick"));


        /**
         * 第三种方式，有参数+代码块：适用于匿名内部类中方法不止一个参数的情况
         * (参数1, 参数2) -> 语句
         * 或
         * (参数1, 参数2) -> {代码块}
         */
        CheckBox checkBox = (CheckBox) findViewById(getLayout());
        /**普通写法**/
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("TAG", "this is a general onCheckedChanged");
            }
        });
        /**使用lambda表达式写法**/
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Log.d("TAG", "this is a lambda onCheckedChanged");
            Log.d("TAG", "this is a lambda onCheckedChanged_isChecked=" + isChecked);
        });
    }
}
