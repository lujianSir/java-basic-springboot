package com.item.service;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.item.entity.ApproveBean;
import com.item.entity.FlowBean;
import com.item.entity.UserBean;
import com.item.mapper.FlowMapper;
import com.item.mapper.UserMapper;
import com.item.tool.JavaTool;
import com.item.tool.Result;

@Service
@Transactional
public class FlowServiceImpl implements FlowService {

	private static final Logger LOG = LoggerFactory.getLogger(FlowServiceImpl.class);

	@Autowired
	private FlowMapper flowMapper;

	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean flowExist(long flownum) {
		if (flowMapper.flowExist(flownum) > 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean approveExist(long approvenum) {
		if (flowMapper.approveExist(approvenum) > 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Result<?> flowAdd(FlowBean flow) {

		try {

			UserBean user = new UserBean();
			// 获取用户角色信息
			user = userMapper.queryByName(flow.getProposer());
			// 查询数据库中所有大于当前角色身份的人物
			List<UserBean> users = userMapper.queryByRole(user.getRole());

			ApproveBean approve = new ApproveBean();

			long flownum = JavaTool.randomNum();
			// 生成流程编号
			while (this.flowExist(flownum)) {
				flow.setFlownum(flownum);
				flow.setNode(0);
				flowMapper.flowAdd(flow);
				// 生成流程之后应该调用审批流程
				for (int i = 0; i < users.size(); i++) {
					long approvenum = JavaTool.randomNum();
					while (this.approveExist(approvenum)) {
						approve.setApprovenum(approvenum);
						approve.setStatus(0);
						approve.setApprover(users.get(i).getUsername());
						approve.setProposer(flow.getProposer());
						approve.setFlownum(flownum);
						flowMapper.approveAdd(approve);
						break;
					}
				}
				break;
			}
			return Result.success();
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return Result.error(500, "服务端异常");
		}
	}

	/**
	 * 实现多个条件查询
	 */
	@Override
	public Result<?> flowQuery(int node, long flownum, Date startDate, Date endDate) {

		return Result.success(flowMapper.flowQuery(node, flownum, startDate, endDate));
	}

	@Override
	public Result<?> approveQuery(long flownum) {
		// TODO Auto-generated method stub
		return Result.success(flowMapper.approveQuery(flownum));
	}

}
