package com.ktds.mvp.thymeleaf.home.controller;

import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

// import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// @Value("${api.backend.url}")
	// private String apiBackend;

	String pagePrefix = "pages/";

	@GetMapping({"","/","/index","/home"})
	public String index(HttpServletRequest request, Model model) throws IOException {
		return pagePrefix + "index";
	}

	@GetMapping("/grid")
	public String grid(HttpServletRequest request, Model model) throws IOException {

		// model.addAttribute("apiBackend", apiBackend);

		return pagePrefix + "grid";
	}

	@GetMapping("/chart")
	public String chart(HttpServletRequest request, Model model) throws IOException {

		// model.addAttribute("apiBackend", apiBackend);

		return pagePrefix + "chart";
	}

	@GetMapping("/test")
	public String test(HttpServletRequest request, Model model) {
		return pagePrefix + "test";
	}

}
