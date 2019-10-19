
package com.example.mad314a2;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.mad314a2.R.id.editText1;
import static com.example.mad314a2.R.id.editText2;
import static com.example.mad314a2.R.id.editText4;

public class MainActivity extends AppCompatActivity {

    EditText id,password,name;
    Button submit;

    //database

    String goodusername ="Good";
    String goodpassword ="0000";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        mAdapter = new StudentAdapter(getApplicationContext());
        rv.setAdapter(mAdapter);




        final StudentDataSource repository = StudentDataSource.getInstance();

        id = findViewById(R.id.editText1);
        password = findViewById(R.id.editText2);
        submit = findViewById(R.id.button);
        name = findViewById(R.id.editText4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                {
                    Editable usernameeditable = id.getText();
                    String username = usernameeditable.toString();

                    Editable passwordeditable = password.getText();
                    String password = passwordeditable.toString();

                    if (username.equals(goodusername) && password.equals(goodpassword)) {

                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                        intent.putExtra("username", username);

                        startActivity(intent);
                    }


                    System.out.println();
                }


                String name = editText4.getText().toString();
                String password = editText2.getText().toString();
                int id = Integer.parseInt(editText1.getText().toString());

                Student s1 = new Student();
                s1.name = name;
                s1.password = password;
                s1.id = id;

                repository.addStudent(s1);


            }
        });
    }
    }
