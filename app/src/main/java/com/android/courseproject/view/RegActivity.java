package com.android.courseproject.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.courseproject.R;

/**
 * Created by User
 */

public class RegActivity extends Activity {

    private Button buttonSignup;
    private Button buttonBack;
    private EditText editTextLogin;
    private EditText editTextPassword;
    private EditText editTextPasswordRepeat;
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        context = this;

        editTextLogin = (EditText) findViewById(R.id.regLogin);
        editTextPassword = (EditText) findViewById(R.id.regPassword);
        editTextPasswordRepeat = (EditText) findViewById(R.id.regPasswordRepeat);
        buttonSignup = (Button) findViewById(R.id.buttonSignup);
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login =  editTextLogin.getText().toString();
                String pass =  editTextPassword.getText().toString();
                String passRepeat =  editTextPasswordRepeat.getText().toString();

                if (registerNewUser(login, pass, passRepeat)){
                    finish();
                }

            }
        });
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    public boolean registerNewUser (String login, String pass, String repeatPass){
        if ((login != null) && (pass != null) && (pass.equals(repeatPass))){
            MainActivity.temporaryLoginPassHolder.put(login, pass);
            Toast.makeText(context, "Successfully added new user!",
                    Toast.LENGTH_LONG).show();
        }
        return true;
    }
}
