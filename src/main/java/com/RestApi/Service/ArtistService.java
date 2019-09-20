package com.RestApi.Service;


import org.springframework.stereotype.Service;

import com.RestApi.Dto.FoodDto;



@Service
public class ArtistService {

	public void createArtist(FoodDto artistDto) {
		System.out.println(artistDto.toString());
	}
	
	public FoodDto getArtist(Long id ) {
		FoodDto artist = new FoodDto();
		artist.setName("Ed Sheeran");
		artist.setGenre("pop");
		artist.setCountry("ENG");
		return artist;
	}
}
