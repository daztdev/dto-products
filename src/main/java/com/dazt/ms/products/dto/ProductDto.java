package com.dazt.ms.products.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ProductDto.
 *
 * @author David Alvarez.
 * @version 1.0.0, 02-11-2022
 */
@Data
@NoArgsConstructor
public class ProductDto {

    private BigInteger id;
    private String name;
    private String description;
    private Integer stock;
    private CategoryDto category;
    private BigDecimal price;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;

}