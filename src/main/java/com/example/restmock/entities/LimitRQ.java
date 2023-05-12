package com.example.restmock.entities;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LimitRQ {

    @NotNull(message = "Не передана орг. единица")
    private OrgUnit orgUnit;
    @Min(value = 1, message = "Значение лимита не может быть меньше 1")
    @Max(value = 1000, message = "Значение лимита не может быть больше 1000")
    private Integer value;
    @NotNull(message = "Не передана валюта лимита")
    private Currency currency;
    @NotNull(message = "Не передан контрагент")
    private Counterparty counterparty;

}
