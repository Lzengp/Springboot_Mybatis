package cn.hnust.springboot.service;

import java.util.List;

import cn.hnust.springboot.bean.Message;

public interface MessageService {

	public List<Message> getMessage();
	
	public List<Message> getAllMessage();
	
	public int addMessage(Message appMessage);
	 
	public List<Message> getMessageById(String id);
	
	public int delMessage(String id);
}
