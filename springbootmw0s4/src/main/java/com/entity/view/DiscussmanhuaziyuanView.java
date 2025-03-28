package com.entity.view;

import com.entity.DiscussmanhuaziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 漫画资源评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-01 17:16:21
 */
@TableName("discussmanhuaziyuan")
public class DiscussmanhuaziyuanView  extends DiscussmanhuaziyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmanhuaziyuanView(){
	}
 
 	public DiscussmanhuaziyuanView(DiscussmanhuaziyuanEntity discussmanhuaziyuanEntity){
 	try {
			BeanUtils.copyProperties(this, discussmanhuaziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
