/**
 * 
 */
package bootJPA.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import bootJPA.bean.Task;
import bootJPA.service.TaskService;

/**headers: { 'Content-Type': 'application/x-www-form-urlencoded' }
 * @author $ Rakesh K Ray
 *
 * @Created May 19, 2017 2:25:26 PM
 */
@SuppressWarnings({ "unused" })
//@CrossOrigin(origins = { "http://localhost:9090" }, maxAge = 3000, allowedHeaders={})
@RestController
public class TestController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/hello")
	public String Hello(){
		return "Hello World";
	}
	
	@GetMapping(name="/all-tasksR", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Task> allTasks(){
		return taskService.findAll();
	}
	
	@PostMapping("/save-taskR")
	public String saveTask(@RequestBody Task task){
		task.setDateCreated(new Date());
		task.setFinished(false);
		System.out.println("Save Task$R" + task.toString());
		taskService.save(task);
		return "Task Saved..";
	}
	
	@DeleteMapping("/delete-taskR/{id}" )
	public String deleteTask(@PathVariable final int id){
		taskService.delete(id);
		return "Task Deleted..";
	}
}
