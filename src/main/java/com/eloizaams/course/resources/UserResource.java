package com.eloizaams.course.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eloizaams.course.entities.User;
import com.eloizaams.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//Para esta injeção de dependência funcionar automaticamente a classe UserService precisa estar registrada como um componente do Spring
	@Autowired
	private UserService service;
	
	@GetMapping //tipo da requisição
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //A requisição vai aceitar o id dentro da URL
	public ResponseEntity<User> findById(@PathVariable Long id){ //@PathVariable usado para o Spring aceitar o parametro passado pela URL
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
}
