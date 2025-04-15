package com.hosu.emailbatch.exceptions;

import com.hosu.emailbatch.exceptions.enums.WeatherBatchExceptionCode;

public class WeatherBatchNotSupportedException extends WeatherBatchException {

    private static final WeatherBatchExceptionCode CODE = WeatherBatchExceptionCode.NOT_SUPPORTED;

    public WeatherBatchNotSupportedException() {
        super(CODE);
    }

    public WeatherBatchNotSupportedException(Throwable cause) {
        super(CODE, cause);
    }

    public WeatherBatchNotSupportedException(String message) {
        super(CODE, message);
    }
}
