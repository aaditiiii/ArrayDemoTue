/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemow24tue;


/**
 *
 * This has been modified by ronak on 23 jan at 12:47pm
 * This is another comment added on 12:52
 * hello there 
 FETECH MERGE
 */
public class Student {
    private int sid;
    private String sname;
    private  String Address;

    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    
    
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    
    
    
}
