/**
 * 
 */
package bootJPA.dao;

import org.springframework.data.repository.CrudRepository;

import bootJPA.bean.Department;

/**
 * @author ${Rakesh K Ray}
 *
 * Sep 15, 2017
 */
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
