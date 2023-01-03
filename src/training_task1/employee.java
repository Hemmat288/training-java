/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_task1;

/**
 *
 * @author Microsoft
 */
 enum Gender{male,female};
public class employee {
        String name;
        String address;
        int ssn;
        Gender sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public employee() {
    }

    public employee(String name, String address, int ssn, Gender sex) {
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "employee{" + "name=" + name + ", address=" + address + ", ssn=" + ssn + ", sex=" + sex + '}';
    }
    
        
}
