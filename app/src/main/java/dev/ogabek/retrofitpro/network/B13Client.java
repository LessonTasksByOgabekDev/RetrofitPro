package dev.ogabek.retrofitpro.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class B13Client {

    private static final String BASE_URL = "https://6221a8a8afd560ea69b618b5.mockapi.io/android/";

    public static Retrofit getRetrofit() {
        Retrofit builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
        return builder;
    }

    public static <T> T createService(Class<T> service) {
        return getRetrofit().create(service);
    }

}
