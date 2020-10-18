package com.synext.detect.api.request;

import java.util.List;

import org.apache.http.NameValuePair;

import com.synext.detect.api.client.SynextClient;

public class DefaultRequest extends SynextClient {
	//盛见区块链网络平台分配给开发者的应用ID
	private String appid;
	//调用接口凭证
	private String accesstoken;
	private String format = "JSON";
	private String charset = "utf-8";
	//发送请求的时间
	private String timestamp;
	//请求URL
	private String url;
	//POST,GET
	private String httpMethod;
	//给GET请求使用的参数
	private List<NameValuePair> paramsList;
	
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	
	public String getAccesstoken() {
		return accesstoken;
	}
	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHttpMethod() {
		return httpMethod;
	}
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}
	public List<NameValuePair> getParamsList() {
		return paramsList;
	}
	public void setParamsList(List<NameValuePair> paramsList) {
		this.paramsList = paramsList;
	}
	
}
