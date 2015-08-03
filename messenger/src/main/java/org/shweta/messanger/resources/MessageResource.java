package org.shweta.messanger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.shweta.messanger.model.Message;
import org.shweta.messanger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId)
	{
		//return "test" + " " + messageId;
		return messageService.getMessage(messageId);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)	
	public Message createMessage(Message message)
	{
		//return "test" + " " + messageId;
		//Message message = new message();
		return messageService.addMessage(message);
	}

	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)	
	public Message updateMessage(@PathParam("messageId") long messageId, Message message)
	{
		//return "test" + " " + messageId;
		//Message message = new message();
		message.setId(messageId);
		return messageService.updateMessage(message);
	}

	@DELETE
	@Path("/{messageId}")
	//@Produces(MediaType.APPLICATION_JSON)	
	public void deleteMessage(@PathParam("messageId") long messageId)
	{
		//return "test" + " " + messageId;
		//Message message = new message();
		
	 messageService.removeMessage(messageId);
	}

	/*@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String gettest()
	{
		return "got the results from test";
		//return messageService.getMessage(id);
	}*/

}
