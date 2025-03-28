package com.dao;

import com.entity.DiscussmanhuaziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmanhuaziyuanVO;
import com.entity.view.DiscussmanhuaziyuanView;


/**
 * 漫画资源评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-01 17:16:21
 */
public interface DiscussmanhuaziyuanDao extends BaseMapper<DiscussmanhuaziyuanEntity> {
	
	List<DiscussmanhuaziyuanVO> selectListVO(@Param("ew") Wrapper<DiscussmanhuaziyuanEntity> wrapper);
	
	DiscussmanhuaziyuanVO selectVO(@Param("ew") Wrapper<DiscussmanhuaziyuanEntity> wrapper);
	
	List<DiscussmanhuaziyuanView> selectListView(@Param("ew") Wrapper<DiscussmanhuaziyuanEntity> wrapper);

	List<DiscussmanhuaziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmanhuaziyuanEntity> wrapper);
	
	DiscussmanhuaziyuanView selectView(@Param("ew") Wrapper<DiscussmanhuaziyuanEntity> wrapper);
	

}
