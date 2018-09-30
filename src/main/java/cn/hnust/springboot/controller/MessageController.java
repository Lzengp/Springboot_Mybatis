package cn.hnust.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.hnust.springboot.bean.Message;
import cn.hnust.springboot.service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/getThree")
    public List<Message> getThreeForMessage(){
        
        List<Message> list = messageService.getMessage();        
        return list;
    }
    
    @RequestMapping("/getAll")
    public List<Message> getAllMessage(){
        
        List<Message> list = messageService.getAllMessage();
        int num = list.size();
        if(null!=list && num>3){
            for (int i = 0; i < num-3; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @RequestMapping("/getByID")
    public List<Message> getMessageById(@RequestParam("id") String id){
        List<Message> list = messageService.getMessageById(id);
        int num = list.size();
        if(null!=list && num>5){
            for (int i = 0; i < num-5; i++) {
                list.remove(0);
            }
        }
        return list;
    }
    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int addMessage(@RequestBody Message appMessage){
        return messageService.addMessage(appMessage);
    }
    
    @RequestMapping(value="/delMessageById",method=RequestMethod.POST)
    public int delMessageById(@RequestParam("id") String id){
            return messageService.delMessage(id);
    }
}
