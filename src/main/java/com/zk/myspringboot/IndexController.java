package com.zk.myspringboot;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
	
	@Autowired
    private MessageSource messageSource;
	
	@RequestMapping("/demo")
	public String index(Model model) {
		Locale locale1 = LocaleContextHolder.getLocale();
        model.addAttribute("username", messageSource.getMessage("username", null, locale1));
        model.addAttribute("password", messageSource.getMessage("password", null, locale1));
		return "index";
	}
}
