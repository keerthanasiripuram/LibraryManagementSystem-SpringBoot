package com.keerthana.springboot.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerthana.springboot.lms.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
