package com.entity.view;

import com.entity.DongmantupianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 动漫图片
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 22:04:45
 */
@TableName("dongmantupian")
public class DongmantupianView  extends DongmantupianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DongmantupianView(){
	}
 
 	public DongmantupianView(DongmantupianEntity dongmantupianEntity){
 	try {
			BeanUtils.copyProperties(this, dongmantupianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
