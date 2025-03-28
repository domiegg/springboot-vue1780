package com.dao;

import com.entity.ManhuaziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ManhuaziyuanVO;
import com.entity.view.ManhuaziyuanView;


/**
 * 漫画资源
 * 
 * @author 
 * @email 
 * @date 2022-04-01 17:16:21
 */
public interface ManhuaziyuanDao extends BaseMapper<ManhuaziyuanEntity> {
	
	List<ManhuaziyuanVO> selectListVO(@Param("ew") Wrapper<ManhuaziyuanEntity> wrapper);
	
	ManhuaziyuanVO selectVO(@Param("ew") Wrapper<ManhuaziyuanEntity> wrapper);
	
	List<ManhuaziyuanView> selectListView(@Param("ew") Wrapper<ManhuaziyuanEntity> wrapper);

	List<ManhuaziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ManhuaziyuanEntity> wrapper);
	
	ManhuaziyuanView selectView(@Param("ew") Wrapper<ManhuaziyuanEntity> wrapper);
	

}
