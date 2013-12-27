package com.example.listtest;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	ListView lv;
	ArrayList<Mobile> array = new ArrayList<Mobile>();
	LayoutInflater inflater;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		inflater = getLayoutInflater();
		lv = (ListView) findViewById(R.id.listView);
		Mobile anycall = new Mobile(R.drawable.anycall, "����", "�����һ˼�ܴ�",
				"112������");
		Mobile huawei = new Mobile(R.drawable.huawei, "��Ϊ", "�����������ǿ", "110������");
		Mobile berry = new Mobile(R.drawable.berry, "��ݮ", "�¹ۺ����ֻ����������ǰ�ȫ",
				"11������");
		Mobile nokia = new Mobile(R.drawable.nokia, "ŵ����", "windows�����������Ҹ���ˤ",
				"112������");
		Mobile duowei = new Mobile(R.drawable.duowei, "��Ψ", "��ps����ʹ", "112������");
		Mobile htc = new Mobile(R.drawable.htc, "���մ�", "���ȳ�", "112������");
		array.add(anycall);
		array.add(huawei);
		array.add(berry);
		array.add(nokia);
		array.add(duowei);
		array.add(htc);
		MyAdapter ma = new MyAdapter(array);
		lv.setAdapter(ma);
		lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),
						array.get(position).title, Toast.LENGTH_SHORT).show();
			}
		});
		lv.setOnItemLongClickListener(new OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),
						"����" + array.get(position).title, Toast.LENGTH_SHORT)
						.show();
				return true;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * �����е�������һ����ʾ��ʽ��ʾ��listView��
	 * 
	 * @author excuce
	 * 
	 */
	class MyAdapter extends BaseAdapter {
		ArrayList<Mobile> list;

		public MyAdapter(ArrayList<Mobile> list) {
			this.list = list;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
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
			// TODO Auto-generated method stub
			View view = inflater.inflate(R.layout.myitem, null);
			ImageView iv = (ImageView) view.findViewById(R.id.iv);
			iv.setImageResource(list.get(position).img);
			TextView title = (TextView) view.findViewById(R.id.tvTitle);
			TextView content = (TextView) view.findViewById(R.id.tvContent);
			TextView follow = (TextView) view.findViewById(R.id.tvFollow);
			title.setText(list.get(position).title);
			content.setText(list.get(position).content);
			follow.setText(list.get(position).follow);
			return view;
		}
	}
}
