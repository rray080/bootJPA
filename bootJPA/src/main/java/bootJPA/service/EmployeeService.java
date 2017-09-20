/**
 * 
 */
package bootJPA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import bootJPA.bean.Employee;
import bootJPA.dao.EmployeeRepository;

/**
 * @author ${Rakesh K Ray}
 *
 * Sep 5, 2017
 */
@Service
public class EmployeeService {
	
	EmployeeRepository empRepository = null;
	
	
	public EmployeeService(EmployeeRepository empRepository) {
		super();
		this.empRepository = empRepository;
	}


	public List<Employee> findAll(){
		List<Employee> empList = new ArrayList<>();
		for(Employee emp : empRepository.findAll())
			empList.add(emp);
		return empList;
	}
	
	public Employee findOne(int empno){
		return empRepository.findOne(empno);
	}
	
	public List<Employee> findEmployeeByDepartmentId(int id){
		return empRepository.findEmployeeByDepartmentId(id);
		
	}
}
