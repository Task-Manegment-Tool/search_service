package com.blue.searchservice.dto;

import com.blue.searchservice.entity.IndexedUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEvent {
    private String event;
    private IndexedUser indexedUser;
}
