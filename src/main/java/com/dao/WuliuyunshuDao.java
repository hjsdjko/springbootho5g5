package com.dao;

import com.entity.WuliuyunshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuliuyunshuVO;
import com.entity.view.WuliuyunshuView;


/**
 * 物流运输
 * 
 * @author 
 * @email 
 * @date 2023-05-11 11:58:02
 */
public interface WuliuyunshuDao extends BaseMapper<WuliuyunshuEntity> {
	
	List<WuliuyunshuVO> selectListVO(@Param("ew") Wrapper<WuliuyunshuEntity> wrapper);
	
	WuliuyunshuVO selectVO(@Param("ew") Wrapper<WuliuyunshuEntity> wrapper);
	
	List<WuliuyunshuView> selectListView(@Param("ew") Wrapper<WuliuyunshuEntity> wrapper);

	List<WuliuyunshuView> selectListView(Pagination page,@Param("ew") Wrapper<WuliuyunshuEntity> wrapper);
	
	WuliuyunshuView selectView(@Param("ew") Wrapper<WuliuyunshuEntity> wrapper);
	

}
