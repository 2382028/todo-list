package todoapp;

import todoapp.views.TodoListView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "todoapp")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        TodoListView todoListView = context.getBean(TodoListView.class);
        todoListView.run();
    }

    @Bean
    Database database = new Database("todo_si", "root", "", "localhost", "3306");
        database.setup();
        return database;
}
