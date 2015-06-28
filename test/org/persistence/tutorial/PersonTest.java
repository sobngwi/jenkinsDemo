package org.persistence.tutorial;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p = new Person();
		assertEquals("unknown name", p.getName());
		assertEquals(3, p.getMaximumBooks());
	}

	public void testSetMaximumBooks() {
		Person p1 = new Person();
		p1.setMaximumBooks(10);
		assertEquals(10, p1.getMaximumBooks());
	}

	public void testSetName() {
		Person p1 = new Person();
		p1.setName("Fred Flintstone");
		assertEquals("Fred Flintstone", p1.getName());
	}
	
	public void testToString() {
		Person p1 = new Person();
		p1.setName("Fred Flintstone");
		p1.setMaximumBooks(7);
		String testString = "Fred Flintstone (7 books)";
		assertEquals(testString, p1.toString());
	}
	

	public void testObjectReference() {
		int a = 3;
		int b = a;
		int c = 0 ;
		a = 4;
		System.out.println(b);
		Person p1 = new Person();
		p1.setName("William Shakespeare");
		Person p2 = p1;
		p2.setName("Charles Dickens");
		assertTrue("What happened to p1's name?",
				p1.getName().equals(p2.getName()));
		
		String s1 = "a string";
		String s2 = "a string";
		assertTrue(s1 == s2);
		s2 = "a string with more";
		s2 = s2.substring(0,8);
		assertFalse(s1 == s2);
		assertTrue(s1.equals(s2));
		
	}


}
