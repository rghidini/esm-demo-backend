package com.example.demo.service.implementation;

import com.example.demo.service.ListService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListServiceImpl implements ListService {
    @Override
    public List<Integer> sortList(List<Integer> listToBeSorted) {
        return listToBeSorted.stream().sorted(Integer::compare).collect(Collectors.toList());
    }
}
