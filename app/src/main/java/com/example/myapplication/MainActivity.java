package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAddClicked(View view) {
        EditText editTextNum1 = findViewById(R.id.activity_main__editTextNum1);
        EditText editTextNum2 = findViewById(R.id.activity_main__editTextNum2);
        TextView textViewRs = findViewById(R.id.activity_main__textViewRs);

        // 혹시나 있을지 모를 양옆의 공백제거
        editTextNum1.setText(editTextNum1.getText().toString().trim());

        if ( editTextNum1.getText().toString().length() == 0 ) {
            toastMsg("숫자1을 입력해주세요.");
            editTextNum1.requestFocus();
            return;
        }

        // 혹시나 있을지 모를 양옆의 공백제거
        editTextNum2.setText(editTextNum2.getText().toString().trim());

        if ( editTextNum2.getText().toString().length() == 0 ) {
            toastMsg("숫자2를 입력해주세요.");
            editTextNum2.requestFocus();
            return;
        }

        int num1 = Integer.parseInt(editTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextNum2.getText().toString());

        int rs = num1 + num2;
        toastMsg("결과 : " + rs);
        textViewRs.setText("결과 : " + rs);
    }

    void toastMsg(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public void btnClearClicked(View view) {
        EditText editTextNum1 = findViewById(R.id.activity_main__editTextNum1);
        EditText editTextNum2 = findViewById(R.id.activity_main__editTextNum2);
        TextView textViewRs = findViewById(R.id.activity_main__textViewRs);

        editTextNum1.setText("");
        editTextNum2.setText("");
        textViewRs.setText("");
    }
}