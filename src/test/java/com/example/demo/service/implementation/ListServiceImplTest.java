package com.example.demo.service.implementation;

import com.example.demo.service.ListService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

@ExtendWith(SpringExtension.class)
public class ListServiceImplTest {

    @InjectMocks
    private ListService listService = new ListServiceImpl();

    @Test
    public void test_sort_list_ok() {
        final var listToBeSorted = new Integer[]{2, 4, 7, 8, 1, 2};
        final var sortedList = listService.sortList(listToBeSorted);

        assertThat(sortedList, notNullValue());
        assertThat(sortedList.length, equalTo(6));
        assertThat(sortedList[0], equalTo(1));
        assertThat(sortedList[5], equalTo(8));
    }
}
