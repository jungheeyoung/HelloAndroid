package kr.hs.emirim.young24.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle; //import : 포함한다.

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {//클래스가 처음 만들어졌을 때 딱 한번만 실행되는 함수이다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//resource.layout.
    }
}