/**
 * 
 */
package bootJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import bootJPA.bean.Employee;

/**
 * @author ${Rakesh K Ray}
 *
 * Sep 5, 2017
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	 @Query("SELECT e FROM Employee e inner join e.department d WHERE d.id = :id")
	 public List<Employee> findEmployeeByDepartmentId(@Param("id") int id);

}
