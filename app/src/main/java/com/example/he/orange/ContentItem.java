package com.example.he.orange;

/**
 * Created by HE on 2017/3/24.
 */

public class ContentItem {
    private String Title_smart;
    private String Content_smart;
    public ContentItem(String Title_smart, String Content_smart){
        this.Content_smart=Content_smart;
        this.Title_smart=Title_smart;
    }

    public String getContent_smart() {
        return Content_smart;
    }

    public String getTitle_smart() {
        return Title_smart;
    }
}
