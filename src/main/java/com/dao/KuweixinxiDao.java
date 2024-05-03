package com.dao;

import com.entity.KuweixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KuweixinxiVO;
import com.entity.view.KuweixinxiView;


/**
 * 库位信息
 * 
 * @author 
 * @email 
 * @date 2023-05-11 11:58:02
 */
public interface KuweixinxiDao extends BaseMapper<KuweixinxiEntity> {
	
	List<KuweixinxiVO> selectListVO(@Param("ew") Wrapper<KuweixinxiEntity> wrapper);
	
	KuweixinxiVO selectVO(@Param("ew") Wrapper<KuweixinxiEntity> wrapper);
	
	List<KuweixinxiView> selectListView(@Param("ew") Wrapper<KuweixinxiEntity> wrapper);

	List<KuweixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KuweixinxiEntity> wrapper);
	
	KuweixinxiView selectView(@Param("ew") Wrapper<KuweixinxiEntity> wrapper);
	

}
