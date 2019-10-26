package com.haobi.floatingactionbutton;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {
                count++;
                if(count%2 == 0){
                    Toast.makeText(MainActivity.this,"取消收藏！",Toast.LENGTH_LONG).show();
                    fab.setImageResource(R.drawable.shoucang);
                }else{
                    Toast.makeText(MainActivity.this,"收藏成功！",Toast.LENGTH_LONG).show();
                    fab.setImageResource(R.drawable.shoucang_3);
                }
            }
        });
    }
}
