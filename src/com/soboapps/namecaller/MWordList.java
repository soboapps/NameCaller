package com.soboapps.namecaller;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
//import android.widget.EditText;
//import android.widget.LinearLayout;
//import com.google.ads.*;


public class MWordList extends Activity implements TextToSpeech.OnInitListener{

	
	/** Called when the activity is first created. */
	
	private TextToSpeech tts;
	private int MY_DATA_CHECK_CODE = 0;
	private Button btnMSay;
	private TextView mshow_text;
	
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.mad);
			
            // check for TTS data
            Intent checkTTSIntent = new Intent();
            checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
            startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);
			
			Button btnls = (Button) findViewById(R.id.btLeftSpin);
	        Button btnrs = (Button) findViewById(R.id.btRightSpin);
	        Button btns = (Button) findViewById(R.id.btSpin);
	        btnMSay = (Button) findViewById(R.id.btMSayit);
			final TextView tvRight = (TextView) findViewById(R.id.tvRightWord);
			final TextView tvLeft = (TextView) findViewById(R.id.tvLeftWord);
			final Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/UNIVERSALFRUITCAKE.ttf");
			mshow_text=(TextView) findViewById(R.id.mshow_text);
			tts = new TextToSpeech(this, this);	
			//final AdView adView;
		    //AdView adView = new AdView(this, AdSize.BANNER, "a14f4924b2df6ab"); 

// Code for Left Spin 
		btnls.setOnClickListener(new View.OnClickListener() {	
		public void onClick(View v) {
			Random generator = new Random();
			int num;
				// Left Mad Word
			
					String[] lmword;
					String l,r;
					lmword= new String[57];
					lmword[0]= "Anus";
					lmword[1]= "Ass";
					lmword[2]= "Ball";
					lmword[3]= "Bitch";
					lmword[4]= "Clit";
					lmword[5]= "Cock";
					lmword[6]= "Crap";
					lmword[7]= "Crouch";
					lmword[8]= "Cum";
					lmword[9]= "Cunt";
					lmword[10]= "Dick";
					lmword[11]= "Dildo";
					lmword[12]= "Douche";
					lmword[13]= "Fanny";
					lmword[14]= "Fart";
					lmword[15]= "Fuck";
					lmword[16]= "Ho";
					lmword[17]= "Jerk";
					lmword[18]= "Jizz";
					lmword[19]= "Mother";
					lmword[20]= "Mucus";
					lmword[21]= "Muff";
					lmword[22]= "Nipple";
					lmword[23]= "Nut";
					lmword[24]= "Panty";
					lmword[25]= "Pecker";
					lmword[26]= "Penis";
					lmword[27]= "Pimple";
					lmword[28]= "Prick";
					lmword[29]= "Pube";
					lmword[30]= "Pussy";
					lmword[31]= "Rectum";
					lmword[32]= "Sack";
					lmword[33]= "Schlong";
					lmword[34]= "Scrotum";
					lmword[35]= "Scum";
					lmword[36]= "Shit";
					lmword[37]= "Slack";
					lmword[38]= "Slut";
					lmword[39]= "Snot";
					lmword[40]= "Sperm";
					lmword[41]= "Tampon";
					lmword[42]= "Testicle";
					lmword[43]= "Tit";
					lmword[44]= "Trash";
					lmword[45]= "Twat";
					lmword[46]= "Twit";
					lmword[47]= "Wench";
					lmword[48]= "Whore";
					lmword[49]= "Wiener";
					lmword[50]= "Anal";
					lmword[51]= "Bimbo";
					lmword[52]= "Bastard";
					lmword[53]= "Spastic";
					lmword[54]= "Wart";
					lmword[55]= "Butt";
					lmword[56]= "Dingle";

			// Random Left Word
				num=generator.nextInt(57);
				tvLeft.setTypeface(tf);
		        tvLeft.setText(lmword[num]);

				r=tvRight.getText().toString();
				l=tvLeft.getText().toString();
				mshow_text.setText("You"+l+r);
		}
	});
	
