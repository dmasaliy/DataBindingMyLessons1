package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class EventHandler {

    public  static  final  String TAG = "Eventhandler";

    public void onClick(Student student, Context context){
        Toast.makeText(context, student.toString(), Toast.LENGTH_SHORT).show();
    }

    public void onChecked(boolean isChecked, Context context){
        String checked = isChecked ? "checked" : "unchecked";

        Toast.makeText(context, checked, Toast.LENGTH_SHORT).show();
    }
}
