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


import com.dao.DongmanwenzhangDao;
import com.entity.DongmanwenzhangEntity;
import com.service.DongmanwenzhangService;
import com.entity.vo.DongmanwenzhangVO;
import com.entity.view.DongmanwenzhangView;

@Service("dongmanwenzhangService")
public class DongmanwenzhangServiceImpl extends ServiceImpl<DongmanwenzhangDao, DongmanwenzhangEntity> implements DongmanwenzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DongmanwenzhangEntity> page = this.selectPage(
                new Query<DongmanwenzhangEntity>(params).getPage(),
                new EntityWrapper<DongmanwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DongmanwenzhangEntity> wrapper) {
		  Page<DongmanwenzhangView> page =new Query<DongmanwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DongmanwenzhangVO> selectListVO(Wrapper<DongmanwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DongmanwenzhangVO selectVO(Wrapper<DongmanwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DongmanwenzhangView> selectListView(Wrapper<DongmanwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DongmanwenzhangView selectView(Wrapper<DongmanwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
