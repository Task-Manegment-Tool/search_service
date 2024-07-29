package com.blue.searchservice.dto;

import com.blue.searchservice.entity.IndexedProject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectEvent {
    private String event;
    private IndexedProject indexedProject;
}
