package com.project.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * @Description:nullMapper
 * @author:null
 * @Date:2025/05/16
 */

public interface TMappers<T, P> extends BaseMapper {
	/**
	 * select by Gh
	 */
	T selectByGh(@Param("gh") String gh);

	/**
	 * update by Gh
	 */
	Integer updateByGh(@Param("bean") T t, @Param("gh") String gh);

	/**
	 * delete by Gh
	 */
	Integer deleteByGh(@Param("gh") String gh);


}