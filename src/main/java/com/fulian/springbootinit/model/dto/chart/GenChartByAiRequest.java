package com.fulian.springbootinit.model.dto.chart;

import lombok.Data;

import java.io.Serializable;

/**
 * ai生成图表请求
 *
 */
@Data
public class GenChartByAiRequest implements Serializable {

    /**
     * 图表名称
     */
    private String name;

    /**
     * 业务目标
     */
    private String goal;

    /**
     * 图表类型
     */
    private String chartType;

    private static final long serialVersionUID = 1L;
}