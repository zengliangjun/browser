package yapa.browser.worker;

import com.yapa.base.IYapaManager;
import com.yapa.base.YapaBaseWorker;

import yapa.browser.R;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class BrowserWorker extends YapaBaseWorker {

	public static final String BROWSERURL = "#URL";

	private WebViewControl mWebViewControl;

	public BrowserWorker() {
		mWebViewControl = new WebViewControl(this);
	}

	@Override
	public int getLayoutId() {
		return R.layout.worker_webview;
	}

	@Override
	public void onCreate(IYapaManager manager, View rootView, Bundle options) {
		super.onCreate(manager, rootView, options);
		mWebViewControl.onCreate(manager, (WebView)rootView.findViewById(R.id.yapa_webview), options);
	}

	@Override
	public void onStart(IYapaManager manager) {
		mWebViewControl.onStart(manager);
	}

	@Override
	public void onResume(IYapaManager manager) {
		mWebViewControl.onResume(manager);
	}

	@Override
	public void onPause(IYapaManager manager) {
		mWebViewControl.onResume(manager);
	}

	@Override
	public void onStop(IYapaManager manager) {
		mWebViewControl.onStop(manager);
	}

	@Override
	public void onDestroy(IYapaManager manager) {
		mWebViewControl.onStop(manager);
	}

	@Override
	public void onSaveInstanceState(IYapaManager manager, Bundle bundle) {
		mWebViewControl.onSaveInstanceState(manager, bundle);
	}

}
