package com.malong.pluginsimple;

import android.app.Application;

import com.lzh.nonview.router.RouterConfiguration;
import com.lzh.nonview.router.anno.RouteConfig;
import com.lzh.router.RouterRuleCreator;
import com.lzh.router.replugin.host.HostRouterConfiguration;
import com.qihoo360.replugin.RePlugin;
@RouteConfig(baseUrl = "host://")
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HostRouterConfiguration.init("com.malong.pluginsimple", this);
        HostRouterConfiguration.get().setCallback(new PluginCallback());//设置与插件间调用的回调监听
        RePlugin.addCertSignature("C7FBF2EBEEE73A545EB181C576B992CA");//生产证书md5值
        // 添加路由规则。
        RouterConfiguration.get().addRouteCreator(new RouterRuleCreator());

    }
}
