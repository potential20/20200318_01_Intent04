package kr.co.tjoeun.a20200318_01_intent04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.a20200318_01_intent04.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

//        1. 메인화면에서 => 버튼을 누르면 => 프로필수정화면으로 이동
        binding.inputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditUserInfoActivity.class);
                startActivityForResult(intent,1000);
            }
        });
//        2. 프로필 수정화면에서 이름 입력 => 확인 => 종료 / 메인으로 복귀
//        3. 돌아온 메인화면에서 2에서 입력한 이름을 텍스트뷰에 반영



    }
}
