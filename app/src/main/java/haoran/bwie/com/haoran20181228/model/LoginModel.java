package haoran.bwie.com.haoran20181228.model;

import haoran.bwie.com.haoran20181228.Bean.UserBean;
import haoran.bwie.com.haoran20181228.net.RequestCallBack;
import haoran.bwie.com.haoran20181228.util.OkHttpUtil;

public class LoginModel implements ILoginModel {

    @Override
    public void login(String url, RequestCallBack requestCallBack) {
        OkHttpUtil okHttpUtil = new OkHttpUtil();
        //请求数据 并存入requestCallback
        okHttpUtil.getData(url, requestCallBack);


    }
}
