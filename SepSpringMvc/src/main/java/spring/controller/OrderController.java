package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.service.NewArticleCommand;

@Controller
@RequestMapping("/order/order.do")
public class OrderController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "order/orderForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("order") OrderCommand orderCommand) {
		return "order/orderCompletion";
	}

}
