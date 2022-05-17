package com.jobiak.springmdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.springmdb.model.GroceryItems;
import com.jobiak.springmdb.repository.ItemRepository;
@Controller
public class ProductController {

	@Autowired
	ItemRepository gitemrepo;

	@RequestMapping(path="/test",method=RequestMethod.GET)
    public String redirect()
	{
		return "signup";
	}

	@RequestMapping(path="/signup",method=RequestMethod.POST)
	public String doSignUp(@ModelAttribute("gitem")GroceryItems gitem) {
		
		//System.out.println(user.getUserId()+user.getName());
		gitemrepo.save(gitem);
		return "success";

    }
	
}
