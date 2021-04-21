package com.ho.practice.jpa.practicespringjpamuliticonnector.service;

import java.util.List;
import java.util.stream.Collectors;

import com.ho.practice.jpa.practicespringjpamuliticonnector.dto.MemberDto;
import com.ho.practice.jpa.practicespringjpamuliticonnector.entity.first.Member;
import com.ho.practice.jpa.practicespringjpamuliticonnector.repository.first.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional("firstTransactionManager")
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;

	public MemberDto addMember(MemberDto memberDto) {
		Member createMember = memberRepository.save(
			Member.builder()
			.name(memberDto.getName())
			.build()
		);
		return MemberDto.builder()
		.id(createMember.getId())
		.name(createMember.getName())
		.build();
	}

	public List<MemberDto> getMember() {
		return memberRepository.findAll().stream().map(m -> MemberDto.builder().id(m.getId()).name(m.getName()).build()).collect(Collectors.toList());
	}

}
