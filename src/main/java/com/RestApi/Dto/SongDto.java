package com.RestApi.Dto;

import java.util.Date;

public class SongDto {

	private String title;
	private int duration;
	private Date release_date;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	@Override
	public String toString() {
		return "SongDto [title=" + title + ", duration=" + duration + ", release_date=" + release_date + "]";
	}

}
