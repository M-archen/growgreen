package com.green.growgreen.todo;

import com.green.growgreen.common.ResVo;
import com.green.growgreen.todo.model.TodoInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {
    public final TodoMapper todoMapper;
    public ResVo postTodo(TodoInsDto dto){
        todoMapper.postTodo(dto);
        return new ResVo(dto.getItodo());
    }
}
