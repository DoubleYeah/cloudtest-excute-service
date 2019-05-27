package cn.cloudtest;

import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.JMeterProperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cn.cloudtest.json.interceptor.InterfaceAdapter;
@EnableEurekaClient
@SpringBootApplication
public class CloudtestExcuteServiceApplication {
    
	
	@Bean
	GsonHttpMessageConverter gsonHttpMessageConverter(){
		GsonHttpMessageConverter converter=new GsonHttpMessageConverter();
		GsonBuilder builder=new GsonBuilder();
		builder.setDateFormat("yyyy-MM-dd");
		builder.registerTypeAdapter(JMeterProperty.class, new InterfaceAdapter<JMeterProperty>());
		builder.registerTypeAdapter(TestElement.class, new InterfaceAdapter<TestElement>());
		Gson gson=builder.create();
		converter.setGson(gson);
		return converter;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CloudtestExcuteServiceApplication.class, args);
	}

}
