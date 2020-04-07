package net.slipp.franchise.core.recruit.domain.entity;

import net.slipp.franchise.core.common.domain.model.entity.Meetup;
import net.slipp.franchise.core.member.domain.entity.Member;

public class Recruit {

    private Long id;
    private Long recruitMeetupId;
    private Long loginUserId;
    private RecruitStatus recruitStatus;

    public Recruit(Long recruitMeetupId, Long loginUserId) {
        this.recruitMeetupId = recruitMeetupId;
        this.loginUserId = loginUserId;
        this.recruitStatus = RecruitStatus.REQUESTED;
    }
}
