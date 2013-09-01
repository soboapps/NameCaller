package com.soboapps.namecaller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class myMenu extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// Mad Button
		ImageButton ibtnMad = (ImageButton) findViewById(R.id.ibtMad);
		ibtnMad.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.soboapps.namecaller.MWORDLIST"));
			}
		});

		// Love Button
		ImageButton ibtnLove = (ImageButton) findViewById(R.id.ibtLove);
		ibtnLove.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.soboapps.namecaller.LWORDLIST"));
			}
		});
		
}
	
		public boolean onCreateOptionsMenu(Menu menu){
			super.onCreateOptionsMenu(menu);
			MenuInflater aboutnc = getMenuInflater();
			aboutnc.inflate(R.menu.main_menu, menu);
			return true;
		}
		
		public boolean onOptionsItemSelected(MenuItem item){
			switch(item.getItemId()){
			case R.id.menuAbout:
				startActivity(new Intent("com.soboapps.namecaller.ABOUT"));
				return true;		
			}
			return false;
		}
}
