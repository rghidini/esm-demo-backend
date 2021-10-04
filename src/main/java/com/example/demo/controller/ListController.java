package com.example.demo.controller;

import com.example.demo.service.ListService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list")
@Tag(name = "List")
@RequiredArgsConstructor
public class ListController {

    private final ListService listService;

    @Operation(
            summary = "Sort List",
            description = "Sort a list of integers in ascending order",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Ok"),
                    @ApiResponse(responseCode = "400", description = "Bad request")
            }
    )
    @PostMapping(path = "/sort", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer[]> recuperarTodosPaginado(@RequestBody Integer[] listToBeSorted) {
        return ResponseEntity.ok(listService.sortList(listToBeSorted));
    }
}
