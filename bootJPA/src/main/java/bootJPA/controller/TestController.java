/**
 * 
 */
package bootJPA.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import bootJPA.bean.Task;
import bootJPA.service.TaskService;

/**
 * @author $ Rakesh K Ray
 *
 * @Created May 19, 2017 2:25:26 PM
 */
@RestController
public class TestController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/hello")
	public String Hello(){
		return "Hello World";
	}
	
	/*@GetMapping("/all-tasks")
	public String allTasks(){
		return taskService.findAll().toString();
	}
	
	@GetMapping("/save-task")
	public String saveTask(@RequestParam String name, @RequestParam String desc){
		Task task = new Task(name,desc,new Date(),false);
		taskService.save(task);
		return "Task Saved..";
	}
	
	@GetMapping("/delete-task/{id}")
	public String deleteTask(@PathVariable final int id){
		taskService.delete(id);
		return "Task Deleted..";
	}*/
}
