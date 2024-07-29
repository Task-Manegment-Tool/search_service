package com.blue.searchservice.dto;

import com.blue.searchservice.entity.IndexedTask;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Document(indexName = "tasks")
//@ToString
public class TaskEvent {
//    @Id
//    private Long id;
    private String eventType;
    private IndexedTask task;
}

