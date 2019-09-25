package com.RestApi.Dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.RestApi.Entity.SongEntity;

public class AlbumDto {

	private String name;
	private String genre;
	private Date createdat;
	private long releaseDate;

	@Autowired
	private List<SongDto> sDto;

	public String getName() {
		return name;
	}

	public List<SongDto> getsDto() {
		return sDto;
	}

	public void setsDto(List<SongDto> sDto) {
		this.sDto = sDto;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public long getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(long releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "AlbumDto [name=" + name + ", genre=" + genre + ", createdat=" + createdat + ", releaseDate="
				+ releaseDate + ", sEntity=" + sDto + "]";
	}
}
