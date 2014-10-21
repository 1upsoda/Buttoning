package ctec.buttoning.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondScreenActivity extends Activity
{

	private Button secondScreenButton;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_screen);
		secondScreenButton = (Button) findViewById(R.id.secondScreenButton);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		secondScreenButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();
				
			}
		});
	}
}
