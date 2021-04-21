package com.arithmetic.expression.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="ARITHMETIC_CALCULATION")
public class ExpressionCalculationModel {
	@Id    
	@Column(name="ID") 
	private int id;
	
	@Column(name="EXPRESSION")
	private String expression;
	
	@Column(name="RESULT")
	private double result;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
}
