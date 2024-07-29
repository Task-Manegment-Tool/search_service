package com.blue.searchservice.repository;

import com.blue.searchservice.dto.TaskEvent;
import com.blue.searchservice.entity.IndexedTask;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;


public interface TaskSearchRepository extends ElasticsearchRepository<IndexedTask, Long> {

}
