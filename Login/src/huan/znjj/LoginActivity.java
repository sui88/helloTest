package huan.znjj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener{
	
	private static final String TAG = "LoginActivity";
	
	private Button login;
	private Button mybreak;
	private Button register;

	private String mUser;
	private String mPassword;

	// UI references.
	private EditText mUserView;
	private EditText mPasswordView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		init();
	}

	public void init()
	{
		Log.d(TAG, "LoginActivity start init");
		login = (Button) findViewById(R.id.login_login);
		register = (Button) findViewById(R.id.login_register);
		mybreak = (Button) findViewById(R.id.login_break);
		
		mUserView = (EditText) findViewById(R.id.login_user);
		mPasswordView = (EditText) findViewById(R.id.login_password);
		
		login.setOnClickListener(this);
		register.setOnClickListener(this);
		mybreak.setOnClickListener(this);
		mPasswordView.setOnClickListener(this);
		mUserView.setOnClickListener(this);
		
		mUserView.setText("573122745");
		mPasswordView.setText("1234567890");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
			case R.id.login_login:
				login();
                break;
                
			case R.id.login_register:
				Intent btnkey2 = new Intent();
				
				
                Toast.makeText(LoginActivity.this,"×¢²á",Toast.LENGTH_SHORT).show();
                btnkey2.setClass(LoginActivity.this,RegisterActivity.class);
              
                startActivity(btnkey2);
                break;
            
			case R.id.login_break:
				Toast.makeText(LoginActivity.this,"·µ»Ø",Toast.LENGTH_SHORT).show();
				finish();
				break;
			
			default:
				break;
		}
	}

	private void login() {
		// TODO Auto-generated method stub
		mUser = mUserView.getText().toString();
		mPassword = mPasswordView.getText().toString();
		Log.d(TAG, mUser);
		Log.d(TAG, mPassword);
		if (mUser.equals("573122745")) {
			if(mPassword.equals("1234567890")){
				Log.d(TAG, mPassword);
				Intent btnkey1 = new Intent();
		        Toast.makeText(LoginActivity.this,"µÇÂ¼",Toast.LENGTH_SHORT).show();
		        btnkey1.setClass(LoginActivity.this,MenuActivity.class);
		        startActivity(btnkey1);
			}else {
				Log.d(TAG, mUser);
				Toast.makeText(LoginActivity.this,"ÃÜÂë´íÎó",Toast.LENGTH_SHORT).show();
				mUserView.setText(null);
				mPasswordView.setText(null);
			}
		} else {
			Log.d(TAG, mUser);
			Toast.makeText(LoginActivity.this,"ÓÃ»§´íÎó",Toast.LENGTH_SHORT).show();
			mUserView.setText(null);
			mPasswordView.setText(null);
		}
		finish();
	}

}
