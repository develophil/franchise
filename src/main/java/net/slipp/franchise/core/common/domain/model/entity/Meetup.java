package net.slipp.franchise.core.common.domain.model.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Meetup {

    private Long id;

    private String name;
    private String desc;
    private int memberLimit;
    private LocalDateTime recruitEndDateTime;

    private Set<Long> memberIds = new HashSet<>();

    private Long createUserId;
    private LocalDateTime createdDateTime;
    private Long updateUserId;
    private LocalDateTime updatedDateTime;

}
