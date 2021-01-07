package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/1/7 10:39
 * @description 卖家dao层
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {

    /**
     * 根据openid查询用户
     *
     * @param openid
     * @return
     */
    SellerInfo findByOpenid(String openid);

}
