package com.example.demo.service.implementation;

import com.example.demo.service.ListService;
import org.springframework.stereotype.Service;

@Service
public class ListServiceImpl implements ListService {
    @Override
    public Integer[] sortList(Integer[] listToBeSorted) {
        for(int i = 0; i < listToBeSorted.length; i++) {
            for(int j = i + 1; j < listToBeSorted.length; j++) {
                final var tempI= listToBeSorted[i];
                final var tempJ= listToBeSorted[j];
                if(tempI > tempJ) {
                    listToBeSorted[i]=tempJ;
                    listToBeSorted[j]= tempI;
                }
            }
        }
        return listToBeSorted;
    }
}
