package com.traeper.guestbookapp.dao;

import java.util.List;

import com.traeper.guestbookapp.vo.GuestBookVO;

public interface GuestBookDAO {
	String create(GuestBookVO guestBookVO);
	List<GuestBookVO> retrieve();
	void update(GuestBookVO guestBookVO);
	void delete(String guestBookId); 
}
