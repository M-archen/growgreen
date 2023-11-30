package com.green.growgreen.todo;

import com.green.growgreen.todo.model.TodoInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {
    int postTodo(TodoInsDto dto);
}
