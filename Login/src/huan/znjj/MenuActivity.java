package huan.znjj;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends Activity implements OnClickListener{

	private Button light;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		init();
	}

	public void init(){
		light = (Button) findViewById(R.id.menu_light);
		
		light.setOnClickListener(this);
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.menu_light:
			Intent lightbtn = new Intent();
            Toast.makeText(MenuActivity.this,"ตฦนโ",Toast.LENGTH_SHORT).show();
            lightbtn.setClass(MenuActivity.this,Light.class);
            startActivity(lightbtn);
			
			break;

		default:
			break;
		}
		
	}

}
