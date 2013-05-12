package com.example.clickabletextview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ClickableTextViewActivity extends Activity {

	private TextView mText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clickable_text_view);
		mText = (TextView)findViewById(R.id.layout_content);
		
		mText.setText("Hello, guy, #Haha# , this is a implemnt of " +
				"TextView which can handle user click event in some " +
				"clickable sentences, and don't block the click event when" +
				" you click the other textview area." +
				"Create by @Gnod. \r\n http://www.github.com");
		mText.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(v.getContext(), "TextView Clicked", Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.clickable_text_view, menu);
		return true;
	}

}
