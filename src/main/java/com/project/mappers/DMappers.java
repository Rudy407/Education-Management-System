package com.project.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * @Description:nullMapper
 * @author:null
 * @Date:2025/05/16
 */

public interface DMappers<T, P> extends BaseMapper {
	/**
	 * select by Yxh
	 */
	T selectByYxh(@Param("yxh") String yxh);

	/**
	 * update by Yxh
	 */
	Integer updateByYxh(@Param("bean") T t, @Param("yxh") String yxh);

	/**
	 * delete by Yxh
	 */
	Integer deleteByYxh(@Param("yxh") String yxh);


}