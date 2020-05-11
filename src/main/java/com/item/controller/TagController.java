package com.item.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.item.entity.ResourceBean;
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
	 * 
	 * @return
	 */
	@RequestMapping(value = "/tagAllQuery")
	public Result<?> tagAllQuery() {
		return tagService.tagAllQuery();
	}

	/**
	 * 通过ID查询
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/queryTagById")
	public Result<?> queryTagById(String id) {
		int num = 0;
		if (id != null && !id.equals("")) {
			num = Integer.parseInt(id);
		}
		return tagService.queryTagById(num);
	}

	/**
	 * 标签模糊查询
	 * 
	 * @param tagname
	 * @return
	 */
	@RequestMapping(value = "/query")
	public Result<?> tagQuery(String tagname) {
		return tagService.tagQuery(tagname);
	}

	/**
	 * 根据标签进行子查询
	 * 
	 * @param tagname
	 * @return
	 */
	@RequestMapping(value = "/subquery", method = RequestMethod.POST)
	public Result<?> tagSubquery(@RequestParam("tagname") String tagname) {
		return tagService.tagSubquery(tagname);
	}

	/**
	 * 添加或者修改节点
	 * 
	 * @param tagBean
	 * @return
	 */
	@RequestMapping(value = "/insertOrUpdateType")
	public Result<?> insertOrUpdateType(TagBean tagBean) {
		return tagService.insertOrUpdateType(tagBean);
	}

	/**
	 * 删除节点
	 * 
	 * @param tagBean
	 * @return
	 */
	@RequestMapping(value = "/deleteTypeById")
	public Result<?> deleteTypeById(TagBean tagBean) {
		return tagService.deleteTypeById(tagBean);
	}

	/**
	 * 查询所有的构建类型
	 * 
	 * @return
	 */
	@RequestMapping(value = "/resourceAllQuery")
	public Result<?> resourceAllQuery(ResourceBean resourceBean) {
		return tagService.resourceAllQuery(resourceBean);
	}

	/**
	 * 添加或者编辑构建类型
	 * 
	 * @param resourceBean
	 * @return
	 */
	@RequestMapping(value = "/insertOrUpdateResource")
	public Result<?> insertOrUpdateResource(ResourceBean resourceBean) {
		return tagService.insertOrUpdateResource(resourceBean);
	}

	/**
	 * 删除构建类型
	 * 
	 * @param resourceBean
	 * @return
	 */
	@RequestMapping(value = "/deleteResourceById")
	public Result<?> deleteResourceById(ResourceBean resourceBean) {
		return tagService.deleteResourceById(resourceBean);
	}

	/**
	 * 查询一级菜单
	 * 
	 * @return
	 */
	@RequestMapping(value = "/queryResourceById")
	public Result<?> queryResourceById(ResourceBean resourceBean) {
		return tagService.queryResourceById(resourceBean);
	}

	/**
	 * 动态移动位置
	 * 
	 * @return
	 */
	@RequestMapping(value = "/updateresourceinfo")
	public Result<?> updateresourceinfo(String message) {
		JSONArray jsonArray = JSONArray.parseArray(message);
		List<Map<String, Object>> maplist = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < jsonArray.size(); i++) {
			Map<String, Object> m = new HashMap<String, Object>();
			JSONObject o = (JSONObject) jsonArray.get(i);
			Map<String, Object> map = o;
			for (Entry<String, Object> entry : map.entrySet()) {
				m.put(entry.getKey(), entry.getValue());
				System.out.println(entry.getKey() + ":" + entry.getValue());

			}
			maplist.add(map);
		}
		List<ResourceBean> list = new ArrayList<ResourceBean>();
		for (int m = 0; m < maplist.size(); m++) {
			ResourceBean resourceBean = new ResourceBean();
			resourceBean.setId(Integer.parseInt(maplist.get(m).get("id").toString()));
			resourceBean.setPid(Integer.parseInt(maplist.get(m).get("pid").toString()));
			resourceBean.setRname(maplist.get(m).get("rname").toString());
			list.add(resourceBean);
		}
		tagService.updateresourceinfo(list);
		return Result.success();
	}

}
