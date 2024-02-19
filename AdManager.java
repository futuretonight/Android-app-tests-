// AdManager.java

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AdManager {

    private AdView adView;

    public AdManager() {
        // Default constructor
    }

    public void loadAd(Context context, View adContainer, String adUnitId) {
        adView = new AdView(context);
  
