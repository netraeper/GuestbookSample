package com.traeper.dao;

import java.util.List;

import com.traeper.vo.GuestBookVO;

public interface GuestBookDAO {
	void create(GuestBookVO guestBookVO);
	List<GuestBookVO> retrieve();
	void update(GuestBookVO guestBookVO);
	void delete(int guestBookId);
}
