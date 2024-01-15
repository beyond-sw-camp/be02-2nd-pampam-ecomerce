package com.example.pampam.product.model.entity;

import com.example.pampam.member.model.entity.Seller;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String productName;
    private Integer price;
    private Integer salePrice;
    private String productInfo;

    //    private Integer peopleCount;
//    private Date startAt;
//    private Date closeAt;
    // TODO: 연관관계 설정 후 외래키 지정
    @OneToMany(mappedBy = "product")
    private List<ProductImage> images;

    // 판매자 테이블과 연관 관계 매핑 설정 완료
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Seller_ID")
    private Seller sellerIdx ;

    // 카테고리 ID
    //@OneToMany(mappedBy = "product")
    //private List<CategoryToProduct> categoryList;

    // 장바구니
    //@OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
    //private List<Cart> carts;
}
