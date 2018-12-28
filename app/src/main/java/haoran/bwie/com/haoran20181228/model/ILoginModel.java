package haoran.bwie.com.haoran20181228.model;

import haoran.bwie.com.haoran20181228.Bean.UserBean;
import haoran.bwie.com.haoran20181228.net.RequestCallBack;

public interface ILoginModel {
    void login(String url, RequestCallBack requestCallBack);
}
