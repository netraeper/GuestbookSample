package com.traeper.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 방명록 객체
 * @author traeper
 */
public class GuestBookVO {
	private String guestBookId;
	private String title;
	private String content;
	private String registerDate;
	private String password;
	public String getGuestBookId() {
		return guestBookId;
	}
	public void setGuestBookId(String guestBookId) {
		this.guestBookId = guestBookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public GuestBookVO() {
	}
	
	public GuestBookVO(String guestBookId, String title, String content,
			String registerDate, String password) {
		this.guestBookId = guestBookId;
		this.title = title;
		this.content = content;
		this.registerDate = registerDate;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	
	
	
}
