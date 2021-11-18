package com.xworkz.inheritence;

import com.xworkz.inheritence.LawerDTO;

public class LawyerDAO {
	private LawerDTO[] lawyerDTOs = new LawerDTO[10];
	private int fire = 0;

	public void save(LawerDTO dto) {
		if (this.fire >= 0 && this.fire < this.lawyerDTOs.length) {
			this.lawyerDTOs[this.fire++] = dto;
		} else {
			System.err.println("Cannot save the dto :".concat(String.valueOf(this.fire)));
		}

	}

	public void save(LawerDTO dto, int index) {
		System.out.println("saved lawyerDTOs dto and int cost:".concat(dto.getName()));
		if (index >= 0 && this.fire < this.lawyerDTOs.length && this.fire >= 0 && dto != null) {
			this.lawyerDTOs[this.fire++] = dto;
			System.out.println("saved lawyerDTOs dto and int cost:".concat(String.valueOf(index)));
		} else {
			System.out.println("Cannot saved the lawyerDTOs :".concat(String.valueOf(this.fire)));
		}
	}

	public void delete(int index) {
		if (index < this.lawyerDTOs.length && index >= 0) {
			this.lawyerDTOs[index] = null;
		} else {
			System.err.println("Cannot delete because the index is out of range");
		}
	}

	public void display() {
		for (int fare = 0; fare < this.lawyerDTOs.length; fare++) {
			LawerDTO store = this.lawyerDTOs[fare];
			System.out.println(store);
		}
	}

	public LawerDTO[] getLawyerDTOs() {
		return lawyerDTOs;
	}

	public boolean searchByName(String name) {
		System.out.println("invoked searchByName");
		System.out.println("name assigned: ".concat(name));

		for (int i = 0; i < this.lawyerDTOs.length; i++) {
			LawerDTO ref = this.lawyerDTOs[i];
			if (ref != null) {
				System.out.println("ref in index is not null: ".concat(String.valueOf(i)));
				String tempName = ref.getName();
				System.out.println("searching: ".concat(tempName));
				if (name.equals(tempName)) {
					System.out.println("name found");
					return true;
				}

			}
		}
		return false;
	}

	public boolean searchByCasesWon(int age) {
		System.out.println("invoked searchByCasesWon");
		System.out.println("age passed: ".concat(String.valueOf(age)));

		for (int ram = 0; ram < this.lawyerDTOs.length; ram++) {
			LawerDTO ref = this.lawyerDTOs[ram];
			if (ref != null) {
				System.out.println("ref in index is not null: ".concat(String.valueOf(ram)));
				int tempName = ref.getAge();
				System.out.println("searching: ".concat(String.valueOf(tempName)));
				{
					System.out.println("age found");
					return true;
				}

			}
		}
		return false;
	}

	public String getQualificationByName(String name) {
		System.out.println("invoked getQualificationByName");
		System.out.println("name passed: ".concat(name));

		for (int kama = 0; kama < this.lawyerDTOs.length; kama++) {
			LawerDTO ref = this.lawyerDTOs[kama];
			if (ref != null) {
				System.out.println("ref in index is not null: ".concat(String.valueOf(kama)));
				String tempName = ref.getName();
				System.out.println("getQualification name: ".concat(tempName));
				if (name.equals(tempName)) {
					System.out.println("name found");
					return name;
				}

			}
		}
		return name;
	}

	public String getExpByName(String name) {
		System.out.println("invoked getExpByName");
		System.out.println("name assigned: ".concat(name));

		for (int i = 0; i< this.lawyerDTOs.length; i++) {
			LawerDTO ref = this.lawyerDTOs[i];
			if (ref != null) {
				System.out.println("ref in index is not null: ".concat(String.valueOf(i)));
				String tempName = ref.getName();
				System.out.println("getExp name: ".concat(tempName));
				if (name.equals(tempName)) {
					System.out.println("name found");
					return name;
				}

			}
		}
		return null;
	}

}
