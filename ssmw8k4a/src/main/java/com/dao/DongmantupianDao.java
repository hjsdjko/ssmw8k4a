package com.dao;

import com.entity.DongmantupianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DongmantupianVO;
import com.entity.view.DongmantupianView;


/**
 * 动漫图片
 * 
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DongmantupianDao extends BaseMapper<DongmantupianEntity> {
	
	List<DongmantupianVO> selectListVO(@Param("ew") Wrapper<DongmantupianEntity> wrapper);
	
	DongmantupianVO selectVO(@Param("ew") Wrapper<DongmantupianEntity> wrapper);
	
	List<DongmantupianView> selectListView(@Param("ew") Wrapper<DongmantupianEntity> wrapper);

	List<DongmantupianView> selectListView(Pagination page,@Param("ew") Wrapper<DongmantupianEntity> wrapper);
	
	DongmantupianView selectView(@Param("ew") Wrapper<DongmantupianEntity> wrapper);
	

}
