package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // given : 주어진 것
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when : 어떤 상황에 무엇을 했을 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then : 이렇게 됨
        Assertions.assertThat(member).isEqualTo(findMember);
    }

}