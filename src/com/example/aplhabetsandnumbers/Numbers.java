package com.example.aplhabetsandnumbers;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class Numbers extends Activity {

	MediaPlayer mp = null;
	boolean Is_rabbit=false;
	boolean Is_panda=false;
	static int i = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_numbers);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.numbers, menu);
		return true;
	}
	
	public void processBack (View view)
	{
	/*	if(mp!=null)
		  {
			  mp.stop();
			  mp.release();
		  }*/
			Intent intent = new Intent(this, Alphabets.class);
			startActivity(intent);
	}

	public void playSheep(View view) {
		Log.v("Rajeev","Inside playSheep");
			
		if (!Is_rabbit)
		{
			if(mp!=null)
			  {
				  mp.stop();
				  mp.release();
			  }
			
			switch (i)
			{
				case 0:
					mp=MediaPlayer.create(this,R.raw.cs);	
					mp.start();
					break;
				default:
					mp=MediaPlayer.create(this,R.raw.cs);	
					mp.start();
					break;
			 		
			}
		}
	Log.v("Rajeev","Exit playSheep");
		

}
	
	public void playPanda(View view) {
		final ImageView image, image1;
		Log.v("Rajeev","Inside playPanda");
		image = (ImageView) findViewById(R.id.numberView);
		Log.v("Rajeev","Inside playPanda 2");
		switch(view.getId())
		{
		case R.id.panda:
	 		// handle button A click;
			
				if (!Is_panda)
				{
					Is_panda = true;
					Log.v("Rajeev","Set is panda 1");
					image.setImageResource(R.drawable.panda);
					Log.v("Rajeev","Set is panda 2");
					image1 =(ImageView) findViewById(R.id.panda);
					Log.v("Rajeev","Set is panda 3");
					image1.setImageResource(R.drawable.cat_1);
					Log.v("Rajeev","Set is panda 4");
				}
				else
				{
					Log.v("Rajeev","UnSet is panda");
					Is_panda = false;
					image.setImageResource(R.drawable.cat_1);
					image1 =(ImageView) findViewById(R.id.panda);
					image1.setImageResource(R.drawable.panda);
					
				}
			
			break;
		
		default:
			Log.v("Rajeev","Default  play panda");
	 		throw new RuntimeException("Unknow button ID");
		}
			
		Log.v("Rajeev","Exit playPanda");
		}
	
	public void playNumber(View view) {
		final ImageView image;
		Log.v("Rajeev","Inside playNumber");
		
		
		if (!Is_rabbit)
		{
			if(mp!=null)
			{	
				mp.stop();
				mp.release();
			}
			Log.v("Rajeev","Inside playNumber IsRabbit is false");
				image = (ImageView) findViewById(R.id.numberView);
				switch(view.getId())
				{
				case R.id.one:
			 		// handle button A click;
					mp=MediaPlayer.create(this,R.raw.one);
			 			image.setImageResource(R.drawable.cat_1);
			 		//	mp.start();
			 		i=0;	
			 		break;
				case R.id.two:
			 		// handle button A click;
					mp=MediaPlayer.create(this,R.raw.two);
			 			image.setImageResource(R.drawable.cat_2);
			 		//	mp.start();
			 			i=1;
			 		break;
			 		
				case R.id.three:
			 		// handle button A click;
					mp=MediaPlayer.create(this,R.raw.three);
			 			image.setImageResource(R.drawable.cat_3);
			 		//	mp.start();
			 			i=1;
			 		break;
				case R.id.four:
			 		// handle button A click;
					mp=MediaPlayer.create(this,R.raw.four);
			 			image.setImageResource(R.drawable.cat_4);
			 		//	mp.start();
			 			i=1;
			 		break;
				case R.id.five:
			 		// handle button A click;
					mp=MediaPlayer.create(this,R.raw.five);
			 			image.setImageResource(R.drawable.cat_5);
			 		//	mp.start();
			 			i=1;
			 		break;
				case R.id.six:
			 		// handle button A click;
					mp=MediaPlayer.create(this,R.raw.six);
			 			image.setImageResource(R.drawable.cat_6);
			 		//	mp.start();
			 			i=1;
			 		break;
				case R.id.seven:
			 		// handle button A click;
					mp=MediaPlayer.create(this,R.raw.seven);
			 			image.setImageResource(R.drawable.cat_7);
			 		//	mp.start();
			 			i=1;
			 		break;
				case R.id.eight:
			 		// handle button A click;
					mp=MediaPlayer.create(this,R.raw.eight);
			 			image.setImageResource(R.drawable.cat_8);
			 		//	mp.start();
			 			i=1;
			 		break;
				case R.id.nine:
			 		// handle button A click;
					mp=MediaPlayer.create(this,R.raw.nine);
			 			image.setImageResource(R.drawable.cat_9);
			 		//	mp.start();
			 			i=1;
			 		break;
				case R.id.ten:
			 		// handle button A click;
					mp=MediaPlayer.create(this,R.raw.ten);
			 			image.setImageResource(R.drawable.cat_10);
			 		//	mp.start();
			 			i=1;
			 			
			 		break;
						default:
			 		throw new RuntimeException("Unknow button ID");
				}
				
				if (mp!=null)
				{
					mp.start();
				
				}
		}
		else
		{
		/*	Log.v("Rajeev","Inside playNumber IsRabbit is true");
			image = (ImageView) findViewById(R.id.numberView);
			switch(view.getId())
			{
			case R.id.one:
		 		// handle button A click;
				//mp=MediaPlayer.create(this,R.raw.one);
		 			image.setImageResource(R.drawable.rabbit);
		 		//	mp.start();
		 		i=0;	
		 		break;
			case R.id.two:
		 		// handle button A click;
				//mp=MediaPlayer.create(this,R.raw.two);
		 			image.setImageResource(R.drawable.two_);
		 		//	mp.start();
		 			i=1;
		 		break;
		 		
			case R.id.three:
		 		// handle button A click;
				//mp=MediaPlayer.create(this,R.raw.three);
		 			image.setImageResource(R.drawable.three_r);
		 		//	mp.start();
		 			i=1;
		 		break;
			case R.id.four:
		 		// handle button A click;
				//mp=MediaPlayer.create(this,R.raw.four);
		 			image.setImageResource(R.drawable.four_r);
		 		//	mp.start();
		 			i=1;
		 		break;
			case R.id.five:
		 		// handle button A click;
				//mp=MediaPlayer.create(this,R.raw.five);
		 			image.setImageResource(R.drawable.five_r);
		 		//	mp.start();
		 			i=1;
		 		break;
			case R.id.six:
		 		// handle button A click;
				//mp=MediaPlayer.create(this,R.raw.six);
		 			image.setImageResource(R.drawable.six_r);
		 		//	mp.start();
		 			i=1;
		 		break;
			case R.id.seven:
		 		// handle button A click;
				//mp=MediaPlayer.create(this,R.raw.seven);
		 			image.setImageResource(R.drawable.seven_r);
		 		//	mp.start();
		 			i=1;
		 		break;
			case R.id.eight:
		 		// handle button A click;
				//mp=MediaPlayer.create(this,R.raw.eight);
		 			image.setImageResource(R.drawable.eight_r);
		 		//	mp.start();
		 			i=1;
		 		break;
			case R.id.nine:
		 		// handle button A click;
				//mp=MediaPlayer.create(this,R.raw.nine);
		 			image.setImageResource(R.drawable.nine_r);
		 		//	mp.start();
		 			i=1;
		 		break;
			case R.id.ten:
		 		// handle button A click;
				//mp=MediaPlayer.create(this,R.raw.ten);
		 			image.setImageResource(R.drawable.ten_r);
		 		//	mp.start();
		 			i=1;
		 			
		 		break;
					default:
		 		throw new RuntimeException("Unknow button ID");
			}*/
		}
		
		
		Log.v("Rajeev","Exit playNumber IsRabbit is true");
	}
	
	protected void onPause() {
	     super.onPause();

	      if(mp!= null)
          {
              mp.stop();
              mp.release();
              mp=null;
          }
       //   finish();
    
	 }
	 public boolean onKeyDown(int keyCode, KeyEvent event) 
	    {
	        if ((keyCode == KeyEvent.KEYCODE_BACK)) 
	        { //Back key pressed
	           //Things to Do
	            if(mp!= null)
	            {
	                mp.stop();
	                mp.release();
	                mp=null;
	            }
	          finish();
	            return true;
	        }
	        return super.onKeyDown(keyCode, event);
	    }
	
/*	protected void onStop() {
	    super.onStop();  // Always call the superclass method first

		if(mp!=null)
			  {
				  mp.stop();
				  mp.release();
			  }
	}
*/
}