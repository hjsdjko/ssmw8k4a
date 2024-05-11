package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DongmantupianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DongmantupianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DongmantupianView;


/**
 * 动漫图片
 *
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DongmantupianService extends IService<DongmantupianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DongmantupianVO> selectListVO(Wrapper<DongmantupianEntity> wrapper);
   	
   	DongmantupianVO selectVO(@Param("ew") Wrapper<DongmantupianEntity> wrapper);
   	
   	List<DongmantupianView> selectListView(Wrapper<DongmantupianEntity> wrapper);
   	
   	DongmantupianView selectView(@Param("ew") Wrapper<DongmantupianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DongmantupianEntity> wrapper);
   	

}

