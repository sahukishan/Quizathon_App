package com.example.quiz_app;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Quzathon_List_Adapter extends BaseAdapter{
	ArrayList<String> list;
	Context context;
	LayoutInflater inflater;
	int width, height;

	public Quzathon_List_Adapter(Context context, ArrayList<String> list2, int width, int height) {
		this.list = list2;
		this.context = context;
		this.width = width;
		this.height = height;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolderItem viewHolder;
		if (convertView == null) {

			// inflate the layout
			convertView = inflater.inflate(R.layout.adapter_quizathon_list, parent, false);
			viewHolder = new ViewHolderItem();
			
			viewHolder.mQuiz_Layout = (LinearLayout) convertView.findViewById(R.id.quiz_layout);
			LayoutParams savedParams = viewHolder.mQuiz_Layout.getLayoutParams();
			savedParams.width = (width /4) * 3;
			savedParams.height = width / 3; 
			
			viewHolder.mQuiz_name = (TextView) convertView.findViewById(R.id.quiz_name);
			viewHolder.mQuiz_name.setText(list.get(position));
			
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolderItem) convertView.getTag();
		}
		
		
		return convertView;
	}
	
	public class ViewHolderItem {
	   LinearLayout mQuiz_Layout;
	   TextView mQuiz_name;
	}

}
