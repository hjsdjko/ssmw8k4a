package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdongmanwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdongmanwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdongmanwenzhangView;


/**
 * 动漫文章评论表
 *
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DiscussdongmanwenzhangService extends IService<DiscussdongmanwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdongmanwenzhangVO> selectListVO(Wrapper<DiscussdongmanwenzhangEntity> wrapper);
   	
   	DiscussdongmanwenzhangVO selectVO(@Param("ew") Wrapper<DiscussdongmanwenzhangEntity> wrapper);
   	
   	List<DiscussdongmanwenzhangView> selectListView(Wrapper<DiscussdongmanwenzhangEntity> wrapper);
   	
   	DiscussdongmanwenzhangView selectView(@Param("ew") Wrapper<DiscussdongmanwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdongmanwenzhangEntity> wrapper);
   	

}

