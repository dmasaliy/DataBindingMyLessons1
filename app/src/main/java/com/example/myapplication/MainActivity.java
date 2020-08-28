package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

import static com.example.myapplication.BR.user;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> lessons = new ArrayList<>();
        lessons.add("Math");
        lessons.add("phisics");

        final Student student = new Student(1, "Vasya", 431, lessons);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setStudent(student);

        TextView textView = binding.textView2;
        Toast.makeText(this, textView.getText(), Toast.LENGTH_SHORT).show();
//
//        EventHandler handler = new EventHandler();
//        binding.setEvent(handler);

        final User user = new User("Pupkin");
        Button button =binding.button;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                student.group.set(321);
//                student.name.set("Some else name");
                Toast.makeText(MainActivity.this, user.name, Toast.LENGTH_SHORT).show();
            }
        });

        binding.setUser(user);


    }
}