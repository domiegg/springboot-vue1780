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


import com.dao.DiscussmanhuaziyuanDao;
import com.entity.DiscussmanhuaziyuanEntity;
import com.service.DiscussmanhuaziyuanService;
import com.entity.vo.DiscussmanhuaziyuanVO;
import com.entity.view.DiscussmanhuaziyuanView;

@Service("discussmanhuaziyuanService")
public class DiscussmanhuaziyuanServiceImpl extends ServiceImpl<DiscussmanhuaziyuanDao, DiscussmanhuaziyuanEntity> implements DiscussmanhuaziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmanhuaziyuanEntity> page = this.selectPage(
                new Query<DiscussmanhuaziyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussmanhuaziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmanhuaziyuanEntity> wrapper) {
		  Page<DiscussmanhuaziyuanView> page =new Query<DiscussmanhuaziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmanhuaziyuanVO> selectListVO(Wrapper<DiscussmanhuaziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmanhuaziyuanVO selectVO(Wrapper<DiscussmanhuaziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmanhuaziyuanView> selectListView(Wrapper<DiscussmanhuaziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmanhuaziyuanView selectView(Wrapper<DiscussmanhuaziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
