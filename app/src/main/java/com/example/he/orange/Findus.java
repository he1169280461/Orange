package com.example.he.orange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HE on 2017/3/24.
 */

public class Findus extends AppCompatActivity {
    private List<ContentItem> ContentItemList=new ArrayList<>();
    public void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.allitemlayout);
        initSmartCare();
        smartAdapter adapter=new smartAdapter(Findus.this,R.layout.smart_content,ContentItemList);
        ListView listView=(ListView)findViewById(R.id.allList);
        listView.setAdapter(adapter);
    }
    private void initSmartCare(){
        ContentItem contentItem1=new ContentItem("Corporate Office","7/1, Eastern Plaza Commercial Complex, 70 Bir Uttam C R Dutta Road, Hatirpool, Dhaka-1205.\nTel: +88 02 9612161");
        ContentItemList.add(contentItem1);
        ContentItem contentItem2=new ContentItem("Registered Office","558 (4th Floor), 8 Paribagh, Hatripool, Dhaka-1205, Bangladesh,\nTel: +88 02 9667969");
        ContentItemList.add(contentItem2);
        ContentItem contentItem3=new ContentItem("Marketing Office","304 (3rd floor), Elephant Road, Dhaka-1205, Bangladesh,\nMob: +88 01770611844");
        ContentItemList.add(contentItem3);
        ContentItem contentItem4=new ContentItem("www.orangemobilebd.com.","www.facebook.com/orangephone.");
        ContentItemList.add(contentItem4);
        ContentItem contentItem5=new ContentItem("","");
        ContentItemList.add(contentItem5);

    }
}

