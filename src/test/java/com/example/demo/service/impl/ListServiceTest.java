package com.example.demo.service.impl;

import com.example.demo.service.ListService;
import com.example.demo.service.implementation.ListServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class ListServiceTest {

    @Test
    public void sort_list_ok() {
        ListService listService = mock(ListServiceImpl.class);
        given(listService.sortList(List.of(200,50,60,2,1))).willReturn(List.of(1,2,50,60,200));

        final List<Integer> sortedList = listService.sortList(List.of(200,50,60,2,1));

        assertThat(sortedList, notNullValue());
        assertThat(sortedList.size(), equalTo(5));
        assertThat(sortedList.get(0), equalTo(1));
        assertThat(sortedList.get(4), equalTo(200));
    }
}
