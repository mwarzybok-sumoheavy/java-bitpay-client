package com.bitpay.sdk.exceptions;

import org.junit.jupiter.api.Test;

public class SubscriptionQueryExceptionTest  extends AbstractTestException {

    private static final String MESSAGE = "Failed to retrieve subscription";
    private static final String CODE = "BITPAY-SUBSCRIPTION-GET";

    @Test
    public void it_should_create_exception_without_status() {
        this.testExceptionWithoutStatus(this.getTestedClass(null), MESSAGE, CODE);
    }

    @Test
    public void it_should_create_exception_with_status() {
        this.testExceptionWithStatus(this.getTestedClass(AbstractTestException.STATUS_CODE), MESSAGE, CODE);
    }

    private SubscriptionQueryException getTestedClass(String status) {
        return new SubscriptionQueryException(status, AbstractTestException.REASON_MESSAGE);
    }
}