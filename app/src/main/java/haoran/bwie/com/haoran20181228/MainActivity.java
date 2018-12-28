package haoran.bwie.com.haoran20181228;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import haoran.bwie.com.haoran20181228.Bean.UserBean;
import haoran.bwie.com.haoran20181228.presenter.LoginPresenter;
import haoran.bwie.com.haoran20181228.view.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {

    private LoginPresenter loginPresenter;
    private String url = "http://120.27.23.105/product/getProducts?pscid=39&page=1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPresenter = new LoginPresenter(this);
        loginPresenter.login(url);

    }

    @Override
    public void success(UserBean userBean) {
        Toast.makeText(this, userBean.getData().get(0).getTitle(), Toast.LENGTH_SHORT).show();
        Log.d("qqqq", userBean.getData().get(0).getTitle());
    }

    @Override
    public void error(String string) {

    }
}
