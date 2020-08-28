package com.example.myapplication;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import java.util.List;
import java.util.Observable;

public class Student {

    public int id;
    public List<String> lessons;

    public ObservableField<String> name = new ObservableField<String>();
    public ObservableInt group = new ObservableInt();

    public Student(int id, String name, int group, List<String> lessons) {
        this.id = id;
        this.name.set(name);
        this.group.set(group);
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", lessons=" + lessons +
                '}';
    }
}
