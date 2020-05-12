package com.firstapp.profile_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    CircleImageView profileImage ;
    TextView fullName,designation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileImage = findViewById(R.id.imageview_profile);
        fullName     = findViewById(R.id.NameOfUser);
        designation  = findViewById(R.id.User_Designation);

      Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate);

      Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.blink_anim);

      Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.lefttoright);

        profileImage.startAnimation(animation);

        fullName.startAnimation(animation1);

        designation.startAnimation(animation2);
    }
}
