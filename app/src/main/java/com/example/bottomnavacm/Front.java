package com.example.bottomnavacm;

import android.content.Intent;
import android.os.Handler;
import android.service.autofill.Validator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Front extends AppCompatActivity implements View.OnClickListener {
Handler handler;
    EditText email;
    EditText password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        email = (EditText) findViewById(R.id.mEmailId);
        password = (EditText) findViewById(R.id.mPassword);
        login = (Button) findViewById(R.id.mLOginSubmit);
        login.setOnClickListener(this);

    }

    private void submit(){
        if(email.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Email not entered!", Toast.LENGTH_LONG).show();
        }
        else if(password.getText().toString().isEmpty()){
            Toast.makeText(this, "Password not entered!", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(Front.this,MainActivity.class );
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.mLOginSubmit:
                submit();
                break;
        }
    }
}

