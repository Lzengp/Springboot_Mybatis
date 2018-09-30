package cn.hnust.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import cn.hnust.springboot.bean.Message;

@Mapper
public interface MessageMapper {
 
    //@Select("select * from message order by senddate asc")
    List<Message> selectAll();
    
	int deleteByPrimaryKey(String id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
 

    List<Message> getMessById(String id);
}
