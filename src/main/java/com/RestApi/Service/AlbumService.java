package com.RestApi.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestApi.Dto.AlbumDto;
import com.RestApi.Entity.AlbumEntity;
import com.RestApi.Entity.ArtistEntity;
import com.RestApi.Repository.AlbumRepo;
import com.RestApi.Repository.ArtistRepo;

@Service
public class AlbumService {

	@Autowired
	private ArtistRepo artistRepository;

	@Autowired
	private AlbumRepo albumRepository;

	public void createAlbum(Long artistsId, AlbumDto albumdto) throws Exception {
		ArtistEntity artist = artistRepository.getByID(artistsId);
		if (artist == null) {
			throw new Exception("Artist doesnt exist id : " + artistsId);
		} else {
			AlbumEntity albumEntity = new AlbumEntity();
			albumEntity.setName(albumdto.getName());
			albumEntity.setGenre(albumdto.getGenre());
			albumEntity.setReleaseDate(new Date(albumdto.getReleaseDate()));
			albumEntity.setArtistEntity(artist);
			albumRepository.save(albumEntity);
		}
	}
}
