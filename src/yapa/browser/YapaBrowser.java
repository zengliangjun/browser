package yapa.browser;

import com.yapa.base.IYapaManager;
import com.yapa.base.SpaceUtils;
import com.yapa.base.YapaToolkit;
import com.yapa.spacev2.ContentAttributeEnty;
import com.yapa.spacev2.Resource;

import android.app.Activity;
import android.os.Bundle;

public class YapaBrowser extends Activity {

    protected IYapaManager mYapaManager;
    protected YapaCenter mHelloYapa;

    public YapaBrowser() {
        mYapaManager = YapaToolkit.getYapaManager(this);
        mHelloYapa = new YapaCenter(this);
        mYapaManager.register(this, mHelloYapa);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_yapa_browser);
        mYapaManager.onCreate(savedInstanceState);
    }

	@Override
	protected void onResume() {
		super.onResume();
        if (false) {
            ContentAttributeEnty.ImageEnty enty = new ContentAttributeEnty.ImageEnty();
            enty.mResource.mPathType = Resource.RESOURCE_ASSET;
            enty.mResource.mPath = "sphere.jpg";

            SpaceUtils.updateRootContent(mYapaManager.getScene(), enty);
        } else {
            ContentAttributeEnty.SkeyboxImageEnty enty = new ContentAttributeEnty.SkeyboxImageEnty();
            enty.mResource.mPathType = Resource.RESOURCE_ASSET;
            enty.mResource.mPath = "skeybox.jpg";

            SpaceUtils.updateRootContent(mYapaManager.getScene(), enty);
        }
	}

}
