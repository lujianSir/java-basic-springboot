package com.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.item.entity.TagBean;
import com.item.service.TagService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "tag")
public class TagController {
	
	@Autowired
	private TagService tagService;
	
	/**
	 * 查询所有的标签
	 * @return
	 */
	@RequestMapping(value = "/tagAllQuery" )
	public Result<?> tagAllQuery() {
		return tagService.tagAllQuery();
	}
	
	/**
	 * 通过ID查询
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/queryTagById" )
	public Result<?> queryTagById(String id) {
		int num=0;
		if(id!=null && !id.equals("")) {
			num=Integer.parseInt(id);
		}
		return tagService.queryTagById(num);
	}
	
	
	/**标签模糊查询
	 * @param tagname
	 * @return
	 */
	@RequestMapping(value = "/query")
	public Result<?> tagQuery(String tagname) {
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
	
	/**
	 * 添加或者修改节点
	 * @param tagBean
	 * @return
	 */
	@RequestMapping(value = "/insertOrUpdateType")
	public Result<?> insertOrUpdateType(TagBean tagBean){
		return tagService.insertOrUpdateType(tagBean);
	}
	
	/**
	 * 删除节点
	 * @param tagBean
	 * @return
	 */
	@RequestMapping(value = "/deleteTypeById")
	public Result<?> deleteTypeById(TagBean tagBean){
		return tagService.deleteTypeById(tagBean);
	}
}
