package com.dao;

import com.entity.DongmanwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DongmanwenzhangVO;
import com.entity.view.DongmanwenzhangView;


/**
 * 动漫文章
 * 
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DongmanwenzhangDao extends BaseMapper<DongmanwenzhangEntity> {
	
	List<DongmanwenzhangVO> selectListVO(@Param("ew") Wrapper<DongmanwenzhangEntity> wrapper);
	
	DongmanwenzhangVO selectVO(@Param("ew") Wrapper<DongmanwenzhangEntity> wrapper);
	
	List<DongmanwenzhangView> selectListView(@Param("ew") Wrapper<DongmanwenzhangEntity> wrapper);

	List<DongmanwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DongmanwenzhangEntity> wrapper);
	
	DongmanwenzhangView selectView(@Param("ew") Wrapper<DongmanwenzhangEntity> wrapper);
	

}
