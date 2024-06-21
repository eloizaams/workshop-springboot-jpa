package com.eloizaams.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eloizaams.course.entities.Order;
import com.eloizaams.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	// Para esta injeção de dependência funcionar automaticamente a classe
	// OrderService precisa estar registrada como um componente do Spring
	@Autowired
	private OrderService service;

	@GetMapping // tipo da requisição
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}") // A requisição vai aceitar o id dentro da URL
	public ResponseEntity<Order> findById(@PathVariable Long id) { // @PathVariable usado para o Spring aceitar o
																	// parametro passado pela URL
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

	}

}
