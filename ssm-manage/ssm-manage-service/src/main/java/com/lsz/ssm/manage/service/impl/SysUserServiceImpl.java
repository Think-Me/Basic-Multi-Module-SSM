package com.lsz.ssm.manage.service.impl;


import com.lsz.ssm.manage.mapper.SysUserMapper;
import com.lsz.ssm.manage.pojo.SysUser;
import com.lsz.ssm.manage.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
