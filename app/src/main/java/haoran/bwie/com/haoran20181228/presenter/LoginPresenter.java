package haoran.bwie.com.haoran20181228.presenter;

import haoran.bwie.com.haoran20181228.Bean.UserBean;
import haoran.bwie.com.haoran20181228.model.LoginModel;
import haoran.bwie.com.haoran20181228.net.RequestCallBack;
import haoran.bwie.com.haoran20181228.view.ILoginView;

public class LoginPresenter {
    private ILoginView loginView;
    private LoginModel loginModel;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
        loginModel = new LoginModel();
    }

    public void login(String url) {
        if (loginModel != null) {
            loginModel.login(url, new RequestCallBack() {
                @Override
                public void success(UserBean userBean) {
                    loginView.success(userBean);
                }

                @Override
                public void falure(String msg) {
                    loginView.error(msg);
                }
            });
        }
    }

}
