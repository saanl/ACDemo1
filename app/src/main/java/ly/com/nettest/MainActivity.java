package ly.com.nettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "34d407a4-d76a-4792-8254-46a24a2a9a8c",
                Analytics.class, Crashes.class);

        WebView webView = findViewById(R.id.web);
        webView.loadUrl("https://www.baidu.com");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
