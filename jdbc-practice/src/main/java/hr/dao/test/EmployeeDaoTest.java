package hr.dao.test;

import java.util.List;

import hr.dao.EmployeeDao;
import hr.vo.EmployeeVo;

public class EmployeeDaoTest {

	public static void main(String[] args) {
		testFindBySalary(10000,20000);
	}

	private static void testFindBySalary(int minSalary, int maxSalary) {
		List<EmployeeVo> list = new EmployeeDao().findBySalary(minSalary, maxSalary);
		for (EmployeeVo vo: list) {
			System.out.println(vo);
		}
	}

}
