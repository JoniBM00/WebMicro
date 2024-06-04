package com.viewnext.microWeb.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller de la página principal, el html no contiene datos y solo redirige
 * a los otros endpoints
 */
@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping("/")
	public String home() {
		return "index";
	}

}
