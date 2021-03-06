package com.aravindan.jokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
@Service
public class ChuckNorrisJokesServiceImpl implements JokesService {
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	@Override
	public String getQuotes() {
		return chuckNorrisQuotes.getRandomQuote();
	}

	public ChuckNorrisJokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes2) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes2;
	}
	
}
