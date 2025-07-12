package com.my_work.mapps.runner;

import com.my_work.mapps.dto.AddressDTO;
import com.my_work.mapps.dto.PersonDTO;

import java.util.HashMap;
import java.util.Map;

public class PersonRunner {
    public static void main(String[] args) {

        PersonDTO person1 = new PersonDTO("Krishnaveni", "krishna24@gmail.com","819286682153");
        PersonDTO person2 = new PersonDTO("Archana", "archana29@gmail.com","819281282153");
        PersonDTO person3 = new PersonDTO("Ashwini", "ashwini21@gmail.com","666677776153");
        PersonDTO person4 = new PersonDTO("Raga", "Raga920@gmail.com","81978925353");
        PersonDTO person5 = new PersonDTO("Kiran", "Kiran@gmail.com","780086682153");
        PersonDTO person6 = new PersonDTO("Nityank", "Nityank@gmail.com","496454231331");
        PersonDTO person7 = new PersonDTO("Ramesh", "Ramesh@gmail.com","899802534153");
        PersonDTO person8 = new PersonDTO("Ramya", "Ramya@gmail.com","456789082153");
        PersonDTO person9 = new PersonDTO("Bhavani", "Bhavani@gmail.com","362780929244");
        PersonDTO person10 = new PersonDTO("Karan", "Karan@gmail.com","535356276943");
        PersonDTO person11 = new PersonDTO("Joshi", "Joshi@gmail.com","500223396460");
        PersonDTO person12 = new PersonDTO("Naveen", "Naveen@gmail.com","285078074974");
        PersonDTO person13 = new PersonDTO("Aaradya", "Aaradya@gmail.com","380462425645");
        PersonDTO person14 = new PersonDTO("Bhavya", "Bhavya@gmail.com","403853383411");
        PersonDTO person15 = new PersonDTO("Chethan", "Chethan@gmail.com","206635790191");
        PersonDTO person16 = new PersonDTO("Harish", "Harish@gmail.com","459198780169");
        PersonDTO person17 = new PersonDTO("Durga", "Durga@gmail.com","689842418699");
        PersonDTO person18 = new PersonDTO("Tarun", "Tarun@gmail.com","978335432544");
        PersonDTO person19 = new PersonDTO("Syresh", "Syresh@gmail.com","427244966553");
        PersonDTO person20 = new PersonDTO("Sarayu", "Sarayu@gmail.com","597881285432");
        PersonDTO person21 = new PersonDTO("Isha", "Isha@gmail.com","624433555497");
        PersonDTO person22 = new PersonDTO("Pari", "Pari@gmail.com","830039805476");
        PersonDTO person24 = new PersonDTO("Eshwar", "Eshwar@gmail.com","204731862086");
        PersonDTO person23 = new PersonDTO("Pooja", "Pooja@gmail.com","689842418699");
        PersonDTO person25 = new PersonDTO("Ganesh", "Ganesh@gmail.com","225390278200");

        PersonDTO person22d = new PersonDTO("Pari", "Pari@gmail.com","830079805476");
        PersonDTO person24d = new PersonDTO("Eshwar", "Eshwar@gmail.com","804731862086");
        PersonDTO person23d = new PersonDTO("Pooja", "Pooja@gmail.com","689842418699");
        PersonDTO person25d = new PersonDTO("Ganesh", "Ganesh@gmail.com","225390278200");



        AddressDTO address1 = new AddressDTO(1, "MG Road", "Bangalore", 560001);
        AddressDTO address2 = new AddressDTO(2, "Brigade Road", "Bangalore", 560025);
        AddressDTO address3 = new AddressDTO(3, "Residency Road", "Bangalore", 560025);
        AddressDTO address4 = new AddressDTO(4, "Commercial Street", "Bangalore", 560001);
        AddressDTO address5 = new AddressDTO(5, "Church Street", "Bangalore", 560001);

        AddressDTO address6 = new AddressDTO(6, "100ft Road", "Indiranagar", 560038);
        AddressDTO address7 = new AddressDTO(7, "5th Block", "Koramangala", 560095);
        AddressDTO address8 = new AddressDTO(8, "BTM Layout Main Road", "BTM Layout", 560076);
        AddressDTO address9 = new AddressDTO(9, "Bannerghatta Road", "JP Nagar", 560078);
        AddressDTO address10 = new AddressDTO(10, "Outer Ring Road", "Marathahalli", 560037);

        AddressDTO address6d = new AddressDTO(6, "100ft Road", "Indiranagar", 560038);
        AddressDTO address7d = new AddressDTO(7, "5th Block", "Koramangala", 560095);
        AddressDTO address8d = new AddressDTO(8, "BTM Layout Main Road", "BTM Layout", 560076);
        AddressDTO address9d = new AddressDTO(9, "Bannerghatta Road", "JP Nagar", 560078);
        AddressDTO address10d = new AddressDTO(10, "Outer Ring Road", "Marathahalli", 560037);

        AddressDTO address11 = new AddressDTO(11, "Sarjapur Road", "Bellandur", 560103);
        AddressDTO address12 = new AddressDTO(12, "Whitefield Main Road", "Whitefield", 560066);
        AddressDTO address13 = new AddressDTO(13, "Hennur Main Road", "Kalyan Nagar", 560043);
        AddressDTO address14 = new AddressDTO(14, "New Town", "Yelahanka", 560064);
        AddressDTO address15 = new AddressDTO(15, "Hebbal Flyover", "Hebbal", 560024);

        AddressDTO address16 = new AddressDTO(16, "8th Cross", "Malleshwaram", 560003);
        AddressDTO address17 = new AddressDTO(17, "1st Block", "Rajajinagar", 560010);
        AddressDTO address18 = new AddressDTO(18, "Main Road", "Basavanagudi", 560004);
        AddressDTO address19 = new AddressDTO(19, "4th Block", "Jayanagar", 560041);
        AddressDTO address20 = new AddressDTO(20, "Hosur Road", "Electronic City", 560100);

        Map<PersonDTO, AddressDTO> personDTOAddressDTOMap = new HashMap<>();

        personDTOAddressDTOMap.put(person1, address1);
        personDTOAddressDTOMap.put(person2, address2);
        personDTOAddressDTOMap.put(person3, address3);
        personDTOAddressDTOMap.put(person4, address4);
        personDTOAddressDTOMap.put(person5, address5);
        personDTOAddressDTOMap.put(person6, address6);
        personDTOAddressDTOMap.put(person7, address7);
        personDTOAddressDTOMap.put(person8, address8);
        personDTOAddressDTOMap.put(person9, address9);
        personDTOAddressDTOMap.put(person10, address10);
        personDTOAddressDTOMap.put(person11, address11);
        personDTOAddressDTOMap.put(person12, address12);
        personDTOAddressDTOMap.put(person13, address13);
        personDTOAddressDTOMap.put(person14, address14);
        personDTOAddressDTOMap.put(person15, address15);
        personDTOAddressDTOMap.put(person16, address6d);
        personDTOAddressDTOMap.put(person17, address7d);
        personDTOAddressDTOMap.put(person18, address8d);
        personDTOAddressDTOMap.put(person19, address9d);
        personDTOAddressDTOMap.put(person20, address10d);
        personDTOAddressDTOMap.put(person21, address16);
        personDTOAddressDTOMap.put(person22, address17);
        personDTOAddressDTOMap.put(person23, address18);
        personDTOAddressDTOMap.put(person24, address19);
        personDTOAddressDTOMap.put(person25, address20);
        personDTOAddressDTOMap.put(person25d, address20);
        personDTOAddressDTOMap.put(person22d, address17);
        personDTOAddressDTOMap.put(person23d, address18);
        personDTOAddressDTOMap.put(person24d, address19);

        System.out.println("keys");
        personDTOAddressDTOMap.keySet().forEach(System.out::println);

        System.out.println("values");
        personDTOAddressDTOMap.values().forEach(System.out::println);

        System.out.println("\n\n");
        personDTOAddressDTOMap.entrySet().stream().forEach(
                personDTOAddressDTOEntry -> System.out.println(
                        personDTOAddressDTOEntry.getKey().getName()+",  "+
                        personDTOAddressDTOEntry.getKey().getAadhaar()+" - "+
                        personDTOAddressDTOEntry.getValue().getStreet()+" - "+
                        personDTOAddressDTOEntry.getValue().getCity()
                )
        );

        System.out.println("Loop using entrySet()");
        for (Map.Entry<PersonDTO, AddressDTO> entry : personDTOAddressDTOMap.entrySet()) {
            PersonDTO person = entry.getKey();
            AddressDTO address = entry.getValue();

            System.out.println(person.getName() + " (" + person.getAadhaar() + ") lives at " +
                    address.getStreet() + ", " + address.getCity() + " - " + address.getPinCode());
        }
        System.out.println("\n\n All Map methods");
        //size()
        System.out.println("Map size: "+ personDTOAddressDTOMap.size());

        //isEmpty()
        System.out.println("is map empty? "+ personDTOAddressDTOMap.isEmpty());

        //containsKey()
        System.out.println("Map contains key person1?"+personDTOAddressDTOMap.containsKey(person1));

        //containsValue()
        System.out.println("Map contains address1? "+personDTOAddressDTOMap.containsValue(address1));

        //get()
        System.out.println("Address of person1?"+personDTOAddressDTOMap.get(person2));

        //put()
        PersonDTO newPerson = new PersonDTO("Tarun", "tarun@gmail.com", "123456789267");
        AddressDTO newAddress = new AddressDTO(26, "HSR", "HSR layout", 560102);
        personDTOAddressDTOMap.put(newPerson, newAddress);
        System.out.println("Added new person using put()");

        //putIfAbsent()
        personDTOAddressDTOMap.putIfAbsent(person1, address1);
        System.out.println("putIfAbsent");

        //remove()
        personDTOAddressDTOMap.remove(newPerson);
        System.out.println("Removed newPerson(Tarun)");

        //replace()
        personDTOAddressDTOMap.replace(person2, address1);
        System.out.println("Replaced address of person2 with address1");


































































































        //keySet()
        System.out.println("All keys");
        personDTOAddressDTOMap.values().forEach(System.out::println);

        //values()
        System.out.println("All values");
        personDTOAddressDTOMap.values().forEach(System.out::println);

        System.out.println("All entries: ");
        for (Map.Entry<PersonDTO, AddressDTO> entry : personDTOAddressDTOMap.entrySet()){
            System.out.println(entry);
        }

        AddressDTO address = new AddressDTO(27, "Mico layout", "BTM Bangalore", 560760);
        System.out.println("Get non-existing key with default: "+personDTOAddressDTOMap.getOrDefault(new PersonDTO("Karan", "karan@gmail.com", "234556779980"), address));

        // clear()
        personDTOAddressDTOMap.clear();
        System.out.println("After clearing map size: "+ personDTOAddressDTOMap.size());
    }
}