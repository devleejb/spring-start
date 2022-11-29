package devleejb.springstart;

import devleejb.springstart.repository.MemberRepository;
import devleejb.springstart.repository.MemoryMemberRepository;
import devleejb.springstart.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
