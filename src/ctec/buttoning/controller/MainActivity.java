package ctec.buttoning.controller;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity 
{

	private Button firstScreenButton;

	/**
	 * Override
	 * 
	 * @param savedInstanceState
	 */
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_item);

		firstScreenButton = (Button) findViewById(R.id.button1);

		setupListeners();
	}

	private void setupListeners() {
		firstScreenButton.setOnClickListener(new View.OnClickListener() 
		{

			@Override
			public void onClick(View currentView) {
				// TODO Auto-generated method stub
				Intent otherScreenIntent = new Intent(currentView.getContext(),
						SecondScreenActivity.class);
				startActivityForResult(otherScreenIntent, 0);
			}
		});
	}
}
