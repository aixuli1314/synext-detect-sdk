package com.synext.detect.api.request;

public class SynextDetectBatchRequest extends DefaultRequest{
	//批次ID
	private String detectBatchid;
	//产品IDs
	private String productids;
	//合格证(检测报告)IDs
	private String proveids;
	//批次详情
	private String detectBatchInfo;
	
	public SynextDetectBatchRequest() {}
	public SynextDetectBatchRequest(String url) {
		super.setUrl(url);
	}
	public String getDetectBatchid() {
		return detectBatchid;
	}
	public void setDetectBatchid(String detectBatchid) {
		this.detectBatchid = detectBatchid;
	}
	public String getProductids() {
		return productids;
	}
	public void setProductids(String productids) {
		this.productids = productids;
	}
	public String getDetectBatchInfo() {
		return detectBatchInfo;
	}
	public void setDetectBatchInfo(String detectBatchInfo) {
		this.detectBatchInfo = detectBatchInfo;
	}
	public String getProveids() {
		return proveids;
	}
	public void setProveids(String proveids) {
		this.proveids = proveids;
	}
	
	
	
}
