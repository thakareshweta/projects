package org.shweta.messanger.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.shweta.messanger.database.DatabaseClass;
import org.shweta.messanger.model.Message;
import org.shweta.messanger.model.Profile;

public class MessageService {

	private Map <Long,Message> messages = DatabaseClass.getMessages();
//	private Map <Long,Profile> profiles = DatabaseClass.getProfiles();
	
	
	public MessageService()
	{
		Message m1 = new Message(1L,"My first Message!!","Shweta ");
		Message m2 = new Message(2L,"My second Message!!","Shweta ");
		messages.put(1L, m1);
		messages.put(2L, m2);
	
	}
	public List<Message> getAllMessages()
	{
	/*	List <Message> messageList = new ArrayList<Message>();
		Message m1 = new Message(1L,"My first Message!!","Shweta ");
		Message m2 = new Message(2L,"My second Message!!","Shweta ");
		messageList.add(m1);
		messageList.add(m2);*/
		return new ArrayList <Message>(messages.values());
		
	}
	public Message getMessage(Long id)
	{
		return messages.get(id);
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
		
		
	}
	
	public Message updateMessage(Message message){
		if(message.getId()<=0)
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
		
	}
	
	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}
}
