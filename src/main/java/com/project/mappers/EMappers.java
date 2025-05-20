package com.project.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * @Description:nullMapper
 * @author:null
 * @Date:2025/05/16
 */

public interface EMappers<T, P> extends BaseMapper {
	/**
	 * select by XhAndXqAndKhAndGh
	 */
	T selectByXhAndXqAndKhAndGh(@Param("xh") String xh, @Param("xq") String xq, @Param("kh") String kh, @Param("gh") String gh);

	/**
	 * update by XhAndXqAndKhAndGh
	 */
	Integer updateByXhAndXqAndKhAndGh(@Param("bean") T t, @Param("xh") String xh, @Param("xq") String xq, @Param("kh") String kh, @Param("gh") String gh);

	/**
	 * delete by XhAndXqAndKhAndGh
	 */
	Integer deleteByXhAndXqAndKhAndGh(@Param("xh") String xh, @Param("xq") String xq, @Param("kh") String kh, @Param("gh") String gh);


}