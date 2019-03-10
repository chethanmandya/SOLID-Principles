package com.chethan.solidprinciples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.chethan.solidprinciples.LiskovSubstitution.After.WithLSPMainClass;
import com.chethan.solidprinciples.LiskovSubstitution.Before.NoLSPMainClass;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println(" Before applying Liskov Substitution Principle ");
        NoLSPMainClass noLSPMainClass = new NoLSPMainClass();
        noLSPMainClass.displayEmployeeDetails();
        System.out.println(" After applying Liskov Substitution Principle ");
        WithLSPMainClass withLSPMainClass = new WithLSPMainClass();
        withLSPMainClass.displayEmployeeDetails();

    }
}
