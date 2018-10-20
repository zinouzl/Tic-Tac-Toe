package com.zinou.tictactoc;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	Context con=this;
   Button b1;
   Button b2;
   Button b3;
   Button b4;
   Button b5;
   Button b6;
   Button b7;
   Button b8;
   Button b9;
   int s1=0;
   int s2=0;
   int s3=0;
   int s4=0;
   int s5=0;
   int s6=0;
   int s7=0;
   int s8=0;
   int s9=0;
   boolean bool1;
   boolean bool2;
   boolean bool3;
   boolean bool4;
   boolean bool5;
   boolean bool6;
   boolean bool7;
   boolean bool8;
   boolean bool9;
   boolean bool10;
   boolean bool11;
   boolean bool12;
   boolean bool13;
   boolean bool14;
   boolean bool15;
   boolean bool16;

   boolean turn=true;
   OnClickListener click=new OnClickListener() {

	@TargetApi(Build.VERSION_CODES.KITKAT)
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		v.setClickable(false);
		Resources res=getResources();
		if (turn){
			v.setBackground(res.getDrawable(R.drawable.x));
			turn=!turn;
		switch (v.getId()) {
		case 0x7f080000:
			s1=1;
			break;
        case 0x7f080001:
        	s2=1;
			break;
 case 0x7f080002:
	 s3=1;
			break;
 case 0x7f080003:
	 s4=1;
		break;
 case 0x7f080004:
	 s5=1;
		break;
 case 0x7f080005:
	 s6=1;
		break;
 case 0x7f080006:
	 s7=1;
		break;
 case 0x7f080007:
	 s8=1;
		break;
 case 0x7f080008:
	 s9=1;
		break;

		default:
			break;
		}
		}else {
				v.setBackground(res.getDrawable(R.drawable.o));
				turn=!turn;
				switch (v.getId()) {
				case 0x7f080000:
					s1=2;
					break;
		        case 0x7f080001:
		        	s2=2;
					break;
		        case 0x7f080002:
			        s3=2;
					break;
		        case 0x7f080003:
		            s4=2;
				    break;
	    	    case 0x7f080004:
			        s5=2;
			    	break;
		        case 0x7f080005:
			        s6=2;
			    	break;
		        case 0x7f080006:
			        s7=2;
				    break;
		        case 0x7f080007:
			        s8=2;
				    break;
		        case 0x7f080008:
			        s9=2;
				    break;

				    default:
					   break;
				}
		}
		bool1=((s1==1)&&(s2==1)&&(s3==1));
		bool2=((s4==1)&&(s5==1)&&(s6==1));
		bool3=((s7==1)&&(s8==1)&&(s9==1));
		bool4=((s1==1)&&(s4==1)&&(s7==1));
		bool5=((s2==1)&&(s5==1)&&(s8==1));
		bool6=((s3==1)&&(s6==1)&&(s9==1));
		bool7=((s1==1)&&(s5==1)&&(s9==1));
		bool8=((s3==1)&&(s5==1)&&(s7==1));
		bool9=((s1==2)&&(s2==2)&&(s3==2));
		bool10=((s4==2)&&(s5==2)&&(s6==2));
		bool11=((s7==2)&&(s8==2)&&(s9==2));
		bool12=((s1==2)&&(s4==2)&&(s7==2));
		bool13=((s2==2)&&(s5==2)&&(s8==2));
		bool14=((s3==2)&&(s6==2)&&(s9==2));
		bool15=((s1==2)&&(s5==2)&&(s9==2));
		bool16=((s3==2)&&(s5==2)&&(s7==2));

		if(bool1||bool2||bool3||bool4||bool5||bool6||bool7||bool8){
			Toast.makeText(con, "the O player is the winner", Toast.LENGTH_LONG).show();
			AlertDialog.Builder k=new Builder(con);
			k.setTitle("we have a winner!");
			k.setMessage(":D");
			k.setPositiveButton("ok", null);
			k.setNegativeButton("cancel", null);
			k.show();
		}
		if(bool9||bool10||bool11||bool12||bool13||bool14||bool15||bool16){
			Toast.makeText(con, "the x player is the winner", Toast.LENGTH_LONG).show();
			AlertDialog.Builder k=new Builder(con);
			k.setTitle("we have a winner!");
			k.setMessage(":D");
			k.setPositiveButton("ok", null);
			k.setNegativeButton("cancel", null);
			k.show();
		}
	}
};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button) findViewById(R.id.b1);
		b2=(Button) findViewById(R.id.b2);
		b3=(Button) findViewById(R.id.b3);
		b4=(Button) findViewById(R.id.b4);
		b5=(Button) findViewById(R.id.b5);
		b6=(Button) findViewById(R.id.b6);
		b7=(Button) findViewById(R.id.b7);
		b8=(Button) findViewById(R.id.b8);
		b9=(Button) findViewById(R.id.b9);
		b1.setOnClickListener(click);
		b2.setOnClickListener(click);
		b3.setOnClickListener(click);
		b4.setOnClickListener(click);
		b5.setOnClickListener(click);
		b6.setOnClickListener(click);
		b7.setOnClickListener(click);
		b8.setOnClickListener(click);
		b9.setOnClickListener(click);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
