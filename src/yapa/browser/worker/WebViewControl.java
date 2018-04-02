package yapa.browser.worker;

import com.yapa.api.IYapaWorker;
import com.yapa.base.IYapaManager;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewControl {

	protected IYapaWorker mWorker;
	protected IYapaManager mManager;
	protected WebView mWebView;

	protected String mLoaderUrl;

	public WebViewControl(IYapaWorker worker) {
		mWorker = worker;
	}

	public void onCreate(IYapaManager manager, WebView webView, Bundle options) {
		mManager = manager;
		mWebView = webView;

		initializeSettings();
		mWebView.setWebViewClient(new WebViewClient(this));
		mWebView.setWebChromeClient(new WebChromeClient(this));
		if (null != options)
			mLoaderUrl = options.getString(BrowserWorker.BROWSERURL);
		if (null != mLoaderUrl) {
			mWebView.loadUrl(mLoaderUrl);
		} else {
			mWebView.loadUrl("http://3g.163.com/touch");
		}
	}

	public void onStart(IYapaManager manager) {
	}

	public void onResume(IYapaManager manager) {
		
	}

	public void onPause(IYapaManager manager) {
		
	}

	public void onStop(IYapaManager manager) {
		
	}

	public void onDestroy(IYapaManager manager) {
		
	}

	public void onSaveInstanceState(IYapaManager manager, Bundle bundle) {
		
	}

    private void initializeSettings() {
        WebSettings settings = mWebView.getSettings();

        settings.setJavaScriptEnabled(true);

        // configure local storage apis and their database paths.
        settings.setAppCachePath(mManager.context().getDir("appcache", 0).getPath());
        settings.setGeolocationDatabasePath(mManager.context().getDir("geolocation", 0).getPath());
        settings.setDatabasePath(mManager.context().getDir("databases", 0).getPath());

        settings.setAppCacheEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
    }
}
