package com.dao;

import com.entity.DiscussdongmantupianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdongmantupianVO;
import com.entity.view.DiscussdongmantupianView;


/**
 * 动漫图片评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DiscussdongmantupianDao extends BaseMapper<DiscussdongmantupianEntity> {
	
	List<DiscussdongmantupianVO> selectListVO(@Param("ew") Wrapper<DiscussdongmantupianEntity> wrapper);
	
	DiscussdongmantupianVO selectVO(@Param("ew") Wrapper<DiscussdongmantupianEntity> wrapper);
	
	List<DiscussdongmantupianView> selectListView(@Param("ew") Wrapper<DiscussdongmantupianEntity> wrapper);

	List<DiscussdongmantupianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdongmantupianEntity> wrapper);
	
	DiscussdongmantupianView selectView(@Param("ew") Wrapper<DiscussdongmantupianEntity> wrapper);
	

}
