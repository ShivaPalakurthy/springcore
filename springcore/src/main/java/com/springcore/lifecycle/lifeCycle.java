package com.springcore.lifecycle;

public class lifeCycle {
		private double lifeTime;

		@Override
		public String toString() {
			return "lifeCycle [lifeTime=" + lifeTime + "]";
		}

		public lifeCycle() {
			super();
			// TODO Auto-generated constructor stub
		}

		public double getLifeTime() {
			return lifeTime;
		}

		public void setLifeTime(double lifeTime) {
			System.out.println("Setting lifetime");
			this.lifeTime = lifeTime;
		}
		public void init() {
			System.out.println("Inside init method");
			
			//To initialize code ,loading config,connecting db,weservice etc
		}
		public void destroy() {
			System.out.println("Inside destroy method");
			//To clean up the code
		}
		
}
