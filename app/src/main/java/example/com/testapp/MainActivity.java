package example.com.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button)findViewById(R.id.butn);
    }


    public void changeVisibiity(View v){
        n++;
        if(n%2!=0)
            btn.setVisibility(View.INVISIBLE);
        else
            btn.setVisibility(View.VISIBLE);

    }
}
