package com.dazt.ms.products.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * CategoryDto.
 *
 * @author David Alvarez.
 * @version 1.0.0, 02-11-2022
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CategoryDto {

    private BigInteger id;
    private String categoryCode;
    private String name;
    private String description;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;

}
