package me.choi.inflearnthejavatest.study;

import me.choi.inflearnthejavatest.Study;
import me.choi.inflearnthejavatest.domain.Member;
import me.choi.inflearnthejavatest.member.MemberService;

public class StudyService {

    private final MemberService memberService;

    private final StudyRepository repository;

    public StudyService(MemberService memberService, StudyRepository repository) {
        this.memberService = memberService;
        this.repository = repository;
    }

    public Study createNewStudy(Long memberId, Study study) {
        Member member = memberService.findById(memberId);
        if (member == null) {
            throw new IllegalArgumentException("Member doesn't exist for id: '" + memberId + "'");
        }
        study.setOwner(member);
        return repository.save(study);
    }

}
