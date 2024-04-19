package com.example.todoapp

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title : String,
    var createdAt : Date
)


fun getFakeTodo() : List<Todo>{
    return listOf<Todo>(
        Todo(id = 1, title = "First todo", Date.from(Instant.now())),
        Todo(id = 2, title = "second todo", Date.from(Instant.now())),
        Todo(id = 3, title = "This is my third todo", Date.from(Instant.now())),
        Todo(id = 4, title = "This is my fourth todo used in ui", Date.from(Instant.now()))
    );
}