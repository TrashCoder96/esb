package com.esb.service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by itimofeev on 07.05.2017.
 */
public interface VkService {

	@GET("messages.send")
	Call<ResponseBody> sendMessage(@Query("access_token") String access_token,
	                               @Query("user_id") String user_id,
	                               @Query("message") String message);

}
