package com.bitpay.sdk.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubscriptionExceptionTest  extends AbstractTestException {

    private static final String MESSAGE = "An unexpected error occurred while trying to manage the subscription";
    private static final String CODE = "BITPAY-SUBSCRIPTION-GENERIC";

    @Test
    public void it_should_create_exception_without_status() {
        this.testExceptionWithoutStatus(this.getTestedClass(null), MESSAGE, CODE);
    }

    @Test
    public void it_should_create_exception_with_status() {
        this.testExceptionWithStatus(this.getTestedClass(AbstractTestException.STATUS_CODE), MESSAGE, CODE);
    }

    @Test
    public void it_should_build_exception_with_different_bitpay_message() {
        final String message = "BITPAY-CUSTOM";
        SubscriptionException exception = new SubscriptionException(null, message);
        Assertions.assertEquals(message, exception.getReasonPhrase());
    }

    private SubscriptionException getTestedClass(String status) {
        return new SubscriptionException(status, AbstractTestException.REASON_MESSAGE);
    }
}