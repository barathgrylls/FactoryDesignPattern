package com.example.demo.factoryDesignPattern;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("eminem")
public class EminemSongs implements AlbumList {

	@Override
	public List<String> getAlbumnList() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Not Afraid");
		arrayList.add("Till clopse");
		return arrayList;
	}

}
