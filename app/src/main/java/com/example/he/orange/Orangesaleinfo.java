package com.example.he.orange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HE on 2017/3/24.
 */

public class Orangesaleinfo extends AppCompatActivity {
    private List<ContentItem> ContentItemList=new ArrayList<>();
    public void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.allitemlayout);
        initSmartCare();
        smartAdapter adapter=new smartAdapter(Orangesaleinfo.this,R.layout.smart_content,ContentItemList);
        ListView listView=(ListView)findViewById(R.id.allList);
        listView.setAdapter(adapter);
    }
    private void initSmartCare(){
        ContentItem contentItem1=new ContentItem("Sale info","Corporate Office,7/1, Eastern Plaza Commercial Complex");
        ContentItemList.add(contentItem1);
        ContentItem contentItem2=new ContentItem("1: Dhaka","01708494721");
        ContentItemList.add(contentItem2);
        ContentItem contentItem3=new ContentItem("2: Dhaka","01708494722");
        ContentItemList.add(contentItem3);
        ContentItem contentItem4=new ContentItem("3: Dhaka","01708494723");
        ContentItemList.add(contentItem4);
        ContentItem contentItem5=new ContentItem("4: Bogra","01708494724");
        ContentItemList.add(contentItem5);
        ContentItem contentItem6=new ContentItem("5: CTG","01708494725");
        ContentItemList.add(contentItem6);
        ContentItem contentItem7=new ContentItem("6: Khulna","01708494726");
        ContentItemList.add(contentItem7);
        ContentItem contentItem8=new ContentItem("7: Khustia","01708494727");
        ContentItemList.add(contentItem8);
        ContentItem contentItem9=new ContentItem("8: Maymenshing","01708494728");
        ContentItemList.add(contentItem9);
        ContentItem contentItem10=new ContentItem("9: Rongpur","01708494729");
        ContentItemList.add(contentItem10);
        ContentItem contentItem11=new ContentItem("10: Rajshahi","01708494730");
        ContentItemList.add(contentItem11);
        ContentItem contentItem12=new ContentItem("11: Comilla","017084947301");
        ContentItemList.add(contentItem12);
        ContentItem contentItem13=new ContentItem("12: Barisal","01708494732");
        ContentItemList.add(contentItem13);
        ContentItem contentItem14=new ContentItem("13: Sylhet","01708494733");
        ContentItemList.add(contentItem14);
        ContentItem contentItem15=new ContentItem("","");
        ContentItemList.add(contentItem15);
    }
}

