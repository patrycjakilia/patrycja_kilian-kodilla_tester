package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.repository.TaskRepository;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("ListName", "ListName Description");
        taskListRepository.save(taskList);

        //When
        List<TaskList> result = taskListRepository.findByListName("ListName");

        //Then
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("ListName Description", result.get(0).getDescription());

        //CleanUp
        taskListRepository.deleteAll();

    }

}