package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    //테스트 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }

    public MemberServiceImpl(MemberRepository MemberRepository) {
        this.memberRepository = MemberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
