package com.example.belikeelonmusk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Nullable
    private InterstitialAd mInterstitialAd = null;
    @Nullable
    private InterstitialAdLoader mInterstitialAdLoader = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInterstitialAdLoader = new InterstitialAdLoader(this);
        mInterstitialAdLoader.setAdLoadListener(new InterstitialAdLoadListener() {
            @Override
            public void onAdLoaded(@NonNull final InterstitialAd interstitialAd) {
                mInterstitialAd = interstitialAd;
                // The ad was loaded successfully. Now you can show loaded ad.
            }

            @Override
            public void onAdFailedToLoad(@NonNull final AdRequestError adRequestError) {
                // Ad failed to load with AdRequestError.
                // Attempting to load a new ad from the onAdFailedToLoad() method is strongly discouraged.
            }
        });
        loadInterstitialAd();
        textView = findViewById(R.id.pretext1);
        Random random = new Random();
        int rtext = 1 + random.nextInt(10);
        switch (rtext){
            case 1:
                textView.setText(R.string.text1);
                break;
            case 2:
                textView.setText(R.string.text2);
                break;
            case 3:
                textView.setText(R.string.text3);
                break;
            case 4:
                textView.setText(R.string.text4);
                break;
            case 5:
                textView.setText(R.string.text5);
                break;
            case 6:
                textView.setText(R.string.text6);
                break;
            case 7:
                textView.setText(R.string.text7);
                break;
            case 8:
                textView.setText(R.string.text8);
                break;
            case 9:
                textView.setText(R.string.text9);
                break;
            case 10:
                textView.setText(R.string.text10);
                break;
            case 11:
                textView.setText(R.string.text11);
                break;
            case 12:
                textView.setText(R.string.text12);
                break;
            case 13:
                textView.setText(R.string.text13);
                break;
            case 14:
                textView.setText(R.string.text14);
                break;
        }



        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, BasicActivity.class);
                startActivity(intent);
                finish();
                showAd();
            }
        }, 7000);
    }

    private void loadInterstitialAd() {
        if (mInterstitialAdLoader != null ) {
            final AdRequestConfiguration adRequestConfiguration =
                    new AdRequestConfiguration.Builder("R-M-9405168-1").build();
            mInterstitialAdLoader.loadAd(adRequestConfiguration);
        }
    }

    public void showAd() {
        if (mInterstitialAd != null) {
            mInterstitialAd.setAdEventListener(new InterstitialAdEventListener() {
                @Override
                public void onAdShown() {
                    // Called when ad is shown.
                }

                @Override
                public void onAdFailedToShow(@NonNull final AdError adError) {
                    // Called when an InterstitialAd failed to show.
                }

                @Override
                public void onAdDismissed() {
                    // Called when ad is dismissed.
                    // Clean resources after Ad dismissed
                    if (mInterstitialAd != null) {
                        mInterstitialAd.setAdEventListener(null);
                        mInterstitialAd = null;
                    }

                    // Now you can preload the next interstitial ad.
                    loadInterstitialAd();
                }

                @Override
                public void onAdClicked() {
                    // Called when a click is recorded for an ad.
                }

                @Override
                public void onAdImpression(@Nullable final ImpressionData impressionData) {
                    // Called when an impression is recorded for an ad.
                }
            });
            mInterstitialAd.show(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mInterstitialAdLoader != null) {
            mInterstitialAdLoader.setAdLoadListener(null);
            mInterstitialAdLoader = null;
        }
        destroyInterstitialAd();
    }

    private void destroyInterstitialAd() {
        if (mInterstitialAd != null) {
            mInterstitialAd.setAdEventListener(null);
            mInterstitialAd = null;
        }
    }
}