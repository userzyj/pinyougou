package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

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
}
