package com.traeper.dao;

import java.util.List;

import com.traeper.vo.GuestBookVO;

public interface GuestBookDAO {
	int create(GuestBookVO guestBookVO);
	List<GuestBookVO> retrieve();
	void update(GuestBookVO guestBookVO);
	void delete(String guestBookId);
}
