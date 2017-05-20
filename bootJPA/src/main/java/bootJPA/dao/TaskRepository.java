/**
 * 
 */
package bootJPA.dao;

import org.springframework.data.repository.CrudRepository;

import bootJPA.bean.Task;

/**
 * @author $ Rakesh K Ray
 *
 * @Created May 19, 2017 3:59:19 PM
 */
public interface TaskRepository extends CrudRepository<Task, Integer>{
	
}
