package com.web.outsourcing.service;

import com.web.outsourcing.dto.MenuRequestDto;
import com.web.outsourcing.dto.MenuResponseDto;

import java.util.List;

public interface MenuServiceIms {

    MenuResponseDto createMenu(MenuRequestDto menuRequestDto);

    List<MenuResponseDto> getMenus();

    MenuResponseDto updateMenu(Long mid, MenuRequestDto menuRequestDto);

}
