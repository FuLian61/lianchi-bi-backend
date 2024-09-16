package com.fulian.springbootinit.model.vo;

import lombok.Data;

/**
 * Bi 的返回结果
 */
@Data
public class BiResponse {
    private String genChart;
    private String genResult;
    // 新生成的图表 id
    private Long chartId;
}
