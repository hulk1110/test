package com.poc3.anz;

import java.util.List;

public class CutomResponse {

	List<ResponseData> responseDatas;

	

	public List<ResponseData> getResponseDatas() {
		return responseDatas;
	}

	public void setResponseDatas(List<ResponseData> responseDatas) {
		this.responseDatas = responseDatas;
	}

	@Override
	public String toString() {
		return "CutomResponse [responseDatas=" + responseDatas + "]";
	}
}
