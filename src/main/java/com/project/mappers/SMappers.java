package com.project.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * @Description:nullMapper
 * @author:null
 * @Date:2025/05/16
 */

public interface SMappers<T, P> extends BaseMapper {
	/**
	 * select by Xh
	 */
	T selectByXh(@Param("xh") String xh);

	/**
	 * update by Xh
	 */
	Integer updateByXh(@Param("bean") T t, @Param("xh") String xh);

	/**
	 * delete by Xh
	 */
	Integer deleteByXh(@Param("xh") String xh);


}