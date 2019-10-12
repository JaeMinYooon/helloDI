package kr.ac.hansung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;

//@AllArgsConstructor
public class PetOwner {
	
	@Autowired //wired by type
	@Qualifier(value="qf_cat")
	private AnimalType animal;
	
	public PetOwner(AnimalType animal) {
		super();
		this.animal = animal;
	}



	public void play() {
		animal.sound();
	}
	
}
