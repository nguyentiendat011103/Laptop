package com.example.laptop.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_variants")
public class ProductVariant {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "option_id", nullable = false)
    private ProductOption option;

    @Size(max = 50)
    @NotNull
    @Column(name = "color", nullable = false, length = 50)
    private String color;

    @Column(name = "price_diff", precision = 12, scale = 2)
    private BigDecimal priceDiff;

    @Column(name = "stock")
    private Integer stock;

    @Lob
    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "is_delete")
    private Boolean isDelete;

    @PrePersist
    protected void prePersist() {
        if (this.isDelete == null) {
            this.isDelete = false;
        }
    }
}
