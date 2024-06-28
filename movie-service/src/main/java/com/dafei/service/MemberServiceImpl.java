package com.dafei.service;

import com.dafei.domain.Member;
import com.dafei.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    // 引入 mapper
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public List<Member> findAll() {
        List<Member> memberList = this.memberMapper.selectList(null);
        return memberList;
    }

    @Override
    public Member findMemberById(String id) {
        Member member = this.memberMapper.selectById(id);
        return member;
    }

    @Override
    public void updateMemberById(Member member) {
        this.memberMapper.updateById(member);
    }

    @Override
    public void addMember(Member member) {
        this.memberMapper.insert(member);
    }

    @Override
    public Integer deleteById(String id) {
        int delete = this.memberMapper.deleteById(id);
        return delete;
    }

    @Override
    public Integer deleteBatchIds(List<Integer> ids) {
        return this.memberMapper.deleteBatchIds(ids);
    }

}
