package com.example.restmock.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LimitRS {
    private final String status;
    private final Integer code;
    private Integer LimitID;
    private Counterparty counterparty;
    private Integer value;

    public LimitRS(String status, Integer code) {
        this.status = status;
        this.code = code;
    }
}
