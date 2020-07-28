package com.item.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.item.entity.FunctionManage;
import com.item.entity.Menu;
import com.item.entity.Page;
import com.item.entity.PakInfo;
import com.item.entity.UserMessage;

@Repository
public interface UnityMapper {

	/**
	 * 通过类别或者名称查询
	 * 
	 * @param pakInfo
	 * @return
	 */
	List<PakInfo> queryPakInfoByName(@Param("list") List<String> list, @Param("page") Page page);

	/**
	 * 通过类别或者名称查询的总数
	 * 
	 * @param name
	 * @return
	 */
	int queryCountByName(@Param("list") List<String> list);

	List<PakInfo> queryFlowModelByName(@Param("list") List<String> list, @Param("page") Page page,
			@Param("uid") String uid);

	int queryCountFlowModelByName(@Param("list") List<String> list, @Param("uid") String uid);

	/**
	 * 通过名称模糊查询
	 * 
	 * @param pakInfo
	 * @param page
	 * @return
	 */
	List<PakInfo> queryPakInfoByDisplayname(@Param("pakInfo") PakInfo pakInfo, @Param("page") Page page);

	/**
	 * 查询总数
	 * 
	 * @param pakInfo
	 * @return
	 */
	int queryCountByDisplayname(PakInfo pakInfo);

	/**
	 * 查询树结构
	 * 
	 * @return
	 */
	List<Menu> queryZTree();

	/**
	 * 通过username和sessionid获取用户信息
	 * 
	 * @param userMessage
	 * @return
	 */
	UserMessage queryUserMessageByUserNameAndSessionId(UserMessage userMessage);

	/**
	 * 添加模块使用次数
	 * 
	 * @param functionManage
	 * @return
	 */
	int insertFunctionManage(FunctionManage functionManage);

	/**
	 * 修改
	 * 
	 * @param functionManage
	 * @return
	 */
	int updateFunctionManage(FunctionManage functionManage);

	/**
	 * 查询名称是否重复
	 * 
	 * @param functionManage
	 * @return
	 */
	FunctionManage queryFunctionManage(FunctionManage functionManage);
}
