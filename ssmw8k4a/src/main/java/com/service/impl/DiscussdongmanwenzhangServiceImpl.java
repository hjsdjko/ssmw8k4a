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


import com.dao.DiscussdongmanwenzhangDao;
import com.entity.DiscussdongmanwenzhangEntity;
import com.service.DiscussdongmanwenzhangService;
import com.entity.vo.DiscussdongmanwenzhangVO;
import com.entity.view.DiscussdongmanwenzhangView;

@Service("discussdongmanwenzhangService")
public class DiscussdongmanwenzhangServiceImpl extends ServiceImpl<DiscussdongmanwenzhangDao, DiscussdongmanwenzhangEntity> implements DiscussdongmanwenzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdongmanwenzhangEntity> page = this.selectPage(
                new Query<DiscussdongmanwenzhangEntity>(params).getPage(),
                new EntityWrapper<DiscussdongmanwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdongmanwenzhangEntity> wrapper) {
		  Page<DiscussdongmanwenzhangView> page =new Query<DiscussdongmanwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdongmanwenzhangVO> selectListVO(Wrapper<DiscussdongmanwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdongmanwenzhangVO selectVO(Wrapper<DiscussdongmanwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdongmanwenzhangView> selectListView(Wrapper<DiscussdongmanwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdongmanwenzhangView selectView(Wrapper<DiscussdongmanwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
