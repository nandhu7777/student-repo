package com.sapient.aem.model;



import static org.junit.jupiter.api.Assertions.*;



import java.time.LocalDate;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

private Student student=null;
	@BeforeEach
	void setUp() throws Exception {
		student= new Student(41636584703909L,"pruthvi",LocalDate.parse("2018-08-19"),"Bangalore","pruthvi@publicissapient.com",9901011721L,12345L,"X",99,89,78,77,98,96,"A+");
	}



	@AfterEach
	void tearDown() throws Exception {
		student=null;
	}
	@Test
	void testSetAadharCard() {
		student.setAdharCard(41636584703909L);
		assertEquals(41636584703909L,student.getAdharCard());
	}



	@Test
	void testInvalidSetAadharCard() {
		student.setAdharCard(6327678483909L);
		assertNotEquals(87258532768L,student.getAdharCard());
	}
	@Test
	void testGetAadharCard() {
		assertEquals(41636584703909L,student.getAdharCard(),"testing aadharcard");
	}
	@Test
	void testInvalidGetAadharCard() {
		assertNotEquals(6327678483909L,student.getAdharCard(),"testing aadharcard");
	}
	@Test
	void testSetName() {
		student.setName("pruthvi");
		assertEquals("pruthvi",student.getName());
	}
	@Test
	void testInvalidSetName() {
		student.setName("ramya");
		assertNotEquals("pruthvi",student.getName());
	}
	@Test
	void testGetName() {
		assertEquals("pruthvi",student.getName(),"testing name");
	}
	@Test
	void testInvalidGetName() {
		assertNotEquals("ramya",student.getName(),"testing name");
	}
	@Test
	void testSetBirthdate() {
		student.setBirthdate(LocalDate.parse("2018-08-19"));
		assertEquals(LocalDate.parse("2018-08-19"),student.getBirthdate());
	}
	@Test
	void testInvalidSetBirthdate() {
		student.setBirthdate(LocalDate.parse("2000-08-19"));
		assertNotEquals(LocalDate.parse("2018-08-19"),student.getBirthdate());
	}
	@Test
	void testGetBirthdate() {
		assertEquals(LocalDate.parse("2018-08-19"),student.getBirthdate(),"testing birthdate");
	}
	@Test
	void testInvalidGetBirthdate() {
		assertNotEquals(LocalDate.parse("2000-08-19"),student.getBirthdate(),"testing birthdate");
	}
	@Test
	void testSetAddress() {
		student.setAddress("Bangalore");
		assertEquals("Bangalore",student.getAddress());
	}
	@Test
	void testInvalidSetAddress() {
		student.setAddress("Combaitore");
		assertNotEquals("Bangalore",student.getAddress());
	}
	@Test
	void testGetAddress() {
		assertEquals("Bangalore",student.getAddress(),"testing address");
	}
	@Test
	void testInvalidGetAddress() {
		assertNotEquals("Combaitore",student.getAddress(),"testing address");
	}
	@Test
	void testSetEmail() {
		student.setEmail("krithika@publicissapient.com");
		assertEquals("krithika@publicissapient.com",student.getEmail());
	}
	@Test
	void testInvalidSetEmail() {
		student.setEmail("krutha@publicissapient.com");
		assertNotEquals("krithika@publicissapient.com",student.getEmail());
	}
	@Test
	void testGetEmail() {
		assertEquals("pruthvi@publicissapient.com",student.getEmail(),"testing email");
	}
	@Test
	void testInvalidGetEmail() {
		assertNotEquals("krutha@publicissapient.com",student.getEmail(),"testing email");
	}
	@Test
	void testSetMobile() {
		student.setMobile(9724132211L);
		assertEquals(9724132211L,student.getMobile());
	}
	@Test
	void testInvalidSetMobile() {
		student.setMobile(9724132211L);
		assertNotEquals(972456342L,student.getMobile());
	}
	@Test
	void testGetMobile() {
		assertEquals(9901011721L,student.getMobile(),"testing mobile");
	}
	@Test
	void testInvalidGetMobile() {
		assertNotEquals(972456342L,student.getMobile(),"testing mobile");
	}
	@Test
	void testSetAdmissionCode() {
		student.setAdmissionCode(1234567L);
		assertEquals(1234567L,student.getAdmissionCode());
	}
	@Test
	void testInvalidSetAdmissionCode() {
		student.setAdmissionCode(134689L);
		assertNotEquals(123456L,student.getAdmissionCode());
	}
	@Test
	void testGetAdmissionCode() {
		assertEquals(12345L,student.getAdmissionCode(),"testing admissionCode");
	}
	@Test
	void testInvalidGetAdmissionCode() {
		assertNotEquals(45678L,student.getAdmissionCode(),"testing admissionCode");
	}
	@Test
	void testSetSubject1() {
		student.setSubject1(99);
		assertEquals(99,student.getSubject1());
	}
	@Test
	void testInvalidSetSubject1() {
		student.setSubject1(98);
		assertNotEquals(99,student.getSubject1());
	}
	@Test
	void testGetSubject1() {
		assertEquals(99,student.getSubject1(),"testing subject1");
	}
	@Test
	void testInvalidGetSubject1() {
		assertNotEquals(95,student.getSubject1(),"testing subject1");
	}
	@Test
	void testSetSubject2() {
		student.setSubject2(99);
		assertEquals(99,student.getSubject2());
	}
	@Test
	void testInvalidSetSubject2() {
		student.setSubject2(98);
		assertNotEquals(99,student.getSubject2());
	}
	@Test
	void testGetSubject2() {
		assertEquals(89,student.getSubject2(),"testing subject2");
	}
	@Test
	void testInvalidGetSubject2() {
		assertNotEquals(95,student.getSubject2(),"testing subject2");
	}
	@Test
	void testSetSubject3() {
		student.setSubject3(99);
		assertEquals(99,student.getSubject3());
	}
	@Test
	void testInvalidSetSubject3() {
		student.setSubject3(98);
		assertNotEquals(99,student.getSubject3());
	}
	@Test
	void testGetSubject3() {
		assertEquals(78,student.getSubject3(),"testing subject3");
	}
	@Test
	void testInvalidGetSubject3() {
		assertNotEquals(95,student.getSubject3(),"testing subject3");
	}
	@Test
	void testSetSubject4() {
		student.setSubject4(99);
		assertEquals(99,student.getSubject4());
	}
	@Test
	void testInvalidSetSubject4() {
		student.setSubject4(98);
		assertNotEquals(99,student.getSubject4());
	}
	@Test
	void testGetSubject4() {
		assertEquals(77,student.getSubject4(),"testing subject4");
	}
	@Test
	void testInvalidGetSubject4() {
		assertNotEquals(95,student.getSubject4(),"testing subject4");
	}
	@Test
	void testSetSubject5() {
		student.setSubject5(99);
		assertEquals(99,student.getSubject5());
	}
	@Test
	void testInvalidSetSubject5() {
		student.setSubject6(98);
		assertNotEquals(99,student.getSubject5());
	}
	@Test
	void testGetSubject5() {
		assertEquals(98,student.getSubject5(),"testing subject5");
	}
	@Test
	void testInvalidGetSubject5() {
		assertNotEquals(95,student.getSubject5(),"testing subject5");
	}
	@Test
	void testSetSubject6() {
		student.setSubject6(99);
		assertEquals(99,student.getSubject6());
	}
	@Test
	void testInvalidSetSubject6() {
		student.setSubject6(98);
		assertNotEquals(99,student.getSubject6());
	}
	@Test
	void testGetSubject6() {
		assertEquals(96,student.getSubject6(),"testing subject6");
	}
	@Test
	void testInvalidGetSubject6() {
		assertNotEquals(95,student.getSubject6(),"testing subject6");
	}
	@Test
	void testSetGrade() {
		student.setGrade("A+");
		assertEquals("A+",student.getGrade());
	}
	@Test
	void testInvalidSetGrade() {
		student.setGrade("A+");
		assertNotEquals("A",student.getGrade());
	}
	@Test
	void testGetGrade() {
		assertEquals("A+",student.getGrade(),"testing grade");
	}
	@Test
	void testInvalidGetGrade() {
		assertNotEquals("B",student.getGrade(),"testing grade");
	}



}