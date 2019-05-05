package com.fred.ycwl.pet.server.domain.po;

import com.fred.ycwl.common.domain.po.BasePo;

import lombok.Data;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2018/9/26 17:40
 */
@Data
public class PetCategory extends BasePo {


    private Long id;
    private String name;
    private String picUrl;
    private String descr;
    private Integer seq;
    private String type;
}
