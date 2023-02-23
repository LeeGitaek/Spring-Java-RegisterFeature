package com.hello.world.repository;

import java.util.List;
import java.util.Optional;

import com.hello.world.domain.Member;

public class JdbcMemberRepository implements MemberRepository {

    @Override
    public Member save(Member member) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
