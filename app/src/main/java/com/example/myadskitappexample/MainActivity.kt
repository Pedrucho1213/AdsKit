package com.example.myadskitappexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.huawei.hms.ads.AdParam
import com.huawei.hms.ads.BannerAdSize
import com.huawei.hms.ads.HwAds
import com.huawei.hms.ads.banner.BannerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HwAds.init(this)
        val bannerView: BannerView? = findViewById(R.id.hw_banner_view)
        bannerView!!.adId = "testw6vs28auh3"
        bannerView.bannerAdSize = BannerAdSize.BANNER_SIZE_360_57
        bannerView.setBannerRefresh(30)
        val adParam = AdParam.Builder().build()
        bannerView.loadAd(adParam)


    }
}