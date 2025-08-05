package api.todo.service;

import api.todo.entity.Todo;
import api.todo.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo insertTodo(Todo todo) {
        if (todo.getId() != null && todoRepository.existsById(todo.getId())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Todo already exists");
        }
        return todoRepository.save(todo);
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo not found with id " + id));
    }

    public Todo updateTodo(Todo todo) {
        if (todo.getId() == null || !todoRepository.existsById(todo.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo can not be updated, id does not exist.");
        }
        return todoRepository.save(todo) ;
    }

    public void deleteTodo(Long id) {
        if (todoRepository.findById(id).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo not found with id " + id);
        }
        todoRepository.deleteById(id);
    }
}
