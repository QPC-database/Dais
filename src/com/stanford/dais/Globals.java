package com.stanford.dais; 


import java.util.ArrayList;

import android.app.Application;
import android.content.Context;

public class Globals extends Application {
	
	public float mTimeLeft = 0; 
	public float mTimeRight = 0; 
	public float mHeadingLeft = 0; 
	public float mHeadingRight = 0; 
	
	public ArrayList<Float> orientations = new ArrayList<Float>(); 
		
	@Override
	public void onCreate() {
		super.onCreate();
	}
	
}