package com.soboapps.namecaller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class NameCallerActivity extends Activity {
	    /** Called when the activity is first created. */

		//MediaPlayer mpSplash;
		protected boolean _active = true;
		protected int _splashTime = 5000; // time to display the splash screen in ms
			
		@Override
		public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.splash);
		 
		    // thread for displaying the SplashScreen
		    Thread splashTread = new Thread() {
		        @Override
		        public void run() {
		            try {
		                int waited = 0;
		                while(_active && (waited < _splashTime)) {
		                    sleep(100);
		                    if(_active) {
		                        waited += 100;
		                    }
		                }
		            } catch(InterruptedException e) {
		                // do nothing
		            } finally {
		                finish();
		                startActivity(new Intent("com.soboapps.namecaller.MYMENU"));
		                interrupt();
		            }
		        }
		    };
		    splashTread.start();
		}
		@Override
		public boolean onTouchEvent(MotionEvent event) {
		    if (event.getAction() == MotionEvent.ACTION_DOWN) {
		        _active = false;
		    }
		    return true;
		}
}