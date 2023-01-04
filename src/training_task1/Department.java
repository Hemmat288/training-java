/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_task1;

import java.util.ArrayList;


/**
 *
 * @author Microsoft
 */
public class Department {
       int dno;
    String dname;
    ArrayList<Employee>emplist=new ArrayList<>(); 

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public ArrayList<Employee> getEmplist() {
        return emplist;
    }

    public void setEmplist(ArrayList<Employee> emplist) {
        this.emplist = emplist;
    }

        public void addEmployee(Employee e){
        emplist.add(e);  
    }
        
    public void removeEmployee(int indx){
        emplist.remove(indx);
         
    }
    
        public void countEmployee(){
           System.out.println( emplist.size());
    }

    @Override
    public String toString() {
        return "department{" + "dno=" + dno + ", dname=" + dname + ", emplist=" + emplist + '}';
    }
        
        
        
    public void print_basic_data(){
        for(int i=0;i<emplist.size();i++){
            System.out.println(emplist.get(i).getSsn()+""+emplist.get(i).getName()+ " "+emplist.get(i).getAddress()+" "+emplist.get(i).getSex());
        }
    }
    
    
    public Department(int dno, String dname, ArrayList<Employee> emplist) {
        this.dno = dno;
        this.dname = dname;
        this.emplist = emplist;
    }

    public Department() {
    }
    
    
}
