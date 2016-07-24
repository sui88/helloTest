package huan.znjj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	private static final String TAG = "MainActivity";
	private Button login;
	private Button register;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
    }

    public void init()
    {
    	Log.d(TAG, "MainActivity start init");
    	login = (Button)findViewById(R.id.main_login);
    	register = (Button)findViewById(R.id.main_exit);
    	
    	login.setOnClickListener(this);
    	register.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		switch(v.getId()){
			case R.id.main_login:
				Intent btnkey1 = new Intent();
                Toast.makeText(MainActivity.this,"µÇÂ¼",Toast.LENGTH_SHORT).show();
                btnkey1.setClass(MainActivity.this,LoginActivity.class);
                startActivity(btnkey1);
                break;
			
			case R.id.main_exit:
                Toast.makeText(MainActivity.this,"ÍË³ö",Toast.LENGTH_SHORT).show();
                finish();
                break;
			
			default:
				break;
		}
	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
