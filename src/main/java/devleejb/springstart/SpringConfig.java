package devleejb.springstart;

import devleejb.springstart.repository.JdbcMemberRepository;
import devleejb.springstart.repository.JdbcTemplateMemberRepository;
import devleejb.springstart.repository.JpaMemberRepository;
import devleejb.springstart.repository.MemberRepository;
import devleejb.springstart.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }
}
