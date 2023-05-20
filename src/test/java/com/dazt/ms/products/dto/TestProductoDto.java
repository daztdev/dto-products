package com.dazt.ms.products.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

class TestProductoDto {

    @Test
    void testSettersAndGetter() {
        final var dto = new ProductDto();
        final var categoryDto = new CategoryDto();
        final var localDateTime = LocalDateTime.now();
        categoryDto.setId(BigInteger.ONE);
        categoryDto.setCategoryCode("category code");
        dto.setId(BigInteger.ONE);
        dto.setName("product name");
        dto.setDescription("product description");
        dto.setStock(Integer.MIN_VALUE);
        dto.setCategory(categoryDto);
        dto.setPrice(BigDecimal.ONE);
        dto.setUpdateTime(localDateTime);
        dto.setCreateTime(localDateTime);
        Assertions.assertEquals(BigInteger.ONE, dto.getId());
        Assertions.assertEquals("product name", dto.getName());
        Assertions.assertEquals("product description", dto.getDescription());
        Assertions.assertEquals(Integer.MIN_VALUE, dto.getStock());
        Assertions.assertEquals(categoryDto, dto.getCategory());
        Assertions.assertEquals(BigDecimal.ONE, dto.getPrice());
        Assertions.assertEquals(localDateTime, dto.getUpdateTime());
        Assertions.assertEquals(localDateTime, dto.getCreateTime());
    }

}
