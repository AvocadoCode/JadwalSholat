package com.idn.avocadocode.jadwalsholat.api;

import com.idn.avocadocode.jadwalsholat.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("jakarta.json")
    Call<ModelJadwal> getJadwal();

}