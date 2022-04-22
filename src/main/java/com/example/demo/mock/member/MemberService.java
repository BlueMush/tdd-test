package com.example.demo.mock.member;

import java.util.Optional;

import com.example.demo.mock.domain.Member;

public interface MemberService {
    void validate(Long memberId) throws InvalidMemberException;

    Optional<Member> findById(Long memberId) throws MemberNotFoundException;
}
