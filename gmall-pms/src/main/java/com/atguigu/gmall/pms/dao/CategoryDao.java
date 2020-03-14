package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author greatagainj
 * @email @
 * @date 2020-03-13 19:10:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}