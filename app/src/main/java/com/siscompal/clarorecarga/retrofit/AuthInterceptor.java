package com.siscompal.clarorecarga.retrofit;

        import android.widget.Toast;

        import com.siscompal.clarorecarga.common.Constantes;
        import com.siscompal.clarorecarga.common.SharedPreferencesManager;
        import com.siscompal.clarorecarga.retrofit.response.Datum;
        import com.siscompal.clarorecarga.ui.DashboardActivity;

        import java.io.IOException;

        import okhttp3.Interceptor;
        import okhttp3.Request;
        import okhttp3.Response;

public class AuthInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        String token = SharedPreferencesManager.getSomeStringValue(Constantes.PREF_TOKEN);
        Request request = chain.request().newBuilder().addHeader("Authorization", token).build();
        return chain.proceed(request);
    }
}
