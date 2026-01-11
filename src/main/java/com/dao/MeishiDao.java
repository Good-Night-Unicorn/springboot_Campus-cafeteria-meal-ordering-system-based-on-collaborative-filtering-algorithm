package com.dao;

import com.entity.MeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishiVO;
import com.entity.view.MeishiView;


/**
 * 美食
 * 
 * @author 
 * @email 
 * @date 2023-12-18 18:40:52
 */
public interface MeishiDao extends BaseMapper<MeishiEntity> {
	
	List<MeishiVO> selectListVO(@Param("ew") Wrapper<MeishiEntity> wrapper);
	
	MeishiVO selectVO(@Param("ew") Wrapper<MeishiEntity> wrapper);
	
	List<MeishiView> selectListView(@Param("ew") Wrapper<MeishiEntity> wrapper);

	List<MeishiView> selectListView(Pagination page,@Param("ew") Wrapper<MeishiEntity> wrapper);
	
	MeishiView selectView(@Param("ew") Wrapper<MeishiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MeishiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MeishiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MeishiEntity> wrapper);



}
