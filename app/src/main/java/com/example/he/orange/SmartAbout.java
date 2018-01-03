package com.example.he.orange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HE on 2017/3/24.
 */

public class SmartAbout extends AppCompatActivity {
    private List<ContentItem> ContentItemList=new ArrayList<>();
    public void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.allitemlayout);
        initSmartAbout();
        smartAdapter adapter=new smartAdapter(SmartAbout.this,R.layout.smart_content,ContentItemList);
        ListView listView=(ListView)findViewById(R.id.allList);
        listView.setAdapter(adapter);
    }
    private void initSmartAbout(){
        //ContentItem contentItem1=new ContentItem("Chipset","MTK6572");
        //ContentItemList.add(contentItem1);
        ContentItem contentItem1=new ContentItem("Model","V8");
        ContentItemList.add(contentItem1);
        ContentItem contentItem2=new ContentItem("CPU","MTK6572");
        ContentItemList.add(contentItem2);
        ContentItem contentItem3=new ContentItem("GPU","Mali-400");
        ContentItemList.add(contentItem3);
        ContentItem contentItem6=new ContentItem("Storage","512MB+4GB");
        ContentItemList.add(contentItem6);
        ContentItem contentItem7=new ContentItem("Camera","Front camera 0.3MEGA\nMain camera 200MEGA");
        ContentItemList.add(contentItem7);
        ContentItem contentItem4=new ContentItem("Band","GSM:850/900/1800/1900Mhz\n3G:WCDMA850/2100Mhz");
        ContentItemList.add(contentItem4);
        ContentItem contentItem5=new ContentItem("LCD","FWVGA");
        ContentItemList.add(contentItem5);
        ContentItem contentItem9=new ContentItem("","");
        ContentItemList.add(contentItem9);
        //ContentItem contentItem8=new ContentItem("Front Camera","2.0MP");
        //ContentItemList.add(contentItem8);
        //ContentItem contentItem9=new ContentItem("Rear Camera","5.0MP");
        //ContentItemList.add(contentItem9);
        /*ContentItem contentItem10=new ContentItem("COMILLA","Zilla porishod Super Market (2nd Floor) Comilla.\n+8801841122719");
        ContentItemList.add(contentItem10);
        ContentItem contentItem11=new ContentItem("KUSHTIA","Shop#7,12/9Sir Soyed Ahmed Road,(5Raster More) Thanapara, Kushtia\n+8801841122726");
        ContentItemList.add(contentItem11);
        ContentItem contentItem12=new ContentItem("COMPLAIN","+8801841122759");
        */
    }
}
