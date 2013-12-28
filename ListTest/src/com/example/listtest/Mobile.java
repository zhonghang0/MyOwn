package com.example.listtest;

public class Mobile {
	int img;
	String title;
	String content;
	String follow;
	boolean isChecked;

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	public Mobile(int img, String title, String content, String follow) {
		this.img = img;
		this.title = title;
		this.content = content;
		this.follow = follow;
	}
}
