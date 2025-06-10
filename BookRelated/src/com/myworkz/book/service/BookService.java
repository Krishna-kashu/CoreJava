package com.myworkz.book.service;

import com.myworkz.book.dto.BookDTO;

public interface BookService {
    boolean validation(BookDTO bookDTO);
}