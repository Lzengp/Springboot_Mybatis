package cn.hnust.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hnust.springboot.bean.Message;
import cn.hnust.springboot.mapper.MessageMapper;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

	@Autowired
    private MessageMapper mapper;
    
    public List<Message> getMessage(){
         List<Message> list = new ArrayList<Message>();
         list.add(mapper.selectByPrimaryKey("xtt"));
         //list = mapper.selectAll();
         return list;
    }
    
    public List<Message> getAllMessage(){
         List<Message> list = new ArrayList<Message>();
         list = mapper.selectAll();
         return list;
    }

    public int addMessage(Message appMessage) {
        return mapper.insert(appMessage);
    }

    public List<Message> getMessageById(String id) {
        return mapper.getMessById(id);
    }

    public int delMessage(String id) {
        return mapper.deleteByPrimaryKey(id);
    }  
}

