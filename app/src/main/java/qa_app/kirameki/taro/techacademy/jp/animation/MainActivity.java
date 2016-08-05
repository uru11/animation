package qa_app.kirameki.taro.techacademy.jp.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AnimationUtils;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.monster).startAnimation(AnimationUtils.loadAnimation(this, R.anim.a1));
    }
}
