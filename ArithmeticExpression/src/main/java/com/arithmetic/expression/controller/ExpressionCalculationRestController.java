package com.arithmetic.expression.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arithmetic.expression.model.DataResponse;
import com.arithmetic.expression.model.ExpressionCalculationModel;
import com.arithmetic.expression.service.ExpressionCalculationService;

@RestController
public class ExpressionCalculationRestController {
	@Autowired
	ExpressionCalculationService service;

	@RequestMapping(value = "/calculations", method = RequestMethod.GET)
	private DataResponse getAll() {
		List<ExpressionCalculationModel> list = service.getAll();
		list.stream().forEach(l -> System.out.println("Expression: "+l.getExpression() + " Result:"+l.getResult()));
		DataResponse dr = new DataResponse();
		dr.setList(list.stream().filter(l -> String.valueOf(l.getResult()) != null).collect(Collectors.toList()));
		return dr;
	}

	@GetMapping("/calculate/{id}")
	private ExpressionCalculationModel getStudent(@PathVariable("id") int id) {
		return service.getById(id);
	}

	@DeleteMapping("/calculate/{id}")
	private void delete(@PathVariable("id") int id) {
		service.delete(id);
	}

}
