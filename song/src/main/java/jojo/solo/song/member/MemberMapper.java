package jojo.solo.song.member;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    default MemberDto.Response memberToMemberResponse(Member member){
        MemberDto.Response response = MemberDto.Response.builder()
                .memberId(member.getMemberId())
                .id(member.getId())
                .nickname(member.getNickname())
                .profileUrl(member.getProfileUrl())
                .mainInst(member.getMainInst())
                .status(member.getStatus())
                .createdAt(member.getCreatedAt())
                .build();

        return response;
    }
}
