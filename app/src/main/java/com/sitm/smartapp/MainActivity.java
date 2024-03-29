package com.sitm.smartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize our views
        textView1=findViewById(R.id.textView1);
        editText1=findViewById(R.id.editText1);
        Button btnSubmit =findViewById(R.id.submitBtn);

        //Set an onclick listener for the submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Call function submit to change our textView
                submit();
            }
        });
    }

    //This method is for the purpose of changing our textView's text
    public void submit(){
        //Get the text from our editText ad store it in name variable
        String name=editText1.getText().toString();
        //View the text in the textview
        textView1.setText("Hello "+name);
    }

}