package com.soboapps.namecaller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class WordList extends Activity{
	
	/** Called when the activity is first created. */

		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);

// Code for Left Spin 
        Button btnls = (Button) findViewById(R.id.btLeftSpin);        
        btnls.setOnClickListener(new View.OnClickListener() {
	
		public void onClick(View v) {
			Random generator = new Random();
			int num;
				// Left Mad Word
				String[] lmword;
				lmword= new String[50];
				lmword[0]= "Ass";
				lmword[1]= "Fuck";
				lmword[2]= "Cock";
				lmword[3]= "Tampon";
				lmword[4]= "Shit";
				lmword[5]= "Penis";
				lmword[6]= "Juice";
				lmword[7]= "Ball";
				lmword[8]= "Jizz";
				lmword[9]= "Cum";
				lmword[10]= "Fanny";
				lmword[11]= "Dick";
				lmword[12]= "Bitch";
				lmword[13]= "Douche";
				lmword[14]= "Fart";
				lmword[15]= "Nut";
				lmword[16]= "'Gina";
				lmword[17]= "Piss";
				lmword[18]= "Whore";
				lmword[19]= "Slut";
				lmword[20]= "Mother";
				lmword[21]= "Crouch";
				lmword[22]= "Wench";
				lmword[23]= "Crap";
				lmword[24]= "Nipple";
				lmword[25]= "Anus";
				lmword[26]= "Jerk";
				lmword[27]= "Trash";
				lmword[28]= "Tit";
				lmword[29]= "Snot";
				lmword[30]= "Scum";
				lmword[31]= "Granny";
				lmword[32]= "Pecker";
				lmword[33]= "Twat";
				lmword[34]= "Rectum";
				lmword[35]= "Wiener";
				lmword[36]= "Cunt";
				lmword[37]= "Clit";
				lmword[38]= "Ho";
				lmword[39]= "Schlong";
				lmword[40]= "Sack";
				lmword[41]= "Pussy";
				lmword[42]= "Testicle";
				lmword[43]= "Dildo";
				lmword[44]= "Prick";
				lmword[45]= "Scrotum";
				lmword[46]= "Muff";
				lmword[47]= "Panty";
				lmword[48]= "Pube";
				lmword[49]= "Sperm";

			// Random Left Word 
				TextView tvLeft = (TextView) findViewById(R.id.tvLeftWord);
				num=generator.nextInt(50);
				tvLeft.setText(lmword[num]);

		}
	});
	
// Code for Right Spin
        Button btnrs = (Button) findViewById(R.id.btRightSpin);        
        btnrs.setOnClickListener(new View.OnClickListener() {
	
		public void onClick(View v) {
			Random generator = new Random();
			int num;
			// Right Mad Word	
			    String[] rmword;
				rmword= new String[50];
				rmword[0]= "Chunk";
				rmword[1]= "Bagger";
				rmword[2]= "Flaps";
				rmword[3]= "Licker";
				rmword[4]= "Munch";
				rmword[5]= "Rammer";
				rmword[6]= "Sucker";
				rmword[7]= "Waffle";
				rmword[8]= "Eater";
				rmword[9]= "Face";
				rmword[10]= "Biter";
				rmword[11]= "Bucket";
				rmword[12]= "Monkey";
				rmword[13]= "Dumpster";
				rmword[14]= "Junkie";
				rmword[15]= "Chomper";
				rmword[16]= "Lips";
				rmword[17]= "Fucker";
				rmword[18]= "Blower";
				rmword[19]= "Donkey";
				rmword[20]= "Wad";
				rmword[21]= "Jockey";
				rmword[22]= "Skank";
				rmword[23]= "Lover";
				rmword[24]= "Shitter";
				rmword[25]= "Hole";
				rmword[26]= "Pincher";
				rmword[27]= "Sniffer";
				rmword[28]= "Wipe";
				rmword[29]= "Twister";
				rmword[30]= "Slammer";
				rmword[31]= "Clot";
				rmword[32]= "Glob";
				rmword[33]= "Jammer";
				rmword[34]= "Fondler";
				rmword[35]= "Tickler";
				rmword[36]= "Fungus";
				rmword[37]= "Plug";
				rmword[38]= "Packer";
				rmword[39]= "Wrangler";
				rmword[40]= "Slime";
				rmword[41]= "Diddler";
				rmword[42]= "Testicle";
				rmword[43]= "Gobbler";
				rmword[44]= "Wanker";
				rmword[45]= "Muncher";
				rmword[46]= "Stain";
				rmword[47]= "Nugget";
				rmword[48]= "Biscuit";
				rmword[49]= "Gargler"; 
			
			// Random Right Word
				TextView tvRight = (TextView) findViewById(R.id.tvRightWord);
				num=generator.nextInt(50);
				tvRight.setText(rmword[num]);

		}
	});	
			
