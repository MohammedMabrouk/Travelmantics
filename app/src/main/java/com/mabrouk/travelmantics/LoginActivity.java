package com.mabrouk.travelmantics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText email, password;
    FrameLayout emailLoginBtn, googleLoginBtn;
    TextView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
//        email.setOnClickListener(this);
        password = findViewById(R.id.password);
//        password.setOnClickListener(this);
        emailLoginBtn = findViewById(R.id.email_sign_in);
        emailLoginBtn.setOnClickListener(this);
        googleLoginBtn = findViewById(R.id.google_sign_in);
        googleLoginBtn.setOnClickListener(this);
        signUp = findViewById(R.id.sign_up_link);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.email:
//                Toast.makeText(this, "email", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.password:
//                Toast.makeText(this, "password", Toast.LENGTH_SHORT).show();
//                break;

            case R.id.email_sign_in:
                Toast.makeText(this, "email sign in", Toast.LENGTH_SHORT).show();
                break;

            case R.id.google_sign_in:
                Toast.makeText(this, "google sign in", Toast.LENGTH_SHORT).show();
                break;

            case R.id.sign_up_link:
                Intent intent = new Intent(this, SignUpActivity.class);
                startActivity(intent);
                break;
        }
    }
}
