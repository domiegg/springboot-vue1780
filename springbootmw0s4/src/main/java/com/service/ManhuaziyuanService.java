package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ManhuaziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ManhuaziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ManhuaziyuanView;


/**
 * 漫画资源
 *
 * @author 
 * @email 
 * @date 2022-04-01 17:16:21
 */
public interface ManhuaziyuanService extends IService<ManhuaziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ManhuaziyuanVO> selectListVO(Wrapper<ManhuaziyuanEntity> wrapper);
   	
   	ManhuaziyuanVO selectVO(@Param("ew") Wrapper<ManhuaziyuanEntity> wrapper);
   	
   	List<ManhuaziyuanView> selectListView(Wrapper<ManhuaziyuanEntity> wrapper);
   	
   	ManhuaziyuanView selectView(@Param("ew") Wrapper<ManhuaziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ManhuaziyuanEntity> wrapper);
   	

}

