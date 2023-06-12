package com.viniciuspontes.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.viniciuspontes.workshopmongo.domain.User;

@RestController

@RequestMapping(value="/users") 
public class UserResource {
	
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<List<User>> findALL(){
			
			User maria = new User("1", "Mria Silva", "mariasilva@gamil.com");
			User alex = new User("2", "Alex Silva", "alexsilva@gamil.com");
			List<User>list= new ArrayList<>();
			list.addAll(Arrays.asList(maria, alex));
			return ResponseEntity.ok().body(list);
		}

}
