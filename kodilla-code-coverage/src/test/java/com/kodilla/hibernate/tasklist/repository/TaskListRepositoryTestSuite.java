package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;

import org.junit.Assert;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    public void testFindByListName() {
        // Tworzenie listy
        TaskList taskList = new TaskList("Testowa Lista", "Opis");

        // Zapisywanie listy
        TaskList savedTaskList = taskListRepository.save(taskList);

        // Wyszukiwanie listy zadań na podstawie nazwy listy
        List<TaskList> foundTaskLists = taskListRepository.findByListName("Testowa Lista");

        // Sprawdzanie, czy lista zadań została odnaleziona i ma poprawną nazwę
        Assert.assertNotNull(foundTaskLists);
        Assert.assertEquals("Testowa Lista", foundTaskLists.get(0).getListName());

        // Usuwanie zapisanej listy zadań
        taskListRepository.delete(savedTaskList);
    }
}