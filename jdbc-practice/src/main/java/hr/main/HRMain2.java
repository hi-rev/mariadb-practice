package hr.main;

import java.util.List;
import java.util.Scanner;

import hr.dao.EmployeeDao;
import hr.vo.EmployeeVo;

public class HRMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("salary [min, max] > ");
		int minSalary  = sc.nextInt();
		int maxSalary = sc.nextInt();
		
		List<EmployeeVo> list = new EmployeeDao().findBySalary(minSalary, maxSalary);
		for (EmployeeVo vo: list) {
			System.out.println(vo.getNo() + ":" + vo.getFirstName() + ":" + vo.getLastName() + ":" + vo.getHireDate());
		}
		
		sc.close();
	}
}
