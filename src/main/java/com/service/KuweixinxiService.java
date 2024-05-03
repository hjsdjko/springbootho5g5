package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KuweixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KuweixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KuweixinxiView;


/**
 * 库位信息
 *
 * @author 
 * @email 
 * @date 2023-05-11 11:58:02
 */
public interface KuweixinxiService extends IService<KuweixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KuweixinxiVO> selectListVO(Wrapper<KuweixinxiEntity> wrapper);
   	
   	KuweixinxiVO selectVO(@Param("ew") Wrapper<KuweixinxiEntity> wrapper);
   	
   	List<KuweixinxiView> selectListView(Wrapper<KuweixinxiEntity> wrapper);
   	
   	KuweixinxiView selectView(@Param("ew") Wrapper<KuweixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KuweixinxiEntity> wrapper);
   	

}

