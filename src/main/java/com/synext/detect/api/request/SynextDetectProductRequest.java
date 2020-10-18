package com.synext.detect.api.request;

public class SynextDetectProductRequest extends DefaultRequest {
	//产品ID
	private String detectProductid;
	//图片IDs
	private String imagesids;
	//批次ID
	private String detectBatchid;
	//合格证(检测报告)IDs
	private String proveids;
	//产品详情
	private String detectProductInfo;
	
	public SynextDetectProductRequest() {}
	public SynextDetectProductRequest(String url) {
		super.setUrl(url);
	}
	
	public String getDetectProductid() {
		return detectProductid;
	}
	public void setDetectProductid(String detectProductid) {
		this.detectProductid = detectProductid;
	}
	public String getImagesids() {
		return imagesids;
	}
	public void setImagesids(String imagesids) {
		this.imagesids = imagesids;
	}
	public String getDetectProductInfo() {
		return detectProductInfo;
	}
	public void setDetectProductInfo(String detectProductInfo) {
		this.detectProductInfo = detectProductInfo;
	}
	public String getProveids() {
		return proveids;
	}
	public void setProveids(String proveids) {
		this.proveids = proveids;
	}
	public String getDetectBatchid() {
		return detectBatchid;
	}
	public void setDetectBatchid(String detectBatchid) {
		this.detectBatchid = detectBatchid;
	}
	
}
