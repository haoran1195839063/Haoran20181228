package haoran.bwie.com.haoran20181228.util;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.logging.Handler;

import haoran.bwie.com.haoran20181228.Bean.UserBean;
import haoran.bwie.com.haoran20181228.net.RequestCallBack;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpUtil {

    public void getData(String url, final RequestCallBack requestCallBack) {
        final android.os.Handler handler = new android.os.Handler();
        OkHttpClient okHttpClient = new OkHttpClient();
        Request build = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(build);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                final UserBean userBean = new Gson().fromJson(string, UserBean.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        requestCallBack.success(userBean);
                    }
                });

            }
        });

    }
}
