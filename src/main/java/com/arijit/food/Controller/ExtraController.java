package com.arijit.food.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExtraController {
	@RequestMapping(value = "/viewgallery")
public String GetGalleryPage()
{
	return "ViewGallery.html";
}
	@RequestMapping(value = "/ourmission")
	public String GetOurMsiionPage()
	{
		return "OurMission.html";
	}
}
