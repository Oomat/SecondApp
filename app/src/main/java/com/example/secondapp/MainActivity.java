package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private LinearLayout zabpass;
    private EditText gmail,pin;
    private TextView text1, text2, text3;
    String email = "admin@gmail.com";
    String parol = "admin";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn11);
        zabpass = findViewById(R.id.linearLayout);
        gmail = findViewById(R.id.pochta);
        pin = findViewById(R.id.parol);
        text1 = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);


        btn1.setOnClickListener(view -> {
            if (gmail.getText().toString().equals(email) && pin.getText().toString().equals(parol)){
                gmail.setVisibility(view.GONE);
                pin.setVisibility(view.GONE);
                btn1.setVisibility(view.GONE);
                text1.setVisibility(view.GONE);
                text3.setVisibility(view.GONE);
                zabpass.setVisibility(view.GONE);
                Toast.makeText(this, "Вы успешно зашли", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Не правильные данные", Toast.LENGTH_SHORT).show();
            }


        });

        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (gmail.getText().toString().length()>0){
                    btn1.setBackgroundColor(getColor(R.color.orange));
                } else {
                    btn1.setBackgroundColor(getColor(R.color.grey));
                }
            }
        });
//        System.out.println("Введите ваши данные");
//        System.out.println("Вы неправильно ввели данные");

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


    }
}