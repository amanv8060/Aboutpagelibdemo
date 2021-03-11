package com.amanv8060.testinglibinjava

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mx.aboutpage.AboutActivity
import com.mx.aboutpage.AboutConfig

class MainActivity2 : ComponentActivity() {
    var aboutConfig: AboutConfig = AboutConfig().getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aboutConfig.appName = "Messengerx"
        aboutConfig.version = "2.0.0"
        aboutConfig.aboutLabelTitle = "About App"
        aboutConfig.packageName = applicationContext.packageName
        aboutConfig.shareMessage="Download this Awsome APP"
        aboutConfig.facebookUserName = "ButWhoCares"
        aboutConfig.twitterUserName = "amanv8060"
        aboutConfig.facebookUserPageId = "108972223791354"
        aboutConfig.webHomePage = "https://messengerx.io"
        aboutConfig.appPublisher = "Ophilia"
        aboutConfig.companyHtmlPath = "https://messengerx.io"
        aboutConfig.privacyHtmlPath = "https://messengerx.io"
        aboutConfig.acknowledgmentHtmlPath = "https://messengerx.io"
        aboutConfig.emailAddress = "verma1090aman@gmail.com"
        setContent {
            AboutActivity().launch(activity = this)
        }
    }
}
