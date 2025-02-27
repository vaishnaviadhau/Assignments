
abstract class Emp{
    int id;
    String name;
    public void setid(int id){
        this.id=id;
    }
    public void setname(String name){
        this.name=name;
    }
public int getid(){
    return id;
}

public String getname(){
    return getname();
}
abstract void calculateSalary();
}


class FullTimeEmp extends Emp{
int salary;
@Override
public void setid(int id) {
    // TODO Auto-generated method stub
    super.setid(id);
}
@Override
public void setname(String name) {
    // TODO Auto-generated method stub
    super.setname(name);
}
@Override
void calculateSalary() {
    // TODO Auto-generated method stub
    System.out.println("Emp_id: "+ id + "\nEmp_name: "+ name);
    System.out.println("salary of fullTimeEmp is 2000000");
}

}


class   PartTimeEmp extends Emp{
    int salary;
    @Override
    public void setid(int id) {
        // TODO Auto-generated method stub
        super.setid(id);
    }
    @Override
    public void setname(String name) {
        // TODO Auto-generated method stub
        super.setname(name);
    }
    @Override
    void calculateSalary() {
        // TODO Auto-generated method stub
        System.out.println("Emp_id: "+ id + "\nEmp_name: "+ name);
        System.out.println("salary of PartTimeEmp is 1000000");
    }
    
    }






public class Que2{

public static void main(String[] args){
FullTimeEmp fte=new FullTimeEmp();
PartTimeEmp pte=new PartTimeEmp();
fte.setid(1001);
fte.setname("John");
pte.setid(1002);
pte.setname("Elon");
fte.calculateSalary();
pte.calculateSalary();
}


}