package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdongmantupianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdongmantupianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdongmantupianView;


/**
 * 动漫图片评论表
 *
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DiscussdongmantupianService extends IService<DiscussdongmantupianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdongmantupianVO> selectListVO(Wrapper<DiscussdongmantupianEntity> wrapper);
   	
   	DiscussdongmantupianVO selectVO(@Param("ew") Wrapper<DiscussdongmantupianEntity> wrapper);
   	
   	List<DiscussdongmantupianView> selectListView(Wrapper<DiscussdongmantupianEntity> wrapper);
   	
   	DiscussdongmantupianView selectView(@Param("ew") Wrapper<DiscussdongmantupianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdongmantupianEntity> wrapper);
   	

}

