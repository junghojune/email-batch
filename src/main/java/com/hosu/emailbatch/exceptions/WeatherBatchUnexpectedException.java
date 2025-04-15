package com.hosu.emailbatch.exceptions;

import com.hosu.emailbatch.exceptions.enums.WeatherBatchExceptionCode;

public class WeatherBatchUnexpectedException extends WeatherBatchException {

    private static final WeatherBatchExceptionCode CODE = WeatherBatchExceptionCode.UNEXPECTED;

    public WeatherBatchUnexpectedException() {
        super(CODE);
    }

    public WeatherBatchUnexpectedException(Throwable cause) {
        super(CODE, cause);
    }

    public WeatherBatchUnexpectedException(String message) {
        super(CODE, message);
    }
}
