package net.slipp.franchise.study.domain;

import java.time.LocalDateTime;

public class JoinRequestHistory {

    private JoinRequestForm joinRequestForm;
    private LocalDateTime requestTime;

    public LocalDateTime getRequestTime() {
        return requestTime;
    }
}
