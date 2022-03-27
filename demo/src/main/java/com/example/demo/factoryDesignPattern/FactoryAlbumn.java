package com.example.demo.factoryDesignPattern;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class FactoryAlbumn {
	
	Map<String,AlbumList> map;
	
	public AlbumList getRapper(String name) {
	AlbumList albumList = map.get(name);
	return albumList;
	}
	
	

}
