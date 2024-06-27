package com.sparta.springresttemplateserver.controller;

import com.sparta.springresttemplateserver.dto.ItemResponseDto;

import com.sparta.springresttemplateserver.dto.UserRequestDto;
import com.sparta.springresttemplateserver.entity.Item;
import com.sparta.springresttemplateserver.service.ItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/server")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    // @RequestParam String query: URL의 쿼리 파라미터 query
    @GetMapping("/get-call-obj") // 클라에서 받는 쿼리로
    public Item getCallObject(@RequestParam String query) {
        return itemService.getCallObject(query);
    }

    @GetMapping("/get-call-list")
    public ItemResponseDto getCallList() {
        return itemService.getCallList();
    }

    // @PathVariable String query: URL 경로의 일부인 {query}
    @PostMapping("/post-call/{query}")
    public Item postCall(@PathVariable String query, @RequestBody UserRequestDto requestDto) { //@RequestBody UserRequestDto requestDto: HTTP 요청 본문에서 UserRequestDto 객체를 받음
        return itemService.postCall(query, requestDto)
                ;
    }
  // @RequestHeader("X-Authorization") String token: HTTP 요청 헤더에서 X-Authorization
    @PostMapping("/exchange-call")
    public ItemResponseDto exchangeCall(@RequestHeader("X-Authorization") String token, @RequestBody UserRequestDto requestDto) {
        return itemService.exchangeCall(token, requestDto);
    }
}