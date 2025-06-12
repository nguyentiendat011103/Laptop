package com.example.laptop.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "info_user_receives")
public class InfoUserReceive {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @Column(name = "street_number", length = 100, nullable = false)
    @NotNull
    private String detailAddress;

    @Column(name = "full_name", length = 100, nullable = false)
    @NotNull
    private String fullName;

    @Column(name = "phone_number", length = 15, nullable = false)
    @NotNull
    private String phoneNumber;

    @Column(name = "email", nullable = false)
    @NotNull
    private String email;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ward_id")
    @NotNull
    private Ward ward;
}
