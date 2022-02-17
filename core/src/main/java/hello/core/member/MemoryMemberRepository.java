package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    // 동시성 이슈 때문에 사실상 ConcurrentHashMap을 사용해야 함
    // synchronized 키워드가 없어서 Multi-Thread 환경에서 사용 불가능
    /**
     * ConcurrentHashMap
     * get()에는 synchronized X, put()에는 존재
     * 읽기 작업에는 여러 쓰레드가 동시에 읽을 수 있으나
     * 쓰기 작업에는 특정 세그먼트에 대해 Lock 사용
     */
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
