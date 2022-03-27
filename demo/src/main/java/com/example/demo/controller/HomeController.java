package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factoryDesignPattern.AlbumList;
import com.example.demo.factoryDesignPattern.FactoryAlbumn;

@RestController
@RequestMapping
public class HomeController {
	
	@Autowired
	FactoryAlbumn factoryAlbumn;
	
	@GetMapping("/test/{name}")
	public String getTest(@PathVariable String name) {
		AlbumList  albumList = factoryAlbumn.getRapper(name);
		System.out.print(albumList);
		return name;
	}
	

}
