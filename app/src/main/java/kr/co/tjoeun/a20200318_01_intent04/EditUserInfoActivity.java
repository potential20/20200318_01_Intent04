package kr.co.tjoeun.a20200318_01_intent04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.a20200318_01_intent04.databinding.ActivityEditUserInfoBinding;

public class EditUserInfoActivity extends AppCompatActivity {

    ActivityEditUserInfoBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_edit_user_info);


    }
}
