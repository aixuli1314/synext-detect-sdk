package com.synext.detect.api.request;

public class SynextAccessTokenRequest extends DefaultRequest{
	//应用唯一标识
	private String appid;
	//应用的密钥
	private String secret;
	
	public SynextAccessTokenRequest() {}
	public SynextAccessTokenRequest(String url) {
		super.setUrl(url);
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
}
