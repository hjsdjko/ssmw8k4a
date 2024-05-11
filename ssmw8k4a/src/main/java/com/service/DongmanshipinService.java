package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DongmanshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DongmanshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DongmanshipinView;


/**
 * 动漫视频
 *
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DongmanshipinService extends IService<DongmanshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DongmanshipinVO> selectListVO(Wrapper<DongmanshipinEntity> wrapper);
   	
   	DongmanshipinVO selectVO(@Param("ew") Wrapper<DongmanshipinEntity> wrapper);
   	
   	List<DongmanshipinView> selectListView(Wrapper<DongmanshipinEntity> wrapper);
   	
   	DongmanshipinView selectView(@Param("ew") Wrapper<DongmanshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DongmanshipinEntity> wrapper);
   	

}

