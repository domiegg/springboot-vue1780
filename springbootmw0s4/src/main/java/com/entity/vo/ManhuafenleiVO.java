package com.entity.vo;

import com.entity.ManhuafenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 漫画分类
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-01 17:16:21
 */
public class ManhuafenleiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 漫画标签
	 */
	
	private String manhuabiaoqian;
				
	
	/**
	 * 设置：漫画标签
	 */
	 
	public void setManhuabiaoqian(String manhuabiaoqian) {
		this.manhuabiaoqian = manhuabiaoqian;
	}
	
	/**
	 * 获取：漫画标签
	 */
	public String getManhuabiaoqian() {
		return manhuabiaoqian;
	}
			
}
