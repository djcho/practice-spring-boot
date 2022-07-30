package com.springboot.test.data.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ProductResponseDto {

    private Long number;

    private String name;

    private int price;

    private int stock;

}
