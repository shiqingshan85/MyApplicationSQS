package com.example.administrator.myapplicationsqs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017-01-03.
 */

public abstract class  MyBaseAdapter extends BaseExpandableListAdapter {
    Context mContext;
    LayoutInflater layoutInflater;
    MyBaseAdapter(Context context){
        this.mContext=context;
        layoutInflater=LayoutInflater.from(mContext);
    }
    List<String> groups;List<List<String>>childs;
    public void addMyData(List<String> groups,List<List<String>>childs){
        this.groups=groups;
        this.childs=childs;
    }
    @Override
    public int getGroupCount() {
        return groups.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childs.get(groupPosition).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groups.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childs.get(groupPosition).get(childPosition) ;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        return getMyGroupView(groupPosition,convertView);
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return getMyChildView(groupPosition,childPosition,convertView);
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
    public abstract View getMyGroupView(int groupPosition, View groupView);
    public abstract  View getMyChildView(int groupPosition, int childPosition,View childView);
}
