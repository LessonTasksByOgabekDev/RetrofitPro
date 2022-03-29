package dev.ogabek.retrofitpro.network.services;


import java.util.List;

import dev.ogabek.retrofitpro.model.User;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserService {

    @POST("user")
    public Call<User> addUser(@Body User user);

    @POST("user")
    @FormUrlEncoded
    public User addUser(@Field("email") String email, @Field("password") String password);

    @GET("user")
    public Call<List<User>> getAllUser();

}
