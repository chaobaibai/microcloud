package cn.fengyichao.service;

import cn.fengyichao.common.dto.DeptDTO;

import java.util.List;
import java.util.Map;

public interface IDeptService {

    /**
     * 根据部门编号获取部门完整信息
     * @param id
     */
    DeptDTO get(long id);

    /**
     * 新增部门
     */
    boolean add(DeptDTO dto);

    /**
     * 查询部门列表
     * @return
     */
    List<DeptDTO> list();

    /**
     * 分页查询
     * @param currentPage 当前页数
     * @param pageSize 每页条数
     * @param column 模糊查询列
     * @param keyword 查询关键字
     * @return
     */
    Map<String, Object> page(int currentPage, int pageSize, String column, String keyword);
}
