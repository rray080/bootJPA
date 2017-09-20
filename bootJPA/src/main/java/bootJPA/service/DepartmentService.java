/**
 * 
 */
package bootJPA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import bootJPA.bean.Department;
import bootJPA.dao.DepartmentRepository;

/**
 * @author ${Rakesh K Ray}
 *
 * Sep 15, 2017
 */
@Service
public class DepartmentService {

	DepartmentRepository deptRepository;
	
	

	public DepartmentService(DepartmentRepository deptRepository) {
		this.deptRepository = deptRepository;
	}



	public Department findOne(int deptno) {
		// TODO Auto-generated method stub
		return deptRepository.findOne(deptno);
	}

	public List<Department> findAll(){
		List<Department> empList = new ArrayList<>();
		for(Department emp : deptRepository.findAll())
			empList.add(emp);
		return empList;
	}
	
}
