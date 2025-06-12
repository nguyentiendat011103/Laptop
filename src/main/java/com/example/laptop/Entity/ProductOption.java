package com.example.laptop.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_options")
public class ProductOption {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @OneToMany(mappedBy = "option", fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    List<ProductVariant> productVariants;

    @Size(max = 50)
    @NotNull
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    @NotNull
    @Column(name = "price", nullable = false, precision = 12, scale = 2)
    private BigDecimal price;

    @Column(name = "is_delete")
    private Boolean isDelete;

    @Column(name = "cpu")
    private String cpu;

    @Column(name = "gpu")
    private String gpu;

    @Column(name = "ram")
    private String ram;

    @Column(name = "ram_type")
    private String ramType;

    @Column(name = "ram_slot")
    private String ramSlot;

    @Column(name = "storage")
    private String storage;

    @Column(name = "storage_upgrade")
    private String storageUpgrade;

    @Column(name = "display_size")
    private String displaySize;

    @Column(name = "display_resolution")
    private String displayResolution; //độ phân giải

    @Column(name = "display_refresh_rate")
    private String displayRefreshRate; //tần số quét

    @Column(name = "display_technology")
    private String displayTechnology; // công nghệ màn hình

    @Column(name = "audio_features", columnDefinition = "TEXT")
    private String audioFeatures; // công nghệ âm thanh

    @Column(name = "keyboard")
    private String keyboard;

    @Column(name = "security")
    private String security;

    @Column(name = "webcam")
    private String webcam;

    @Column(name = "os")
    private String operatingSystem;

    @Column(name = "battery")
    private String battery;

    @Column(name = "weight")
    private String weight;

    @Column(name = "dimension")
    private String dimension;

    @Column(name = "wifi")
    private String wifi;

    @Column(name = "bluetooth")
    private String bluetooth;

    @Column(name = "ports", columnDefinition = "TEXT")
    private String ports;

    @Column(name = "special_features", columnDefinition = "TEXT")
    private String specialFeatures; // wifi 6, vân tay

    @PrePersist
    private void prePersist() {
        if (this.isDelete == null) {
            this.isDelete = false;
        }
    }

}


