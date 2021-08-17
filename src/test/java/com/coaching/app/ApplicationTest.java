package com.coaching.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ApplicationTest {

    @Test
    public void applicationTest() {
        Application.main(new String[]{});
    }

}
