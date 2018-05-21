package com.technocrat.spark.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technocrat.spark.pojo.Word;

@Service
public class MLService {
	
	/*@Autowired
	private SparkSession spark;*/
	
	@Autowired
	private JavaSparkContext sc;
	
	public void performRequest() {
		JavaRDD<String> wordsFile = sc.textFile("in/word_count.text");
		JavaRDD<Object> words = wordsFile.flatMap(row -> Arrays.asList(row.split(" ")).iterator());
		Map<Object, Long> count = words.countByValue();
		count.forEach((k,v) -> System.out.println(k.toString() + " "+v.toString()));
		List<Word> list = new ArrayList<>();
		/*for (Map.Entry<Object, Long> entry : count.entrySet()) {
			list.add(new Word(entry.getKey().toString(), entry.getValue()));
		}*/
		//return list;
	}

}
