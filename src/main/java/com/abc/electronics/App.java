package com.abc.electronics;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.abc.electronics.pojo.Camera;
import com.abc.electronics.pojo.CellPhone;
import com.abc.electronics.pojo.Computer;
import com.abc.electronics.pojo.Electronics;
import com.abc.electronics.pojo.Person;
import com.abc.electronics.pojo.Speaker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	LocalDate myDate = LocalDate.now().plus(Period.ofDays(3));
    	
    	int value = Period.between(LocalDate.now(), myDate).getDays();
    	System.out.println(value);
    	
    	long secs = Duration.between(LocalTime.now(), LocalTime.MAX).getSeconds();
    	
    	System.out.println(secs);
    	
    	/*
    	Set<String> zones = ZoneId.getAvailableZoneIds();
    	System.out.println(zones);
    	
    	ZoneId zoneId = ZoneId.of("America/Marigot");
    	System.out.println(zoneId);
    	
    	ZonedDateTime zonedDtTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
    	
    	System.out.println(zonedDtTime);
    	*/
    	
    	/*
    	LocalDate currDate = LocalDate.now().plusDays(5);
    	System.out.println(currDate);
    	
    	LocalTime currTime = LocalTime.now().plusHours(3);
    	System.out.println(currTime);
    	
    	LocalDateTime currDtTime = LocalDateTime.now().plusDays(2).plusHours(5);
    	System.out.println(currDtTime);
    	
*/
    	/*
    	Person p1 = new Person("John", "S", 21, " First St, Atlanta, GA");
    	Person p2 = new Person("Robin", "K", 24, " Second St, Atlanta, GA");
    	Person p3 = new Person("Keran", "H", 25, " Third St, Atlanta, GA");
    	Person p4 = new Person("Ashutosh", "S", 21, " Fifth St, Atlanta, GA");
    	
    	List<Person> personList = Arrays.asList(p1, p2, p3, p4);
    	
    	List<String> firstNameList = 
    			personList.stream().map(Person :: getFirstName)
    	.collect(Collectors.toList());
    	
    	System.out.println(firstNameList);
    	*/
    	
    	/*
    	List<String> words = 
    			Arrays.asList("run", "eat", "walk", "work", "play");
    	
    	List<String> upperCaseWord = 
    			words.stream().sorted().map(String::toUpperCase)
    	.collect(Collectors.toList());
    	
    	System.out.println(upperCaseWord);
    	*/
    	/*
    	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
    	
    	List<Integer> evenNoList = 
    			list.stream()
    			.filter(k-> k%2==0).collect(Collectors.toList());
    	System.out.println(evenNoList);
    	*/
    	/*
    	Stream<Integer> rand = Stream.generate(()-> (new Random())
    			.nextInt(100));
    	rand.limit(10).forEach(System.out::println);
    			
    	*/
    	
    	/*
    	List<Integer> list1 = new ArrayList<>();
    	for(int i=0; i<25; i++) {
    		list1.add(i);
    	}
    	
    	Stream<Integer> stream = list1.stream();
    	stream.forEach(l -> System.out.println(l));
    	
    	*/
    	
    	/*
    	Person p1 = new Person("John", "S", 21, " First St, Atlanta, GA");
    	Person p2 = new Person("Robin", "K", 24, " Second St, Atlanta, GA");
    	Person p3 = new Person("Keran", "H", 25, " Third St, Atlanta, GA");
    	Person p4 = new Person("John", "S", 21, " Fifth St, Atlanta, GA");
    	
    	Comparator<Person> compareByLastName = 
    			Comparator.comparing(Person::getLastName);
    	
    	Map<Person, String> perComMap = new TreeMap<>(compareByLastName);
    	
    	perComMap.put(p1, "John first St");
    	perComMap.put(p2, "Robin Second St");
    	perComMap.put(p3, "Keran Third St");
    	perComMap.put(p4, "John Fifth St");
    	
    	for(Map.Entry<Person, String> entrySet : perComMap.entrySet()) {
    		System.out.println(entrySet.getKey().getFirstName() + " : " + entrySet.getValue());
    	}
    	*/
    	/*
    	Map<Integer, String> intStrMap = new TreeMap<>();
    	intStrMap.put(5, "Five");
    	intStrMap.put(27, "Twenty Seven");
    	intStrMap.put(2, "Two");
    	
    	intStrMap.put(2, "Duplicate Two");
    	
    	for(Map.Entry<Integer, String> entrySet : intStrMap.entrySet()) {
    		System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
    	}
    	
    	Set<Integer> mapKeys = intStrMap.keySet();
    	System.out.println(mapKeys);
    	
    	Collection<String> values = intStrMap.values();
    	System.out.println(values);
    	
    	String value = intStrMap.get(2);
    	System.out.println(value);
    	
    	boolean b1 =intStrMap.containsKey(10);
    	boolean b2 =intStrMap.containsKey(2);
    	boolean b3 =intStrMap.containsValue("Two");
    	boolean b4 =intStrMap.containsValue("Duplicate Two");
    	
    	System.out.println(b1);
    	System.out.println(b2);
    	System.out.println(b3);
    	System.out.println(b4);
    	*/
    	/*
    	Person p1 = new Person("John", "S", 21, " First St, Atlanta, GA");
    	Person p2 = new Person("Robin", "K", 24, " Second St, Atlanta, GA");
    	Person p3 = new Person("Keran", "H", 25, " Third St, Atlanta, GA");
    	Person p4 = new Person("John", "S", 21, " Fifth St, Atlanta, GA");
    	
    	Comparator<Person> compareByLastName = 
    			Comparator.comparing(Person::getLastName);
    	
    	Set<Person> personSet = new TreeSet<>(compareByLastName);
    	
    	personSet.add(p1);
    	personSet.add(p2);
    	personSet.add(p3);
    	personSet.add(p4);
    	
    	Comparator<Person> compareByFirstName = 
    			Comparator.comparing(Person::getFirstName);
    	
    	for(Person p : personSet) {
    		System.out.println(p.getFirstName());
    	}
    	
    	Set<Person> personSet1 = new TreeSet<>(compareByFirstName);
    	
    	personSet1.addAll(personSet);
    	
    	System.out.println("-------------");
    	
    	for(Person p : personSet1) {
    		System.out.println(p.getFirstName());
    	}
    	*/
    	/*
    	Set<Integer> mySet = new TreeSet<>();
    	mySet.add(3);
    	mySet.add(2);
    	mySet.add(28);
    	boolean b1 = mySet.add(15);
    	System.out.println(b1);
    	
    	boolean b2 = mySet.add(28);
    	System.out.println(b2);
    	
    	boolean b3 = mySet.add(2);
    	System.out.println(b3);
    	
    	for(Integer i : mySet) {
    		System.out.println("element is : "+ i);
    	}
    	*/
    	/*
    	List<Person> personList = new ArrayList<>();
    	
    	Person p1 = new Person("John", "S", 21, " First St, Atlanta, GA");
    	Person p2 = new Person("Robin", "K", 24, " Second St, Atlanta, GA");
    	Person p3 = new Person("Keran", "H", 25, " Third St, Atlanta, GA");
    	
    	Person p4 = new Person("John", "S", 21, " Fifth St, Atlanta, GA");
    	
    	personList.add(p1);
    	personList.add(p2);
    	personList.add(p3);
    	personList.add(p4);
    	
    	System.out.println("before sort");
    	for(Person p : personList) {
    		System.out.println(p.getFirstName());
    	}
    	
    	Comparator<Person> compareByLastName = 
    			Comparator.comparing(Person::getLastName);
    	
    	personList.sort(compareByLastName);
    	
    	System.out.println("After sort");
    	for(Person p : personList) {
    		System.out.println(p.getFirstName());
    	}
    	*/
    	/*
    	if(p1.hashCode()==p4.hashCode()) {
    		if(p1.equals(p4)) {
        		System.out.println("P1 and P4 are equal");
        	}else {
        		System.out.println("P1 and P4 are not equal");
        	}
    	}else {
    		System.out.println("Objects are different");
    	}
    	
    	int diff = p2.compareTo(p1);
    	if(diff==0) {
    		System.out.println("equal");
    	}
    	else if(diff>0) {
    		System.out.println("greater");
    	}
    	else {
    		System.out.println("less");
    	}
    	
    	*/
    	/*
    	List<Computer> compList = new LinkedList<>();
    	
    	compList.add(new Computer());
    	
    	Computer comp1 = new Computer();
    	comp1.setMemory("2 GB");
    	
    	compList.add(comp1);
    	
    	for(Computer com : compList) {
    		System.out.println(com.getMemory());
    	}
    	
    	List<Integer> intList = new ArrayList<>();
    	intList.add(5);
    	intList.add(1);
    	intList.add(9);
    	
    	for(int i=0; i<intList.size(); i++) {
    		System.out.println("value : "+intList.get(i));
    	}
    	
    	System.out.println("-------");
    	
    	List<Integer> intList_1 = new ArrayList<>();
    	intList_1.addAll(intList);
    	    	
    	for(Integer i : intList_1) {
    		System.out.println("value :"+i);
    	}
    	
    	
    	*/
    	
    	
    	/*
    	GenClass<Integer, String> genObj = new GenClass<>(5, "test");
    	
    	System.out.println("value of t is: " + genObj.getT());
    	
    	
    	GMTest.gmethod(" Generic String");
    	
    	GMTest.gmethod(25);
    	
    	GMTest.gmethod(10.5);
    	
    	*/
    	
    	
    	/*
    	Promotions p = (int a, int b)-> {
    		return a-b; 
    		};
    	
    	int effectivePrice = p.calculateSaving(3, 2);
    	
    	System.out.println("effective price is: "+effectivePrice);
    	
    	int effectivePrice_1 = p.calculateSaving(5, 2);
    	
    	System.out.println("effective price 1 is: "+effectivePrice_1);
    	
    	*/
    	
    	//p.availablePromotions();
    	/*
    	PromotionType promoEnum;
    	
    	String promotions = "";
    	
    	if(args==null || args.length<=1) {
    		System.out.println("Provide argument from 1 to 4");
    		return;
    	}
    	
    	switch(args[1]) {
    	
    	case "1":
    		promoEnum=PromotionType.BOGO;
    		promotions = Promotions.BOGO;
    		break;
    	case "2":
    		promoEnum=PromotionType.BTGO;
    		promotions = Promotions.BTGO;
    		break;
    	default:
    		promoEnum=PromotionType.FREEITEM;
    		promotions = Promotions.FREE_ITEM;
    	}
    	
    	
    	System.out.println(" The current promotion is: "+promoEnum.value);
    	
    	System.out.println("Promotion constants : "+ promotions);
    	
    	switch(args[0]) {
    	
    	case "1":
    	{
    		Computer comp = new Computer();
    		comp.setMemory("16GB");
    		comp.setProcessor("Intel");
    		comp.setOpenBox(false);
    		boxCondition(comp);
    	}
    	break;
    	
    	case "2":
    	{
    		Camera cam = new Camera();
    		cam.setMegaPixel("48 MP");
    		cam.setOpenBox(true);
    		boxCondition(cam);
    	}
    	break;
    	
    	case "3":
    	{
    		CellPhone cp = new CellPhone();
    		cp.setBatteryLifeHours(36);
    		cp.setMemory("8GB");
    		cp.setSize("6.8 inch");
    		cp.setOpenBox(true);
    		boxCondition(cp);
    	}
    	break;
    	
    	case "4":
    	{
    		Speaker speaker = new Speaker();
    		speaker.setNoOfChannels(5);
    		speaker.setSizeInInch(28);
    		speaker.setOpenBox(false);
    		boxCondition(speaker);
    	}
    	break;
    	
    	default:
    		System.out.println("Argument is not valid");
    	
    	}*/
    }
    
    public static void boxCondition(Electronics electronics) {
    	//electronics.checkBoxCondition();
    	if (electronics instanceof Computer) {
			System.out.println("I am computer");	
		} 
    	else if (electronics instanceof Camera) {
			System.out.println("I am Camera");	
		}
    	else if (electronics instanceof CellPhone) {
			System.out.println("I am CellPhone");	
		}
    	else if (electronics instanceof Speaker) {
			System.out.println("I am Speaker");	
		}
    	electronics.display();
    	//electronics.productInfo();
    	electronics.productQuality();
    	
    	electronics.add(2, 3);
    	electronics.add(2, 3, 4);
    	electronics.add("Hello ", " Overloading");
    }
}
