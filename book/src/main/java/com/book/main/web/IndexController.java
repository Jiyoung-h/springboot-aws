package com.book.main.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.book.main.web.dto.PostsListResponseDto;
import com.book.main.web.service.posts.PostsService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class IndexController {
	
	private final PostsService postsService;
	
	@GetMapping("/")
	public List<PostsListResponseDto> index(Model model) {
		return postsService.findAllDesc();
	}
	
	@GetMapping("/posts/save") 
	public String postsSave() {
		return "posts-save";
	}
}
