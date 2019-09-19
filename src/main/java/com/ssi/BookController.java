package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

	@RequestMapping("addbook")
	public ModelAndView addbook(@ModelAttribute("info") Books book) {
		BookDao.saveBook(book);
		ModelAndView mv = new ModelAndView("result.jsp");
		return mv;
	}

	@RequestMapping("deletebook")
	public ModelAndView deletebook(@ModelAttribute("info") Books book) {
		ModelAndView mv = new ModelAndView("resultbookdelete.jsp");
		book.getBname();
		book.getPrice();
		BookDao.removeBook(book);
		return mv;
	}

	@RequestMapping("updatebook")
	public ModelAndView updatebook(@ModelAttribute("info") Books book) {
		BookDao.updateBook(book);
		ModelAndView mv = new ModelAndView("resultupdated.jsp");
		return mv;
	}
}
