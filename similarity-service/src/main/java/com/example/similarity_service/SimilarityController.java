package com.example.similarity_service;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/similarity")
public class SimilarityController {

    // 업로드된 데이터를 임시로 메모리에 저장해둘 보관함 (초안용)
    private final List<Map<String, Object>> storage = new ArrayList<>();

    // 1. 단어 근연도 결과를 업로드(전송)받는 통로
    @PostMapping("/upload")
    public String uploadResult(@RequestBody Map<String, Object> resultData) {
        // 프론트가 보낸 데이터를 임시 보관함에 저장
        storage.add(resultData);
        System.out.println("웹에서 업로드된 데이터 수신 성공: " + resultData);
        return "단어 근연도 결과 업로드 성공!";
    }

    // 2. 임시 저장된 전체 목록을 확인하는 통로
    @GetMapping("/list")
    public List<Map<String, Object>> getList() {
        return storage;
    }
}