// Code for Spin on Both
        Button btns = (Button) findViewById(R.id.btSpin);        
        btns.setOnClickListener(new View.OnClickListener() {
	
		public void onClick(View v) {
			Random generator = new Random();
			int num;
				// Left Mad Word
				String[] lmword;
				lmword= new String[50];
				lmword[0]= "Ass";
				lmword[1]= "Fuck";
				lmword[2]= "Cock";
				lmword[3]= "Tampon";
				lmword[4]= "Shit";
				lmword[5]= "Penis";
				lmword[6]= "Juice";
				lmword[7]= "Ball";
				lmword[8]= "Jizz";
				lmword[9]= "Cum";
				lmword[10]= "Fanny";
				lmword[11]= "Dick";
				lmword[12]= "Bitch";
				lmword[13]= "Douche";
				lmword[14]= "Fart";
				lmword[15]= "Nut";
				lmword[16]= "'Gina";
				lmword[17]= "Piss";
				lmword[18]= "Whore";
				lmword[19]= "Slut";
				lmword[20]= "Mother";
				lmword[21]= "Crouch";
				lmword[22]= "Wench";
				lmword[23]= "Crap";
				lmword[24]= "Nipple";
				lmword[25]= "Anus";
				lmword[26]= "Jerk";
				lmword[27]= "Trash";
				lmword[28]= "Tit";
				lmword[29]= "Snot";
				lmword[30]= "Scum";
				lmword[31]= "Granny";
				lmword[32]= "Pecker";
				lmword[33]= "Twat";
				lmword[34]= "Rectum";
				lmword[35]= "Wiener";
				lmword[36]= "Cunt";
				lmword[37]= "Clit";
				lmword[38]= "Ho";
				lmword[39]= "Schlong";
				lmword[40]= "Sack";
				lmword[41]= "Pussy";
				lmword[42]= "Testicle";
				lmword[43]= "Dildo";
				lmword[44]= "Prick";
				lmword[45]= "Scrotum";
				lmword[46]= "Muff";
				lmword[47]= "Panty";
				lmword[48]= "Pube";
				lmword[49]= "Sperm";

			// Right Mad Word	
			    String[] rmword;
				rmword= new String[50];
				rmword[0]= "Chunk";
				rmword[1]= "Bagger";
				rmword[2]= "Flaps";
				rmword[3]= "Licker";
				rmword[4]= "Munch";
				rmword[5]= "Rammer";
				rmword[6]= "Sucker";
				rmword[7]= "Waffle";
				rmword[8]= "Eater";
				rmword[9]= "Face";
				rmword[10]= "Biter";
				rmword[11]= "Bucket";
				rmword[12]= "Monkey";
				rmword[13]= "Dumpster";
				rmword[14]= "Junkie";
				rmword[15]= "Chomper";
				rmword[16]= "Lips";
				rmword[17]= "Fucker";
				rmword[18]= "Blower";
				rmword[19]= "Donkey";
				rmword[20]= "Wad";
				rmword[21]= "Jockey";
				rmword[22]= "Skank";
				rmword[23]= "Lover";
				rmword[24]= "Shitter";
				rmword[25]= "Hole";
				rmword[26]= "Pincher";
				rmword[27]= "Sniffer";
				rmword[28]= "Wipe";
				rmword[29]= "Twister";
				rmword[30]= "Slammer";
				rmword[31]= "Clot";
				rmword[32]= "Glob";
				rmword[33]= "Jammer";
				rmword[34]= "Fondler";
				rmword[35]= "Tickler";
				rmword[36]= "Fungus";
				rmword[37]= "Plug";
				rmword[38]= "Packer";
				rmword[39]= "Wrangler";
				rmword[40]= "Slime";
				rmword[41]= "Diddler";
				rmword[42]= "Testicle";
				rmword[43]= "Gobbler";
				rmword[44]= "Wanker";
				rmword[45]= "Muncher";
				rmword[46]= "Stain";
				rmword[47]= "Nugget";
				rmword[48]= "Biscuit";
				rmword[49]= "Gargler"; 

			// Random Left Word 
				TextView tvLeft = (TextView) findViewById(R.id.tvLeftWord);
				num=generator.nextInt(50);
				tvLeft.setText(lmword[num]);
			
			// Random Right Word
				TextView tvRight = (TextView) findViewById(R.id.tvRightWord);
				num=generator.nextInt(50);
				tvRight.setText(rmword[num]);

		}
	});
	

}
}
