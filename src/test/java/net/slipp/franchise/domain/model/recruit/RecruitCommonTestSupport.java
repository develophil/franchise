package net.slipp.franchise.domain.model.recruit;

import net.slipp.franchise.domain.model.DomainTestSupport;
import net.slipp.franchise.domain.model.recruit.inqueryitem.InquiryDefinition;
import org.mockito.Mock;

import static org.mockito.BDDMockito.given;

public abstract class RecruitCommonTestSupport extends DomainTestSupport implements RecruitValueObjectSupport{

    @Mock
    protected RecruitIdGenerator recruitIdGenerator;
    protected RecruitFactory recruitFactory;

    void setUp() {

        given(recruitIdGenerator.gen()).willReturn(RecruitId.of("1"));
        recruitFactory = new RecruitFactory(recruitIdGenerator);
    }

    protected Recruit testRecruit() {
        return recruitFactory.create(meetupId);
    }

    protected InquiryDefinition anyInquiryDefinition() {
        return new InquiryDefinition("너 몇살이니?", true);
    }
}
