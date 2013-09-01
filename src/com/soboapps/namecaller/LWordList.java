package com.soboapps.namecaller;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class LWordList extends Activity implements TextToSpeech.OnInitListener{
	
	private TextToSpeech tts;
	private Button btnLSay;
	private TextView mshow_text;
	
	/** Called when the activity is first created. */

		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.love);
				
			Button btnls = (Button) findViewById(R.id.btLeftSpin);
	        Button btnrs = (Button) findViewById(R.id.btRightSpin);
	        Button btns = (Button) findViewById(R.id.btSpin);
	        btnLSay = (Button) findViewById(R.id.btLSayit);
			final TextView tvRight = (TextView) findViewById(R.id.tvRightWord);
			final TextView tvLeft = (TextView) findViewById(R.id.tvLeftWord);
			final Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/UNIVERSALFRUITCAKE.ttf");
			mshow_text=(TextView) findViewById(R.id.lshow_text);
			tts = new TextToSpeech(this, this);
			
// Code for Left Spin 
		btnls.setOnClickListener(new View.OnClickListener() {	
		public void onClick(View v) {
			Random generator = new Random();
			int num;
				// Left Love Word
				String[] llword;
				String l,r;
				llword= new String[32];
				llword[0]="Sweet";
				llword[1]="Hot";
				llword[2]="Snuggle";
				llword[3]="Honey";
				llword[4]="Sugar";
				llword[5]="Pudding";
				llword[6]="YumYum";
				llword[7]="Pookey";
				llword[8]="Pooh";
				llword[9]="Love";
				llword[10]="pleasure";
				llword[11]="Sex";
				llword[12]="Pumpkin";
				llword[13]="Lover";
				llword[14]="Puffin";
				llword[15]="Stud";
				llword[16]="Doodle";
				llword[17]="Lovie";
				llword[18]="Snooker";
				llword[19]="Twinkle";
				llword[20]="Beau";
				llword[21]="Cutie";
				llword[22]="Lovie";
				llword[23]="Baby";
				llword[24]="Cream";
				llword[25]="Cuddley";
				llword[26]="Warm";
				llword[27]="Joy";
				llword[28]="Cutesy";
				llword[29]="Angel";
				llword[30]="Tootsie";
				llword[31]="Googly";
				

			// Random Left Word
				num=generator.nextInt(32);
				tvLeft.setTypeface(tf);
		        tvLeft.setText(llword[num]);
		        
				r=tvRight.getText().toString();
				l=tvLeft.getText().toString();
				mshow_text.setText("Honey, your my"+l+r);
		}
	});
	
// Code for Right Spin      
        btnrs.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Random generator = new Random();
			int num;
			// Right Love Word	
				String[] rlword;
				String l,r;
				rlword= new String[32];
				rlword[0]="Pie";
				rlword[1]="Lips";
				rlword[2]="Bunny";
				rlword[3]="Pie";
				rlword[4]="Britches";
				rlword[5]="Pants";
				rlword[6]="Butt";
				rlword[7]="Love";
				rlword[8]="Bear";
				rlword[9]="Muffin";
				rlword[10]="Kitten";
				rlword[11]="Monkey";
				rlword[12]="Pea";
				rlword[13]="Boo";
				rlword[14]="Puppy";
				rlword[15]="Bug";
				rlword[16]="Stuff";
				rlword[17]="Dovie";
				rlword[18]="Pots";
				rlword[19]="Bun";
				rlword[20]="Plum";
				rlword[21]="Tuffin";
				rlword[22]="Wuddley";
				rlword[23]="Bumpkins";
				rlword[24]="Doll";
				rlword[25]="Bisket";
				rlword[26]="Cakes";
				rlword[27]="Face";
				rlword[28]="Button";
				rlword[29]="Muppet";
				rlword[30]="Wootsie";
				rlword[31]="Woogly";
			
			
			// Random Right Word
				num=generator.nextInt(32);
				tvRight.setTypeface(tf);
				tvRight.setText(rlword[num]);
				
				r=tvRight.getText().toString();
				l=tvLeft.getText().toString();
				mshow_text.setText("Honey, your my"+l+r);
		}
	});	
			
