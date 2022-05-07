package com.elearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
/*
	@Autowired
	private MessageRepository repo;

	@GetMapping("all")
	public String showAllMessages(Model m) {
		
		List<Message> all = repo.findAll();
		m.addAttribute("messages",all);
		
		return "messages";  //we are returning view name.It must be present in template with same name

	}
	
	//@RequestParam is used for fetching request  parameters
	@GetMapping("delete")
	public String deleteById(@RequestParam int id) {
		System.out.println("deleting message  with id="+id);
		//Todo delete Message from DB using id we have received
		repo.deleteById(id);
		return "redirect:/message/all";//this is the syntax of redirect
	}
	
	@GetMapping("create")
	public String showCreateMessage(Model m) {
		m.addAttribute("message",new Message()); //backing object to html
		return "addMessage";
		
	}
	
	//this is used to perform insertion operation in DB
	@PostMapping("add")
	public String performAddMessage(@ModelAttribute Message message){
		//TODO to  insert a record in DB
		repo.save(message);
		return "redirect:/message/all";
		
	}
	
	
	@PutMapping("update")
	public String update(@ModelAttribute Message message) {
		System.out.println("Update");
		repo.save(message);
		
		return "redirect:/message/all";
	}
	
	*/
	
	
	
	@GetMapping("/hello")
	 //Model m
	public String hello() {
		System.out.println("In hello()");
		//whatever we are returning from this method is view
		//this view is in the form of HTML file
		//and HTML view MUST be present in -->src/main/resources/templates
																				//welcome.html
		//following method has two argument
		//key-->This is used in html to fetch the value
		//value
		//m.addAttribute("title","Welcome to Message API from zensar");
		return "register";  //we are returning view name.It must be present in template with same name
	}

	 
}
