package com.web.outsourcing.service;

import com.web.outsourcing.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService implements MenuServiceIms{

    private final MenuRepository menuRepository;

}
