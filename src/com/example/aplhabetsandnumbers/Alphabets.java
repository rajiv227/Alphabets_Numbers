package com.example.aplhabetsandnumbers;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class Alphabets extends Activity {

	MediaPlayer mp=null;
	static int i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alphabets);
		//sendMessage();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alphabets, menu);
		return true;
	}

	
	
	public void processBack (View view)
	{
		/*if(mp!=null)
		  {
			  mp.stop();
			  mp.release();
		  }*/
			Intent intent = new Intent(this, MainActivity.class);
			startActivity(intent);
	}
	public void processNext(View view)
	{
		/*if(mp!=null)
		  {
			  mp.stop();
			  mp.release();
		  }*/
		Intent intent = new Intent(this, Numbers.class);
        startActivity(intent);
	}
	
	public void playZoo(View view) {
		
		if(mp!=null)
			{	
				mp.stop();
				//mp.release();
			}
	switch(i)
	{
	case 0:
 		// handle button A click;
			mp=MediaPlayer.create(this,R.raw.zoo);
			mp.start();
 			 					
 		break;
	case 1:
 		// handle button A click;
			mp=MediaPlayer.create(this,R.raw.a);
			mp.start();
 			 					
 		break;
 		case 2:
 		// handle button B click;
 			mp=MediaPlayer.create(this,R.raw.bs);
 			mp.start();
 		break;
 		
 		case 3:
     		mp=MediaPlayer.create(this,R.raw.cs);
     		mp.start();
    		break;
     		
 		case 4:
			 mp=MediaPlayer.create(this,R.raw.ds);
			 mp.start();
     		break;
 		case 5:
 			mp=MediaPlayer.create(this,R.raw.es);
 			mp.start();
     		break;
 		case 6:
 			mp=MediaPlayer.create(this,R.raw.fs);
			mp.start();
 			break;
 		case 7:
 			mp=MediaPlayer.create(this,R.raw.gs);
			mp.start();
 			break;
 		case 8:
 			mp=MediaPlayer.create(this,R.raw.hs);
			mp.start();
 			break;
 		case 9:
 			break;
 		case 10:
 			mp=MediaPlayer.create(this,R.raw.js);
			mp.start();
 			break;
 		case 11:
 			break;
     	case 12:
     		// handle button B click;
  			mp=MediaPlayer.create(this,R.raw.ls);
  			mp.start();
     		break;
     	case 13:
 			break;
     	case 14:
     		
 			break;
     	case 15:
     		mp=MediaPlayer.create(this,R.raw.os);
			mp.start();
 			break;
     	case 16:
     		mp=MediaPlayer.create(this,R.raw.ps);
			mp.start();
 			break;
     	case 17:
 			break;
     	case 18:
 			break;
     	case 19:
 			break;
  		case 20:
     		// handle button B click;
   			mp=MediaPlayer.create(this,R.raw.ts);
   			mp.start();
     		break;
  		case 21:
 			break;
  		case 22:
 			break;
  		case 23:
 			break;
  		case 24:
 			break;
  		case 25:
  			mp=MediaPlayer.create(this,R.raw.ys);
   			mp.start();
 			break;
  		case 26:
 			break;
 		default:
 			break;
	}

}
	
        
    	
	
	public void sendMessage(View view) {
	final ImageView image;
	
	
	if(mp!=null)
	{	
		mp.stop();
	}
	image = (ImageView) findViewById(R.id.imageView1);
	switch(view.getId())
	{
	case R.id.a:
 		// handle button A click;
			mp=MediaPlayer.create(this,R.raw.a);
 			image.setImageResource(R.drawable.a);
 			i=1;
 					
 		break;
 		case R.id.b:
 		// handle button B click;
 			
 			mp=MediaPlayer.create(this,R.raw.b);
 			image.setImageResource(R.drawable.b);
 			i=2;
 			
 		break;
 		
 		case R.id.c:
     		// handle button B click;
 			
 			mp=MediaPlayer.create(this,R.raw.c);
     		image.setImageResource(R.drawable.c);
     		i=3;
     		break;
     		
 		case R.id.d:
     		// handle button B click;mp.stop();
 			/*mp.release();
			 mp=MediaPlayer.create(this,R.raw.d);*/
     			image.setImageResource(R.drawable.d);
     			//mp.start();
     			mp=MediaPlayer.create(this,R.raw.d);
     			i=4;
     		break;
     		
 		case R.id.e:
     		// handle button B click;
 			mp=MediaPlayer.create(this,R.raw.e);
 			/*mp.stop();
 			mp.release();
 			 mp=MediaPlayer.create(this,R.raw.e);*/
     			image.setImageResource(R.drawable.e);
     			//mp.start();
     			i=5;
     		break;
     		
 		case R.id.f:
     		// handle button B click;
 			mp=MediaPlayer.create(this,R.raw.f);
     			image.setImageResource(R.drawable.f);
     			//mp.start();
     			i=6;
     		break;
     		
 		case R.id.g:
     		// handle button B click;
 			mp=MediaPlayer.create(this,R.raw.g);
     	    image.setImageResource(R.drawable.g);
     	   i=7;
     		break;
     		
     		case R.id.h:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.h);
     	    image.setImageResource(R.drawable.h);
     	   i=8;
     		break;
     		
     		case R.id.i:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.i);
     	    image.setImageResource(R.drawable.i);
     	   i=9;
     		break;
     		
     		case R.id.j:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.j);
     	    image.setImageResource(R.drawable.j);
     	   i=10;
     		break;
     		
     		case R.id.k:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.k);
     	    image.setImageResource(R.drawable.k);
     	   i=11;
     		break;
     		
     		case R.id.l:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.l);
     	    image.setImageResource(R.drawable.l);
     	   i=12;
     		break;
     		
     		case R.id.m:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.m);
     	    image.setImageResource(R.drawable.m);
     	   i=13;
     		break;
     		
     		case R.id.n:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.n);
     	    image.setImageResource(R.drawable.n);
     	   i=14;
     		break;
     		
     		case R.id.o:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.o);
     	    image.setImageResource(R.drawable.o);
     	   i=15;
     		break;
     		
     		case R.id.p:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.p);
     	    image.setImageResource(R.drawable.p);
     	   i=16;
     		break;
     		
     		case R.id.q:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.q);
     	    image.setImageResource(R.drawable.q);
     	   i=17;
     		break;
     		
     		case R.id.r:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.r);
     	    image.setImageResource(R.drawable.r);
     	   i=18;
     		break;
     		
     		case R.id.s:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.s);
     	    image.setImageResource(R.drawable.s);
     	   i=19;
     		break;
     		
     		case R.id.t:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.t);
     	    image.setImageResource(R.drawable.t);
     	   i=20;
     		break;
     		
     		case R.id.u:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.u);
     	    image.setImageResource(R.drawable.u);
     	   i=21;
     		break;
     		
     		case R.id.v:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.v);
     	    image.setImageResource(R.drawable.v);
     	   i=22;
     		break;
     		
     		case R.id.w:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.w);
     	    image.setImageResource(R.drawable.w);
     	   i=23;
     		break;
     		
     		case R.id.x:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.x);
     	    image.setImageResource(R.drawable.x);
     	   i=24;
     		break;
     		
     		case R.id.y:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.y);
     	    image.setImageResource(R.drawable.y);
     	   i=25;
     		break;
     		
     		case R.id.z:
     		// handle button B click;
     			mp=MediaPlayer.create(this,R.raw.z);
     	    image.setImageResource(R.drawable.z);
     	   i=26;
     		break;
     		
 		default:
 			i=0;
 			throw new RuntimeException("Unknow button ID");
	}
	if (mp!=null)
		mp.start();
}


	protected void onPause() {
	     super.onPause();

	      if(mp!= null)
         {
             mp.stop();
             mp.release();
             mp=null;
         }
	      
         //finish();
   
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

	

}
