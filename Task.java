package com.robertnickle.finalProject;

public class Task {
			
	
		private String name;
		private boolean completed;
		
		public Task(String name) {
			this.name = name;
			this.completed = true;
		}
		
		public String getName() {
			return this.name;
		}
		public boolean getCompleted() {
			return this.completed;
		}
		public void setName(String name) {
			this.name = name;
			
		}
		public void setComplete(boolean completed) {
			this.completed = completed;
		}
		
		@Override
		public String toString() {
			return this.name + (this.completed? " (Complete)": "");
		}
	
}
