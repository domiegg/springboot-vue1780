package com.entity.model;

import com.entity.PaixingbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 排行榜
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-01 17:16:21
 */
public class PaixingbangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 漫画名称
	 */
	
	private String manhuamingcheng;
		
	/**
	 * 漫画分类
	 */
	
	private String manhuafenlei;
		
	/**
	 * 漫画标签
	 */
	
	private String manhuabiaoqian;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 排行
	 */
	
	private Integer paixing;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：漫画名称
	 */
	 
	public void setManhuamingcheng(String manhuamingcheng) {
		this.manhuamingcheng = manhuamingcheng;
	}
	
	/**
	 * 获取：漫画名称
	 */
	public String getManhuamingcheng() {
		return manhuamingcheng;
	}
				
	
	/**
	 * 设置：漫画分类
	 */
	 
	public void setManhuafenlei(String manhuafenlei) {
		this.manhuafenlei = manhuafenlei;
	}
	
	/**
	 * 获取：漫画分类
	 */
	public String getManhuafenlei() {
		return manhuafenlei;
	}
				
	
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
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：排行
	 */
	 
	public void setPaixing(Integer paixing) {
		this.paixing = paixing;
	}
	
	/**
	 * 获取：排行
	 */
	public Integer getPaixing() {
		return paixing;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：更新时间
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