// Code for Right Spin      
        btnrs.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Random generator = new Random();
			int num;
			// Right Mad Word	
			    String[] rmword;
			    String r,l;
				rmword= new String[57];
				rmword[0]="Bagger";
				rmword[1]="Biscuit";
				rmword[2]="Biter";
				rmword[3]="Blower";
				rmword[4]="Bucket";
				rmword[5]="Chomper";
				rmword[6]="Chunk";
				rmword[7]="Clot";
				rmword[8]="Diddler";
				rmword[9]="Donkey";
				rmword[10]="Dumpster";
				rmword[11]="Eater";
				rmword[12]="Face";
				rmword[13]="Flaps";
				rmword[14]="Fondler";
				rmword[15]="Fucker";
				rmword[16]="Fungus";
				rmword[17]="Gargler";
				rmword[18]="Glob";
				rmword[19]="Gobbler";
				rmword[20]="Hole";
				rmword[21]="Jammer";
				rmword[22]="Jockey";
				rmword[23]="Junkie";
				rmword[24]="Licker";
				rmword[25]="Lips";
				rmword[26]="Lover";
				rmword[27]="Monkey";
				rmword[28]="Munch";
				rmword[29]="Muncher";
				rmword[30]="Nugget";
				rmword[31]="Packer";
				rmword[32]="Pincher";
				rmword[33]="Plug";
				rmword[34]="Rammer";
				rmword[35]="Shitter";
				rmword[36]="Skank";
				rmword[37]="Slammer";
				rmword[38]="Slime";
				rmword[39]="Sniffer";
				rmword[40]="Stain";
				rmword[41]="Sucker";
				rmword[42]="Testicle";
				rmword[43]="Tickler";
				rmword[44]="Twister";
				rmword[45]="Wad";
				rmword[46]="Waffle";
				rmword[47]="Wanker";
				rmword[48]="Wipe";
				rmword[49]="Wrangler";  
				rmword[50]="Lube";
				rmword[51]="Flake";
				rmword[52]="Tool";
				rmword[53]="Hoser";
				rmword[54]="Nibbler";
				rmword[55]="Rash";
				rmword[56]="Guzzler";
			
			// Random Right Word
				num=generator.nextInt(57);
				tvRight.setTypeface(tf);
				tvRight.setText(rmword[num]);
				
				r=tvRight.getText().toString();
				l=tvLeft.getText().toString();
				mshow_text.setText("You"+l+r);
		}
	});	
			
