package com.example.demo.factoryDesignPattern;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface AlbumList {
	
	public List<String> getAlbumnList();

}
