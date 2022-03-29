package dev.ogabek.retrofitpro.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import dev.ogabek.retrofitpro.R;
import dev.ogabek.retrofitpro.model.User;
import dev.ogabek.retrofitpro.network.B13Client;
import dev.ogabek.retrofitpro.network.services.UserService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView tv_text;
    private UserService service;
    private Call<List<User>> call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        service = B13Client.createService(UserService.class);

        initViews();

    }

    private void initViews() {

        tv_text = findViewById(R.id.tv_text);

        call = service.getAllUser();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                tv_text.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                tv_text.setText(t.getLocalizedMessage());
            }
        });
    }
}