package com.RestApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.Dto.ArtistDto;
import com.RestApi.Service.ArtistService;

@RestController
@RequestMapping("/artist")
public class ArtistController {

	@Autowired
	private ArtistService artistService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createArtist(@RequestBody ArtistDto artistDto) {
		artistService.createArtist(artistDto);
	}

	/*
	 * @RequestMapping(value = "", method = RequestMethod.GET) public ArtistDto
	 * getArtistById(@RequestParam(value = "id", required = true) Long artistId,
	 * 
	 * @RequestParam(value = "name", required = false) String name) {
	 * System.out.println("id : " + artistId + ", name : " + name); return
	 * artistService.getArtist(artistId); }
	 * 
	 * // http://localhost:8000/amazonmusic/artist/20/detail
	 * 
	 * @RequestMapping(value = "/20/detail", method = RequestMethod.GET) public
	 * ArtistDto getArtistFromId(@PathVariable(value = "id") Long artistId,
	 * 
	 * @RequestHeader(value = "auth-token") String authToken) {
	 * System.out.println("auth token : " + authToken); return
	 * artistService.getArtist(artistId); }
	 */

}
