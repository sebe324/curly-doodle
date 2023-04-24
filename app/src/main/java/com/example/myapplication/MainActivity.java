package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String email;
    String password;
    String passwordConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConfirm = (Button) findViewById(R.id.buttonConfirm);
        EditText emailInput = (EditText) findViewById(R.id.emailInput);
        EditText passwordInput = (EditText) findViewById(R.id.passwordInput);
        EditText passwordConfirmInput = (EditText) findViewById(R.id.passwordConfirm);
        TextView result = (TextView) findViewById(R.id.result);

        buttonConfirm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                email=emailInput.getText().toString();
                password=passwordInput.getText().toString();
                passwordConfirm=passwordConfirmInput.getText().toString();
                if(!email.contains("@")){
                    result.setText("Nieprawidłowy adres e-mail");
                }
                else if(!password.equals(passwordConfirm)){
                    result.setText("Hasła się różnią");
                }
                else{
                    result.setText("Witaj " + email);
                }
            }
        });
    }
}