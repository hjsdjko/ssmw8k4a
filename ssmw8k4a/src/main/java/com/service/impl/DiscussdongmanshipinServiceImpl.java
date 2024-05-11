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


import com.dao.DiscussdongmanshipinDao;
import com.entity.DiscussdongmanshipinEntity;
import com.service.DiscussdongmanshipinService;
import com.entity.vo.DiscussdongmanshipinVO;
import com.entity.view.DiscussdongmanshipinView;

@Service("discussdongmanshipinService")
public class DiscussdongmanshipinServiceImpl extends ServiceImpl<DiscussdongmanshipinDao, DiscussdongmanshipinEntity> implements DiscussdongmanshipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdongmanshipinEntity> page = this.selectPage(
                new Query<DiscussdongmanshipinEntity>(params).getPage(),
                new EntityWrapper<DiscussdongmanshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdongmanshipinEntity> wrapper) {
		  Page<DiscussdongmanshipinView> page =new Query<DiscussdongmanshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdongmanshipinVO> selectListVO(Wrapper<DiscussdongmanshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdongmanshipinVO selectVO(Wrapper<DiscussdongmanshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdongmanshipinView> selectListView(Wrapper<DiscussdongmanshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdongmanshipinView selectView(Wrapper<DiscussdongmanshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
