package com.imooc.utils;

import com.imooc.VO.ResultVO;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 10:18
 * @description 返回数据的工具类
 */
public class ResultVoUtil {

    /**
     * 请求成功返回数据
     *
     * @param object
     * @return
     */
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    /**
     * 只请求成功返回
     *
     * @return
     */
    public static ResultVO success() {
        return success(null);
    }

    /**
     * 请求失败返回数据
     *
     * @param code
     * @param msg
     * @return
     */
    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}
