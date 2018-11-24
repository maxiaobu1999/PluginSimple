package com.malong.toutiao;

import android.app.Application;

import com.lzh.nonview.router.RouterConfiguration;
import com.lzh.nonview.router.anno.RouteConfig;
import com.lzh.router.RouterRuleCreator;
import com.lzh.router.replugin.plugin.PluginRouterConfiguration;

@RouteConfig(baseUrl = "taotiao://")
public class TouTiaoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PluginRouterConfiguration.init("com.malong.toutiao", "toutiao", this);
        RouterConfiguration.get().addRouteCreator(new RouterRuleCreator());
    }
}
