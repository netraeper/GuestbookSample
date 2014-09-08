package com.traeper.dao;

import com.traeper.vo.GuestBookVO;

public interface GuestBookDAO {
	void create(GuestBookVO guestBookVO);
	void retrieve();
	void update(GuestBookVO guestBookVO);
	void delete(int guestBookId);
	
}
