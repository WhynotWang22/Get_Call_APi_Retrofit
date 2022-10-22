package com.whynotquang.get_call_api_retrofit.in;

import com.whynotquang.get_call_api_retrofit.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JSONPlaceholder {

    @GET("posts")
    Call<List<Post>> getPost();
}
