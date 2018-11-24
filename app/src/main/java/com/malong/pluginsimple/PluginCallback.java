package com.malong.pluginsimple;

import android.net.Uri;

import com.lzh.router.replugin.core.IPluginCallback;

public class PluginCallback implements IPluginCallback {
//    private LoadingDialog mLoadingDialog;

    @Override
    public void onInvalidUri(Uri uri) {
        // 当uri为非法
//        Logger.w("PluginCallback", uri.toString());
    }

    @Override
    public void notFound(Uri uri, String alias) {
//        Logger.w("PluginCallback", "notFound:" + alias);
    }

    @Override
    public void onResume(Uri uri) {
//        Logger.w("PluginCallback", "onResume:" + uri.toString());
    }

    @Override
    public void onStartLoading(Uri uri, String alias) {
//        if ("host".equals(alias)) {
//            return;
//        }
//        if (mLoadingDialog != null) {
//            return;
//        }
//        Logger.w("PluginCallback", "加载插件" + alias + "中...");
////
//        if (MyActivityManager.getCurrentActivity() != null) {
//            if (!MyActivityManager.getCurrentActivity().isFinishing()) {
//                mLoadingDialog = new LoadingDialog(MyActivityManager.getCurrentActivity(), R.style.MyDialogStyle);
//                mLoadingDialog.show();
//            }
//        }
    }

    @Override
    public void onLoadedCompleted(Uri uri, String alias) {
//        if (mLoadingDialog == null) {
//            return;
//        } else if (mLoadingDialog != null) {
//            if (mLoadingDialog.isShowing()) {
//                mLoadingDialog.dismiss();
//            }
//            mLoadingDialog = null;
//        }
//        Logger.w("PluginCallback", "加载插件" + alias + "完成");
    }
}