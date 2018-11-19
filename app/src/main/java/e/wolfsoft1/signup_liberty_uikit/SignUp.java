package e.wolfsoft1.signup_liberty_uikit;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import adapter.Hello1Adapter;
import me.relex.circleindicator.CircleIndicator;


public class SignUp extends AppCompatActivity {

    private ViewPager v1;
    private Hello1Adapter a;
    private CircleIndicator indicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        v1 = (ViewPager)findViewById(R.id.v1);
        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator);
        a = new Hello1Adapter(getSupportFragmentManager());
        v1.setAdapter(a);
        indicator.setViewPager(v1);
        a.registerDataSetObserver(indicator.getDataSetObserver());
    }
}
