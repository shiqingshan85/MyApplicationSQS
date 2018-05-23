package com.example.administrator.myapplicationsqs;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-01-03.
 */

public class MyAdapter extends MyBaseAdapter {
    MyAdapter(Context context) {
        super(context);
    }

    @Override
    public View getMyGroupView(int groupPosition, View groupView) {
        View view=layoutInflater.inflate(R.layout.item_elv_group,null);
        TextView tv_group= (TextView) view.findViewById(R.id.tv_group_data);
        tv_group.setText((String)getGroup(groupPosition));
        return view;


    }


    @Override
    public View getMyChildView(int groupPosition, int childPosition, View childView) {
        View view1=layoutInflater.inflate(R.layout.elv_childs,null);
        TextView tv_group= (TextView) view1.findViewById(R.id.tv_group_data2);
        tv_group.setText((String)getChild(groupPosition,childPosition));
        return view1;

    }
}
