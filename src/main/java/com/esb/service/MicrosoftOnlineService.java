package com.esb.service;

import com.esb.service.ro.AccessTokenRo;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by itimofeev on 07.05.2017.
 */
public interface MicrosoftOnlineService {

	@FormUrlEncoded
	@POST("common/oauth2/v2.0/token")
	Call<AccessTokenRo> updateToken(@Field(value = "grant_type") String grant_type,
	                                @Field(value = "client_id") String client_id,
	                                @Field(value = "client_secret") String client_secret,
	                                @Field(value = "scope") String scope);

}
