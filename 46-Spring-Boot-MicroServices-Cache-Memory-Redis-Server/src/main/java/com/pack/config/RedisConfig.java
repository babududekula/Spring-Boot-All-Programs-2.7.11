package com.pack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.pack.binding.User;

@Configuration
public class RedisConfig 
{
	@Bean
	public  JedisConnectionFactory jedisConncetionFactory()
	{
		return new JedisConnectionFactory();
	}
	
	@Primary
	@Bean
	public RedisTemplate<String, User> redisTemplate(JedisConnectionFactory conncetionFactory)
	{
		RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(conncetionFactory);
		return redisTemplate;
	}
}
