package com.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.item.service.TagService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "tag")
public class TagController {
	
	@Autowired
	private TagService tagService;
	
	/**标签查询
	 * @param tagname
	 * @return
	 */
	@RequestMapping(value = "/query" , method = RequestMethod.POST)
	public Result<?> tagQuery(@RequestParam("tagname") String tagname) {
		return tagService.tagQuery(tagname);
	}
	
	/**根据标签进行子查询
 	 * @param tagname
	 * @return
	 */
	@RequestMapping(value = "/subquery" , method = RequestMethod.POST)
	public Result<?> tagSubquery(@RequestParam("tagname") String tagname){
		return tagService.tagSubquery(tagname);
	}

}
