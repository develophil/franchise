package net.slipp.franchise.core.recruit.application.service;

import net.slipp.franchise.core.member.domain.entity.Member;
import net.slipp.franchise.core.recruit.domain.entity.Recruit;

public class RecruitService {


    public Object joinMeetup(Member member, Long meetupId) {
        Recruit recruit = new Recruit(meetupId, member.getId());

        return
    }

    public Object findJoinableMeetups(Member member) {
        return null;
    }
}
