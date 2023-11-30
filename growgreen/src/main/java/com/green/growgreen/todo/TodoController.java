package com.green.growgreen.todo;

import com.green.growgreen.common.ResVo;
import com.green.growgreen.todo.model.TodoInsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todo")
public class TodoController {
    public final TodoService todoService;
    @PostMapping
    public ResVo postTodo(@RequestBody TodoInsDto dto){
        return todoService.postTodo(dto);
    }
}
