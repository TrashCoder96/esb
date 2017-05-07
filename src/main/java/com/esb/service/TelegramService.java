package com.esb.service;

import com.esb.service.ro.RootEntity;
import com.esb.service.ro.TelegramMessage;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by itimofeev on 07.05.2017.
 */
public interface TelegramService {

	@POST("bot{token}/sendMessage")
	Call<ResponseBody> sendMessage(@Path("token") String token, @Body TelegramMessage body);

}
