package com.example.a01c10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class ShowGridView1 extends Activity implements OnItemClickListener{
	GridView gv;
	testOption[] tos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_grid_view1);
		
		gv=(GridView) findViewById(R.id.gridView1);
		//������������ImageItem <====> ��̬�����Ԫ�أ�����һһ��Ӧ
		SimpleAdapter simpleAdapter = new SimpleAdapter(this,
                getData(),//������Դ   
                R.layout.gv1,//gridview�ڲ����ֵ��ļ�                
                new String[] {"ItemImage","ItemText"},//Ҫ��ȡ��ģ�����ݵļ�
                new int[] {R.id.ItemImage,R.id.ItemText}); //ģ�����ݵļ���Ӧ��ֵ������2���ؼ���
		gv.setAdapter(simpleAdapter);
		gv.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_grid_view1, menu);
		return true;
	}
	
	//���ɶ�̬���飬����ת������  
	private List<Map<String, Object>> getData(){
		//�����������
		tos =new testOption[15];
		tos[0]=new testOption(R.drawable.ic_1,"NO.1");
		tos[1]=new testOption(R.drawable.ic_2,"NO.2");
		tos[2]=new testOption(R.drawable.ic_3,"NO.3");
		tos[3]=new testOption(R.drawable.ic_4,"NO.4");
		tos[4]=new testOption(R.drawable.ic_5,"NO.5");
		tos[5]=new testOption(R.drawable.ic_6,"NO.6");
		tos[6]=new testOption(R.drawable.ic_7,"NO.7");
		tos[7]=new testOption(R.drawable.ic_8,"NO.8");
		tos[8]=new testOption(R.drawable.ic_9,"NO.9");
		tos[9]=new testOption(R.drawable.ic_10,"NO.10");
		tos[10]=new testOption(R.drawable.ic_11,"NO.11");
		tos[11]=new testOption(R.drawable.ic_12,"NO.12");
		tos[12]=new testOption(R.drawable.ic_13,"NO.13");
		tos[13]=new testOption(R.drawable.ic_14,"NO.14");
		tos[14]=new testOption(R.drawable.ic_15,"NO.15");
		
		
		
		
		List<Map<String, Object>> l = new ArrayList<Map<String, Object>>();
		
		for(int i=0;i<tos.length;i++){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", tos[i].getIcon());
			map.put("ItemText", tos[i].getName());
			l.add(map);
		}
		
		
		return l;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
		// TODO Auto-generated method stub
		Intent intent =new Intent(ShowGridView1.this,ShowView1.class);
		
		//testOptionʵ�������ʵ��Serializable�ӿڣ������л�
		intent.putExtra("item", tos[position]);
		
		ShowGridView1.this.startActivity(intent);
	}

}
