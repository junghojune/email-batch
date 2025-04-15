package com.hosu.emailbatch.exceptions;

import com.hosu.emailbatch.exceptions.enums.WeatherBatchExceptionCode;
import lombok.Getter;

@Getter
public class WeatherBatchException extends RuntimeException{

    private final WeatherBatchExceptionCode exceptionCode;

    public WeatherBatchException(WeatherBatchExceptionCode exceptionCode) {
        super();
        this.exceptionCode = exceptionCode;
    }

    public WeatherBatchException(WeatherBatchExceptionCode exceptionCode, String message) {
        super(message);
        this.exceptionCode = exceptionCode;
    }

    public WeatherBatchException(WeatherBatchExceptionCode exceptionCode, Throwable cause) {
        super(cause);
        this.exceptionCode = exceptionCode;
    }
}
