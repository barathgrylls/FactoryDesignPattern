package com.example.demo.factoryDesignPattern;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("lil")
public class LitWayneSongs implements AlbumList {

	@Override
	public List<String> getAlbumnList() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("No Love");
		arrayList.add("Lollypop");
		return arrayList;
	}

}
