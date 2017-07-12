/* TODO:
Analyze this library for usage in my project
https://github.com/mcharmas/Android-ReactiveLocation
*/

package com.android.courseproject.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.courseproject.R;

import java.util.HashMap;

public class MainActivity extends Activity {

    public static HashMap<String, String> temporaryLoginPassHolder = new HashMap<>();

    private EditText editTextLogin;
    private EditText editTextPassword;
    private Button buttonLogin;
    private Button buttonRegister;
    private Context context;

    static {
        temporaryLoginPassHolder.put("temp", "temp");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        editTextLogin = (EditText) findViewById(R.id.login);
        editTextPassword = (EditText) findViewById(R.id.password);

        buttonRegister = (Button) findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, RegActivity.class);
                startActivity(intent);
            }
        });
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String login = editTextLogin.getText().toString();
                String pass = editTextPassword.getText().toString();

                if (temporaryLoginPassHolder.containsKey(login) &&
                        temporaryLoginPassHolder.get(login).equals(pass)) {
                    Intent intent = new Intent(context, StartingUserActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(context, "No user with these login and password",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
