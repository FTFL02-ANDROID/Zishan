package com.example.camera_db_gps;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Taking_Image_Activity extends Activity {

	private ImageView imgFavorite;
	private Button buttontakephoto,buttonregister;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_taking__image_);
		
		  imgFavorite = (ImageView)findViewById(R.id.imageView);
		  buttontakephoto=(Button)findViewById(R.id.buttonTake_Photo);
		  buttonregister=(Button)findViewById(R.id.buttonregister);
	      
		  buttontakephoto.setOnClickListener(new OnClickListener() {
	         @Override
	         public void onClick(View v) {
	            open();
	         }

	      });
	   }

	private void open() {
		// TODO Auto-generated method stub
		 Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
	     startActivityForResult(intent, 0);
	  }
	
	

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
     // TODO Auto-generated method stub
     super.onActivityResult(requestCode, resultCode, data);
     Bitmap bp = (Bitmap) data.getExtras().get("data");
     imgFavorite.setImageBitmap(bp);
  }
}
	   