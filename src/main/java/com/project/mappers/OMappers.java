package com.project.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * @Description:nullMapper
 * @author:null
 * @Date:2025/05/16
 */

public interface OMappers<T, P> extends BaseMapper {
	/**
	 * select by XqAndKhAndGh
	 */
	T selectByXqAndKhAndGh(@Param("xq") String xq, @Param("kh") String kh, @Param("gh") String gh);

	/**
	 * update by XqAndKhAndGh
	 */
	Integer updateByXqAndKhAndGh(@Param("bean") T t, @Param("xq") String xq, @Param("kh") String kh, @Param("gh") String gh);

	/**
	 * delete by XqAndKhAndGh
	 */
	Integer deleteByXqAndKhAndGh(@Param("xq") String xq, @Param("kh") String kh, @Param("gh") String gh);


}