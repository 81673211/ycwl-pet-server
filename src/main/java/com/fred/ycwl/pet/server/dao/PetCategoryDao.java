package com.fred.ycwl.pet.server.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import com.fred.ycwl.pet.server.domain.bo.PetCategoryListParam;
import com.fred.ycwl.pet.server.domain.po.PetCategory;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2018/9/27 10:10
 */
@Repository
public interface PetCategoryDao {

//    PetCategory get(Long id);

//    void save(PetCategory petCategory);

//    void updateByPrimaryKeySelective(PetCategory petCategory);


    @Select("SELECT * FROM pet_category WHERE type=#{param.type}")
    @Results({
            @Result(column = "pic_url", property = "picUrl", jdbcType= JdbcType.VARCHAR)
    })
    List<PetCategory> list(@Param("param") PetCategoryListParam param);

//    Long count(PetCategoryParam param);
}
