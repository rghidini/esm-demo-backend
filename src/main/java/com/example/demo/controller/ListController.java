package com.example.demo.controller;

import com.example.demo.service.ListService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
@Tag(name = "List")
@RequiredArgsConstructor
public class ListController {

    private final ListService listService;

    @Operation(
            summary = "Sort List",
            description = "Sort a list of integers in ascending order"
    )
    @PostMapping(path = "/sort", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Integer>> recuperarTodosPaginado(@RequestBody List<Integer> listToBeSorted) {
        return ResponseEntity.ok(listService.sortList(listToBeSorted));
    }
}
