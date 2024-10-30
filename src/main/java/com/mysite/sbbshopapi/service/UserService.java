package com.mysite.sbbshopapi.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {
	
	@PreAuthorize("hasRole('ADMIN')")
	public void adminOnly() {
		log.info("관리자만 실행 허용");
		
	}
	
	@PreAuthorize("hasRole('ADMIN', 'MANAGER')") public void managerOnly() {
		log.info("매니저 이상 권한 사용자만 실행 허용");
	}
	
//	@PreAuthorize("hasRole('ADMIN', 'MANAGER', 'USER')")
//	public void userOnly() {
//		log.info("모든 사용자 실행 허용");
//	}
}
