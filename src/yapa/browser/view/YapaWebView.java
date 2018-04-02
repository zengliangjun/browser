package yapa.browser.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;

public class YapaWebView extends WebView {

	private static final String TAG = "YapaWebView";

	public YapaWebView(Context context) {
		super(context);
	}

	public YapaWebView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public YapaWebView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
    public void onDraw(Canvas canvas) {
		// Log.d(TAG, "onDraw onDraw");
		super.onDraw(canvas);
    }
}
