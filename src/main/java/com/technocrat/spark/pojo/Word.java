package com.technocrat.spark.pojo;

public class Word {
	
	private String word;
	private Long count;
	
	public Word(String word, Long count) {
		super();
		this.word = word;
		this.count = count;
	}
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public Long getCount() {
		return count;
	}
	
	public void setCount(Long count) {
		this.count = count;
	}
	
}
