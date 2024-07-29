package com.blue.searchservice.controller;

import com.blue.searchservice.entity.IndexedProject;
import com.blue.searchservice.entity.IndexedTask;
import com.blue.searchservice.entity.IndexedUser;
import com.blue.searchservice.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

//    @GetMapping("/tasks")
//    public ResponseEntity<Optional<IndexedTask>> searchTask(@RequestParam String name){
//        return ResponseEntity.ok(searchService.searchTasks(name));
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<List<IndexedUser>> searchUser(@RequestParam String keyword){
//        List<IndexedUser> users = searchService.searchUsers(keyword);
//        return ResponseEntity.ok(users);
//    }
//
//    @GetMapping("/projects")
//    public ResponseEntity<List<IndexedProject>> searchProject(@RequestParam String keyword){
//        List<IndexedProject> projects = searchService.searchProjects(keyword);
//        return ResponseEntity.ok(projects);
//    }
}
