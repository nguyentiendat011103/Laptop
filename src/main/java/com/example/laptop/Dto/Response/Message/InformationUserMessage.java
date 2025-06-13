package com.example.laptop.Dto.Response.Message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InformationUserMessage {

    private Integer idUser;
    private String nameUser;
    private LocalDateTime createdAt;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InformationUserMessage that = (InformationUserMessage) o;
        return Objects.equals(idUser, that.idUser) && Objects.equals(nameUser, that.nameUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, nameUser);
    }
}
