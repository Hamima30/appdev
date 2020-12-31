package com.example.selection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MyRadioButton extends BaseActivity {
    RadioButton rdoYes, rdoNo, rdoNevermind;
    Button btnClick;
    TextView tv;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_my_radio_button;
    }

    @Override
    protected String getActivityName() {
        return "Activity 8";
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_radio_button);
        tv=findViewById(R.id.tvQuestion);
        rdoYes=findViewById(R.id.rdoYes);
        rdoNo=findViewById(R.id.rdoNo);
        rdoNevermind=findViewById(R.id.rdoNevermind);
        btnClick=findViewById(R.id.btnClick);
        btnClick.setOnClickListener(view -> {
            String result = "";
            if(rdoYes.isChecked()) result="Are you kidding me?";
            else if(rdoNo.isChecked()) result="You are so honest!";
            else if(rdoNevermind.isChecked()) result="The truth shall prevail";
            Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
        });
    }
    public void rdoIsClicked(View view) {
        boolean checked = ((RadioButton) (view)).isChecked();
        String str="";
        switch(view.getId()) {
            case R.id.rdoYes:
                if(checked)
                    str = "Amazing";
                break;
            case R.id.rdoNo:
                if(checked)
                    str = "Wonderful";
                break;
            case R.id.rdoNevermind:
                if(checked)
                    str = "Okies";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}

