package com.aravindan.jokes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class SpringJokesConfiguration {
	
	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes2() {
		return new ChuckNorrisQuotes();
	}
	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes1() {
		return new ChuckNorrisQuotes();
	}
}
