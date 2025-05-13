package com.project.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:nullMapper
 * @author:null
 * @Date:2025/05/12
 */
@Mapper
public interface CMappers<T, P> extends BaseMapper {
	/**
	 * select by Kh
	 */
	T selectByKh(@Param("kh") String kh);

	/**
	 * update by Kh
	 */
	Integer updateByKh(@Param("bean") T t, @Param("kh") String kh);

	/**
	 * delete by Kh
	 */
	Integer deleteByKh(@Param("kh") String kh);


}