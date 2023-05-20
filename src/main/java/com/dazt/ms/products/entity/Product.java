package com.dazt.ms.products.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * Product.
 *
 * @author David Alvarez.
 * @version 1.0.0, 20-09-2022
 */
@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public class Product implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 6922576685008410979L;

    /** id. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private BigInteger id;

    /** name. */
    @Column(length = 50, nullable = false)
    private String name;

    /** description. */
    @Column(length = 200, nullable = false)
    private String description;

    /** stock. */
    @Column(nullable = false)
    private Integer stock;

    /** price. */
    @Column(nullable = false)
    private BigDecimal price;

    /** updateTime. */
    @CreationTimestamp
    @Column(nullable = false, name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    /** createTime. */
    @UpdateTimestamp
    @Column(nullable = false, name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

}