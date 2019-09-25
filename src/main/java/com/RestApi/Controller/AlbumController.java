package com.RestApi.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.Dto.AlbumDto;
import com.RestApi.Dto.ArtistDto;
import com.RestApi.Dto.SongDto;
import com.RestApi.Entity.AlbumEntity;
import com.RestApi.Entity.SongEntity;
import com.RestApi.Service.AlbumService;
import com.RestApi.Service.ArtistService;
import com.RestApi.Service.SongService;

@RestController
@RequestMapping("/albums")
public class AlbumController {

	@Autowired
	private AlbumService albumService;

	@Autowired
	private SongService songService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public AlbumDto get(@RequestParam(value = "id") Long aId) {
		return  albumService.getSongsByAlbumId(aId);		
		// TODO get the album with an id plus the songs the album has
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createAlbum(@RequestParam(value = "id") Long artistId, @RequestBody AlbumDto albumDto)
			throws Exception {
		albumService.createAlbum(artistId, albumDto);
	}

	@RequestMapping(value = "/{id}/songs", method = RequestMethod.POST)
	public void addSongs(@PathVariable(value = "id") Long albumId, @RequestBody List<SongDto> songs) throws Exception {
		songService.createSongs(songs, albumId);
	}
}
