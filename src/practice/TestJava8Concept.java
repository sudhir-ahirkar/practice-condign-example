package practice;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class TestJava8Concept {

    public static void main(String[] args) {

        Map<Integer, String> idNameMap = new HashMap<Integer, String>();

        //Insert Id-Name pairs into idNameMap

        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");

        //Java 8 sorting using Entry.comparingByValue()

        Map<Integer, String> sortedMapByValue = idNameMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
        System.out.println("sortedMapByValue====>"+sortedMapByValue);

/*        Map<Integer, String> sortMapByValue
                = idNameMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("sortMapByValue===================>"+sortMapByValue);*/



        List<Employee> empLst = Arrays.asList(new Employee("Emp1",1000,"IT"),new Employee("Emp2",1200,"CS"),
                new Employee("Emp3",800,"IT")
        ,new Employee("Emp1",1500,"CS"));


        Optional<Employee> maxSalaryEmp = empLst.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));
        Optional<Employee> highestSalEmp = empLst.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));
        Map<String, Employee> deptHighestSalEmpMap = empLst.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)));

//        deptHighestSalEmpMap.entrySet().stream().sorted(e->e.comparingByValue()).
//        LinkedHashMap<String, Employee> collect = deptHighestSalEmpMap.entrySet()
//                .stream()
//                .sorted(e -> Comparator.comparingInt(e.getValue().getSalary()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));



        Employee employee = empLst.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).findAny().get();
        System.out.println("employee====>"+employee);

        Employee secHighSalEmployee = empLst.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(2).skip(1).findAny().get();
        System.out.println("secHighSalEmployee====>"+secHighSalEmployee);

        Map<String, Employee> highestSalEmployee = empLst.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)));

        System.out.println("highestSalEmployee==>"+highestSalEmployee);

        Map<String, Set<Employee>> hasMap = empLst.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toSet()));
        Map<String, Set<Employee>> treeMap = empLst.stream().collect(Collectors.groupingBy(Employee::getDept, TreeMap::new, Collectors.toSet()));

        System.out.println("hasMap===>"+hasMap);
        System.out.println("treeMap===>"+treeMap);

        String riddle = "ab?ac?";

        StringBuilder sb = new StringBuilder();
//        char previous = ,next
        for (int i = 0; i < riddle.length(); i++) {
//             = riddle.charAt(i-1);
            char current = riddle.charAt(i);
            char next = riddle.charAt(i+1);
//          System.out.println("previous===>"+previous);
            System.out.println("next===>"+next);
        }
    }
}

