package com.RestApi.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestApi.Dto.AlbumDto;
import com.RestApi.Dto.SongDto;
import com.RestApi.Entity.AlbumEntity;
import com.RestApi.Entity.ArtistEntity;
import com.RestApi.Entity.SongEntity;
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
			albumEntity.setCreatedAt(albumdto.getCreatedat());
			albumEntity.setReleaseDate(new Date(albumdto.getReleaseDate()));
			albumEntity.setArtistEntity(artist);
			albumRepository.save(albumEntity);
		}
	}

	public AlbumDto getSongsByAlbumId(Long aId) {
		AlbumEntity aEntity = albumRepository.getAlbumByid(aId);
		List<SongDto> ssDtos = new ArrayList<SongDto>();
		
		AlbumDto aDto = new AlbumDto();
		List<SongEntity> sEntities = aEntity.getSongs();
		
		for (SongEntity s : sEntities) {
			SongDto sDto = new SongDto();
			sDto.setTitle(s.getTitle());
			sDto.setDuration(s.getDuration());
			sDto.setRelease_date(s.getReleaseDate());
			ssDtos.add(sDto);
		}
		aDto.setsDto(ssDtos);
		return aDto;
	}
}
