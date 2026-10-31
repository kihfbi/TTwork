package com.example.hellocodex;
import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b) { super.onCreate(b);
 LinearLayout root = new LinearLayout(this); root.setGravity(Gravity.CENTER); root.setBackgroundColor(Color.BLACK);
 Button button = new Button(this); button.setText("눌러서 확인"); button.setOnClickListener(v -> Toast.makeText(this, "APK 설치 성공", Toast.LENGTH_LONG).show()); root.addView(button); setContentView(root);
 }
}