// Code for Spin on Both        
        btns.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Random generator = new Random();
			int num;
				// Left Mad Word
				String[] lmword;
				String r,l;
				lmword= new String[57];
				lmword[0]= "Anus";
				lmword[1]= "Ass";
				lmword[2]= "Ball";
				lmword[3]= "Bitch";
				lmword[4]= "Clit";
				lmword[5]= "Cock";
				lmword[6]= "Crap";
				lmword[7]= "Crouch";
				lmword[8]= "Cum";
				lmword[9]= "Cunt";
				lmword[10]= "Dick";
				lmword[11]= "Dildo";
				lmword[12]= "Douche";
				lmword[13]= "Fanny";
				lmword[14]= "Fart";
				lmword[15]= "Fuck";
				lmword[16]= "Ho";
				lmword[17]= "Jerk";
				lmword[18]= "Jizz";
				lmword[19]= "Mother";
				lmword[20]= "Mucus";
				lmword[21]= "Muff";
				lmword[22]= "Nipple";
				lmword[23]= "Nut";
				lmword[24]= "Panty";
				lmword[25]= "Pecker";
				lmword[26]= "Penis";
				lmword[27]= "Pimple";
				lmword[28]= "Prick";
				lmword[29]= "Pube";
				lmword[30]= "Pussy";
				lmword[31]= "Rectum";
				lmword[32]= "Sack";
				lmword[33]= "Schlong";
				lmword[34]= "Scrotum";
				lmword[35]= "Scum";
				lmword[36]= "Shit";
				lmword[37]= "Slack";
				lmword[38]= "Slut";
				lmword[39]= "Snot";
				lmword[40]= "Sperm";
				lmword[41]= "Tampon";
				lmword[42]= "Testicle";
				lmword[43]= "Tit";
				lmword[44]= "Trash";
				lmword[45]= "Twat";
				lmword[46]= "Twit";
				lmword[47]= "Wench";
				lmword[48]= "Whore";
				lmword[49]= "Wiener";
				lmword[50]= "Anal";
				lmword[51]= "Bimbo";
				lmword[52]= "Bastard";
				lmword[53]= "Spastic";
				lmword[54]= "Wart";
				lmword[55]= "Butt";
				lmword[56]= "Dingle";
				

			// Right Mad Word	
			    String[] rmword;
				rmword= new String[57];
				rmword[0]="Bagger";
				rmword[1]="Biscuit";
				rmword[2]="Biter";
				rmword[3]="Blower";
				rmword[4]="Bucket";
				rmword[5]="Chomper";
				rmword[6]="Chunk";
				rmword[7]="Clot";
				rmword[8]="Diddler";
				rmword[9]="Donkey";
				rmword[10]="Dumpster";
				rmword[11]="Eater";
				rmword[12]="Face";
				rmword[13]="Flaps";
				rmword[14]="Fondler";
				rmword[15]="Fucker";
				rmword[16]="Fungus";
				rmword[17]="Gargler";
				rmword[18]="Glob";
				rmword[19]="Gobbler";
				rmword[20]="Hole";
				rmword[21]="Jammer";
				rmword[22]="Jockey";
				rmword[23]="Junkie";
				rmword[24]="Licker";
				rmword[25]="Lips";
				rmword[26]="Lover";
				rmword[27]="Monkey";
				rmword[28]="Munch";
				rmword[29]="Muncher";
				rmword[30]="Nugget";
				rmword[31]="Packer";
				rmword[32]="Pincher";
				rmword[33]="Plug";
				rmword[34]="Rammer";
				rmword[35]="Shitter";
				rmword[36]="Skank";
				rmword[37]="Slammer";
				rmword[38]="Slime";
				rmword[39]="Sniffer";
				rmword[40]="Stain";
				rmword[41]="Sucker";
				rmword[42]="Testicle";
				rmword[43]="Tickler";
				rmword[44]="Twister";
				rmword[45]="Wad";
				rmword[46]="Waffle";
				rmword[47]="Wanker";
				rmword[48]="Wipe";
				rmword[49]="Wrangler";  
				rmword[50]="Lube";
				rmword[51]="Flake";
				rmword[52]="Tool";
				rmword[53]="Hoser";
				rmword[54]="Nibbler";
				rmword[55]="Rash";
				rmword[56]="Guzzler";

			// Random Left Word 
				num=generator.nextInt(57);
				tvLeft.setTypeface(tf);
				tvLeft.setText(lmword[num]);
				l=tvLeft.getText().toString();
				
			// Random Right Word
				num=generator.nextInt(57);
				tvRight.setTypeface(tf);
				tvRight.setText(rmword[num]);
				r=tvRight.getText().toString();

			// Say it for me!	
				mshow_text.setText("You"+l+r);

		}
	});
        
        btnMSay.setOnClickListener(new View.OnClickListener() {
        	//@Override
            public void onClick(View arg0) {
                speakOut(true);
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
	                btnMSay.setEnabled(true);
	                speakOut(true);
	            }
	 
	        } else {
	            Log.e("TTS", "Initilization Failed!");
	        }
	 
	    }
	 
	    private void speakOut(boolean b) {
	 
	        String text = mshow_text.getText().toString();
	        
			HashMap<String, String> hashMap = new HashMap<String, String>();
			hashMap.put(TextToSpeech.Engine.KEY_FEATURE_NETWORK_SYNTHESIS, "true");
			tts.speak(text, TextToSpeech.QUEUE_FLUSH, b ? hashMap : null);
			
	        //tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
	    }
	//}
	
	    // Create the adView
	    //adView = new AdView(this, AdSize.BANNER, "a14f4924b2df6ab");
 
	    // Lookup your LinearLayout assuming it’s been given
	    // the attribute android:id="@+id/mainLayout"
	   // LinearLayout layout = (LinearLayout)findViewById(R.id.adLayout);

	    // Add the adView to it
	    //layout.addView(adView);

	    // Initiate a generic request to load it with an ad
	    //adView.loadAd(new AdRequest());
	 

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
