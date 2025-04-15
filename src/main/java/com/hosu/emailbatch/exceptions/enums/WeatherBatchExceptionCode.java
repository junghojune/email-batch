package com.hosu.emailbatch.exceptions.enums;

import lombok.Getter;

@Getter
public enum WeatherBatchExceptionCode {
    UNEXPECTED("UNEXPECTED"),
    NOT_SUPPORTED("NOT_SUPPORTED");

    private final String dbCode;


    WeatherBatchExceptionCode(String dbCode) {
        this.dbCode = dbCode;
    }
}
