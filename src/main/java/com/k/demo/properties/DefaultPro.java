package com.k.demo.properties;


import org.apache.kafka.clients.admin.KafkaAdminClient;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

/**
 * created by wyk
 * 2018/6/19
 **/
public class DefaultPro {
	public static void main(String[] args)  {
		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers","192.168.2.110:9092");
		KafkaAdminClient client = (KafkaAdminClient) KafkaAdminClient.create(properties);
		System.out.println(client.getClass());
	}
}
