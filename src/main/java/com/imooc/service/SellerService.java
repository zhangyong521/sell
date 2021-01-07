package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/1/7 10:39
 * @description 卖家逻辑层接口
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     *
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
