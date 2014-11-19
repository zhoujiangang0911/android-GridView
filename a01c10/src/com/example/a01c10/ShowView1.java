package com.example.a01c10;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowView1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_view1);
		
		//获取传过来的参数并还原为对象
		Intent intent =getIntent();
		testOption to=(testOption)intent.getSerializableExtra("item");
		
		//指定图片
		ImageView iv=(ImageView)findViewById(R.id.imageView1);
		iv.setImageResource(to.getIcon());
		
		//指定文字
		TextView tv=(TextView)findViewById(R.id.textView1);
		tv.setText(to.getName());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_view1, menu);
		return true;
	}

}
