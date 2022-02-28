package com.z1f.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zyf
 * @className CommonResult
 * @date 2022/2/19 11:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {

    /**
     * 响应码
     */
    private String code;

    /**
     * 响应信息
     */
    private String msg;
    /**
     * 响应数据
     */
    private T data;

    public CommonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}