package com.wsleli.service.impl;

import com.wsleli.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/06/24 0:57
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service is running ...");
    }
}