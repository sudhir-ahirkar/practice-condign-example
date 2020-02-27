package bny.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMapEqualAndHashcodeConcept implements Comparable {

  private Integer id;
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    TestMapEqualAndHashcodeConcept t1=new TestMapEqualAndHashcodeConcept(1);
    TestMapEqualAndHashcodeConcept t2=new TestMapEqualAndHashcodeConcept(1);
    Map m=new TreeMap();
    m.put(t1,1);
    m.put(t2,1);
    System.out.println(m.size());
   Set s= m.keySet();
   Iterator t=s.iterator();
   while(t.hasNext()) {
    System.out.println(t.next());
   }
    
    

  }
  
  
  

  @Override
  public String toString() {
    return this.id.toString();
  }




  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }




  @Override
  public boolean equals(Object obj) {
//    if (this == obj)
//      return true;
//    if (obj == null)
//      return false;
//    if (getClass() != obj.getClass())
//      return false;
//    TestMapEqualAndHashcodeConcept other = (TestMapEqualAndHashcodeConcept) obj;
//    if (id == null) {
//      if (other.id != null)
//        return false;
//    } else if (!id.equals(other.id))
//      return false;
//    return true;
    
    TestMapEqualAndHashcodeConcept other = (TestMapEqualAndHashcodeConcept) obj;
    Boolean ret=false;
    
    if(other.id.equals(this.id))
      ret= true;
    
    return ret;
  }




  public TestMapEqualAndHashcodeConcept(Integer id) {
    super();
    this.id = id;
  }




  @Override
  public int compareTo(Object o) {
//    return this.id.compareTo(((TestMapEqualAndHashcodeConcept)o).id);
//    return -1;
//    return 1;
    return 0;

  }

}
