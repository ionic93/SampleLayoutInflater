package com.example.samplelayoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        layout = findViewById(R.id.container);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            //LayoutInflater = Xml에 미리 정의해둔 틀을 실제 메모리에 올려주는 역할
            // inflate(객체화 할 xml, 객체화한 뷰를 넣을 부모 레이아웃/컨테이너, true(즉시 인플레이션 여부))
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            inflater.inflate(R.layout.sub1,layout,true);

            CheckBox checkBox = layout.findViewById(R.id.checkBox);
            checkBox.setText("로딩되었어요");
        });
    }
}