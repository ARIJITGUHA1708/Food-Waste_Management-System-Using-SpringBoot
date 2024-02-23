package com.arijit.food.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymeleafController {
	@RequestMapping(value = "/thymeleafpage",method = RequestMethod.GET)
public String getThymeleafPage(Model model)
{
		List<String> list = List.of("arijit","sushant","ankit");
	String name="arijit guha";
	model.addAttribute("names",list);
	model.addAttribute("name",name);
	return "Thymeleaf.html";
}
}
