package com.example.aplhabetsandnumbers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void processAlphabet(View view){
        Intent intent = new Intent(this, Alphabets.class);
        startActivity(intent);	
    	}
        
    public void processNumber(View view){
        Intent intent = new Intent(this, Numbers.class);
        startActivity(intent);	
    	}
        
        
    }
    //rajeev
    /*public void sendMessage(View view) {
    	final ImageView image;
    	MediaPlayer mp=MediaPlayer.create(this,R.raw.cat);
    	image = (ImageView) findViewById(R.id.imageView1);
    	switch(view.getId())
    	{
    	case R.id.a:
     		// handle button A click;

     			image.setImageResource(R.drawable.a);
     			mp.start();
     			
     		break;
     		case R.id.b:
     		// handle button B click;
     			image.setImageResource(R.drawable.b);
     			mp.start();
     		break;
     		
     		case R.id.c:
         		// handle button B click;
         			image.setImageResource(R.drawable.c);
         			mp.start();
         		break;
         		
     		case R.id.d:
         		// handle button B click;
         			image.setImageResource(R.drawable.d);
         			mp.start();
         		break;
         		
     		case R.id.e:
         		// handle button B click;
         			image.setImageResource(R.drawable.e);
         			mp.start();
         		break;
         		
     		case R.id.f:
         		// handle button B click;
         			image.setImageResource(R.drawable.f);
         			mp.start();
         		break;
         		
     		case R.id.g:
         		// handle button B click;
         	    image.setImageResource(R.drawable.g);
         		break;
         		
         		case R.id.h:
         		// handle button B click;
         	    image.setImageResource(R.drawable.h);
         		break;
         		
         		case R.id.i:
         		// handle button B click;
         	    image.setImageResource(R.drawable.i);
         		break;
         		
         		case R.id.j:
         		// handle button B click;
         	    image.setImageResource(R.drawable.j);
         		break;
         		
         		case R.id.k:
         		// handle button B click;
         	    image.setImageResource(R.drawable.k);
         		break;
         		
         		case R.id.l:
         		// handle button B click;
         	    image.setImageResource(R.drawable.l);
         		break;
         		
         		case R.id.m:
         		// handle button B click;
         	    image.setImageResource(R.drawable.m);
         		break;
         		
         		case R.id.n:
         		// handle button B click;
         	    image.setImageResource(R.drawable.n);
         		break;
         		
         		case R.id.o:
         		// handle button B click;
         	    image.setImageResource(R.drawable.o);
         		break;
         		
         		case R.id.p:
         		// handle button B click;
         	    image.setImageResource(R.drawable.p);
         		break;
         		
         		case R.id.q:
         		// handle button B click;
         	    image.setImageResource(R.drawable.q);
         		break;
         		
         		case R.id.r:
         		// handle button B click;
         	    image.setImageResource(R.drawable.r);
         		break;
         		
         		case R.id.s:
         		// handle button B click;
         	    image.setImageResource(R.drawable.s);
         		break;
         		
         		case R.id.t:
         		// handle button B click;
         	    image.setImageResource(R.drawable.t);
         		break;
         		
         		case R.id.u:
         		// handle button B click;
         	    image.setImageResource(R.drawable.u);
         		break;
         		
         		case R.id.v:
         		// handle button B click;
         	    image.setImageResource(R.drawable.v);
         		break;
         		
         		case R.id.w:
         		// handle button B click;
         	    image.setImageResource(R.drawable.w);
         		break;
         		
         		case R.id.x:
         		// handle button B click;
         	    image.setImageResource(R.drawable.x);
         		break;
         		
         		case R.id.y:
         		// handle button B click;
         	    image.setImageResource(R.drawable.y);
         		break;
         		
         		case R.id.z:
         		// handle button B click;
         	    image.setImageResource(R.drawable.z);
         		break;
         		
     		default:
     		throw new RuntimeException("Unknow button ID");
    	}
    }
    
   */
    

