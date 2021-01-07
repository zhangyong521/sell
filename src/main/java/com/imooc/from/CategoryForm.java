package com.imooc.from;

import lombok.Data;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/7 10:18
 * @description 新增类目的表单
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

}
