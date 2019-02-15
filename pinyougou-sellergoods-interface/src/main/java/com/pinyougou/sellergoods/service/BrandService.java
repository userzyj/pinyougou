package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;

/**品牌服务处接口
 *
 */
public interface BrandService  {
    /**
     * 返回全部列表
     *
     */
    public List<TbBrand>  findAll();

    /**
     * 返回分页列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageResult findPage(int pageNum,int pageSize);

    /**
     * 新增品牌
     * @param brand
     */
    public void add(TbBrand brand);

    /**
     * 根据id查询品牌信息
     * @param id
     * @return
     */
    public TbBrand findOne(Long id);

    /**
     * 修改品牌信息
     * @param brand
     */
    public void update(TbBrand brand);

    /**
     * 批量删除
     * @param ids
     */
    public void delete(long[] ids);

    /**分页
     *
     * @param brand
     * @param pageNum  当前页码
     * @param pageSize  每页记录数
     * @return
     */
    public PageResult findPage(TbBrand brand, int pageNum,int pageSize);
}
