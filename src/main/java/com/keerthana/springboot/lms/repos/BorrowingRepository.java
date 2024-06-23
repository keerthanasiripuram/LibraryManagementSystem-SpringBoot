package com.keerthana.springboot.lms.repos;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerthana.springboot.lms.model.Borrowing;

public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {

	List<Borrowing> findByReturnDate(Date date);

}
