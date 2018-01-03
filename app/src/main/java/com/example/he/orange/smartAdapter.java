package com.example.he.orange;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HE on 2017/3/24.
 */

public class smartAdapter extends ArrayAdapter<ContentItem> {
    private int resourceId;
    public smartAdapter(Context context, int textViewResourceId,List<ContentItem> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        ContentItem contentItem=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null){
            view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.smartTitle=(TextView)view.findViewById(R.id.title_smart);
            viewHolder.smartContent=(TextView)view.findViewById(R.id.content_smart);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.smartTitle.setText(contentItem.getTitle_smart());
        viewHolder.smartContent.setText(contentItem.getContent_smart());
        return view;
    }
    class ViewHolder{
        TextView smartTitle;
        TextView smartContent;
    }
}
