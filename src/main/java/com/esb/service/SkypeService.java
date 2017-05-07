package com.esb.service;

import com.esb.service.ro.RootEntity;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by itimofeev on 07.05.2017.
 */
public interface SkypeService {

	@POST("v2/conversations/{skype_id}/activities")
	Call<ResponseBody> sendMessage(@Header("Authorization") String header, @Path("skype_id") String skype_id, @Body RootEntity body);

}
