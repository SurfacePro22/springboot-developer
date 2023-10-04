package shop.e.nintendo.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository; // inject bean

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}