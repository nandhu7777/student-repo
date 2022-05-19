package com.sapient.aem.model;



import static org.junit.jupiter.api.Assertions.*;



import java.time.LocalDate;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TeacherTest {



	private Teacher teacher=null;
	@BeforeEach
	void setUp() throws Exception {
		teacher= new Teacher(41636584703909L,"pruthvi",LocalDate.parse("2018-08-19"),"Bangalore","pruthvi@publicissapient.com",9901011721L,"MBA","male",575877.00);
	}



	@AfterEach
	void tearDown() throws Exception {
		teacher=null;
	}
	@Test
	void testSetAadharCard() {
		teacher.setAdharCard(41636584703909L);
		assertEquals(41636584703909L,teacher.getAdharCard());
	}



	@Test
	void testInvalidSetAadharCard() {
		teacher.setAdharCard(6327678483909L);
		assertNotEquals(87258532768L,teacher.getAdharCard());
	}
	@Test
	void testGetAadharCard() {
		assertEquals(41636584703909L,teacher.getAdharCard(),"testing aadharcard");
	}
	@Test
	void testInvalidGetAadharCard() {
		assertNotEquals(6327678483909L,teacher.getAdharCard(),"testing aadharcard");
	}
	@Test
	void testSetName() {
		teacher.setName("pruthvi");
		assertEquals("pruthvi",teacher.getName());
	}
	@Test
	void testInvalidSetName() {
		teacher.setName("ramya");
		assertNotEquals("pruthvi",teacher.getName());
	}
	@Test
	void testGetName() {
		assertEquals("pruthvi",teacher.getName(),"testing name");
	}
	@Test
	void testInvalidGetName() {
		assertNotEquals("ramya",teacher.getName(),"testing name");
	}
	@Test
	void testSetBirthdate() {
		teacher.setBirthdate(LocalDate.parse("2018-08-19"));
		assertEquals(LocalDate.parse("2018-08-19"),teacher.getBirthdate());
	}
	@Test
	void testInvalidSetBirthdate() {
		teacher.setBirthdate(LocalDate.parse("2000-08-19"));
		assertNotEquals(LocalDate.parse("2018-08-19"),teacher.getBirthdate());
	}
	@Test
	void testGetBirthdate() {
		assertEquals(LocalDate.parse("2018-08-19"),teacher.getBirthdate(),"testing birthdate");
	}
	@Test
	void testInvalidGetBirthdate() {
		assertNotEquals(LocalDate.parse("2000-08-19"),teacher.getBirthdate(),"testing birthdate");
	}
	@Test
	void testSetAddress() {
		teacher.setAddress("Bangalore");
		assertEquals("Bangalore",teacher.getAddress());
	}
	@Test
	void testInvalidSetAddress() {
		teacher.setAddress("Combaitore");
		assertNotEquals("Bangalore",teacher.getAddress());
	}
	@Test
	void testGetAddress() {
		assertEquals("Bangalore",teacher.getAddress(),"testing address");
	}
	@Test
	void testInvalidGetAddress() {
		assertNotEquals("Combaitore",teacher.getAddress(),"testing address");
	}
	@Test
	void testSetEmail() {
		teacher.setEmail("krithika@publicissapient.com");
		assertEquals("krithika@publicissapient.com",teacher.getEmail());
	}
	@Test
	void testInvalidSetEmail() {
		teacher.setEmail("krutha@publicissapient.com");
		assertNotEquals("krithika@publicissapient.com",teacher.getEmail());
	}
	@Test
	void testGetEmail() {
		assertEquals("pruthvi@publicissapient.com",teacher.getEmail(),"testing email");
	}
	@Test
	void testInvalidGetEmail() {
		assertNotEquals("krutha@publicissapient.com",teacher.getEmail(),"testing email");
	}
	@Test
	void testSetMobile() {
		teacher.setMobile(9724132211L);
		assertEquals(9724132211L,teacher.getMobile());
	}
	@Test
	void testInvalidSetMobile() {
		teacher.setMobile(9724132211L);
		assertNotEquals(972456342L,teacher.getMobile());
	}
	@Test
	void testGetMobile() {
		assertEquals(9901011721L,teacher.getMobile(),"testing mobile");
	}
	@Test
	void testInvalidGetMobile() {
		assertNotEquals(972456342L,teacher.getMobile(),"testing mobile");
	}
	@Test
	void testSetQualification() {
		teacher.setQualification("MBA");
		assertEquals("MBA",teacher.getQualification());
	}
	@Test
	void testInvalidSetQualification() {
		teacher.setQualification("MBA");
		assertNotEquals("M.Tech PhD",teacher.getQualification());
	}
	@Test
	void testGetQualification() {
		assertEquals("MBA",teacher.getQualification(),"testing qualification");
	}
	@Test
	void testInvalidGetQualification() {
		assertNotEquals("M.Tech PhD",teacher.getQualification(),"testing qualification");
	}
	@Test
	void testSetGender() {
		teacher.setGender("Male");
		assertEquals("Male",teacher.getGender());
	}
	@Test
	void testInvalidSetGender() {
		teacher.setGender("Male");
		assertNotEquals("Female",teacher.getGender());
	}
	@Test
	void testGetGender() {
		assertEquals("male",teacher.getGender(),"testing gender");
	}
	@Test
	void testInvalidGetGender() {
		assertNotEquals("female",teacher.getGender(),"testing gender");
	}
	@Test
	void testSetSalary() {
		teacher.setSalary(456671.00);
		assertEquals(456671.00,teacher.getSalary());
	}
	@Test
	void testInvalidSetSalary() {
		teacher.setSalary(65287.00);
		assertNotEquals(652817.00,teacher.getSalary());
	}
	@Test
	void testGetSalary() {
		assertEquals(575877.00,teacher.getSalary(),"testing salary");
	}
	@Test
	void testInvalidGetSalary() {
		assertNotEquals(762837.00,teacher.getSalary(),"testing salary");
	}



}