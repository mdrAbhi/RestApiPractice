package com.RestApi.Service;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestApi.Dto.ArtistDto;
import com.RestApi.Entity.ArtistEntity;
import com.RestApi.Repository.ArtistRepo;



@Service
public class ArtistService {

	@Autowired
	private ArtistRepo artistRepo;
	
	
	public void createArtist(ArtistDto artistDto) {
		ArtistEntity artistEntity = new ArtistEntity();
		artistEntity.setName(artistDto.getName());
		artistEntity.setGenre(artistDto.getGenre());
		artistEntity.setCountry(artistDto.getCountry());
		artistEntity.setCreatedAt(new Date());
		artistRepo.save(artistEntity);
	}
	
	public ArtistDto getArtist(Long id ) {
		ArtistDto artist = new ArtistDto();
		artist.setName("EdSheeran");
		artist.setGenre("pop");
		artist.setCountry("ENG");
		return artist;
	}

	public ArtistRepo getArtistRepo() {
		return artistRepo;
	}

	public void setArtistRepo(ArtistRepo artistRepo) {
		this.artistRepo = artistRepo;
	}
}
