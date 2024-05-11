package com.dao;

import com.entity.DongmanshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DongmanshipinVO;
import com.entity.view.DongmanshipinView;


/**
 * 动漫视频
 * 
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DongmanshipinDao extends BaseMapper<DongmanshipinEntity> {
	
	List<DongmanshipinVO> selectListVO(@Param("ew") Wrapper<DongmanshipinEntity> wrapper);
	
	DongmanshipinVO selectVO(@Param("ew") Wrapper<DongmanshipinEntity> wrapper);
	
	List<DongmanshipinView> selectListView(@Param("ew") Wrapper<DongmanshipinEntity> wrapper);

	List<DongmanshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DongmanshipinEntity> wrapper);
	
	DongmanshipinView selectView(@Param("ew") Wrapper<DongmanshipinEntity> wrapper);
	

}
