package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 구현체를 선택하지 않으면 NullPointerException
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // join을 호출하면 다형성에 의해 interface가 아닌 구현체인 MemoryMemberRepository안에 있는 save() 호출
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
