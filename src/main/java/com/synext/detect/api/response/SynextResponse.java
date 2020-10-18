package com.synext.detect.api.response;

import java.io.Serializable;
import java.util.Map;

/**
 * 返回对象的封装
 * 
 * @author caomei
 *
 */

public class SynextResponse implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public static final String SUCCESS = "success";
    public static final String ERROR = "error";
    public static final String WARNING = "warning";
    private String statusCode = "200";
    private String status;
    private String message;
    private Object data;

    private Map map;
    private Object queryBean;

    public SynextResponse() {

    }

    public static SynextResponse getSuccessReturnDatas() {
        return new SynextResponse(SynextResponse.SUCCESS);
    }
    public static SynextResponse getSuccessReturnDatas(Object data) {
    	return new SynextResponse(SynextResponse.SUCCESS,"",data);
    }

    public static SynextResponse getErrorReturnDatas() {
        return new SynextResponse(SynextResponse.ERROR);
    }

    public static SynextResponse getWarningReturnDatas() {
        return new SynextResponse(SynextResponse.WARNING);
    }

    public SynextResponse(String status) {
        this.status = status;
    }

    public SynextResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public SynextResponse(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object obj) {
        this.data = obj;
    }


    @SuppressWarnings("rawtypes")
    public Map getMap() {
        return map;
    }

    @SuppressWarnings("rawtypes")
    public void setMap(Map map) {
        this.map = map;
    }

    public Object getQueryBean() {
        return queryBean;
    }

    public void setQueryBean(Object queryBean) {
        this.queryBean = queryBean;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
