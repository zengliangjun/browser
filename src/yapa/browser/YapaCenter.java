package yapa.browser;

import yapa.browser.worker.BrowserWorker;

import com.yapa.api.IYapaCenter;
import com.yapa.api.IYapaControl;
import com.yapa.base.IYapaManager;
import com.yapa.base.YapaBaseCenter;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class YapaCenter extends YapaBaseCenter {

    protected Activity mActivity;

    public YapaCenter(Activity activity) {
        mActivity = activity;
    }

    @Override
	public int spaceStatus() {
		// return IYapaCenter.YAPA_ORIENTATIONLANDSCAPE_LAYOUTSPACELEFT;
    	return IYapaCenter.YAPA_ENTERSPACE | IYapaCenter.YAPA_ORIENTATIONPORTRAIT_LAYOUTBACKGROUND;
	}

    @Override
    public IYapaControl setupControl() {
        return null;
    }

    @Override
    public Intent onActivityCreated(IYapaManager manager, Bundle outState) {
        if (!manager.spaceInOut()) {
            Intent intent = new Intent();
            ComponentName name = new ComponentName(manager.context(), BrowserWorker.class);
            intent.setComponent(name);
            return intent;
        }

        Intent intent = new Intent();

        Bundle bundle = new Bundle();

        String[] classNames = new String[] {
                BrowserWorker.class.getName(),
        };

        bundle.putStringArray(workComponentArray, classNames);
        intent.putExtra(workBundleExtra, bundle);

        return intent;
    }

}
