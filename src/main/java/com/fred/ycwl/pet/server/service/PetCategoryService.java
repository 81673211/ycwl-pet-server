package com.fred.ycwl.pet.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fred.ycwl.pet.server.dao.PetCategoryDao;
import com.fred.ycwl.pet.server.domain.bo.PetCategoryListParam;
import com.fred.ycwl.pet.server.domain.po.PetCategory;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2019/4/30 15:53
 */
@Service
@Transactional
public class PetCategoryService {

    @Autowired
    private PetCategoryDao petCategoryDao;

    @Transactional(readOnly = true)
    public List<PetCategory> list(PetCategoryListParam param) {
        return petCategoryDao.list(param);
    }
}
