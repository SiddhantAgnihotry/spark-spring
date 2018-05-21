package com.technocrat.config;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource("classpath:application.properties")
public class SparkConfig {
	
	@Value("${spark.app.name}")
	private String appName;
	@Value("${spark.master}")
	private String masterUri;
	@Value("${spark.home}")
	private String sparkHome;
	
	@Bean
	public SparkConf conf() {
		return new SparkConf().setAppName(appName).setMaster(masterUri);
	}
	
	@Bean
	public JavaSparkContext sc() {
		return new JavaSparkContext(conf());
	}
	
	@Bean
	public SparkSession sparkSession() {
		return SparkSession.builder().sparkContext(sc().sc()).appName(appName).getOrCreate();
	}
	
	/*@Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }*/

}
