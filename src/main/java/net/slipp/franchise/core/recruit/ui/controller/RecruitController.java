package net.slipp.franchise.core.recruit.ui.controller;

import net.slipp.franchise.core.member.domain.entity.Member;
import net.slipp.franchise.core.recruit.application.service.RecruitService;

public class RecruitController {

    public RecruitService recruitService;

    public Object getJoinableMeetups(Member member) {
        return recruitService.findJoinableMeetups(member);
    }

    public Object joinMeetup(Member member, Long meetupId) {
        return recruitService.joinMeetup(member, meetupId);
    }
}
