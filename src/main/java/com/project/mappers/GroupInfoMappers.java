package com.project.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * @Description:班级信息Mapper
 * @author:null
 * @Date:2025/05/16
 */

public interface GroupInfoMappers<T, P> extends BaseMapper {
	/**
	 * select by GroupId
	 */
	T selectByGroupId(@Param("groupId") String groupId);

	/**
	 * update by GroupId
	 */
	Integer updateByGroupId(@Param("bean") T t, @Param("groupId") String groupId);

	/**
	 * delete by GroupId
	 */
	Integer deleteByGroupId(@Param("groupId") String groupId);

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