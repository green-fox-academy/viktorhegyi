/**
 * Created by Viktor on 2017-04-21.
 */
public class App {

  public static void main(String[] args) {

    ToDoList toDoList = new ToDoList(args);

    if ( args.length == 0 ) {
      toDoList.usage();
    } else if ( args[0].contains("-l")) {
      toDoList.ToDoList();
    } else if ( args[0].contains("-a")) {
      toDoList.addTodolist();
      toDoList.ToDoList();
    } else if ( args[0].contains("-r")) {
      toDoList.removeTodolist();
      toDoList.ToDoList();
    } else if ( args[0].contains("-c")) {
      toDoList.checkTask();
      toDoList.ToDoList();
    } else if ( !args[0].contains("-") || args[0].contains("")) {
      System.out.println("\nUnsupported argument\n");
      toDoList.usage();
    }
  }

}