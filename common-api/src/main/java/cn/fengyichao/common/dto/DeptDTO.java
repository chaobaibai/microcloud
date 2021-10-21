package cn.fengyichao.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 实现部门映射
 */
@Data
public class DeptDTO implements Serializable {
    /**
     * 部门编号
     */
    private Long deptno;
    /**
     * 部门名称
     */
    private String dname;
    /**
     * 部门位置
     */
    private String loc;

}
