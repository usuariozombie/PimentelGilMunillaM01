package com.vedruna.pimentelgilmunillam01.persistence.model;

import com.vedruna.pimentelgilmunillam01.persistence.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CRUDInterface {
    @GET("/products")
    Call<List<Product>> getAll();
}