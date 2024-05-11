package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DongmanwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DongmanwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DongmanwenzhangView;


/**
 * 动漫文章
 *
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
public interface DongmanwenzhangService extends IService<DongmanwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DongmanwenzhangVO> selectListVO(Wrapper<DongmanwenzhangEntity> wrapper);
   	
   	DongmanwenzhangVO selectVO(@Param("ew") Wrapper<DongmanwenzhangEntity> wrapper);
   	
   	List<DongmanwenzhangView> selectListView(Wrapper<DongmanwenzhangEntity> wrapper);
   	
   	DongmanwenzhangView selectView(@Param("ew") Wrapper<DongmanwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DongmanwenzhangEntity> wrapper);
   	

}

