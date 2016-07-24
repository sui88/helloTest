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
import android.widget.Toast;


public class RegisterActivity extends Activity implements OnClickListener {

	private static final String TAG = "RegisterActivity";
	private Button register;
	private Button mybreak;

	private EditText mUserV;
	private EditText mPassWordV;
	private EditText mPassWordAgainV;

	private String mUser;
	private String mPassWord;
	private String mPassWordAgain;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		init();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.register, menu);
		
		return true;
	}

	public void init() {
		Log.d(TAG, "RegisterActivity start init");
		register = (Button) findViewById(R.id.register_register);
		mybreak = (Button) findViewById(R.id.register_break);

		mUserV = (EditText) findViewById(R.id.register_user);
		mPassWordV = (EditText) findViewById(R.id.register_password);
		mPassWordAgainV = (EditText) findViewById(R.id.register_password_again);

		register.setOnClickListener(this);
		mybreak.setOnClickListener(this);

		mUserV.setText("573122745");
		mPassWordV.setText("123456789");
		mPassWordAgainV.setText("123456789");
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.register_register:
			// Toast.makeText(RegisterActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
			// finish();
			register();
			break;

		case R.id.register_break:
			Toast.makeText(RegisterActivity.this, "返回", Toast.LENGTH_SHORT).show();
			finish();
			break;

		default:
			break;
		}
	}

	private void register() {
		// TODO Auto-generated method stub
		mUser = mUserV.getText().toString();
		mPassWord = mPassWordV.getText().toString();
		mPassWordAgain = mPassWordAgainV.getText().toString();

		if (mUser.equals(null)) {
			Log.d(TAG, mUser + "\n" + mPassWord + "\n" + mPassWordAgain);
			Toast.makeText(RegisterActivity.this, "请输入用户名", Toast.LENGTH_SHORT)
			.show();
			return;
		} else {
			Toast.makeText(RegisterActivity.this, "尼玛1", Toast.LENGTH_SHORT)
			.show();
		}

		if (mPassWord.equals(null)) {
			Log.d(TAG, mUser + "\n" + mPassWord + "\n" + mPassWordAgain);
			Toast.makeText(RegisterActivity.this, "请输入密码", Toast.LENGTH_SHORT)
			.show();
			return;
		} else {
			Toast.makeText(RegisterActivity.this, "尼玛2", Toast.LENGTH_SHORT)
			.show();
		}

		if (mPassWordAgain.equals(null)) {
			Log.d(TAG, mUser + "\n" + mPassWord + "\n" + mPassWordAgain);
			Toast.makeText(RegisterActivity.this, "请再输入一次密码",
					Toast.LENGTH_SHORT).show();
			return;
		} else {
			Toast.makeText(RegisterActivity.this, "尼玛3", Toast.LENGTH_SHORT)
			.show();
		}

		if (mUser.equals(null) && mPassWord.equals(null) && mPassWordAgain.equals(null)) {
			Log.d(TAG, mUser + "\n" + mPassWord + "\n" + mPassWordAgain);
			Toast.makeText(RegisterActivity.this, "请重新输入", Toast.LENGTH_SHORT)
			.show();
			return;
		} else {
			Toast.makeText(RegisterActivity.this, "尼玛1", Toast.LENGTH_SHORT)
			.show();
		}

		Log.d(TAG, mUser + "\n" + mPassWord + "\n" + mPassWordAgain);
		
		if (!mPassWord.equals(null)) {

			if (mPassWord.equals(mPassWordAgain)) {
				Log.d(TAG, mUser + "\n" + mPassWord + "\n" + mPassWordAgain);
				Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT)
				.show();
				finish();
			} else {
				Toast.makeText(RegisterActivity.this, "两次密码不相同请重新输入",
						Toast.LENGTH_SHORT).show();
				mUserV.setText(null);
				mPassWordV.setText(null);
				mPassWordAgainV.setText(null);
			}
		}
		
	}

}
