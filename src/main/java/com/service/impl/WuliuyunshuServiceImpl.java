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


import com.dao.WuliuyunshuDao;
import com.entity.WuliuyunshuEntity;
import com.service.WuliuyunshuService;
import com.entity.vo.WuliuyunshuVO;
import com.entity.view.WuliuyunshuView;

@Service("wuliuyunshuService")
public class WuliuyunshuServiceImpl extends ServiceImpl<WuliuyunshuDao, WuliuyunshuEntity> implements WuliuyunshuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuliuyunshuEntity> page = this.selectPage(
                new Query<WuliuyunshuEntity>(params).getPage(),
                new EntityWrapper<WuliuyunshuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuliuyunshuEntity> wrapper) {
		  Page<WuliuyunshuView> page =new Query<WuliuyunshuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuliuyunshuVO> selectListVO(Wrapper<WuliuyunshuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuliuyunshuVO selectVO(Wrapper<WuliuyunshuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuliuyunshuView> selectListView(Wrapper<WuliuyunshuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuliuyunshuView selectView(Wrapper<WuliuyunshuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
