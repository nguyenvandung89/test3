package com.example.test3;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
  private TextView text;
  private Button button;
  private EditText edit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_main);
	  edit = (EditText) findViewById(R.id.edittext);
	  text = (TextView) findViewById(R.id.textview);
	  button = (Button) findViewById(R.id.button);
	  edit.setText("");
	  button.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
		  text.setText("Hello: " + edit.getText().toString());
		}
	});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	  getMenuInflater().inflate(R.menu.main, menu);
	  return true;
	}
}
