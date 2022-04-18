package com.shop.demo.mapper;

import java.util.List;

import com.shop.demo.entity.Goods;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

public interface GoodsMapper {
    /**
     * 通过名字查找
     * 
     * @return
     */
    @Select("select * from goods where goodsName like concat('%',#{goodsName},'%')")
    List<Goods> findGoodsByName(String goodsName);

    /**
     * 通过类型查找
     * 
     * @return
     */
    @Select("select * from goods where goodsType like concat('%',#{goodsType},'%')")
    List<Goods> findGoodsByType(String goodsType);

    /**
     * 通过价格范围
     * 
     * @return
     */
    @Select("select * from goods where goodsPrice between #{goodsPrice1} and #{goodsPrice2}")
    List<Goods> findGoodsByPrice(double goodsPrice1, double goodsPrice2);

    /**
     * 添加
     * 
     * @return
     * 
     */
    @Update("insert into goods(goodsId,goodsName,goodsType,goodsInventory,goodsDescription,goodsPrice) values(#{goodsId},#{goodsName},#{goodsType},#{goodsInventory},#{goodsDescription},#{goodsPrice})")
    @Transactional
    void addGoods(Goods goods);

    /**
     * 修改
     * 
     * @return
     * 
     */
    @Update("update goods set goodsName = #{goodsName},goodsPrice=#{goodsPrice},goodsStock=#{goodsStock},goodsDescription=#{goodsDescription},goodsImg=#{goodsImg},goodsType=#{goodsType} where goodsId = #{goodsId}")
    @Transactional
    void updateGoodsById(Goods goods);

    /**
     * 删除
     * 
     * @return
     * 
     */
    @Delete("delete from goods where goodsId = #{goodsId}")
    @Transactional
    void deleteGoodsById(int goodsId);
}
