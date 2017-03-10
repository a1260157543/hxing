package com.easemob.lamb.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.easemob.lamb.R;
import com.squareup.picasso.Picasso;

public class MainImage extends Activity {
    private ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainimage);
        imageview = (ImageView)findViewById(R.id.imageview);
        Picasso.with(getApplicationContext()).load("https://a1260157543.github.io/images/lyy251.png")
                //.placeholder(R.mipmap.ic_launcher)
                //.error(R.mipmap.ic_launcher)
                //.resize(400, 200).centerCrop()
//				  .rotate(90)
                .into(imageview);
    }

}
