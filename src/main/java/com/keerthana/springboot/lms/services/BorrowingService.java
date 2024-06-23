package com.keerthana.springboot.lms.services;

import org.springframework.stereotype.Service;

import com.keerthana.springboot.lms.model.Borrowing;

public interface BorrowingService {
	Borrowing borrowBook(Long bookId, Long memberId);
	Borrowing returnBook(Long borrowingId);
}
