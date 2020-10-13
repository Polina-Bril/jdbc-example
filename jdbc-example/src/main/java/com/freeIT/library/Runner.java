package com.freeIT.library;

import com.freeIT.library.dao.PetyaGenreDao;
import com.freeIT.library.exception.MyServiceException;
import com.freeIT.library.model.Genre;
import com.freeIT.library.service.GenreService;
import com.freeIT.library.service.GenreServiceImpl;

import java.util.List;

public class Runner {
	public static void main(String[] args) throws MyServiceException {

		GenreService service = new GenreServiceImpl(new PetyaGenreDao());

		List<Genre> all = service.getAll();

		System.out.println(all);

	}
}