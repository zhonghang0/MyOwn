package com.example.listtest;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	ListView lv;
	ArrayList<Mobile> array = new ArrayList<Mobile>();
	LayoutInflater inflater;
	MyAdapter ma;

	// 加点注释
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		inflater = getLayoutInflater();
		lv = (ListView) findViewById(R.id.listView);
		initData();
		Button btn = (Button) findViewById(R.id.btnAdd);
		btn.setOnClickListener(this);
		Button btnDelete = (Button) findViewById(R.id.btnDelete);
		btnDelete.setOnClickListener(this);
		initListView();
	}

	private void initData() {
		Mobile anycall = new Mobile(R.drawable.anycall, "三星", "心意合一思密达",
				"112个人赞");
		Mobile huawei = new Mobile(R.drawable.huawei, "华为", "不仅仅是五百强", "110个人赞");
		Mobile berry = new Mobile(R.drawable.berry, "黑莓", "奥观海的手机，不仅仅是安全",
				"11个人赞");
		Mobile nokia = new Mobile(R.drawable.nokia, "诺基亚", "windows负责蓝屏，我负责抗摔",
				"112个人赞");
		Mobile duowei = new Mobile(R.drawable.duowei, "朵唯", "比ps还好使", "112个人赞");
		Mobile htc = new Mobile(R.drawable.htc, "多普达", "火腿肠", "112个人赞");
		array.add(anycall);
		array.add(huawei);
		array.add(berry);
		array.add(nokia);
		array.add(duowei);
		array.add(htc);
	}

	private void initListView() {
		ma = new MyAdapter(array);
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
						"长按" + array.get(position).title, Toast.LENGTH_SHORT)
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
	 * 将所有的数据以一种显示方式显示到listView中
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
		public View getView(final int position, View convertView,
				ViewGroup parent) {
			ViewHolder vh = null;
			if (convertView == null) {
				vh = new ViewHolder();
				convertView = inflater.inflate(R.layout.myitem, null);
				vh.iv = (ImageView) convertView.findViewById(R.id.iv);
				vh.title = (TextView) convertView.findViewById(R.id.tvTitle);
				vh.content = (TextView) convertView
						.findViewById(R.id.tvContent);
				vh.follow = (TextView) convertView.findViewById(R.id.tvFollow);
				vh.cb = (CheckBox) convertView.findViewById(R.id.checkBox1);
				convertView.setTag(vh);
				// TODO Auto-generated method stub
			}
			vh = (ViewHolder) convertView.getTag();
			vh.cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					// TODO Auto-generated method stub
					list.get(position).setChecked(isChecked);
				}
			});
			vh.cb.setChecked(list.get(position).isChecked);

			vh.iv.setImageResource(list.get(position).img);
			vh.title.setText(list.get(position).title);
			vh.content.setText(list.get(position).content);
			vh.follow.setText(list.get(position).follow);
			return convertView;
		}

		class ViewHolder {
			ImageView iv;
			TextView title;
			TextView content;
			TextView follow;
			CheckBox cb;
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnAdd:
			Intent intent = new Intent(getApplicationContext(),
					GrideActivityTest.class);
			startActivity(intent);
			break;
		case R.id.btnDelete:

			break;

		default:
			break;
		}
	}
}
