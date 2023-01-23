package com.techart.transactionals.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Mikhail.Leonovets
 * @since 01/20/2023
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductAndCounterDto {
    private String productName;
    private BigDecimal productPrice;
    private String counterName;

}
