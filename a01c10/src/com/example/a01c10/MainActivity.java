package com.example.a01c10;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//�򵥵�GridView
		Button bt1=(Button)findViewById(R.id.button1);
		bt1.setOnClickListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//��ť������
	OnClickListener listener=new OnClickListener() {
		
		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			Button bt=(Button)view;
			switch(bt.getId()){
			case R.id.button1://�򵥵�GridView
				Intent intent1 =getIntent();
				intent1.setClass(MainActivity.this, ShowGridView1.class);
				MainActivity.this.startActivity(intent1);
				break;
			}
		}
	};

}
