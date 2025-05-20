package com.project.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * @Description:nullMapper
 * @author:null
 * @Date:2025/05/16
 */

public interface UserInfoMappers<T, P> extends BaseMapper {
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

	/**
	 * select by Uid
	 */
	T selectByUid(@Param("uid") String uid);

	/**
	 * update by Uid
	 */
	Integer updateByUid(@Param("bean") T t, @Param("uid") String uid);

	/**
	 * delete by Uid
	 */
	Integer deleteByUid(@Param("uid") String uid);


}