package com.example.apijsonproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.apijsonproject.models.Datum;
import com.example.apijsonproject.models.DeezerAdapter;
import com.example.apijsonproject.models.DeezerResponse;
import com.example.apijsonproject.utils.ApiClient;
import com.example.apijsonproject.utils.ApiInretface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Headers;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (ApiClient.APY_KEY.isEmpty()){
            Toast.makeText(this, "Please obtain your api key from track", Toast.LENGTH_SHORT).show();
            finish();
        }
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInretface apiService = ApiClient.getClient().create(ApiInretface.class);
        Log.i("deezerId", "beforeCall");
        Call<DeezerResponse> call = apiService.getTrackByName("0e2ab71894mshdc79f98d5127b9cp19cdc3jsnc739053375aa",
                "deezerdevs-deezer.p.rapidapi.com",
                "eminem");//, ApiClient.APY_KEY);
        Log.i("deezerId", "afterCall");
        call.enqueue(new Callback<DeezerResponse>() {
            @Override
            public void onResponse(Call<DeezerResponse> call, Response<DeezerResponse> response) {
                Log.i("deezerId", "response"+response.body().getData().toString());
                List<Datum> data = response.body().getData();
                Log.i("deezerId", "List" + response.body().getData());
                recyclerView.setAdapter(new DeezerAdapter(getApplicationContext(), R.layout.deezer_item, data));
            }

            @Override
            public void onFailure(Call<DeezerResponse> call, Throwable t) {
                Log.i("deezerId", "onResponse" + t.getMessage());
            }
        });
    }
}