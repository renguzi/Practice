//package ThinkingInJavaPractice.HoldingYourObjects;
//
//import ThinkingInJavaPractice.typeinfo.pets.Pet;
//import ThinkingInJavaPractice.typeinfo.pets.Pets;
//
//import java.util.*;
//
///**
// * @Author:asher
// * @Date:2021/2/4 13:17
// * @Description:ThinkingInJavaPractice.HoldingYourObjects
// * @Version:1.0
// */
//public class InterfaceVsIterator {
//    public static void display(Iterator<Pet> iterator) {
//        while (iterator.hasNext()) {
//            Pet p = iterator.next();
//            System.out.print(p.id() + ";" + p + " ");
//        }
//        System.out.println("\n");
//    }
//
//    public static void display(Collection<Pet> collection) {
//        for (Pet p : collection) {
//            System.out.print(p.id() + ";" + p + " ");
//        }
//        System.out.println("\n");
//    }
//
//    public static void main(String[] args) {
//        List<Pet> petList = Pets.arrayList(8);
//        Set<Pet> petSet = new HashSet<Pet>(petList);
//        Map<String, Pet> petMap = new LinkedHashMap<String, Pet>();
//        String[] names=("Ralph,Eric,Robin,Lacey,"+"Britney,Sam,Spot,Fluffy").split(",");
//        for (int i = 0; i < names.length; i++) {
//            petMap.put(names[i], petList.get(i));
//        }
//        display(petList);
//        display(petSet);
//        display(petList.iterator());
//        display(petSet.iterator());
//        System.out.println(petMap);
//        System.out.println(petMap.keySet());
//        display(petMap.values());
//        display(petMap.values().iterator());
//    }
//}
