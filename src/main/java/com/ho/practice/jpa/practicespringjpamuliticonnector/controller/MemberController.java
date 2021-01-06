package com.ho.practice.jpa.practicespringjpamuliticonnector.controller;

import java.util.List;

import com.ho.practice.jpa.practicespringjpamuliticonnector.dto.MemberDto;
import com.ho.practice.jpa.practicespringjpamuliticonnector.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {
 
    @Autowired
    private MemberService memberService;
    
    @PostMapping("")
	public MemberDto addMember(@RequestBody MemberDto member) {
        return memberService.addMember(member);
    }
    
    @GetMapping("")
	public List<MemberDto> getMember() {
        return memberService.getMember();
	}
    
}
