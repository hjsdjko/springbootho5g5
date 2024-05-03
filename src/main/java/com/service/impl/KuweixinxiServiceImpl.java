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


import com.dao.KuweixinxiDao;
import com.entity.KuweixinxiEntity;
import com.service.KuweixinxiService;
import com.entity.vo.KuweixinxiVO;
import com.entity.view.KuweixinxiView;

@Service("kuweixinxiService")
public class KuweixinxiServiceImpl extends ServiceImpl<KuweixinxiDao, KuweixinxiEntity> implements KuweixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KuweixinxiEntity> page = this.selectPage(
                new Query<KuweixinxiEntity>(params).getPage(),
                new EntityWrapper<KuweixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KuweixinxiEntity> wrapper) {
		  Page<KuweixinxiView> page =new Query<KuweixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KuweixinxiVO> selectListVO(Wrapper<KuweixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KuweixinxiVO selectVO(Wrapper<KuweixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KuweixinxiView> selectListView(Wrapper<KuweixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KuweixinxiView selectView(Wrapper<KuweixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
