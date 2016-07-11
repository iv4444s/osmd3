package com.qwert.asd.model;


import javax.persistence.*;

@Entity

    @Table(name = "owner")
    public class Owner {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name= "ownername")
        protected String ownername;

        @Column(name = "ownerlastname")
        private String ownerlastname;

        @Column(name="tel")
        private String tel;

        @Column(name = "email")
        private String email;


    public Owner() {
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getOwnername() {
            return ownername;
        }

        public void setOwnername(String ownername) {
            this.ownername = ownername;
        }

        public String getOwnerlastname() {
            return ownerlastname;
        }

        public void setOwnerlastname(String ownerlastname) {
            this.ownerlastname = ownerlastname;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        @Override
        public String toString() {
            return "Owner{" +
                    "id=" + email +
                    ", bookTitle='" + ownername + '\'' +
                    ", bookAuthor='" + ownerlastname + '\'' +
                    ", price=" + tel +
                    '}';
        }

    }
