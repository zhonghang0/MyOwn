package com.example.listtest;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class GrideActivityTest extends Activity {
	ArrayList<Mobile> array = new ArrayList<Mobile>();
	LayoutInflater inflater;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gride);
		inflater = getLayoutInflater();
		GridView gv = (GridView) findViewById(R.id.gridView1);
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
		MyGridAdapter mga = new MyGridAdapter();
		gv.setAdapter(mga);
	}

	class MyGridAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return array.size();
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
			ViewHolder vh = null;
			if (convertView == null) {
				vh = new ViewHolder();
				convertView = inflater.inflate(R.layout.griditem, null);
				vh.iv = (ImageView) convertView.findViewById(R.id.imageView1);
				vh.tv = (TextView) convertView.findViewById(R.id.textView1);
				convertView.setTag(vh);
			}
			vh = (ViewHolder) convertView.getTag();
			vh.iv.setImageResource(array.get(position).img);
			vh.tv.setText(array.get(position).title);
			return convertView;
		}

		class ViewHolder {
			ImageView iv;
			TextView tv;
		}

	}
}
