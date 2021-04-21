package com.arithmetic.expression.dao;

import org.springframework.data.repository.CrudRepository;
import com.arithmetic.expression.model.ExpressionCalculationModel;  

public interface ExpressionCalculationDAO extends CrudRepository<ExpressionCalculationModel, Integer> {
	
}
