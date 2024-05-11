package com.dao;

import com.entity.DiscussdongmanwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdongmanwenzhangVO;
import com.entity.view.DiscussdongmanwenzhangView;


/**
 * 动漫文章评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DiscussdongmanwenzhangDao extends BaseMapper<DiscussdongmanwenzhangEntity> {
	
	List<DiscussdongmanwenzhangVO> selectListVO(@Param("ew") Wrapper<DiscussdongmanwenzhangEntity> wrapper);
	
	DiscussdongmanwenzhangVO selectVO(@Param("ew") Wrapper<DiscussdongmanwenzhangEntity> wrapper);
	
	List<DiscussdongmanwenzhangView> selectListView(@Param("ew") Wrapper<DiscussdongmanwenzhangEntity> wrapper);

	List<DiscussdongmanwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdongmanwenzhangEntity> wrapper);
	
	DiscussdongmanwenzhangView selectView(@Param("ew") Wrapper<DiscussdongmanwenzhangEntity> wrapper);
	

}
