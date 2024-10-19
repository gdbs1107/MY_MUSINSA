package com.example.musinsa_clone.domain.product;

import com.example.musinsa_clone.domain.baseEntity.BaseEntity;
import com.example.musinsa_clone.domain.enumClass.Gender;
import com.example.musinsa_clone.test.testEntity.Category;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Products extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String productName;

    private Integer price;

    private Integer score;

    private Integer stock;

    private String description;

    //배송기간
    private LocalDateTime deliveryPeriod;

    private Long productNumber;

    private Gender gender;

    //구매횟수
    private Integer purchaseCount;

    //제품 자체 할인률
    private Integer productDiscount;

    // 카테고리 연관 관계 (2차 카테고리와 매핑)
    @ManyToOne
    @JoinColumn(name = "ProductCategory_id")
    private ProductCategory productCategory;
}