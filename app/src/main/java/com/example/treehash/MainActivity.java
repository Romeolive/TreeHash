package com.example.treehash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    TextView tree;
    TextView hash;
    EditText editText;

    Button f;
    Button s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hash = findViewById(R.id.Hash);
        tree = findViewById(R.id.Tree);
        editText = findViewById(R.id.edit);
        f = findViewById(R.id.f);
        s = findViewById(R.id.s);

        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();


        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hashSet.add(editText.getText().toString());
                treeSet.add(editText.getText().toString());
                editText.setText("");
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hash.setText(hashSet.toString());
                tree.setText(treeSet.toString());
            }
        });




    }

}