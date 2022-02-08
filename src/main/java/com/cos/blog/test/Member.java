package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Member {
	private  int id;
	private  String username;
	private  String password;
	private  String email;
	
	@Builder // 빌더 장점 : 객체의 값넣을때 순서 x, 객체 값순서를 햇갈려서 잘못 넣는 실수를 방지
	public Member(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
}
