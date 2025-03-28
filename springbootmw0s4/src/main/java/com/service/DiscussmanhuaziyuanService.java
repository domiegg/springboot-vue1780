package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmanhuaziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmanhuaziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmanhuaziyuanView;


/**
 * 漫画资源评论表
 *
 * @author 
 * @email 
 * @date 2022-04-01 17:16:21
 */
public interface DiscussmanhuaziyuanService extends IService<DiscussmanhuaziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmanhuaziyuanVO> selectListVO(Wrapper<DiscussmanhuaziyuanEntity> wrapper);
   	
   	DiscussmanhuaziyuanVO selectVO(@Param("ew") Wrapper<DiscussmanhuaziyuanEntity> wrapper);
   	
   	List<DiscussmanhuaziyuanView> selectListView(Wrapper<DiscussmanhuaziyuanEntity> wrapper);
   	
   	DiscussmanhuaziyuanView selectView(@Param("ew") Wrapper<DiscussmanhuaziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmanhuaziyuanEntity> wrapper);
   	

}

