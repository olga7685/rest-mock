package com.example.restmock.controller;


import com.example.restmock.entities.*;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/limit")
@Validated
public class LimitController {

    private final String sharedKey = "SHARED_KEY_2";
    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @PostMapping("/set")
    public LimitRS setLimit(@RequestParam(value = "key") String key,
                            @Valid @RequestBody LimitRQ rq) {
        final LimitRS rs;
        if (sharedKey.equalsIgnoreCase(key)) {
            OrgUnit orgUnit = rq.getOrgUnit();
            Integer value = rq.getValue();
            Counterparty counterparty = rq.getCounterparty();
            Currency currency = rq.getCurrency();
            rs = new LimitRS(SUCCESS_STATUS, CODE_SUCCESS,100000 + (int)(Math.random()*100000), counterparty, value);
        } else {
            rs = new LimitRS(ERROR_STATUS, AUTH_FAILURE);
        }

        return rs;
    }
}

