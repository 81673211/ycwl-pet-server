package com.fred.ycwl.pet.server.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fred.ycwl.common.exception.BusinessException;
import com.fred.ycwl.common.web.Response;
import com.fred.ycwl.common.web.ResponseCode;
import com.fred.ycwl.pet.server.controller.request.PetCategoryListRequest;
import com.fred.ycwl.pet.server.domain.bo.PetCategoryListParam;
import com.fred.ycwl.pet.server.domain.po.PetCategory;
import com.fred.ycwl.pet.server.service.PetCategoryService;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2019/4/30 15:23
 */
@RestController
@RequestMapping("/pet/category")
public class PetCategoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PetCategoryController.class);

    @Autowired
    private PetCategoryService petCategoryService;

    @GetMapping("/list")
    public Response<List<PetCategory>> list(
            @Validated PetCategoryListRequest request, BindingResult result) {

        if (result.hasErrors()) {
            LOGGER.warn(result.getAllErrors().get(0).getDefaultMessage());
            throw new BusinessException(ResponseCode.ERROR_400);
        }
        PetCategoryListParam listParam = new PetCategoryListParam();
        listParam.setType(request.getType());
        return Response.getSuccess(petCategoryService.list(listParam));
    }
}
