package com.arithmetic.expression.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.arithmetic.expression.model.ExpressionCalculationModel;
import com.arithmetic.expression.service.ExpressionCalculationService;

@Controller
public class ExpressionCalculationController {
	@Autowired
	ExpressionCalculationService service;

	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String showResults(ExpressionCalculationModel model) {
		return "home";
	}

	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public String getResult(ModelMap modelMap, @RequestParam String expression) {
		ExpressionCalculationModel model = service.calculate(expression);
		modelMap.put("expression", model.getExpression());
		modelMap.put("result", model.getResult());
		return "output";
	}

}
