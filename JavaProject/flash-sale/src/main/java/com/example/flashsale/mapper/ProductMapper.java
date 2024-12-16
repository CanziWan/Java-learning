package com.example.flashsale.mapper;

import com.example.flashsale.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 商品信息操作 Mapper 接口
 */
@Mapper
public interface ProductMapper {
    @Select("SELECT * FROM products WHERE id = #{productId}")
    Product getProductById(int productId);

    @Update("UPDATE products SET stock = #{stock} WHERE id = #{id}")
    void updateProductStock(Product product);
}