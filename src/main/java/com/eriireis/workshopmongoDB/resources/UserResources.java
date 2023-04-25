package com.eriireis.workshopmongoDB.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eriireis.workshopmongoDB.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	//@GetMapping
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity< List<User >> findAll(){
		User goku = new User("1", "Goku", "Goku@dragonball.com");
		User vegeta = new User("2", "Vegeta" ,"vegeta@drgonball.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(goku, vegeta));
		return ResponseEntity.ok().body(list);
	}

}