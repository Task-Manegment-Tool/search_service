package com.blue.searchservice.service;


import com.blue.searchservice.dto.TaskEvent;
//import com.blue.searchservice.entity.IndexedProject;
import com.blue.searchservice.entity.IndexedUser;

import java.util.List;
import java.util.Optional;

public interface SearchService {

//    public Optional<TaskEvent> searchTasks(String keyword);
//    public List<IndexedProject> searchProjects(String keyword);
    public List<IndexedUser> searchUsers(String keyword);
}
