package com.RestApi.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestApi.Dto.ArtistDto;

import com.RestApi.Entity.ArtistEntity;
import com.RestApi.Repository.ArtistRepo;



@Service
public class ArtistService {

	@Autowired
	private ArtistRepo artistRepo;
	
//	@Autowired
//	private ArtistEntity artistEntity;
	
	
	public void createArtist(ArtistDto artistDto) {
		ArtistEntity artistEntity = new ArtistEntity();
		artistEntity.setName(artistDto.getName());
		artistEntity.setGenre(artistDto.getGenre());
		artistEntity.setCountry(artistDto.getCountry());
		artistEntity.setCreatedAt(new Date());
		artistRepo.save(artistEntity);
	}
	
	public ArtistDto getArtist(Long id) {
		ArtistDto artistDto = new ArtistDto();
	    ArtistEntity artistEntity = (ArtistEntity) artistRepo.getByID(id);
	    artistDto.setName(artistEntity.getName());
	    artistDto.setGenre(artistEntity.getGenre());
	    artistDto.setCountry(artistDto.getCountry());
	   // System.out.println(artistDto.toString());
	    return artistDto;
	    
	}

	
	public List<ArtistDto> getArtistbyName(String name) {
		
		List<ArtistDto> artistDtoList =  new ArrayList<ArtistDto>();
	    List<ArtistEntity> artistEntity = artistRepo.getByName(name);
	   
	    for( ArtistEntity a: artistEntity) {
	    	ArtistDto adto = new ArtistDto();
	    adto.setName(a.getName());
	    adto.setGenre(a.getGenre());
	    adto.setCountry(a.getCountry());
	    artistDtoList.add(adto);
	      }
	   
	    
	    System.out.println(artistDtoList.toString());
	    return artistDtoList;
	    
	}
	
	
	
	public ArtistRepo getArtistRepo() {
		return artistRepo;
	}

	public void setArtistRepo(ArtistRepo artistRepo) {
		this.artistRepo = artistRepo;
	}
}
