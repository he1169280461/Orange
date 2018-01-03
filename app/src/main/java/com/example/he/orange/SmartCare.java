package com.example.he.orange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HE on 2017/3/24.
 */

public class SmartCare extends AppCompatActivity {
    private List<ContentItem> ContentItemList=new ArrayList<>();
    public void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.allitemlayout);
        initSmartCare();
        smartAdapter adapter=new smartAdapter(SmartCare.this,R.layout.smart_content,ContentItemList);
        ListView listView=(ListView)findViewById(R.id.allList);
        listView.setAdapter(adapter);
    }
    private void initSmartCare(){
        ContentItem contentItem0=new ContentItem("Orange care:","");
        ContentItemList.add(contentItem0);
        ContentItem contentItem1=new ContentItem("1: Hot line","01708494742");
        ContentItemList.add(contentItem1);
        ContentItem contentItem2=new ContentItem("2: Dhaka Head office","01708494744");
        ContentItemList.add(contentItem2);
        ContentItem contentItem3=new ContentItem("3: Dhaka Head office","01708494745");
        ContentItemList.add(contentItem3);
        ContentItem contentItem4=new ContentItem("4: Dhaka Head office","01708494746");
        ContentItemList.add(contentItem4);
        ContentItem contentItem5=new ContentItem("5: Dhaka Head office","01708494747");
        ContentItemList.add(contentItem5);
        ContentItem contentItem6=new ContentItem("6: Dhaka Estern Plaza","01708494750");
        ContentItemList.add(contentItem6);
        ContentItem contentItem7=new ContentItem("7: Dhaka Gulistan","01708494751");
        ContentItemList.add(contentItem7);
        ContentItem contentItem8=new ContentItem("8: Khulna","01708494748");
        ContentItemList.add(contentItem8);
        ContentItem contentItem9=new ContentItem("9: Khustia","01708494749");
        ContentItemList.add(contentItem9);
        ContentItem contentItem10=new ContentItem("10: Gazipur","01708494752");
        ContentItemList.add(contentItem10);
        ContentItem contentItem11=new ContentItem("11: Pabna","01708494754");
        ContentItemList.add(contentItem11);
        ContentItem contentItem12=new ContentItem("12: Bogra","01708494755");
        ContentItemList.add(contentItem12);
        ContentItem contentItem13=new ContentItem("13: Rajsahi","01708494756");
        ContentItemList.add(contentItem13);
        ContentItem contentItem14=new ContentItem("14: Rangpur","01708494757");
        ContentItemList.add(contentItem14);
        ContentItem contentItem15=new ContentItem("15: CTG","01708494758");
        ContentItemList.add(contentItem15);
        ContentItem contentItem16=new ContentItem("16: Barisal","01708494759");
        ContentItemList.add(contentItem16);
        ContentItem contentItem17=new ContentItem("17: Sylhet","01708494760");
        ContentItemList.add(contentItem17);
        ContentItem contentItem18=new ContentItem("","");
        ContentItemList.add(contentItem18);
    }
}

