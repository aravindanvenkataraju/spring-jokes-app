package com.aravindan.jokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class SpringJokesConfiguration {
	
	//@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
	

}
