package com.ai.yc.common.service.atom.menu.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.yc.common.dao.mapper.bo.SysMenu;
import com.ai.yc.common.dao.mapper.factory.MapperFactory;
import com.ai.yc.common.service.atom.menu.ISysMenuAtomService;

@Component
public class SysMenuAtomService implements ISysMenuAtomService{


	@Override
	public List<SysMenu> findByUserId(String userId) {
		return MapperFactory.getSysMenuMapper().findByUserId(userId);
	}

	

}
