package hello.core.member;

public interface MemberRepository {

    // 저장하는 기능
    void save(Member member);

    // 회원 ID를 이용하여 회원 찾기 기능
    Member findById(Long memberId);

}
