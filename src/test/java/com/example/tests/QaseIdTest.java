package com.example.tests;

import io.qase.commons.annotation.*;
import org.testng.annotations.Test;

public class QaseIdTest {
    @Test
    // Replace the Id `1` with a valid Id from your Qase project and uncomment the
    // line below.

    @QaseId(1)
    public void testWithQaseId_success() {
        System.out.println("Test with QaseId");
    }
}
