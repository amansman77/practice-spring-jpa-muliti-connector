package com.ho.practice.jpa.practicespringjpamuliticonnector.repository.first;

import com.ho.practice.jpa.practicespringjpamuliticonnector.entity.first.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
