package com.synext.detect.api.request;

public class SynextDetectPictureRequest extends DefaultRequest{
	//图片ID
	private String detectPictureid;
	//图片详情
	private String detectPictureInfo;
	//图片类型(1:产品图片，2：批次图片)
	private String imagesType;
	//所属类型合约数据ID
	private String dataId;
	
	public SynextDetectPictureRequest() {}
	public SynextDetectPictureRequest(String url) {
		super.setUrl(url);
	}
	
	public String getDetectPictureid() {
		return detectPictureid;
	}
	public void setDetectPictureid(String detectPictureid) {
		this.detectPictureid = detectPictureid;
	}
	public String getDetectPictureInfo() {
		return detectPictureInfo;
	}
	public void setDetectPictureInfo(String detectPictureInfo) {
		this.detectPictureInfo = detectPictureInfo;
	}
	public String getImagesType() {
		return imagesType;
	}
	public void setImagesType(String imagesType) {
		this.imagesType = imagesType;
	}
	public String getDataId() {
		return dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	
	
}
