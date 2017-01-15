
package edu.lfa.dao;

public class SArraylist {
    private int id;
    private String Fname,Lname,Email;

    public SArraylist(int id, String Fname, String Lname, String Email) {
        this.id = id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Email = Email;
    }

    public SArraylist() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "SArraylist{" + "id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", Email=" + Email + '}';
    }
    
}
