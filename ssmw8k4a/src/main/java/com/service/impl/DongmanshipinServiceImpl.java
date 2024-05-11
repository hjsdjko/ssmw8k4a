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


import com.dao.DongmanshipinDao;
import com.entity.DongmanshipinEntity;
import com.service.DongmanshipinService;
import com.entity.vo.DongmanshipinVO;
import com.entity.view.DongmanshipinView;

@Service("dongmanshipinService")
public class DongmanshipinServiceImpl extends ServiceImpl<DongmanshipinDao, DongmanshipinEntity> implements DongmanshipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DongmanshipinEntity> page = this.selectPage(
                new Query<DongmanshipinEntity>(params).getPage(),
                new EntityWrapper<DongmanshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DongmanshipinEntity> wrapper) {
		  Page<DongmanshipinView> page =new Query<DongmanshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DongmanshipinVO> selectListVO(Wrapper<DongmanshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DongmanshipinVO selectVO(Wrapper<DongmanshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DongmanshipinView> selectListView(Wrapper<DongmanshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DongmanshipinView selectView(Wrapper<DongmanshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
