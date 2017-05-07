package com.esb.service;

import com.esb.service.ro.TelegramMessage;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by itimofeev on 07.05.2017.
 */
public interface TelegramService {

	@POST("sendMessage")
	Call<ResponseBody> sendMessage(@Body TelegramMessage body);

}
