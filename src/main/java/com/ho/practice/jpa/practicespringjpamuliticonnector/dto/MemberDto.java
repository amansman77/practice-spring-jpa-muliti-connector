package com.ho.practice.jpa.practicespringjpamuliticonnector.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {
    
    private long id;
	private String password;
	private String name;
	private String email;
	private String phoneNumber;
    private LocalDateTime createTime;
	private LocalDateTime modifyTime;
	
}
