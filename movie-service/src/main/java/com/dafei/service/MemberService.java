package com.dafei.service;

import com.dafei.domain.Member;


import java.util.List;

public interface MemberService {
    // 查询 影视列表
    public List<Member> findAll();

    // 根据id 去查询一个影视信息
    public Member findMemberById(String id);

    // 修改
    public void updateMemberById(Member member);

    // 添加
    public void addMember(Member member);

    // 删除
    public Integer deleteById(String id);

    Integer deleteBatchIds(List<Integer> ids);
}
