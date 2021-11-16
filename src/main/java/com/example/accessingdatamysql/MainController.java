package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/books") // This means URL's start with /demo (after Application path)
public class MainController {
	private final BookService bookService;

	@Autowired
	public MainController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping
	public @ResponseBody Iterable<Book> getAllBooks() {
		return bookService.readAll();
	}

	@GetMapping(value = "{isbn}")
	public @ResponseBody Book getBook(@PathVariable String isbn) {
		return bookService.read(isbn);
	}

	@PostMapping
	public void postBook(@RequestBody Book book) {
		bookService.create(book);
	}

	@PatchMapping
	public @ResponseBody boolean patchBook(@RequestBody Book book) {
		return bookService.update(book);
	}

	@DeleteMapping(value = "{isbn}")
	public @ResponseBody boolean deleteBook(@PathVariable String isbn) {
		return bookService.delete(isbn);
	}
}
