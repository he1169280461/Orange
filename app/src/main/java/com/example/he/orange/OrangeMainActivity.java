package com.example.he.orange;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class OrangeMainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] data={"Orange V8 feature","Orange care info","Orange sales info","Find us"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(OrangeMainActivity.this,android.R.layout.simple_list_item_1,data);
        listView=(ListView)findViewById(R.id.mainlist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(OrangeMainActivity.this,SmartAbout.class);
                    startActivity(intent);
                }else if(position==1){
                    Intent intent=new Intent(OrangeMainActivity.this,SmartCare.class);
                    startActivity(intent);
                }else if(position==2){
                    Intent intent=new Intent(OrangeMainActivity.this,Orangesaleinfo.class);
                    startActivity(intent);
                }else if(position==3){
                    Intent intent=new Intent(OrangeMainActivity.this,Findus.class);
                    startActivity(intent);
                }
            }
        });
    }
}

