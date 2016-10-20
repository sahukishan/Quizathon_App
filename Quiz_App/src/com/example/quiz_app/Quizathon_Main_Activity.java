package com.example.quiz_app;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;

public class Quizathon_Main_Activity extends Activity {
	TextView mQuizathon_title_textview;
	ListView mQuizathon_list;
	Quzathon_List_Adapter mQuzathon_lista_adapter;
	ArrayList<String> Quiz_names;
	int mScreen_Width, mScreen_Height;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Quiz_names = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Quiz_names.add("Quiz"+i);
		}
		
		 DisplayMetrics metrics =new DisplayMetrics();
		 getWindowManager().getDefaultDisplay().getMetrics(metrics);
		 mScreen_Width = metrics.widthPixels;
		 mScreen_Height = metrics.heightPixels;
		 

		mQuizathon_title_textview = (TextView) findViewById(R.id.quizathon_title_textview);
		mQuizathon_list = (ListView) findViewById(R.id.quizathon_list);
//		mQuizathon_list.getLayoutParams().width = mScreen_Width / 2;
		
		mQuzathon_lista_adapter = new Quzathon_List_Adapter(Quizathon_Main_Activity.this, Quiz_names, mScreen_Width, mScreen_Height);
		mQuizathon_list.setAdapter(mQuzathon_lista_adapter);

		String udata = "Quizathon";
		SpannableString content = new SpannableString(udata);
		content.setSpan(new UnderlineSpan(), 0, udata.length(), 0);
		mQuizathon_title_textview.setText(content);
	}
}
