package com.dedytech;

import java.time.LocalDateTime;

public record Message(
        String message,
        LocalDateTime createdAt
) {
}
