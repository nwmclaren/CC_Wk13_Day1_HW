package com.codeclan.example.piratesservice;

import com.codeclan.example.piratesservice.models.Pirate;
import com.codeclan.example.piratesservice.models.Raid;
import com.codeclan.example.piratesservice.models.Ship;
import com.codeclan.example.piratesservice.repositories.PirateRepository;
import com.codeclan.example.piratesservice.repositories.RaidRepository;
import com.codeclan.example.piratesservice.repositories.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PiratesserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void createPirate(){
//		Pirate jack = new Pirate("Jack", "Sparrow", 32);
//		pirateRepository.save(jack);
//	}

//	@Test
//	public void createPirateAndShip(){
//		 Ship ship = new Ship("The Flying Dutchman");
//		 shipRepository.save(ship);
//
//		 Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
//		 pirateRepository.save(pirate1);
//
//	}

	@Test
	public void addPiratesAndRaids(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);

		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(pirate1);

		Raid raid1 = new Raid("Tortuga", 100);
		raidRepository.save(raid1);

		raid1.addPirate(pirate1);
//		raidRepository.save(raid1);

	}

}
