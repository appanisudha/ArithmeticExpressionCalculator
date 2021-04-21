package com.arithmetic.expression.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Service;

import com.arithmetic.expression.dao.ExpressionCalculationDAO;
import com.arithmetic.expression.model.ExpressionCalculationModel;

@Service
public class ExpressionCalculationService {
	@Autowired
	private ExpressionCalculationDAO dao;

	public ExpressionCalculationModel calculate(String expression) {
		ExpressionParser parser = new SpelExpressionParser();
		double result = parser.parseExpression(expression).getValue(Double.class);
		ExpressionCalculationModel model = new ExpressionCalculationModel();
		model.setExpression(expression);
		model.setResult(result);
		saveOrUpdate(model);
		return model;
	}

	// getting all student records
	public List<ExpressionCalculationModel> getAll() {
		List<ExpressionCalculationModel> list = new ArrayList<ExpressionCalculationModel>();
		dao.findAll().forEach(l -> list.add(l));
		return list;
	}

	// getting a specific record
	public ExpressionCalculationModel getById(int id) {
		return dao.findById(id).get();
	}
	
	// Saving a specific record
	public void saveOrUpdate(ExpressionCalculationModel model) {
		dao.save(model);
	}

	// deleting a specific record
	public void delete(int id) {
		dao.deleteById(id);
	}
}
