package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
		private String name;
		private List<String> phoneNumbers;
		private Set<String> addresses;
		private Map<String, String> courses;
		public Emp() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Emp(String name, List<String> phoneNumbers, Set<String> addresses, Map<String, String> courses) {
			super();
			this.name = name;
			this.phoneNumbers = phoneNumbers;
			this.addresses = addresses;
			this.courses = courses;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		public void setPhoneNumbers(List<String> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}
		public Set<String> getAddresses() {
			return addresses;
		}
		public void setAddresses(Set<String> addresses) {
			this.addresses = addresses;
		}
		public Map<String, String> getCourses() {
			return courses;
		}
		public void setCourses(Map<String, String> courses) {
			this.courses = courses;
		}
}
