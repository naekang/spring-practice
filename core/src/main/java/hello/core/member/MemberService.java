package hello.core.member;

public interface MemberService {

    // 회원 가입 기능
    void join(Member member);

    // 회원 조회 기능
    Member findMember(Long memberId);

}
