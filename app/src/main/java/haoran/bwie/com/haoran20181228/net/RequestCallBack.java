package haoran.bwie.com.haoran20181228.net;

import haoran.bwie.com.haoran20181228.Bean.UserBean;

public interface RequestCallBack {
    void success(UserBean userBean);

    void falure(String msg);
}
