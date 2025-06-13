package com.example.laptop.Dto.Response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import  lombok.Builder;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PageResponse<T> {

    List<T> content; //  // Dữ liệu của trang hiện tại
    Integer totalPages; // Tổng số trang
    Long totalElements;// Tổng số bản ghi
    Integer pageSize;//Kích thước mỗi trang
    Integer currentPage;// Trang hiện tại

    public PageResponse(Page<T> page) {
        this.content = page.getContent();
        this.totalPages = page.getTotalPages();
        this.totalElements = page.getTotalElements();
        this.pageSize = page.getSize();
        this.currentPage = page.getNumber()+1;
    }
}
