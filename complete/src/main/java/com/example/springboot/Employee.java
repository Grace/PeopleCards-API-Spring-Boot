package com.example.springboot;

public class Employee {

        private final long id;
        private final String name;
        private final String notes;

        public Employee() {
            this.id = -1;
            this.name = "";
            this.notes = "";
        }

        public Employee(long id, String name, String notes) {
            this.id = id;
            this.name = name;
            this.notes = notes;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getNotes() {
            return notes;
        }
}
