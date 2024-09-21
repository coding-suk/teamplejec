package com.web.outsourcing.controller;

import com.web.outsourcing.common.ApiResponse;
import com.web.outsourcing.dto.MenuRequestDto;
import com.web.outsourcing.dto.MenuResponseDto;
import com.web.outsourcing.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stores")
public class MenuController {

    private final MenuService menuService;

    /*
    * 메뉴를 생성
    *
    *
    *
    * */
    @PostMapping("/menus")
    public ResponseEntity<ApiResponse<MenuResponseDto>> createMenu(@RequestBody MenuRequestDto menuRequestDto) {
        MenuResponseDto menuResponseDto = menuService.createMenu(menuRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.success(menuResponseDto));
    }

    @GetMapping("/menus")
    public ResponseEntity<ApiResponse<List<MenuResponseDto>>> getMenus() {
        List<MenuResponseDto> menu = menuService.getMenus();
        return ResponseEntity.ok(ApiResponse.success(menu));
    }

    @PutMapping("/menus/{mid}")
    public ResponseEntity<ApiResponse<MenuResponseDto>> updateMenu(@PathVariable Long mid,
                                                                   @RequestBody MenuRequestDto menuRequestDto) {
            MenuResponseDto updateMenu = menuService.updateMenu(mid, menuRequestDto);
            return ResponseEntity.ok(ApiResponse.success(updateMenu));

    }

}
