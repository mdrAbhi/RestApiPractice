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
import com.RestApi.Service.AlbumService;
import com.RestApi.Service.ArtistService;

@RestController
@RequestMapping("/albums")
public class AlbumController {
	



	
	@Autowired
	private AlbumService albumService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public void test() {
		System.out.println("this is a test");
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createAlbum(@RequestParam Long artistId,
			@RequestBody AlbumDto albumDto) throws Exception {
		albumService.createAlbum(artistId, albumDto);
	}
}
