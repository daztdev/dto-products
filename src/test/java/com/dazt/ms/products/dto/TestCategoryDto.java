package com.dazt.ms.products.dto;

import com.dazt.ms.products.dto.CategoryDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.time.LocalDateTime;

class TestCategoryDto {

    @Test
    void testSettersAndGetter() {
        final var dto = new CategoryDto();
        final var localDateTime = LocalDateTime.now();
        dto.setId(BigInteger.ONE);
        dto.setCategoryCode("category code");
        dto.setName("category name");
        dto.setDescription("category description");
        dto.setCreateTime(localDateTime);
        dto.setUpdateTime(localDateTime);
        Assertions.assertEquals(BigInteger.ONE, dto.getId());
        Assertions.assertEquals("category code", dto.getCategoryCode());
        Assertions.assertEquals("category name", dto.getName());
        Assertions.assertEquals("category description", dto.getDescription());
        Assertions.assertEquals(localDateTime, dto.getCreateTime());
        Assertions.assertEquals(localDateTime, dto.getUpdateTime());
    }

}
