package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ManhuaziyuanDao;
import com.entity.ManhuaziyuanEntity;
import com.service.ManhuaziyuanService;
import com.entity.vo.ManhuaziyuanVO;
import com.entity.view.ManhuaziyuanView;

@Service("manhuaziyuanService")
public class ManhuaziyuanServiceImpl extends ServiceImpl<ManhuaziyuanDao, ManhuaziyuanEntity> implements ManhuaziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ManhuaziyuanEntity> page = this.selectPage(
                new Query<ManhuaziyuanEntity>(params).getPage(),
                new EntityWrapper<ManhuaziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ManhuaziyuanEntity> wrapper) {
		  Page<ManhuaziyuanView> page =new Query<ManhuaziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ManhuaziyuanVO> selectListVO(Wrapper<ManhuaziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ManhuaziyuanVO selectVO(Wrapper<ManhuaziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ManhuaziyuanView> selectListView(Wrapper<ManhuaziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ManhuaziyuanView selectView(Wrapper<ManhuaziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
