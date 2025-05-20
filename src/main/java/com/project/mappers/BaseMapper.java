package com.project.mappers;

import org.apache.ibatis.annotations.Param;
import java.util.List;

interface BaseMapper<T, P> {

    /**
     * insert: (插入)
     */
    Integer insert(@Param("bean") T t);

    /**
     * insertOrUpdate: (插入或者更新)
     */
    Integer insertOrUpdate(@Param("bean") T t);

    /**
     * insertBatch: (批量插入)
     */
    Integer insertBatch(@Param("list") List<T> list);

    /**
     * insertOrUpdateBatch: (批量插入或更新)
     */
    Integer insertOrUpdateBatch(@Param("list") List<T> list);

    /**
     * selectList: (根据参数查询集合)
     */
    List<T> selectList(@Param("query") P p);

    /**
     * selectCount: (根据参数查询集合)
     */
    Integer selectCount(@Param("query") P p);


    /**
     * 单对象更新，更新存在风险，使用时注意参数能唯一确定一个对象
     */
    Integer updateByParam(@Param("bean") T t,@Param("query") P p);


}
