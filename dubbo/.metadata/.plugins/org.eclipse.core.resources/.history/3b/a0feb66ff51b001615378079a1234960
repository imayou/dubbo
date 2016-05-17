package com.ayou.article.action;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ayou.article.ArticleService;

@Component
@Controller
@RequestMapping("/article")
public class ArticleAction {

	@Reference(version = "1.0")
	private ArticleService articleService;

	@RequestMapping("/name")
	@ResponseBody
	public String getName() {
		return articleService.getName();
	}
}
