package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class CountCals extends AppCompatActivity {
//    JSONObject jsonObject = new JSONObject();
    private ListView lv;
    ArrayList<HashMap<String, String>> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number);
        lv = (ListView) findViewById(R.id.listview);
        arrayList = new ArrayList<>();
        Intent intent = getIntent();
        String historyCount = intent.getStringExtra("HistoryCount");
//        ListView history = (ListView) findViewById(R.id.listHistory);
//        TextView history1 = (TextView) findViewById(R.id.txt_history1);
//        TextView history2 = (TextView) findViewById(R.id.txt_history2);
//        TextView history3 = (TextView) findViewById(R.id.txt_history3);
//        TextView history4 = (TextView) findViewById(R.id.txt_history4);
//        TextView history5 = (TextView) findViewById(R.id.txt_history5);
//        TextView history6 = (TextView) findViewById(R.id.txt_history6);
//        TextView history7 = (TextView) findViewById(R.id.txt_history7);
//        TextView history8 = (TextView) findViewById(R.id.txt_history8);
//        TextView history9 = (TextView) findViewById(R.id.txt_history9);
//        TextView history10 = (TextView) findViewById(R.id.txt_history10);

//        history.setText("You've calculated " + historyCount + " times");'
//        history1.setText(readFromFile("HistoryCalculator.json"));
    }
    public String readFromFile(String fileName) {
        File path = getApplicationContext().getFilesDir();
//        File readFrom = new File(path,fileName);
//        byte[] content = new byte[(int) readFrom.length()];
//
//        try {
//            FileInputStream stream = new FileInputStream(readFrom);
//            stream.read(content);
//            return new String(content);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return e.toString();
//        }
        String file = path + "/" + fileName;
        try {
            JSONObject reader = new JSONObject(file);
            JSONArray historyArr = reader.getJSONArray();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
