package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdongmanshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdongmanshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdongmanshipinView;


/**
 * 动漫视频评论表
 *
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DiscussdongmanshipinService extends IService<DiscussdongmanshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdongmanshipinVO> selectListVO(Wrapper<DiscussdongmanshipinEntity> wrapper);
   	
   	DiscussdongmanshipinVO selectVO(@Param("ew") Wrapper<DiscussdongmanshipinEntity> wrapper);
   	
   	List<DiscussdongmanshipinView> selectListView(Wrapper<DiscussdongmanshipinEntity> wrapper);
   	
   	DiscussdongmanshipinView selectView(@Param("ew") Wrapper<DiscussdongmanshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdongmanshipinEntity> wrapper);
   	

}

