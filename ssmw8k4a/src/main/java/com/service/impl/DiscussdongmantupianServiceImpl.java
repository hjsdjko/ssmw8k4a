package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussdongmantupianDao;
import com.entity.DiscussdongmantupianEntity;
import com.service.DiscussdongmantupianService;
import com.entity.vo.DiscussdongmantupianVO;
import com.entity.view.DiscussdongmantupianView;

@Service("discussdongmantupianService")
public class DiscussdongmantupianServiceImpl extends ServiceImpl<DiscussdongmantupianDao, DiscussdongmantupianEntity> implements DiscussdongmantupianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdongmantupianEntity> page = this.selectPage(
                new Query<DiscussdongmantupianEntity>(params).getPage(),
                new EntityWrapper<DiscussdongmantupianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdongmantupianEntity> wrapper) {
		  Page<DiscussdongmantupianView> page =new Query<DiscussdongmantupianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdongmantupianVO> selectListVO(Wrapper<DiscussdongmantupianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdongmantupianVO selectVO(Wrapper<DiscussdongmantupianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdongmantupianView> selectListView(Wrapper<DiscussdongmantupianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdongmantupianView selectView(Wrapper<DiscussdongmantupianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
