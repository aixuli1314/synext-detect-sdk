package com.synext.detect.api.request;

public class SynextDetectProveRequest extends DefaultRequest {
	//合格证信息ID
	private String detectProveid;
	//合格证详情数据
	private String detectProveInfo;
	//合格证类型(1：产品合格证，2：批次合格证)
	private String proveType;
	//所属类型合约数据ID
	private String dataId;
	
	public SynextDetectProveRequest() {}
	public SynextDetectProveRequest(String url) {
		super.setUrl(url);
	}
	public String getDetectProveid() {
		return detectProveid;
	}
	public void setDetectProveid(String detectProveid) {
		this.detectProveid = detectProveid;
	}
	public String getDetectProveInfo() {
		return detectProveInfo;
	}
	public void setDetectProveInfo(String detectProveInfo) {
		this.detectProveInfo = detectProveInfo;
	}
	public String getProveType() {
		return proveType;
	}
	public void setProveType(String proveType) {
		this.proveType = proveType;
	}
	public String getDataId() {
		return dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	
	
}
