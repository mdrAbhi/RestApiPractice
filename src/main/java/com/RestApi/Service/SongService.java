package com.RestApi.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.RestApi.Dto.SongDto;
import com.RestApi.Entity.AlbumEntity;
import com.RestApi.Entity.SongEntity;
import com.RestApi.Repository.AlbumRepo;
import com.RestApi.Repository.SongRepo;

@Service
	public class SongService {
		
		@Autowired
		private AlbumRepo albumRepository;
		
		@Autowired
		private SongRepo songRepository;
		
		@Transactional
		public void createSongs(List<SongDto> songDtos, Long albumId) throws Exception {
			AlbumEntity albumEntity = albumRepository.getById(albumId);
			if(albumEntity == null) {
				throw new Exception("Album not Found id : " + albumId);
			} else {
				for(SongDto dto : songDtos) {
					SongEntity temp = new SongEntity();
					temp.setTitle(dto.getTitle());
					temp.setDuration(dto.getDuration());
					if(dto.getRelease_date() != null) {
						temp.setReleaseDate(dto.getRelease_date());
					} else {
						temp.setReleaseDate(new Date());
					}
					temp.setAlbum(albumEntity);
					songRepository.save(temp);
				}
			}
		}
			
	}
