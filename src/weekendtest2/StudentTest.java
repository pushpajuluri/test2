package weekendtest2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	
		public void score88Test() {
			Student student = new Student(false, 88, 85);
			String result = student.printGrade(student);
			assertEquals("A", result);
		}

		@Test
		public void score60Test() {
			Student student = new Student(true, 60, 85);
			String result = student.printGrade(student);
			assertEquals("C", result);
		}

		@Test
		public void score60Test2() {
			Student student = new Student(false, 60, 85);
			String result = student.printGrade(student);
			assertEquals("B", result);
		}

		@Test
		public void score80Test() {
			Student student = new Student(true, 80, 85);
			String result = student.printGrade(student);
			assertEquals("A", result);
		}

		@Test
		public void score80Test2() {
			Student student = new Student(true, 80, 70);
			String result = student.printGrade(student);
			assertEquals("B", result);
		}
		@Test
		public void scoreBetween60and80Test() {
			Student student = new Student(true,65, 70);
			String result = student.printGrade(student);
			assertEquals("B", result);
		}

	
	

}

