package com.entity.view;

import com.entity.ManhuaziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 漫画资源
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-01 17:16:21
 */
@TableName("manhuaziyuan")
public class ManhuaziyuanView  extends ManhuaziyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ManhuaziyuanView(){
	}
 
 	public ManhuaziyuanView(ManhuaziyuanEntity manhuaziyuanEntity){
 	try {
			BeanUtils.copyProperties(this, manhuaziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
