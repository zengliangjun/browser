package yapa.browser.worker;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;

public class WebChromeClient extends android.webkit.WebChromeClient {

	public WebChromeClient(WebViewControl webViewControl) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Bitmap getDefaultVideoPoster() {
		// TODO Auto-generated method stub
		return super.getDefaultVideoPoster();
	}

	@Override
	public View getVideoLoadingProgressView() {
		// TODO Auto-generated method stub
		return super.getVideoLoadingProgressView();
	}

	@Override
	public void getVisitedHistory(ValueCallback<String[]> callback) {
		// TODO Auto-generated method stub
		super.getVisitedHistory(callback);
	}

	@Override
	public void onCloseWindow(WebView window) {
		// TODO Auto-generated method stub
		super.onCloseWindow(window);
	}

	@Override
	public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
		// TODO Auto-generated method stub
		return super.onConsoleMessage(consoleMessage);
	}

	@Override
	public void onConsoleMessage(String message, int lineNumber, String sourceID) {
		// TODO Auto-generated method stub
		super.onConsoleMessage(message, lineNumber, sourceID);
	}

	@Override
	public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
		// TODO Auto-generated method stub
		return super.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
	}

	@Override
	public void onExceededDatabaseQuota(String url, String databaseIdentifier, long quota, long estimatedDatabaseSize,
			long totalQuota, QuotaUpdater quotaUpdater) {
		// TODO Auto-generated method stub
		super.onExceededDatabaseQuota(url, databaseIdentifier, quota, estimatedDatabaseSize, totalQuota, quotaUpdater);
	}

	@Override
	public void onGeolocationPermissionsHidePrompt() {
		// TODO Auto-generated method stub
		super.onGeolocationPermissionsHidePrompt();
	}

	@Override
	public void onGeolocationPermissionsShowPrompt(String origin, Callback callback) {
		// TODO Auto-generated method stub
		super.onGeolocationPermissionsShowPrompt(origin, callback);
	}

	@Override
	public void onHideCustomView() {
		// TODO Auto-generated method stub
		super.onHideCustomView();
	}

	@Override
	public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
		// TODO Auto-generated method stub
		return super.onJsAlert(view, url, message, result);
	}

	@Override
	public boolean onJsBeforeUnload(WebView view, String url, String message, JsResult result) {
		// TODO Auto-generated method stub
		return super.onJsBeforeUnload(view, url, message, result);
	}

	@Override
	public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
		// TODO Auto-generated method stub
		return super.onJsConfirm(view, url, message, result);
	}

	@Override
	public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
		// TODO Auto-generated method stub
		return super.onJsPrompt(view, url, message, defaultValue, result);
	}

	@Override
	public boolean onJsTimeout() {
		// TODO Auto-generated method stub
		return super.onJsTimeout();
	}

	@Override
	public void onProgressChanged(WebView view, int newProgress) {
		// TODO Auto-generated method stub
		super.onProgressChanged(view, newProgress);
	}

	@Override
	public void onReachedMaxAppCacheSize(long requiredStorage, long quota, QuotaUpdater quotaUpdater) {
		// TODO Auto-generated method stub
		super.onReachedMaxAppCacheSize(requiredStorage, quota, quotaUpdater);
	}

	@Override
	public void onReceivedIcon(WebView view, Bitmap icon) {
		// TODO Auto-generated method stub
		super.onReceivedIcon(view, icon);
	}

	@Override
	public void onReceivedTitle(WebView view, String title) {
		// TODO Auto-generated method stub
		super.onReceivedTitle(view, title);
	}

	@Override
	public void onReceivedTouchIconUrl(WebView view, String url, boolean precomposed) {
		// TODO Auto-generated method stub
		super.onReceivedTouchIconUrl(view, url, precomposed);
	}

	@Override
	public void onRequestFocus(WebView view) {
		// TODO Auto-generated method stub
		super.onRequestFocus(view);
	}

	@Override
	public void onShowCustomView(View view, CustomViewCallback callback) {
		// TODO Auto-generated method stub
		super.onShowCustomView(view, callback);
	}

	@Override
	public void onShowCustomView(View view, int requestedOrientation, CustomViewCallback callback) {
		// TODO Auto-generated method stub
		super.onShowCustomView(view, requestedOrientation, callback);
	}

}
