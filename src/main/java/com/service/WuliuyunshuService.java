package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuliuyunshuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuliuyunshuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuliuyunshuView;


/**
 * 物流运输
 *
 * @author 
 * @email 
 * @date 2023-05-11 11:58:02
 */
public interface WuliuyunshuService extends IService<WuliuyunshuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuliuyunshuVO> selectListVO(Wrapper<WuliuyunshuEntity> wrapper);
   	
   	WuliuyunshuVO selectVO(@Param("ew") Wrapper<WuliuyunshuEntity> wrapper);
   	
   	List<WuliuyunshuView> selectListView(Wrapper<WuliuyunshuEntity> wrapper);
   	
   	WuliuyunshuView selectView(@Param("ew") Wrapper<WuliuyunshuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuliuyunshuEntity> wrapper);
   	

}

