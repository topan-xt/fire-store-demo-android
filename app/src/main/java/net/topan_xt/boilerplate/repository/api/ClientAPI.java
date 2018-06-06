package net.topan_xt.boilerplate.repository.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*************************************************
 * Author     : Topan E.                         *
 * Contact    : topan.xt@gmail.com               *
 * Created on : Jun 06, 2018.                    *
 *************************************************/

public class ClientAPI {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .addNetworkInterceptor(chain -> {
                        Request original = chain.request();
                        Request.Builder builder = original.newBuilder();
                        Request request = builder.build();
                        return chain.proceed(request);

                    })
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(ConfigUrl.Url.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }
}
