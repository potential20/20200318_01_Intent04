package kr.co.tjoeun.a20200318_01_intent04;

import androidx.annotation.Nullable;
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        requestCode => 어떤 요청으로 띄운화면인지? 구별.
//        이름 변경 or 프사 변경 개발자가 분류한 requestCode 값을 따라감.

        if (requestCode == 1000) {
//            우리가 요청한 프로필 변경 화면 이동이다!

//            resultCode => 완료 / 취소 여부. 보통 완료일때만 대응.
            if (resultCode == RESULT_OK) {
//                확인버튼을 눌러서 finish가 되었다!

//                첨부된 데이터가 있나 확인. => Intent data 변수에 들어있다.

                String name = data.getStringExtra("inputName");
                binding.nameTxt.setText(name);
            }

        }

    }
}
