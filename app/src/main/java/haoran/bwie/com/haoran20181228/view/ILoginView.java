package haoran.bwie.com.haoran20181228.view;

import haoran.bwie.com.haoran20181228.Bean.UserBean;

public interface ILoginView {
    void success(UserBean userBean);

    void error(String string);
}