// Code for Spin on Both        
        btns.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Random generator = new Random();
			int num;
				// Left Love Word
				String[] llword;
				String l,r;
				llword= new String[32];
				llword[0]="Sweet";
				llword[1]="Hot";
				llword[2]="Snuggle";
				llword[3]="Honey";
				llword[4]="Sugar";
				llword[5]="Pudding";
				llword[6]="YumYum";
				llword[7]="Pookey";
				llword[8]="Pooh";
				llword[9]="Love";
				llword[10]="pleasure";
				llword[11]="Sex";
				llword[12]="Pumpkin";
				llword[13]="Lover";
				llword[14]="Puffin";
				llword[15]="Stud";
				llword[16]="Doodle";
				llword[17]="Lovie";
				llword[18]="Snooker";
				llword[19]="Twinkle";
				llword[20]="Beau";
				llword[21]="Cutie";
				llword[22]="Lovie";
				llword[23]="Baby";
				llword[24]="Cream";
				llword[25]="Cuddley";
				llword[26]="Warm";
				llword[27]="Joy";
				llword[28]="Cutesy";
				llword[29]="Angel";
				llword[30]="Tootsie";
				llword[31]="Googly";

			// Right Love Word	
			    String[] rlword;
				rlword= new String[32];
				rlword[0]="Pie";
				rlword[1]="Lips";
				rlword[2]="Bunny";
				rlword[3]="Pie";
				rlword[4]="Britches";
				rlword[5]="Pants";
				rlword[6]="Butt";
				rlword[7]="Love";
				rlword[8]="Bear";
				rlword[9]="Muffin";
				rlword[10]="Kitten";
				rlword[11]="Monkey";
				rlword[12]="Pea";
				rlword[13]="Boo";
				rlword[14]="Puppy";
				rlword[15]="Bug";
				rlword[16]="Stuff";
				rlword[17]="Dovie";
				rlword[18]="Pots";
				rlword[19]="Bun";
				rlword[20]="Plum";
				rlword[21]="Tuffin";
				rlword[22]="Wuddley";
				rlword[23]="Bumpkins";
				rlword[24]="Doll";
				rlword[25]="Bisket";
				rlword[26]="Cakes";
				rlword[27]="Face";
				rlword[28]="Button";
				rlword[29]="Muppet";
				rlword[30]="Wootsie";
				rlword[31]="Woogly";
				
			// Random Left Word 
				num=generator.nextInt(32);
				tvLeft.setTypeface(tf);
				tvLeft.setText(llword[num]);
			
			// Random Right Word
				num=generator.nextInt(32);
				tvRight.setTypeface(tf);
				tvRight.setText(rlword[num]);
				
				r=tvRight.getText().toString();
				l=tvLeft.getText().toString();
				mshow_text.setText("Honey, your my"+l+r);
		}
	});
//}
		
        btnLSay.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View arg0) {
                speakOut();
            }
 
        });
		}
      
	    //@Override
	    public void onDestroy() {
	        // Don't forget to shutdown tts!
	        if (tts != null) {
	            tts.stop();
	            tts.shutdown();
	        }
	        super.onDestroy();
	    }
	 
	    //@Override
	    public void onInit(int status) {
	 
	        if (status == TextToSpeech.SUCCESS) {
	 
	            int result = tts.setLanguage(Locale.US);
	 
	            if (result == TextToSpeech.LANG_MISSING_DATA
	                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
	                Log.e("TTS", "This Language is not supported");
	            } else {
	                btnLSay.setEnabled(true);
	                speakOut();
	            }
	 
	        } else {
	            Log.e("TTS", "Initilization Failed!");
	        }
	 
	    }
	 
	    private void speakOut() {
	 
	        String text = mshow_text.getText().toString();
	 
	        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
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
