package com.ho.practice.jpa.practicespringjpamuliticonnector.service;

import com.ho.practice.jpa.practicespringjpamuliticonnector.entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
