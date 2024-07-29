package com.blue.searchservice.service;


import com.blue.searchservice.dto.TaskEvent;
//import com.blue.searchservice.entity.IndexedProject;
import com.blue.searchservice.entity.IndexedTask;
import com.blue.searchservice.entity.IndexedUser;
//import com.blue.searchservice.repository.ProjectSearchRepository;
import com.blue.searchservice.repository.ProjectSearchRepository;
import com.blue.searchservice.repository.TaskSearchRepository;
import com.blue.searchservice.repository.UserSearchRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private ProjectSearchRepository projectSearchRepository;

    @Autowired
    private TaskSearchRepository taskSearchRepository;
    private UserSearchRepository userSearchRepository;

    @Autowired
    private ObjectMapper objectMapper;

//    public Optional<TaskEvent> searchTasks(String query) {
//
//        return taskSearchRepository.findByNameContaining(query);
//
//    }

//    public List<IndexedProject> searchProjects(String keyword) {
//        return projectSearchRepository.findByNameContaining(keyword);
//    }

    public List<IndexedUser> searchUsers(String keyword) {
        return userSearchRepository.findByUsernameContaining(keyword);
    }

    @KafkaListener(topics = "Task-Topic", groupId = "search-topic-group")
    public void processTaskEvents(String taskEventStr) {

        try {
            System.out.println("listen data :" + taskEventStr);
            TaskEvent taskEvent = objectMapper.readValue(taskEventStr, TaskEvent.class);
            if (taskEvent.getEventType().equals("CreateTask")) {
                System.out.println("This is for Creating Task ");
                final IndexedTask save = taskSearchRepository.save(taskEvent.getTask());
                System.out.println("save===" + save);
            } else {
                System.out.println("This is for updating the Task ");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
