package com.keerthana.springboot.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keerthana.springboot.lms.model.Book;
import com.keerthana.springboot.lms.model.Member;
import com.keerthana.springboot.lms.repos.BookRepository;


@Controller
public class BookController {
	@Autowired
private BookRepository bookRepository;
@GetMapping("/")
public String listBooks(Model model)
{
	
	model.addAttribute("books",bookRepository.findAll());
	return "books";
}
@GetMapping("/book/new")
public String showCreateForm(Model model)
{
	Book book=new Book();
	model.addAttribute("book", book);
	return "create_book";
}
//@RequestMapping(value="/products/",method=RequestMethod.GET)
//public List<Product> getProducts()
//{
//	return repository.findAll();
//}
@PostMapping("/books")
public String saveBook(Book book)
{
	bookRepository.save(book);
	return "redirect:/";
}
//@RequestMapping(value="/book/delete/{id}",method=RequestMethod.DELETE)
////@CacheEvict("product-cache")
//public String deleteProduct(@PathVariable("id") Long id)
//{
//	bookRepository.deleteById(id);
//	return "redirect:/";
//}
@GetMapping("/book/{id}")
public String deleteBook(@PathVariable("id") Long id, Model model)
{
	bookRepository.deleteById(id);
	List<Book> books=bookRepository.findAll();
	model.addAttribute("books",books);
	return "redirect:/";
}

@GetMapping("/book/update/{id}")
public String editBook(@PathVariable("id") Long id,Model model)
{
	Book book=bookRepository.findById(id).get();
	model.addAttribute("book",book);
	return "update_book";
}
@PostMapping("/book/update")
public String updateBook(Book book)
{	
//	Book existingBook = bookRepository.findById(book.getIsbn());
//    existingBook.setAuthor(book.getAuthor());
//    existingBook.setTitle(book.getTitle());
	System.out.println("hello");
//	book.setTitle(bookDetails.getTitle());
//    book.setAuthor(bookDetails.getAuthor());
//    book.setIsbn(bookDetails.getIsbn());
	bookRepository.save(book);
	return "redirect:/";
}
}
