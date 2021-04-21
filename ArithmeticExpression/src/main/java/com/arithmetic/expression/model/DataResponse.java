package com.arithmetic.expression.model;

import java.io.Serializable;
import java.util.List;

public class DataResponse implements Serializable{
	
	private List<ExpressionCalculationModel> list;

	public List<ExpressionCalculationModel> getList() {
		return list;
	}

	public void setList(List<ExpressionCalculationModel> list) {
		this.list = list;
	}
}
