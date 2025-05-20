package com.project.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * @Description:班级公告表Mapper
 * @author:null
 * @Date:2025/05/16
 */

public interface NoticeMappers<T, P> extends BaseMapper {
	/**
	 * select by Id
	 */
	T selectById(@Param("id") Integer id);

	/**
	 * update by Id
	 */
	Integer updateById(@Param("bean") T t, @Param("id") Integer id);

	/**
	 * delete by Id
	 */
	Integer deleteById(@Param("id") Integer id);


}