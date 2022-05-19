package com.sapient.aem.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	Person person= null;

	@BeforeEach
	void setUp() throws Exception {
		person = new Person(123456789L,"mouni",LocalDate.parse("2019-06-17"),"pune","mouni@gmail.com",8677867867L);
	}

	@AfterEach
	void tearDown() throws Exception {
		person=null;
	}

	@Test
	void testSetAadharCard() {
	person.setAdharCard(123456789L);
	assertEquals(123456789L,person.getAdharCard());
	}



	@Test
	void testInvalidSetAadharCard() {
	person.setAdharCard(6327678483909L);
	assertNotEquals(87258532768L,person.getAdharCard());
	}
	@Test
	void testGetAadharCard() {
	assertEquals(123456789L,person.getAdharCard(),"testing aadharcard");
	}
	@Test
	void testInvalidGetAadharCard() {
	assertNotEquals(6327678483909L,person.getAdharCard(),"testing aadharcard");
	}
	@Test
	void testSetName() {
	person.setName("mouni");
	assertEquals("mouni",person.getName());
	}
	@Test
	void testInvalidSetName() {
	person.setName("ramya");
	assertNotEquals("mouni",person.getName());
	}
	@Test
	void testGetName() {
	assertEquals("mouni",person.getName(),"testing traineename");
	}
	@Test
	void testInvalidGetName() {
	assertNotEquals("ramya",person.getName(),"testing traineename");
	}
	@Test
	void testSetBirthdate() {
	person.setBirthdate(LocalDate.parse("2019-06-17"));
	assertEquals(LocalDate.parse("2019-06-17"),person.getBirthdate());
	}
	@Test
	void testInvalidSetBirthdate() {
	person.setBirthdate(LocalDate.parse("2000-08-19"));
	assertNotEquals(LocalDate.parse("2019-06-17"),person.getBirthdate());
	}
	@Test
	void testGetBirthdate() {
	assertEquals(LocalDate.parse("2019-06-17"),person.getBirthdate(),"testing birthdate");
	}
	@Test
	void testInvalidGetBirthdate() {
	assertNotEquals(LocalDate.parse("2000-08-19"),person.getBirthdate(),"testing birthdate");
	}
	@Test
	void testSetAddress() {
	person.setAddress("pune");
	assertEquals("pune",person.getAddress());
	}
	@Test
	void testInvalidSetAddress() {
	person.setAddress("Bangolre");
	assertNotEquals("pune",person.getAddress());
	}
	@Test
	void testGetAddress() {
	assertEquals("pune",person.getAddress(),"testing address");
	}
	@Test
	void testInvalidGetAddress() {
	assertNotEquals("Bangolre",person.getAddress(),"testing address");
	}
	@Test
	void testSetEmail() {
	person.setEmail("mouni@gmail.com");
	assertEquals("mouni@gmail.com",person.getEmail());
	}
	@Test
	void testInvalidSetEmail() {
	person.setEmail("krutha@publicissapient.com");
	assertNotEquals("mouni@gmail.com",person.getEmail());
	}
	@Test
	void testGetEmail() {
	assertEquals("mouni@gmail.com",person.getEmail(),"testing email");
	}
	@Test
	void testInvalidGetEmail() {
	assertNotEquals("krutha@publicissapient.com",person.getEmail(),"testing email");
	}
	@Test
	void testSetMobile() {
	person.setMobile(8677867867L);
	assertEquals(8677867867L,person.getMobile());
	}
	@Test
	void testInvalidSetMobile() {
	person.setMobile(9724132211L);
	assertNotEquals(8677867867L,person.getMobile());
	}
	@Test
	void testGetMobile() {
	assertEquals(8677867867L,person.getMobile(),"testing mobile");
	}
	@Test
	void testInvalidGetMobile() {
	assertNotEquals(866877867L,person.getMobile(),"testing mobile");
	}


	}

