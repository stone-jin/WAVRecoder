package com.edu.util;

import java.util.Stack;

import android.app.Activity;

public class ActivityManager {

	private static Stack<Activity> activities = new Stack<Activity>();
	private static Activity current;
	
	public static Activity getCurrent(){
		return current;
	}
	
	public static void pop(){
		if(!activities.isEmpty()){
			current = activities.peek();
		}else{
			current = null;
		}
	}
	
	public static void popall(){
		for(Activity activity : activities){
			activity.finish();
		}
		current = null;
	}
	
	public static void push(Activity activity){
		if(current != activity){
			current = activities.push(activity);
		}
	}
	
	public static int getSize(){
		return activities.size();
	}
}
