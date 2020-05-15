package com.item.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.item.entity.Menu;
import com.item.entity.Page;
import com.item.entity.PakInfo;
import com.item.mapper.UnityMapper;
import com.item.tool.Result;

@Service
@Transactional
public class UnityServiceImpl implements UnityService {

	@Autowired
	private UnityMapper unityMapper;

	@Override
	public Page queryPakInfoByName(String name, Page page) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		if (name != null && !name.equals("")) {
			String[] str = name.split(",");
			for (int i = 0; i < str.length; i++) {
				list.add(str[i]);
			}
		}
		List<PakInfo> pakInfos = unityMapper.queryPakInfoByName(list, page);
		int total = unityMapper.queryCountByName(list);
		page.setList(pakInfos);
		page.setTotal(total);
		return page;
	}

	@Override
	public Page queryPakInfoByDisplayname(PakInfo pakInfo, Page page) {
		// TODO Auto-generated method stub
		List<PakInfo> list = unityMapper.queryPakInfoByDisplayname(pakInfo, page);
		int total = unityMapper.queryCountByDisplayname(pakInfo);
		page.setList(list);
		page.setTotal(total);
		return page;
	}

	@Override
	public Result<?> queryZTree() {
		// TODO Auto-generated method stub
		List<Menu> list = unityMapper.queryZTree();
		// 树形结构数据生成
		List<Menu> result = parseMenuTree(list);
		return Result.success(result);
	}

	public static List<Menu> parseMenuTree(List<Menu> list) {
		List<Menu> result = new ArrayList<Menu>();

		// 1、获取第一级节点
		for (Menu menu : list) {
			if (menu.getPid() == 0) {
				result.add(menu);
			}
		}

		// 2、递归获取子节点
		for (Menu parent : result) {
			parent = recursiveTree(parent, list);
		}

		return result;
	}

	public static Menu recursiveTree(Menu parent, List<Menu> list) {
		for (Menu menu : list) {
			if (Objects.equals(parent.getId(), menu.getPid())) {
				menu = recursiveTree(menu, list);
				parent.getChildren().add(menu);
			}
		}

		return parent;
	}

}
