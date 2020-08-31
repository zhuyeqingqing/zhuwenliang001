package com.example.zhuwenliang001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hahahah");
        System.out.println("第二次提交");
        Toast.makeText(this,"hehe",Toast.LENGTH_LONG).show();
    }
}
