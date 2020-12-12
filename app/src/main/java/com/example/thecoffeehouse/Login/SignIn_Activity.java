package com.example.thecoffeehouse.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.thecoffeehouse.MainActivity;
import com.example.thecoffeehouse.R;

public class SignIn_Activity extends AppCompatActivity {

    Button signin;
    EditText edtsdt, edtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);

        edtsdt =(EditText) findViewById(R.id.edtsdt);
        edtpassword=(EditText) findViewById(R.id.edtPassword);
        signin=(Button) findViewById(R.id.btn_signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlButton();
            }
        });
    }
    private void ControlButton() {
        if (edtsdt.getText().length() != 0 && edtpassword.getText().length() != 0) {
            if (edtsdt.getText().toString().equals("0373997578") && edtpassword.getText().toString().equals("admin")) {
                Toast.makeText(SignIn_Activity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();

                //chuyen giua cac giao dien vói nhau
                Intent intent = new Intent(SignIn_Activity.this, MainActivity.class);
                startActivity(intent);

            } else {
                Toast.makeText(SignIn_Activity.this, "Vui lòng kiểm tra lại email hoặc mật khẩu", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(SignIn_Activity.this, "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
        }
    }
}