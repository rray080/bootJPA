/**
 * 
 */
package bootJPA.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bootJPA.bean.Department;
import bootJPA.bean.Employee;
import bootJPA.service.DepartmentService;
import bootJPA.service.EmployeeService;

/**
 * @author ${Rakesh K Ray}
 *
 *         Sep 3, 2017
 */
@RestController
@RequestMapping("/api")
public class DemoController {
	
	@Autowired
	EmployeeService empService;
	@Autowired
	DepartmentService deptService;
	
	@RequestMapping(value = "/add/{value1}/{value2}")
	public int add(@PathVariable int value1, @PathVariable int value2) {
		int result = 0;
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result = value1 + value2;
		return result;
	}
	
	@RequestMapping(value = "/mul/{value1}/{value2}")
	public int multiply(@PathVariable int value1, @PathVariable int value2) {
		int result = 0;
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result = value1 * value2;
		return result;
	}
	
	@RequestMapping(value = "/employees", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> employees() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empService.findAll();
	}
	
	@RequestMapping(value = "/employees/{empno}")
	public Employee employees(@PathVariable int empno) {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empService.findOne(empno);
	}
	@RequestMapping(value = "/employees/deptno/{deptno}")
	public Department employeesDept(@PathVariable int deptno) {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptService.findOne(deptno);
	}
	
	@RequestMapping(value = "/departments")
	public @ResponseBody List<Department> departments() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptService.findAll();
	}
	
	@RequestMapping(value = "/departments/employees/{deptId}")
	public @ResponseBody List<Employee> departments(@PathVariable final int deptId) {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empService.findEmployeeByDepartmentId(deptId);
	}
}
