package ly.com.nettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.push.Push;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "34d407a4-d76a-4792-8254-46a24a2a9a8c",
                Analytics.class, Crashes.class,Push.class);

        WebView webView = findViewById(R.id.web);
        webView.loadUrl("https://www.baidu.com");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    public void click1(View view){

        Random random = new Random();
        int nextInt = random.nextInt(15);

        if(nextInt % 2 == 0){
            int k = 9/0;
        }else if(nextInt % 3 == 0){
            Integer s = null;
            s.equals(89);
        }else if(nextInt %5 == 0){
            String[] s = {"",""};
            String s1 = s[3];
        }else{
            throw new RuntimeException("测试Crash");
        }

    }
}
