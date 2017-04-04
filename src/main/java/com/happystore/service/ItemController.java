package com.happystore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.happystore.beans.Article;

@RestController
public class ItemController {

	 //private static final String template = "Hello, %s!";
	 private final AtomicLong counter = new AtomicLong();

	 private static List<Article> la = new ArrayList<Article>();

	 static {
		 
		 la.add(new Article(1, "Voiture"));
		 la.add(new Article (2, "MacDo"));
		 la.add(new Article (3, "MacBook Pro"));
	 }
	 
//	 @RequestMapping("/article/{id}")
//	 public Article getAnArticle(@RequestParam(value="name", defaultValue="Empty") String name) {
//	    return new Article((int)counter.incrementAndGet(),
//	                        String.format(name));
//	 }
	 
	 @RequestMapping("/article/{id}")
	 public Article getAnArticle(@PathVariable("id") int a, @RequestParam(value="name", defaultValue="Empty") String name) {
	    
		 return la.get(a);
	 }
	 
	 @RequestMapping("/article")
	 public List <Article> getListOfArticle(@RequestParam(value="name", defaultValue="Empty") String name) {
	    return la;
	 }
	 
	 @RequestMapping(value="/article" , method=RequestMethod.POST)
	 public Article createAnArticle(@RequestParam(value="lb", defaultValue="hpsLib") String name) {
	    
		 Article a = new Article((int)counter.incrementAndGet(),
                String.format(name));
		 la.add(a); 
		 return  a ;
	 }
}
